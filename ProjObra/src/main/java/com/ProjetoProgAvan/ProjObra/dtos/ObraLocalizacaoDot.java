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
}
