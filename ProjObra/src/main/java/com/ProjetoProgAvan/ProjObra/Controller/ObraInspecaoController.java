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

import com.ProjetoProgAvan.ProjObra.dtos.ObraInspecaoDot;
import com.ProjetoProgAvan.ProjObra.model.ObraInspecao;
import com.ProjetoProgAvan.ProjObra.services.ObraInspecaoServices;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/obrainspecao")
public class ObraInspecaoController {
    final ObraInspecaoServices obraInspecaoServices;

    public ObraInspecaoController(ObraInspecaoServices obraInspecaoServices) {
        this.obraInspecaoServices = obraInspecaoServices;
    }

    @PostMapping
    public ResponseEntity<Object> saveProjObra(@RequestBody ObraInspecaoDot obraInspecaoDot) {

        if (obraInspecaoServices.existsById(obraInspecaoDot.getId())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: ID is already in use!");
        }
        if (obraInspecaoServices.existsByFrequencia(obraInspecaoDot.getFrequencia())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Frequencia is already in use!");
        }
        if (obraInspecaoServices.existsByMes(obraInspecaoDot.getMes())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Mes is already in use!");
        }
        if (obraInspecaoServices.existsByStatusAndObraId(obraInspecaoDot.getStatus(), obraInspecaoDot.getObraId())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Status is already in use!!");
        }
        if (obraInspecaoServices.existsByPrioridade(obraInspecaoDot.getPrioridade())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Prioridade is already in use!");
        }
        if (obraInspecaoServices.existsByObraId(obraInspecaoDot.getObraId())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: ObraID is already in no");
        }

        var obraInspecao = new ObraInspecao();
        BeanUtils.copyProperties(obraInspecaoDot, obraInspecao);
        ObraInspecao.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(obraInspecaoServices.save(obraInspecao));
    }

    @GetMapping
    public ResponseEntity<List<ObraInspecao>> getAllProjObras() {
        return ResponseEntity.status(HttpStatus.OK).body(obraInspecaoServices.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneProjObra(@PathVariable(value = "id") Integer id) {
        Optional<ObraInspecao> obraInspecaoOptional = obraInspecaoServices.findById(id);
        if (!obraInspecaoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Obra not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(obraInspecaoOptional.get());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProjObra(@PathVariable(value = "id") Integer id){
        Optional<ObraInspecao> obraInspecaoOptional = obraInspecaoServices.findById(id);
        if (!obraInspecaoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Obra not found.");
        }
        obraInspecaoServices.delete(obraInspecaoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body(" Obra deleted successfully.");
    }
}
