package com.ProjetoProgAvan.ProjObra.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoProgAvan.ProjObra.services.ObraDetalhesTecnicosServices;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/obradetalhes")
public class ObraDetalhesTecnicosController {

    final ObraDetalhesTecnicosServices obraDetalhesTecnicosServices;

    public ObraDetalhesTecnicosController(ObraDetalhesTecnicosServices obraDetalhesTecnicosServices) {
        this.obraDetalhesTecnicosServices = obraDetalhesTecnicosServices;
    }
    
    
}
