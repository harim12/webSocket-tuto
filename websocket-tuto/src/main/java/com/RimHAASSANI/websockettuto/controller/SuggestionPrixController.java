package com.RimHAASSANI.websockettuto.controller;

import com.RimHAASSANI.websockettuto.entity.SuggestionPrixEntity;
import com.RimHAASSANI.websockettuto.service.SuggestionPrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/price-suggestion")
@CrossOrigin(origins = "http://localhost:4200")
public class SuggestionPrixController {

    @Autowired
    private SuggestionPrixService suggestionPrixService;
    @PostMapping("/add")
    public SuggestionPrixEntity addPriceSuggestion(@RequestBody SuggestionPrixEntity suggestionPrixEntity){
        return suggestionPrixService.addPriceSuggestion(suggestionPrixEntity);
    }

    @GetMapping("/get")
    public List<SuggestionPrixEntity> getPriceSuggestions(){
        return suggestionPrixService.getPriceSuggestions();
    }
}
