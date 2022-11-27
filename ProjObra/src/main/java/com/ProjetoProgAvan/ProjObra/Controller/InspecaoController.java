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
    public ResponseEntity<Object> saveProjObra(@RequestBody InspecaoDot inspecaoDot) {
        if (inspecaoServices.existsById(inspecaoDot.getId())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: ID is already in use!");
        }
        if (inspecaoServices.existsByDate(inspecaoDot.getDate())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: DATE is already in use!");
        }
        if (inspecaoServices.existsByObservacoesAndObraInspecaoId(inspecaoDot.getObservacoes(),
                inspecaoDot.getObraInspecaoId())) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("Conflict: Observation is already registered for this Observation/Work Inspection id!");
        }

        var inspecao = new Inspecao();
        BeanUtils.copyProperties(inspecaoDot, inspecao);
        Inspecao.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(inspecaoServices.save(inspecao));
    }

    @GetMapping
    public ResponseEntity<List<Inspecao>> getAllProjObras() {
        return ResponseEntity.status(HttpStatus.OK).body(inspecaoServices.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneProjObra(@PathVariable(value = "id") Integer id) {
        Optional<Inspecao> inspecaoOptional = inspecaoServices.findById(id);
        if (!inspecaoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Inspecao not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(inspecaoOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProjObra(@PathVariable(value = "id") Integer id) {
        Optional<Inspecao> inspecaoOptional = inspecaoServices.findById(id);
        if (!inspecaoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Inspecao not found.");
        }
        inspecaoServices.delete(inspecaoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body(" Inspecao deleted successfully.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateProjObra(@PathVariable(value = "id") Integer id,
            @RequestBody InspecaoDot inspecaoDot) {
        Optional<Inspecao> inspecaoOptional = inspecaoServices.findById(id);
        if (!inspecaoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Inspecao Spot not found.");
        }
        var inspecao = inspecaoOptional.get();
        inspecao.setId(inspecaoDot.getId());
        inspecao.setDate(inspecaoDot.getDate());
        inspecao.setObservacoes(inspecaoDot.getObservacoes());
        inspecao.setObraInspecaoId(inspecaoDot.getObraInspecaoId());

        return ResponseEntity.status(HttpStatus.OK).body(inspecaoServices.save(inspecao));
    }
}
