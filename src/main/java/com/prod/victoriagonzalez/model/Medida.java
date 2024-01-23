package com.prod.victoriagonzalez.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medidas")
public class Medida implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String concepto;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getConcepto() {
		return concepto;
	}


	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}


	private static final long serialVersionUID = 1L;
	
	
}
