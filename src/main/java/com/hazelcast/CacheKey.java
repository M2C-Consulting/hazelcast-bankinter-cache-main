package com.hazelcast;

import java.io.Serializable;

public class CacheKey implements Serializable{
    
	private static final long serialVersionUID = 1L;
    
	private String empresa = ""; // 4 caracteres
	private String aplicacion = ""; // 3 caracteres
	private Integer secuencia2 = 0;
	private String idioma2 = ""; // 5 caracteres
	private String canal = ""; // 3 caracteres
	private String dispositivo = ""; // 3 caracteres
	
	public CacheKey(String empresa, String aplicacion, Integer secuencia2, String idioma2, String canal, String dispositivo) {
		this.empresa = empresa;
		this.aplicacion = aplicacion;
		this.secuencia2 = secuencia2;
		this.idioma2 = idioma2;
		this.canal = canal;
		this.dispositivo = dispositivo;
	};
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getAplicacion() {
		return aplicacion;
	}
	public void setAplicacion(String aplicacion) {
		this.aplicacion = aplicacion;
	}
	public Integer getSecuencia2() {
		return secuencia2;
	}
	public void setSecuencia2(Integer secuencia2) {
		this.secuencia2 = secuencia2;
	}
	public String getIdioma2() {
		return idioma2;
	}
	public void setIdioma2(String idioma2) {
		this.idioma2 = idioma2;
	}
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public String getDispositivo() {
		return dispositivo;
	}
	public void setDispositivo(String dispositivo) {
		this.dispositivo = dispositivo;
	}

	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    
	    CacheKey that = (CacheKey) o;
	    return this.empresa.equals(that.empresa) &&
	      this.aplicacion.equals(that.aplicacion) &&
	      this.secuencia2 == that.secuencia2 &&
	      this.idioma2.equals(that.idioma2) &&
		  this.canal.equals(that.canal) &&
		  this.dispositivo.equals(that.dispositivo);
	}
	
}
