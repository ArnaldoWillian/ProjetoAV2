package com.ProjetoProgAvan.ProjObra.model;



import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.ProjetoProgAvan.ProjObra.enum2.InspecaoFrequencia;
import com.ProjetoProgAvan.ProjObra.enum2.InspecaoStatus;
@Entity
public class ObraInspecao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Enumerated(EnumType.STRING)
    private InspecaoFrequencia frequencia;
    
    private Integer mes;
    @Enumerated(EnumType.STRING)
    private InspecaoStatus status;
    
    private Integer prioridade;
    @OneToOne
	@JoinColumn(name = "obra_id",referencedColumnName = "id")
    private Obra obraId;

	public ObraInspecao() {
	}

	public ObraInspecao(Integer id, InspecaoFrequencia frequencia, Integer mes, InspecaoStatus status,
			Integer prioridade, Obra obraId) {
		
		this.id = id;
		this.frequencia = frequencia;
		this.mes = mes;
		this.status = status;
		this.prioridade = prioridade;
		this.obraId = obraId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public InspecaoFrequencia getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(InspecaoFrequencia frequencia) {
		this.frequencia = frequencia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public InspecaoStatus getStatus() {
		return status;
	}

	public void setStatus(InspecaoStatus status) {
		this.status = status;
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

	public Obra getObraId() {
		return obraId;
	}

	public void setObraId(Obra obraId) {
		this.obraId = obraId;
	}

    
    
}
