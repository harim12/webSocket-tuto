package com.RimHAASSANI.websockettuto.service;

import com.RimHAASSANI.websockettuto.entity.DemandeEntity;
import com.RimHAASSANI.websockettuto.repository.DemandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DemandeService {

    @Autowired
    private DemandeRepository demandeRepository;
    public DemandeEntity addDemande(DemandeEntity demandeEntity) {
        return demandeRepository.save(demandeEntity);
    }

    public List<DemandeEntity> getDemandes() {
        return demandeRepository.findAll();
    }
}
