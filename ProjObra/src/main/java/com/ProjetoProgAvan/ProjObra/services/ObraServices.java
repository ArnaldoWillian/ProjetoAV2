package com.ProjetoProgAvan.ProjObra.services;


import org.springframework.stereotype.Service;

import com.ProjetoProgAvan.ProjObra.Repository.ObraRepository;

@Service
public class ObraServices {

    
    final ObraRepository obraRepository;

    public ObraServices(ObraRepository obraRepository) {
        this.obraRepository = obraRepository;
    }



    
}
