package com.ProjetoProgAvan.ProjObra.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import com.ProjetoProgAvan.ProjObra.Repository.ObraDetalhesTecnicosRepository;
import com.ProjetoProgAvan.ProjObra.enum2.ObraRisco;
import com.ProjetoProgAvan.ProjObra.enum2.ObraTipo;
import com.ProjetoProgAvan.ProjObra.model.Obra;
import com.ProjetoProgAvan.ProjObra.model.ObraDetalhesTecnicos;

@Service
public class ObraDetalhesTecnicosServices {

    final ObraDetalhesTecnicosRepository obraDetalhesTecnicosRepository;

    public ObraDetalhesTecnicosServices(ObraDetalhesTecnicosRepository obraDetalhesTecnicosRepository) {
        this.obraDetalhesTecnicosRepository = obraDetalhesTecnicosRepository;
    }

    public boolean existsById(Integer id) {
        return obraDetalhesTecnicosRepository.existsById(id);
    }

    public boolean existsByTipo(ObraTipo tipo) {
        return obraDetalhesTecnicosRepository.existsByTipo(tipo);
    }

    public boolean existsByObraId(Obra obraId) {
        return obraDetalhesTecnicosRepository.existsByObraId(obraId);
    }

    public boolean existsByRisco(ObraRisco risco) {
        return obraDetalhesTecnicosRepository.existsByRisco(risco);
    }

    @Transactional
    public ObraDetalhesTecnicos save(ObraDetalhesTecnicos obraDetalhesTecnicos) {
        return obraDetalhesTecnicosRepository.save(obraDetalhesTecnicos);
    }

    public List<ObraDetalhesTecnicos> findAll() {
        return obraDetalhesTecnicosRepository.findAll();
    }

    public Optional<ObraDetalhesTecnicos> findById(Integer id) {
        return obraDetalhesTecnicosRepository.findById(id);
    }

    public void delete(ObraDetalhesTecnicos obraDetalhesTecnicos) {
        obraDetalhesTecnicosRepository.delete(obraDetalhesTecnicos);
    }

}
