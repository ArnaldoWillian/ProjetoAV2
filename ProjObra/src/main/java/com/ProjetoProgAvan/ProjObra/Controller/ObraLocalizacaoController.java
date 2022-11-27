package com.ProjetoProgAvan.ProjObra.Controller;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoProgAvan.ProjObra.dtos.ObraLocalizacaoDot;
import com.ProjetoProgAvan.ProjObra.model.ObraLocalizacao;
import com.ProjetoProgAvan.ProjObra.services.ObraLocalizacaoServices;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/obralocalizacao")
public class ObraLocalizacaoController {

    final ObraLocalizacaoServices obraLocalizacaoServices;

    public ObraLocalizacaoController(ObraLocalizacaoServices obraLocalizacaoServices) {
        this.obraLocalizacaoServices = obraLocalizacaoServices;
    }

    @PostMapping
    public ResponseEntity<Object> saveProjObra(@RequestBody ObraLocalizacaoDot ObraLocalizacaoDot) {

        if (obraLocalizacaoServices.existsById(ObraLocalizacaoDot.getId())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: ID is already in use!");
        }
        if (obraLocalizacaoServices.existsByCidade(ObraLocalizacaoDot.getCidade())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: DATE is already in use!");
        }
        if (obraLocalizacaoServices.existsByEstado(ObraLocalizacaoDot.getEstado())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Observation is already registered for this Observation/Work Inspection id!");
        }
        if (obraLocalizacaoServices.existsByLatitude(ObraLocalizacaoDot.getLatitude())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: DATE is already in use!");
        }
        if (obraLocalizacaoServices.existsByLongitude(ObraLocalizacaoDot.getLongitude())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: DATE is already in use!");
        }
        if (obraLocalizacaoServices.existsByObraId(ObraLocalizacaoDot.getObraId())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: DATE is already in use!");
        }

        var obraLocalizacao = new ObraLocalizacao();
        BeanUtils.copyProperties(ObraLocalizacaoDot, obraLocalizacao);
        ObraLocalizacao.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(obraLocalizacaoServices.save(obraLocalizacao));
        }

        
    }

