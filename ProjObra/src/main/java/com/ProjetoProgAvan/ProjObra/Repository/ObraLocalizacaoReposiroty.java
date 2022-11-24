package com.ProjetoProgAvan.ProjObra.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjetoProgAvan.ProjObra.model.ObraLocalizacao;

@Repository
public interface ObraLocalizacaoReposiroty extends JpaRepository<ObraLocalizacao, UUID> {
    
}
