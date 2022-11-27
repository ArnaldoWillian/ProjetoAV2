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
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneProjObra(@PathVariable(value = "id") Integer id) {
        Optional<ObraDetalhesTecnicos> obraDetalhesTecnicosOptional = obraDetalhesTecnicosServices.findById(id);
        if (!obraDetalhesTecnicosOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ObraDetalhesTecnicos not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(obraDetalhesTecnicosOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProjObra(@PathVariable(value = "id") Integer id) {
        Optional<ObraDetalhesTecnicos> obraDetalhesTecnicosOptional = obraDetalhesTecnicosServices.findById(id);
        if (!obraDetalhesTecnicosOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ObraDetalhesTecnicos not found.");
        }
        obraDetalhesTecnicosServices.delete(obraDetalhesTecnicosOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body(" ObraDetalhesTecnicos deleted successfully.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateProjObra(@PathVariable(value = "id") Integer id,
            @RequestBody ObraDetalhesTecnicosDot obraDetalhesTecnicosDot) {
        Optional<ObraDetalhesTecnicos> obraDetalhesTecnicosOptional = obraDetalhesTecnicosServices.findById(id);
        if (!obraDetalhesTecnicosOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ObraDetalhesTecnicos Spot not found.");
        }
        var ObraDetalhesTecnicos = obraDetalhesTecnicosOptional.get();
        ObraDetalhesTecnicos.setId(obraDetalhesTecnicosDot.getId());
        ObraDetalhesTecnicos.setTipo(obraDetalhesTecnicosDot.getTipo());
        ObraDetalhesTecnicos.setRisco(obraDetalhesTecnicosDot.getRisco());
        ObraDetalhesTecnicos.setObraId(obraDetalhesTecnicosDot.getObraId());

        return ResponseEntity.status(HttpStatus.OK).body(obraDetalhesTecnicosServices.save(ObraDetalhesTecnicos));
    }
}
