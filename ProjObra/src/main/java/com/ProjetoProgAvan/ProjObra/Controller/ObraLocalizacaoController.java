package com.ProjetoProgAvan.ProjObra.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoProgAvan.ProjObra.services.ObraLocalizacaoServices;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/obralocalizacao")
public class ObraLocalizacaoController {

    final ObraLocalizacaoServices obraLocalizacaoServices;

    public ObraLocalizacaoController(ObraLocalizacaoServices obraLocalizacaoServices) {
        this.obraLocalizacaoServices = obraLocalizacaoServices;
    }
    
}
