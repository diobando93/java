package com.s501.s501.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Cuadros")
public class CuadrosModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombre;
	private String autor;
	private double precio;
	private String fecha;
	private Long idTienda;
	
	/*
	@ManyToOne
	@JsonBackReference
	//@JsonIgnoreProperties(value = {"referenceList", "handler","hibernateLazyInitializer"}, allowSetters = true)
    @JoinColumn(name="tienda_id")
    private TiendaModel tienda;
    */
	
	public CuadrosModel() {
		
	}
	

	
	
	public CuadrosModel(Long id, String nombre, String autor, double precio, String fecha, Long idTienda) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.fecha = fecha;
		this.idTienda = idTienda;
	}




	public Long getIdTienda() {
		return idTienda;
	}




	public void setIdTienda(Long idTienda) {
		this.idTienda = idTienda;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
