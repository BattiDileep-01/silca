package com.silca.service;

import com.silca.dto.SilcaDto;
import com.silca.repository.SilcaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SilcaServiceImpl implements SilcaService{
    @Autowired
    SilcaRepo silcarepo;

    @Override
    public SilcaDto addCutting(SilcaDto silcadto) {
       
        return null;
    }

    @Override
    public SilcaDto getCuttingByID(int silcaId) {
        return null;
    }

    @Override
    public List<SilcaDto> getAllCutting() {
        return List.of();
    }

    @Override
    public SilcaDto updateCuttingById(int silcaId) {
        return null;
    }

    @Override
    public SilcaDto deleteCuttingByID(int silcaID) {
        return null;
    }
}
