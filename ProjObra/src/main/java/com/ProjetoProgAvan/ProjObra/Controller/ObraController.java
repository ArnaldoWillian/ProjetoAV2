package com.ProjetoProgAvan.ProjObra.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoProgAvan.ProjObra.services.ObraServices;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/obra")
public class ObraController {

    final ObraServices obraServices;

    public ObraController(ObraServices obraServices) {
        this.obraServices = obraServices;
    }
     
}
