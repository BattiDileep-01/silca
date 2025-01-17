package com.silca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SilcaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Integer silcaId;
    @NonNull
    private String vehicleMake;
    @NonNull
    private String vehicleModel;
    @NonNull
    private long snNum;

}
