package com.RimHAASSANI.websockettuto.repository;

import com.RimHAASSANI.websockettuto.entity.SuggestionPrixEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuggestionPrixRepository extends JpaRepository<SuggestionPrixEntity,Integer> {
}
