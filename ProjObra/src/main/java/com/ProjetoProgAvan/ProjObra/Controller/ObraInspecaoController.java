package com.ProjetoProgAvan.ProjObra.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoProgAvan.ProjObra.services.ObraInspecaoServices;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/obrainspecao")
public class ObraInspecaoController {
    final ObraInspecaoServices obraInspecaoServices;

    public ObraInspecaoController(ObraInspecaoServices obraInspecaoServices) {
        this.obraInspecaoServices = obraInspecaoServices;
    }
    
    
}
