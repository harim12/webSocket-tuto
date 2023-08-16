package com.RimHAASSANI.websockettuto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DemenagementFormEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer demenagementFormId;
    private String type;
}
