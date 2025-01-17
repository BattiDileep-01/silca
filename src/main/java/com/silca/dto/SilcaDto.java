package com.silca.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SilcaDto {

    private int silcaId;
    private String vehicleMake;
    private String vehicleModel;
    private long snNum;
}
