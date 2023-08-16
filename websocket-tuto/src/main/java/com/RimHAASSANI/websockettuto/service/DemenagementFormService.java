package com.RimHAASSANI.websockettuto.service;

import com.RimHAASSANI.websockettuto.entity.DemenagementFormEntity;
import com.RimHAASSANI.websockettuto.repository.DemenagementFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemenagementFormService {

    @Autowired
    private DemenagementFormRepository demenagementFormRepository;


    public DemenagementFormEntity addDemenagementForm(DemenagementFormEntity demenagementFormEntity) {
        return  demenagementFormRepository.save(demenagementFormEntity);
    }

    public List<DemenagementFormEntity> getDemenagementForm() {
        return demenagementFormRepository.findAll();
    }
}
