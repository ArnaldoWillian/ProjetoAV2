package com.ProjetoProgAvan.ProjObra.dtos;

import javax.validation.constraints.NotBlank;

import com.ProjetoProgAvan.ProjObra.enum2.ObraRisco;
import com.ProjetoProgAvan.ProjObra.enum2.ObraTipo;

public class ObraDetalhesTecnicosDot {
    
    @NotBlank
    private  ObraTipo tipo;
	@NotBlank
    private ObraRisco risco;
    
    public ObraTipo getTipo() {
        return tipo;
    }
    public void setTipo(ObraTipo tipo) {
        this.tipo = tipo;
    }
    public ObraRisco getRisco() {
        return risco;
    }
    public void setRisco(ObraRisco risco) {
        this.risco = risco;
    }
   
    
}
