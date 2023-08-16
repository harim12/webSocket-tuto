package com.RimHAASSANI.websockettuto.service;

import com.RimHAASSANI.websockettuto.entity.SuggestionPrixEntity;
import com.RimHAASSANI.websockettuto.repository.SuggestionPrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuggestionPrixService {

    @Autowired
    private SuggestionPrixRepository suggestionPrixRepository;

    public SuggestionPrixEntity addPriceSuggestion(SuggestionPrixEntity suggestionPrixEntity) {
        return suggestionPrixRepository.save(suggestionPrixEntity);
    }

    public List<SuggestionPrixEntity> getPriceSuggestions() {
        return this.suggestionPrixRepository.findAll();
    }
}
