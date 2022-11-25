package com.ProjetoProgAvan.ProjObra.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
public class Inspecao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	
    private LocalDate date;
    
    private String observacoes;
    @ManyToOne
	@JoinColumn(name = "obra_inspecao_id",referencedColumnName = "id")
    private ObraInspecao obraInspecaoId;
	
	
	public Inspecao() {
	}

	public Inspecao(UUID id, LocalDate date, String observacoes, ObraInspecao obraInspecaoId) {
		this.id = id;
		this.date = date;
		this.observacoes = observacoes;
		this.obraInspecaoId = obraInspecaoId;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
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

	public static void setRegistrationDate(LocalDateTime localDateTime) {
	}

	
}