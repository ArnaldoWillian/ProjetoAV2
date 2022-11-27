package com.ProjetoProgAvan.ProjObra.dtos;

import javax.validation.constraints.NotBlank;

import com.ProjetoProgAvan.ProjObra.model.Obra;

public class ObraLocalizacaoDot {

    @NotBlank
    private Integer id;
    @NotBlank
    private String cidade;
    @NotBlank
    private String estado;
    @NotBlank
    private String latitude;
    @NotBlank
    private String longitude;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}
