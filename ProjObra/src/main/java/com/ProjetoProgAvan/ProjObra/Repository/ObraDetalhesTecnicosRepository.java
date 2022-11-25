package com.ProjetoProgAvan.ProjObra.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjetoProgAvan.ProjObra.model.ObraDetalhesTecnicos;

@Repository
public interface ObraDetalhesTecnicosRepository extends JpaRepository<ObraDetalhesTecnicos, Integer>{
    
}
