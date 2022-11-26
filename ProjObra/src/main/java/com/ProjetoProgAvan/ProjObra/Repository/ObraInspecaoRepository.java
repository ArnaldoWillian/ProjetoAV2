package com.ProjetoProgAvan.ProjObra.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjetoProgAvan.ProjObra.enum2.InspecaoFrequencia;
import com.ProjetoProgAvan.ProjObra.enum2.InspecaoStatus;
import com.ProjetoProgAvan.ProjObra.model.Obra;
import com.ProjetoProgAvan.ProjObra.model.ObraInspecao;

@Repository
public interface ObraInspecaoRepository extends JpaRepository<ObraInspecao,Integer> {

    boolean existsByFrequencia(InspecaoFrequencia frequencia);

    boolean existsByMes(Integer mes);

    boolean existsByStatus(InspecaoStatus status);

    boolean existsByPrioridade(Integer prioridade);

    boolean existsByObraId(Obra obraId);

    boolean existsByStatusAndObraId(InspecaoStatus status, Obra obraId);

   
     
}
