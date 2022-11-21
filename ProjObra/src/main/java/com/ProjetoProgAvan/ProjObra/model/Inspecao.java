package com.ProjetoProgAvan.ProjObra.model;

import java.time.LocalDate;

import javax.persistence.Entity;



@Entity
public class Inspecao {
	
	
	private Integer id;
	
    private LocalDate date;
    
    private String observacoes;
    
    private ObraInspecao obraInspecaoId;
	

	public Inspecao() {
	}

	public Inspecao(Integer id, LocalDate date, String observacoes, ObraInspecao obraInspecaoId) {
		this.id = id;
		this.date = date;
		this.observacoes = observacoes;
		this.obraInspecaoId = obraInspecaoId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public ObraInspecao getObraInspecaoId() {
		return obraInspecaoId;
	}

	public void setObraInspecaoId(ObraInspecao obraInspecaoId) {
		this.obraInspecaoId = obraInspecaoId;
	}

	
}