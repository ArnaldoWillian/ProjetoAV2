package com.ProjetoProgAvan.ProjObra.services;

import org.springframework.stereotype.Service;
import com.ProjetoProgAvan.ProjObra.Repository.InspecaoRepository;
import com.ProjetoProgAvan.ProjObra.model.Inspecao;

@Service
public class InspecaoServices {
    
    final InspecaoRepository inspecaoRepository;

    public InspecaoServices(InspecaoRepository inspecaoRepository) {
        this.inspecaoRepository = inspecaoRepository;
        
    }

    public Inspecao save(Inspecao inspecao) {
        return inspecaoRepository.save(inspecao);
    }
}
