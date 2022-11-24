package com.ProjetoProgAvan.ProjObra.services;

import com.ProjetoProgAvan.ProjObra.Repository.InspecaoRepository;

public class InspecaoServices {
    
    final InspecaoRepository inspecaoRepository;

    public InspecaoServices(InspecaoRepository inspecaoRepository) {
        this.inspecaoRepository = inspecaoRepository;
    }
}
