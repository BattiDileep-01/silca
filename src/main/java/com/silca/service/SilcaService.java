package com.silca.service;

import com.silca.dto.SilcaDto;

import java.util.List;

public interface SilcaService {

public SilcaDto addCutting(SilcaDto silcadto);

public SilcaDto getCuttingByID(int silcaId);

public List<SilcaDto> getAllCutting();

public SilcaDto updateCuttingById(int silcaId);

public SilcaDto deleteCuttingByID(int silcaID);
}
