package com.ProjetoProgAvan.ProjObra.Controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoProgAvan.ProjObra.dtos.ObraDetalhesTecnicosDot;
import com.ProjetoProgAvan.ProjObra.model.ObraDetalhesTecnicos;
import com.ProjetoProgAvan.ProjObra.services.ObraDetalhesTecnicosServices;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/obradetalhes")
public class ObraDetalhesTecnicosController {

    final ObraDetalhesTecnicosServices obraDetalhesTecnicosServices;

    public ObraDetalhesTecnicosController(ObraDetalhesTecnicosServices obraDetalhesTecnicosServices) {
        this.obraDetalhesTecnicosServices = obraDetalhesTecnicosServices;
    }

    @PostMapping
    public ResponseEntity<Object> saveProjObra(@RequestBody ObraDetalhesTecnicosDot obraDetalhesTecnicosDot) {

        if (obraDetalhesTecnicosServices.existsById(obraDetalhesTecnicosDot.getId())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: ID is already in use!");
        }
        if (obraDetalhesTecnicosServices.existsByTipo(obraDetalhesTecnicosDot.getTipo())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Tipo is already in use!");
        }
        if (obraDetalhesTecnicosServices.existsByRisco(obraDetalhesTecnicosDot.getRisco())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Risco is already in use!");
        }
        if (obraDetalhesTecnicosServices.existsByObraId(obraDetalhesTecnicosDot.getObraId())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: ObraID is already in no");
        }

        var obraDetalhesTecnicos = new ObraDetalhesTecnicos();
        BeanUtils.copyProperties(obraDetalhesTecnicosDot, obraDetalhesTecnicos);
        ObraDetalhesTecnicos.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(obraDetalhesTecnicosServices.save(obraDetalhesTecnicos));
    }
    @GetMapping
    public ResponseEntity<Object> getAllProjObras() {
        return ResponseEntity.status(HttpStatus.OK).body(obraDetalhesTecnicosServices.findAll());
    }
    
}
