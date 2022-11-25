package com.ProjetoProgAvan.ProjObra.Repository;

import java.time.LocalDate;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjetoProgAvan.ProjObra.model.Inspecao;
import com.ProjetoProgAvan.ProjObra.model.ObraInspecao;

@Repository
public interface InspecaoRepository extends JpaRepository<Inspecao, Integer>{
    
    boolean existsById(Integer id); 
    boolean existsByDate(LocalDate date);
    boolean existsByObservacoesAndObraInspecaoId(String observacoes, ObraInspecao obraInspecaoId);

}
