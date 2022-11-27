package com.ProjetoProgAvan.ProjObra.Controller;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping
    public ResponseEntity<Object> getAllProjObras() {
        return ResponseEntity.status(HttpStatus.OK).body(obraLocalizacaoServices.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneProjObra(@PathVariable(value = "id") Integer id) {
        Optional<ObraLocalizacao> ObraLocalizacaoOptional = obraLocalizacaoServices.findById(id);
        if (!ObraLocalizacaoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Obra not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(ObraLocalizacaoOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProjObra(@PathVariable(value = "id") Integer id) {
        Optional<ObraLocalizacao> obraLocalizacaoOptional = obraLocalizacaoServices.findById(id);
        if (!obraLocalizacaoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ObraLocalizacao not found.");
        }
        obraLocalizacaoServices.delete(obraLocalizacaoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body(" ObObraLocalizacaora deleted successfully.");
    }
}
