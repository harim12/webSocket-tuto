package com.RimHAASSANI.websockettuto.repository;

import com.RimHAASSANI.websockettuto.entity.DemenagementFormEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemenagementFormRepository  extends JpaRepository<DemenagementFormEntity,Integer> {
}
