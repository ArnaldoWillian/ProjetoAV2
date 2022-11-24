package com.ProjetoProgAvan.ProjObra.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.ProjetoProgAvan.ProjObra.enum2.ObraRisco;
import com.ProjetoProgAvan.ProjObra.enum2.ObraTipo;

@Entity
public class ObraDetalhesTecnicos {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	@Enumerated(EnumType.STRING)
    private ObraTipo tipo;
	@Enumerated(EnumType.STRING)
    private ObraRisco risco;
    @OneToOne
	@JoinColumn(name = "obra_id",referencedColumnName = "id")
    private Obra obraId;

	public ObraDetalhesTecnicos() {
		
		
	}

	public ObraDetalhesTecnicos(UUID id, ObraTipo tipo, ObraRisco risco, Obra obraId) {
		
		this.id = id;
		this.tipo = tipo;
		this.risco = risco;
		this.obraId = obraId;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
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
