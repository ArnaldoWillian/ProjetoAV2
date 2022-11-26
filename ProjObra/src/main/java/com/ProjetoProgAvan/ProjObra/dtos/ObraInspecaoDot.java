package com.ProjetoProgAvan.ProjObra.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.ProjetoProgAvan.ProjObra.enum2.InspecaoFrequencia;
import com.ProjetoProgAvan.ProjObra.enum2.InspecaoStatus;

public class ObraInspecaoDot {
    
    @NotBlank
    private InspecaoFrequencia frequencia;
    @NotNull
    private Integer mes;
    @NotBlank
    private InspecaoStatus status;
    @NotNull
    private Integer prioridade;
    
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

    
  
}
