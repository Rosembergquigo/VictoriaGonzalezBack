package com.prod.victoriagonzalez.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cedula;
	private String nombre;
	private String telefono;
	private String correo;
	/*
	 * @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 * 
	 * @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	 * 
	 * @JoinColumn(name = "id_medida") private List<Medida> medidas;
	 */
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/*
	 * public List<Medida> getMedidas() { return medidas; } public void
	 * setMedidas(List<Medida> medidas) { this.medidas = medidas; }
	 */
	
	
}
