package com.ProjetoProgAvan.ProjObra.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.ProjetoProgAvan.ProjObra.enum2.InspecaoFrequencia;
import com.ProjetoProgAvan.ProjObra.enum2.InspecaoStatus;
import com.ProjetoProgAvan.ProjObra.model.Obra;

public class ObraInspecaoDot {

    @NotBlank
    private Integer id;
    @NotBlank
    private InspecaoFrequencia frequencia;
    @NotNull
    private Integer mes;
    @NotBlank
    private InspecaoStatus status;
    @NotNull
    private Integer prioridade;
    @NotBlank
    private Obra obraId;

    public InspecaoFrequencia getFrequencia() {
        return frequencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
