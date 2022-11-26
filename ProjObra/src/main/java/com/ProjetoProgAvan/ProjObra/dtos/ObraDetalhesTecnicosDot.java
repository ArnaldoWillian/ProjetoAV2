package com.ProjetoProgAvan.ProjObra.dtos;

import javax.validation.constraints.NotBlank;

import com.ProjetoProgAvan.ProjObra.enum2.ObraRisco;
import com.ProjetoProgAvan.ProjObra.enum2.ObraTipo;
import com.ProjetoProgAvan.ProjObra.model.Obra;

public class ObraDetalhesTecnicosDot {
    
    @NotBlank
    private Integer id;
    @NotBlank
    private  ObraTipo tipo;
	@NotBlank
    private ObraRisco risco;
    @NotBlank
    private Obra obraId;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Obra getObraId() {
        return obraId;
    }
    public void setObraId(Obra obraId) {
        this.obraId = obraId;
    }
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
