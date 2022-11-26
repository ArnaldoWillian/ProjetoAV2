package com.ProjetoProgAvan.ProjObra.model;



import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Obra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    private String nome;
    
    private Integer anoConstrucao;
    
    private String coordenacao;
    
    private String gerencia;
    
    private String diretoria;
    
    private String outorga;
    
    private String titularidade;
    
    

	public Obra() {
	}

	public Obra(Integer id, String nome, Integer anoConstrucao, String coordenacao, String gerencia, String diretoria,
			String outorga, String titularidade) {
		
		this.id = id;
		this.nome = nome;
		this.anoConstrucao = anoConstrucao;
		this.coordenacao = coordenacao;
		this.gerencia = gerencia;
		this.diretoria = diretoria;
		this.outorga = outorga;
		this.titularidade = titularidade;
	}

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

	public static void setRegistrationDate(LocalDateTime now) {
	}

	
		
	}
    
    
    

