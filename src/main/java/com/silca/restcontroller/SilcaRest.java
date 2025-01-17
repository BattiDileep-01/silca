package com.silca.restcontroller;

import com.silca.dto.SilcaDto;
import com.silca.service.SilcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Api/Silca")
public class SilcaRest {
    @Autowired
    SilcaService silcaservice;

    @PostMapping("/addCutting")
    public SilcaDto addCutting(SilcaDto silcadto) {
        return null;
    }

    @GetMapping("/getCuttingByID")
    public SilcaDto getCuttingByID(int silcaId) {
        return null;
    }

    @GetMapping("/getAllCutting")
    public List<SilcaDto> getAllCutting() {
        return List.of();
    }

    @PutMapping("/updateCuttingById")
    public SilcaDto updateCuttingById(int silcaId) {
        return null;
    }

    @DeleteMapping("/deleteCuttingByID")
    public SilcaDto deleteCuttingByID(int silcaID) {
        return null;
    }
}
