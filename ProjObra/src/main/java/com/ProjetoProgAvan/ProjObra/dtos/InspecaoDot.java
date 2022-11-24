package com.ProjetoProgAvan.ProjObra.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class InspecaoDot {
   
    @NotNull
    private LocalDate date;
    @NotBlank
    private String observacoes;
   

}
