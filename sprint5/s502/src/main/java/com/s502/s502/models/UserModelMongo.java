package com.s502.s502.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserModelMongo {
	@Id
	private String id;
	private String nombre;
	private String email;
	private Date date; 
	
	public UserModelMongo() {
		
	}

	public UserModelMongo(String id, String nombre, String email, Date date) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "UserModelMongo [id=" + id + ", nombre=" + nombre + ", email=" + email + ", date=" + date + "]";
	}
	
	

}
