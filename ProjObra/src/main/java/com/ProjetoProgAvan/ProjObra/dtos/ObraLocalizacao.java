package com.ProjetoProgAvan.ProjObra.dtos;

import javax.validation.constraints.NotBlank;

public class ObraLocalizacao {
   
    @NotBlank
    private String cidade;
	@NotBlank
    private String estado;
    @NotBlank
    private String latitude;
	@NotBlank
    private String longitude;
}
