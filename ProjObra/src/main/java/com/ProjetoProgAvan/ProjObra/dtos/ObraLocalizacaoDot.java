package com.ProjetoProgAvan.ProjObra.dtos;

import javax.validation.constraints.NotBlank;

public class ObraLocalizacaoDot {
   
    @NotBlank
    private String cidade;
	@NotBlank
    private String estado;
    @NotBlank
    private String latitude;
	@NotBlank
    private String longitude;
    
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


