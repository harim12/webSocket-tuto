package com.RimHAASSANI.websockettuto.service;

import com.RimHAASSANI.websockettuto.entity.DemenagementFormEntity;
import com.RimHAASSANI.websockettuto.repository.DemenagementFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemenagementFormService {

    @Autowired
    private WebSocketService webSocketService;
    @Autowired
    private DemenagementFormRepository demenagementFormRepository;


    public DemenagementFormEntity addDemenagementForm(DemenagementFormEntity demenagementFormEntity) {
        DemenagementFormEntity demenagementForm  =  demenagementFormRepository.save(demenagementFormEntity);
        notifyFrontend();
        return demenagementForm;
    }

    public List<DemenagementFormEntity> getDemenagementForm() {
        return demenagementFormRepository.findAll();
    }
    protected String getEntityTopic(){
        return "add-demande";
    }
    public void notifyFrontend(){
        final String entityTopic = getEntityTopic();
        if(entityTopic==null){

            return;
        }
        webSocketService.sendMessage(entityTopic);

    }
}
