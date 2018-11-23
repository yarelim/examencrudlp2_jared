package com.jared.modell;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="producto")
public class Producto {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_producto")
	long id;
	
	@Column(name = "name_producto")
	String name_producto;
	
	@Column(name = "mac")
	String mac;
	
	@Column(name = "descripcion")
	String descripcion;
	
	
	
	@ManyToOne
	@JoinColumn(name = "modelo_id_modelo")
	private Modelo modelo;

	
	
	public Producto() {
		super();

	}

	
	
	
	public Producto(long id, String name_producto, String mac, String descripcion, Modelo modelo) {
		super();
		this.id = id;
		this.name_producto = name_producto;
		this.mac = mac;
		this.descripcion = descripcion;
		this.modelo = modelo;
	}




	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName_producto() {
		return name_producto;
	}

	public void setName_producto(String name_producto) {
		this.name_producto = name_producto;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Modelo getModelo() {
		return modelo;
	}


	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	

	
	
}
