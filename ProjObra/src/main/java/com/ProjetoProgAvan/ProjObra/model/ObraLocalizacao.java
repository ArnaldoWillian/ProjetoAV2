package com.ProjetoProgAvan.ProjObra.model;

public class ObraLocalizacao {

	private Integer id;
	
    private String cidade;
	
    private String estado;

    private String latitude;
	
    private String longitude;
   
    private Obra obraId;
    
    

	public ObraLocalizacao(Integer id, String cidade, String estado, String latitude, String longitude, Obra obraId) {
		super();
		this.id = id;
		this.cidade = cidade;
		this.estado = estado;
		this.latitude = latitude;
		this.longitude = longitude;
		this.obraId = obraId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Obra getObraId() {
		return obraId;
	}

	public void setObraId(Obra obraId) {
		this.obraId = obraId;
	}
    
    
    
}
