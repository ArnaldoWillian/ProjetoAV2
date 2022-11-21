package com.ProjetoProgAvan.ProjObra.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.ProjetoProgAvan.ProjObra.ObraRisco;
import com.ProjetoProgAvan.ProjObra.ObraTipo;

@Entity
public class ObraDetalhesTecnicos {
	
	private Integer id;
	@Enumerated(EnumType.STRING)
    private ObraTipo tipo;
	@Enumerated(EnumType.STRING)
    private ObraRisco risco;
   
    private Obra obraId;

	public ObraDetalhesTecnicos() {
		
		
	}

	public ObraDetalhesTecnicos(Integer id, ObraTipo tipo, ObraRisco risco, Obra obraId) {
		
		this.id = id;
		this.tipo = tipo;
		this.risco = risco;
		this.obraId = obraId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Obra getObraId() {
		return obraId;
	}

	public void setObraId(Obra obraId) {
		this.obraId = obraId;
	}

    
}
