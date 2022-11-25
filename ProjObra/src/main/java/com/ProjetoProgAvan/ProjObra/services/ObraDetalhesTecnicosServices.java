package com.ProjetoProgAvan.ProjObra.services;

import org.springframework.stereotype.Service;

import com.ProjetoProgAvan.ProjObra.Repository.ObraDetalhesTecnicosRepository;

@Service
public class ObraDetalhesTecnicosServices {

    final ObraDetalhesTecnicosRepository obraDetalhesTecnicosRepository;

    public ObraDetalhesTecnicosServices(ObraDetalhesTecnicosRepository obraDetalhesTecnicosRepository) {
        this.obraDetalhesTecnicosRepository = obraDetalhesTecnicosRepository;
    }

        
}
