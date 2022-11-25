package com.ProjetoProgAvan.ProjObra.services;

import org.springframework.stereotype.Service;

import com.ProjetoProgAvan.ProjObra.Repository.ObraLocalizacaoReposiroty;

@Service
public class ObraLocalizacaoServices {

    final ObraLocalizacaoReposiroty obraLocalizacaoReposiroty;

    public ObraLocalizacaoServices(ObraLocalizacaoReposiroty obraLocalizacaoReposiroty) {
        this.obraLocalizacaoReposiroty = obraLocalizacaoReposiroty;
    }

    
    
}
