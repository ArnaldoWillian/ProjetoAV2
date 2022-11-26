package com.ProjetoProgAvan.ProjObra.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ProjetoProgAvan.ProjObra.Repository.ObraInspecaoRepository;
import com.ProjetoProgAvan.ProjObra.enum2.InspecaoFrequencia;
import com.ProjetoProgAvan.ProjObra.enum2.InspecaoStatus;
import com.ProjetoProgAvan.ProjObra.model.Obra;
import com.ProjetoProgAvan.ProjObra.model.ObraInspecao;

@Service
public class ObraInspecaoServices {

    final ObraInspecaoRepository obraInspecaoRepository;

    public ObraInspecaoServices(ObraInspecaoRepository obraInspecaoRepository) {
        this.obraInspecaoRepository = obraInspecaoRepository;
    }

    public boolean existsByFrequencia(InspecaoFrequencia frequencia) {
        return obraInspecaoRepository.existsByFrequencia(frequencia);
    }

    public boolean existsByMes(Integer mes) {
        return obraInspecaoRepository.existsByMes(mes);
    }

    public boolean existsByStatus(InspecaoStatus status) {
        return obraInspecaoRepository.existsByStatus(status);
    }

    public boolean existsByPrioridade(Integer prioridade) {
        return obraInspecaoRepository.existsByPrioridade(prioridade);
    }
    public boolean existsByObraId(Obra obraId) {
        return obraInspecaoRepository.existsByObraId(obraId);
    }

    public boolean existsById(Integer id) {
        return obraInspecaoRepository.existsById(id);
    }
   

    @Transactional
    public ObraInspecao save(ObraInspecao obraInspecao) {
        return obraInspecaoRepository.save(obraInspecao);
    }

    public List <ObraInspecao> findAll() {
        return obraInspecaoRepository.findAll();
    }

    public Optional<ObraInspecao> findById(Integer id) {
        return obraInspecaoRepository.findById(id);
    }

    public boolean existsByStatusAndObraId(InspecaoStatus status, Obra obraId) {
        return obraInspecaoRepository.existsByStatusAndObraId(status, obraId);
    }

    public void delete(ObraInspecao obraInspecao) {
        obraInspecaoRepository.delete(obraInspecao);
    }

   

   
    
    }
    

