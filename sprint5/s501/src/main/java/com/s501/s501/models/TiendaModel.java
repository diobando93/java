package com.s501.s501.models;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;


@Entity
@Table(name = "Tienda")
public class TiendaModel {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
    private Long id;
	private String nombre;
	private int capacidad;
	
	/*
	@JsonManagedReference
	@OneToMany(
				mappedBy= "tienda",
				cascade = CascadeType.ALL
			  )
	private List<CuadrosModel> cuadros = new ArrayList<>();
	*/
	
	
	public TiendaModel() {
		
	}
	
	public TiendaModel(Long id, String nombre, int capacidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.capacidad = capacidad;

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
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	

}
