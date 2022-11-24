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
  
}
