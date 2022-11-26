package com.ProjetoProgAvan.ProjObra.services;




import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import com.ProjetoProgAvan.ProjObra.Repository.ObraRepository;
import com.ProjetoProgAvan.ProjObra.model.Obra;

@Service
public class ObraServices {

    
    final ObraRepository obraRepository;

    public ObraServices(ObraRepository obraRepository) {
        this.obraRepository = obraRepository;
    }

    @Transactional
    public Obra save(Obra obra) {
        return obraRepository.save(obra);
    }

    public boolean existsById(Integer id) {
        return obraRepository.existsById(id);
    }

    public boolean existsByNome(String nome) {
        return obraRepository.existsByNome(nome);
    }

    public boolean existsByAnoConstrucao(Integer anoConstrucao) {
        return obraRepository.existsByAnoConstrucao(anoConstrucao);
    }

    public boolean existsByGerencia(String gerencia) {
        return obraRepository.existsByGerencia(gerencia);
    }

    public boolean existsByDiretoria(String diretoria) {
        return obraRepository.existsByDiretoria(diretoria);
    }

    public boolean existsByOutorga(String outorga) {
        return obraRepository.existsByOutorga(outorga);
    }

    public boolean existsByTitularidade(String titularidade) {
        return obraRepository.existsByTitularidade(titularidade);
    }

    public boolean existsByCoordenacao(String coordenacao) {
        return obraRepository.existsByCoordenacao(coordenacao);
    }



    
}
