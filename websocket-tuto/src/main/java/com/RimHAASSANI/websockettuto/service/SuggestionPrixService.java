package com.RimHAASSANI.websockettuto.service;

import com.RimHAASSANI.websockettuto.entity.SuggestionPrixEntity;
import com.RimHAASSANI.websockettuto.repository.SuggestionPrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuggestionPrixService {
    @Autowired
    private WebSocketService webSocketService;

    @Autowired
    private SuggestionPrixRepository suggestionPrixRepository;

    public SuggestionPrixEntity addPriceSuggestion(SuggestionPrixEntity suggestionPrixEntity) {

        SuggestionPrixEntity suugestion=  suggestionPrixRepository.save(suggestionPrixEntity);
        notifyFrontend();
        return  suugestion;
    }

    public List<SuggestionPrixEntity> getPriceSuggestions() {
        return  this.suggestionPrixRepository.findAll();
    }
    protected String getEntityTopic(){
        return "add-price-suggestion";
    }
    public void notifyFrontend(){
        final String entityTopic = getEntityTopic();
        if(entityTopic==null){

            return;
        }
        webSocketService.sendMessage(entityTopic);

    }
}
