package com.RimHAASSANI.websockettuto.service;

import com.RimHAASSANI.websockettuto.entity.DemandeEntity;
import com.RimHAASSANI.websockettuto.repository.DemandeRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class DemandeService {

    @Autowired
    private WebSocketService webSocketService;


    @Autowired
    private DemandeRepository demandeRepository;
    public DemandeEntity addDemande(DemandeEntity demandeEntity) {
        DemandeEntity demande =  demandeRepository.save(demandeEntity);
        notifyFrontend();
        return demande;
    }

    public List<DemandeEntity> getDemandes() {
         List<DemandeEntity> demandes =  demandeRepository.findAll();
         //notifyFrontend();
         return demandes;
    }


    protected String getEntityTopic(){
        return "demande";
    }
    public void notifyFrontend(){
        final String entityTopic = getEntityTopic();
        if(entityTopic==null){

            return;
        }
        webSocketService.sendMessage(entityTopic);

    }
}
