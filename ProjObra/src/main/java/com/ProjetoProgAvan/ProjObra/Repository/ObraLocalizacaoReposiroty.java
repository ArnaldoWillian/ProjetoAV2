package com.ProjetoProgAvan.ProjObra.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjetoProgAvan.ProjObra.model.Obra;
import com.ProjetoProgAvan.ProjObra.model.ObraLocalizacao;

@Repository
public interface ObraLocalizacaoReposiroty extends JpaRepository<ObraLocalizacao, Integer> {

    boolean existsById(Integer id);

    boolean existsByCidade(String cidade);

    boolean existsByEstado(String estado);

    boolean existsByLatitude(String latitude);

    boolean existsByLongitude(String longitude);

    boolean existsByObraId(Obra obraId);
    
}
