package com.jared.modell;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="modelo")
public class Modelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_modelo")
	long idModelo;
	
	@Column(name = "name_modelo")
	String nameModelo;
	
	

	public Modelo() {
		super();

	}

	public Modelo(long idModelo, String nameModelo ) {
		super();
		this.idModelo = idModelo;
		this.nameModelo = nameModelo;
		
	}
	
	public long getId() {
		return idModelo;
	}

	public void setId(long idModelo) {
		this.idModelo = idModelo;
	}

	public String getNameModelo() {
		return nameModelo;
	}

	public void setName_producto(String nameModelo) {
		this.nameModelo = nameModelo;
	}

	
}
