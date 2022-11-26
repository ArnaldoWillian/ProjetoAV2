package com.ProjetoProgAvan.ProjObra.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProjetoProgAvan.ProjObra.enum2.ObraRisco;
import com.ProjetoProgAvan.ProjObra.enum2.ObraTipo;
import com.ProjetoProgAvan.ProjObra.model.Obra;
import com.ProjetoProgAvan.ProjObra.model.ObraDetalhesTecnicos;

@Repository
public interface ObraDetalhesTecnicosRepository extends JpaRepository<ObraDetalhesTecnicos, Integer>{

    boolean existsByTipo(ObraTipo tipo);

    boolean existsByObraId(Obra obraId);

    boolean existsByRisco(ObraRisco risco);
    
}
