package com.ProjetoProgAvan.ProjObra.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.ProjetoProgAvan.ProjObra.model.ObraInspecao;

public class InspecaoDot {

    @NotBlank
    private Integer id;
    @NotNull
    private LocalDate date;
    @NotBlank
    private String observacoes;
    @NotBlank
    private ObraInspecao obraInspecaoId;

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
