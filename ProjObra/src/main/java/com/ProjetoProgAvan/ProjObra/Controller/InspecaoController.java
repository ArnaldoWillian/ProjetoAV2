package com.ProjetoProgAvan.ProjObra.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoProgAvan.ProjObra.services.InspecaoServices;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/inspecao")
public class InspecaoController {

    final InspecaoServices inspecaoServices;

    public InspecaoController(InspecaoServices inspecaoServices) {
        this.inspecaoServices = inspecaoServices;
    }
    

}
