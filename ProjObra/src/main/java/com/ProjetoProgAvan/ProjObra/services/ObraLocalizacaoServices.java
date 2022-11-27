package com.ProjetoProgAvan.ProjObra.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ProjetoProgAvan.ProjObra.Repository.ObraLocalizacaoReposiroty;
import com.ProjetoProgAvan.ProjObra.model.Obra;
import com.ProjetoProgAvan.ProjObra.model.ObraLocalizacao;

@Service
public class ObraLocalizacaoServices {

    final ObraLocalizacaoReposiroty obraLocalizacaoReposiroty;

    public ObraLocalizacaoServices(ObraLocalizacaoReposiroty obraLocalizacaoReposiroty) {
        this.obraLocalizacaoReposiroty = obraLocalizacaoReposiroty;
    }

    public boolean existsById(Integer id) {
        return obraLocalizacaoReposiroty.existsById(id);
    }

    public boolean existsByCidade(String cidade) {
        return obraLocalizacaoReposiroty.existsByCidade(cidade);
    }

    public boolean existsByEstado(String estado) {
        return obraLocalizacaoReposiroty.existsByEstado(estado);
    }

    public boolean existsByLatitude(String latitude) {
        return obraLocalizacaoReposiroty.existsByLatitude(latitude);
    }

    public boolean existsByLongitude(String longitude) {
        return obraLocalizacaoReposiroty.existsByLongitude(longitude);
    }

    public boolean existsByObraId(Obra obraId) {
        return obraLocalizacaoReposiroty.existsByObraId(obraId);
    }

    @Transactional
    public ObraLocalizacao save(ObraLocalizacao obraLocalizacao) {
        return obraLocalizacaoReposiroty.save(obraLocalizacao);
    }

    public List <ObraLocalizacao> findAll() {
        return obraLocalizacaoReposiroty.findAll();
    }

    public Optional<ObraLocalizacao> findById(Integer id) {
        return obraLocalizacaoReposiroty.findById(id);
    }

    @Transactional
    public void delete(ObraLocalizacao obraLocalizacao) {
        obraLocalizacaoReposiroty.delete(obraLocalizacao);
    }
    
    
}
