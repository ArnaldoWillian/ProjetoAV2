package com.ProjetoProgAvan.ProjObra.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ObraDot {

    @NotBlank
    private String nome;
    @NotNull
    private Integer anoConstrucao;
    @NotBlank
    private String coordenacao;
    @NotBlank
    private String gerencia;
    @NotBlank
    private String diretoria;
    @NotBlank
    private String outorga;
    @NotBlank
    private String titularidade;
    
}
