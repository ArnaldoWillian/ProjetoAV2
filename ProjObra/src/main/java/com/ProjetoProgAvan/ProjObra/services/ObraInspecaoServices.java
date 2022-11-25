package com.ProjetoProgAvan.ProjObra.services;

import org.springframework.stereotype.Service;

import com.ProjetoProgAvan.ProjObra.Repository.ObraInspecaoRepository;

@Service
public class ObraInspecaoServices {

    final ObraInspecaoRepository obraInspecaoRepository;

    public ObraInspecaoServices(ObraInspecaoRepository obraInspecaoRepository) {
        this.obraInspecaoRepository = obraInspecaoRepository;
    }
    
}
