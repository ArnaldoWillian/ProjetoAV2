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

import com.ProjetoProgAvan.ProjObra.dtos.ObraDot;
import com.ProjetoProgAvan.ProjObra.model.Obra;
import com.ProjetoProgAvan.ProjObra.services.ObraServices;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/obra")
public class ObraController {

    final ObraServices obraServices;

    public ObraController(ObraServices obraServices) {
        this.obraServices = obraServices;
    }

    @PostMapping
    public ResponseEntity<Object> saveProjObra(@RequestBody ObraDot obraDot) {
        if (obraServices.existsById(obraDot.getId())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: ID is already in use!");
        }
        if (obraServices.existsByNome(obraDot.getNome())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: NOME is already in use!");
        }
        if (obraServices.existsByAnoConstrucao(obraDot.getAnoConstrucao())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: AnoConstrucao is already in use!");
        }
        if (obraServices.existsByCoordenacao(obraDot.getCoordenacao())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Coordenacao is already in use!");
        }
        if (obraServices.existsByGerencia(obraDot.getGerencia())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Gerencia is already in use!");
        }
        if (obraServices.existsByDiretoria(obraDot.getDiretoria())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Diretoria is already in use!");
        }
        if (obraServices.existsByOutorga(obraDot.getOutorga())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Outorga is already in use!!");
        }
        if (obraServices.existsByTitularidade(obraDot.getTitularidade())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Titularidade is already in use!!");
        }

        var obra = new Obra();
        BeanUtils.copyProperties(obraDot, obra);
        Obra.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(obraServices.save(obra));
    }

    @GetMapping
    public ResponseEntity<List<Obra>> getAllProjObras() {
        return ResponseEntity.status(HttpStatus.OK).body(obraServices.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneProjObra(@PathVariable(value = "id") Integer id) {
        Optional<Obra> obraOptional = obraServices.findById(id);
        if (!obraOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Obra not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(obraOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProjObra(@PathVariable(value = "id") Integer id) {
        Optional<Obra> obraOptional = obraServices.findById(id);
        if (!obraOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Obra not found.");
        }
        obraServices.delete(obraOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body(" Obra deleted successfully.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateProjObra(@PathVariable(value = "id") Integer id,
            @RequestBody ObraDot obraDot) {
        Optional<Obra> obraOptional = obraServices.findById(id);
        if (!obraOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Obra Spot not found.");
        }
        var obra = obraOptional.get();
        obra.setId(obraDot.getId());
        obra.setNome(obraDot.getNome());
        obra.setAnoConstrucao(obraDot.getAnoConstrucao());
        obra.setCoordenacao(obraDot.getCoordenacao());
        obra.setGerencia(obraDot.getGerencia());
        obra.setDiretoria(obraDot.getDiretoria());
        obra.setOutorga(obraDot.getOutorga());
        obra.setTitularidade(obraDot.getTitularidade());

        return ResponseEntity.status(HttpStatus.OK).body(obraServices.save(obra));
    }
}
