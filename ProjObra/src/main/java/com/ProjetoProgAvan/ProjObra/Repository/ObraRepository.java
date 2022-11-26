package com.ProjetoProgAvan.ProjObra.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjetoProgAvan.ProjObra.model.Obra;

@Repository
public interface ObraRepository extends JpaRepository<Obra, Integer>{
    
    boolean existsById(Integer id); 
    boolean existsByNome(String nome);
    boolean existsByAnoConstrucao(Integer AnoConstrucao);
    boolean existsByGerencia(String Gerencia);
    boolean existsByDiretoria(String Diretoria);
    boolean existsByOutorga(String Outorga);
    boolean existsByTitularidade(String Titularidade);
    boolean existsByCoordenacao(String coordenacao);
}
