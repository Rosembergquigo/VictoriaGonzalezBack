package com.prod.victoriagonzalez.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "casa")
public class Casa implements Serializable{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id_casa")
	private Long idCasa;
	@Column(name = "nombre_casa")
	private String nombreCasa;
	private String direccion;
	private String telefono;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Long getIdCasa() {
		return idCasa;
	}
	public void setIdCasa(Long idCasa) {
		this.idCasa = idCasa;
	}
	public String getNombreCasa() {
		return nombreCasa;
	}
	public void setNombreCasa(String nombreCasa) {
		this.nombreCasa = nombreCasa;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
}
