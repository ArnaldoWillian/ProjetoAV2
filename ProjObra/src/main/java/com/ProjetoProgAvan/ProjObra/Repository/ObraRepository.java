package com.ProjetoProgAvan.ProjObra.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjetoProgAvan.ProjObra.model.Obra;

@Repository
public interface ObraRepository extends JpaRepository<Obra, Integer>{
    
}
