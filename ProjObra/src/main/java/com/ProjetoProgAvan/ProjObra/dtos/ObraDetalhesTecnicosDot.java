package com.ProjetoProgAvan.ProjObra.dtos;

import javax.validation.constraints.NotBlank;

import com.ProjetoProgAvan.ProjObra.enum2.ObraRisco;
import com.ProjetoProgAvan.ProjObra.enum2.ObraTipo;

public class ObraDetalhesTecnicosDot {
    
    @NotBlank
    private  ObraTipo tipo;
	@NotBlank
    private ObraRisco risco;
   
    
}
