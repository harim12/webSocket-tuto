package com.RimHAASSANI.websockettuto.controller;

import com.RimHAASSANI.websockettuto.entity.DemenagementFormEntity;
import com.RimHAASSANI.websockettuto.service.DemenagementFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demenagement-form")
@CrossOrigin(origins = "http://localhost:4200")
public class DemenagementFormController {

    @Autowired
    private DemenagementFormService demenagementFormService;

    @PostMapping("add")
    public DemenagementFormEntity addDemenagementForm(@RequestBody DemenagementFormEntity demenagementFormEntity){
        return demenagementFormService.addDemenagementForm(demenagementFormEntity);
    }
    @GetMapping("get")
    public List<DemenagementFormEntity> getDemenagementForm(){
        return demenagementFormService.getDemenagementForm();
    }
}
