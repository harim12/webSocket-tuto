package com.RimHAASSANI.websockettuto.controller;

import com.RimHAASSANI.websockettuto.entity.DemandeEntity;
import com.RimHAASSANI.websockettuto.service.DemandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class DemandeController {

    @Autowired
    private DemandeService demandeService;
    @PostMapping("demande/add")
    public DemandeEntity addDemande(@RequestBody DemandeEntity demandeEntity){
        return demandeService.addDemande(demandeEntity);
    }
    @GetMapping("demande/get")
    public List<DemandeEntity> getDemandes(){
        return demandeService.getDemandes();
    }
}
