package com.ProjetoProgAvan.ProjObra.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ObraDot {
    
    @NotBlank
    private Integer id;
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

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getAnoConstrucao() {
        return anoConstrucao;
    }
    public void setAnoConstrucao(Integer anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }
    public String getCoordenacao() {
        return coordenacao;
    }
    public void setCoordenacao(String coordenacao) {
        this.coordenacao = coordenacao;
    }
    public String getGerencia() {
        return gerencia;
    }
    public void setGerencia(String gerencia) {
        this.gerencia = gerencia;
    }
    public String getDiretoria() {
        return diretoria;
    }
    public void setDiretoria(String diretoria) {
        this.diretoria = diretoria;
    }
    public String getOutorga() {
        return outorga;
    }
    public void setOutorga(String outorga) {
        this.outorga = outorga;
    }
    public String getTitularidade() {
        return titularidade;
    }
    public void setTitularidade(String titularidade) {
        this.titularidade = titularidade;
    }
    
    

}
