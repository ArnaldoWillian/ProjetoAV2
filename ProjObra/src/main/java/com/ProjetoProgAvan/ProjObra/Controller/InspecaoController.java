package com.ProjetoProgAvan.ProjObra.Controller;


import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoProgAvan.ProjObra.dtos.InspecaoDot;
import com.ProjetoProgAvan.ProjObra.model.Inspecao;
import com.ProjetoProgAvan.ProjObra.services.InspecaoServices;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/inspecao")
public class InspecaoController {

    final InspecaoServices inspecaoServices;

    public InspecaoController(InspecaoServices inspecaoServices) {
        this.inspecaoServices = inspecaoServices;
    }
    @PostMapping
    public ResponseEntity<Object> saveInspecao(@RequestBody  InspecaoDot inspecaoDot){
        var inspecao = new Inspecao();
        BeanUtils.copyProperties(inspecaoDot, inspecao);
        inspecao.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(inspecaoServices.save(inspecao));
    }

}


