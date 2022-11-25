package com.ProjetoProgAvan.ProjObra.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.ProjetoProgAvan.ProjObra.Repository.InspecaoRepository;
import com.ProjetoProgAvan.ProjObra.model.Inspecao;
import com.ProjetoProgAvan.ProjObra.model.ObraInspecao;

@Service
public class InspecaoServices {
    
    final InspecaoRepository inspecaoRepository;

    public InspecaoServices(InspecaoRepository inspecaoRepository) {
        this.inspecaoRepository = inspecaoRepository;
        
    }
    @Transactional
    public Inspecao save(Inspecao inspecao) {
        return inspecaoRepository.save(inspecao);
    }

    public boolean existsById(Integer id) {
        return inspecaoRepository.existsById(id);
     }

     public boolean existsByDate(LocalDate date){
        return inspecaoRepository.existsByDate(date);
     }

      public boolean existsByObservacoesAndObraInspecaoId(String observacoes, ObraInspecao obraInspecaoId) {
        return inspecaoRepository.existsByObservacoesAndObraInspecaoId(observacoes, obraInspecaoId);
    }

    public List<Inspecao> findAll() {
        return inspecaoRepository.findAll();
    }

    public Optional<Inspecao> findById(Integer id) {
        return inspecaoRepository.findById(id);
    }
    
    }

