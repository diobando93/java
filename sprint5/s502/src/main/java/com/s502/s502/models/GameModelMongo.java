package com.s502.s502.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "game")
public class GameModelMongo {
	
	@Id
	private String id;
	private String idUser;
	private double shotOne;
	private double shotTwo;
	private double successPercentaje;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdUser() {
		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	public double getShotOne() {
		return shotOne;
	}
	public void setShotOne(double shotOne) {
		this.shotOne = shotOne;
	}
	public double getShotTwo() {
		return shotTwo;
	}
	public void setShotTwo(double shotTwo) {
		this.shotTwo = shotTwo;
	}
	public double getSuccessPercentaje() {
		return successPercentaje;
	}
	public void setSuccessPercentaje(double successPercentaje) {
		this.successPercentaje = successPercentaje;
	}
	@Override
	public String toString() {
		return "GameModelMongo [id=" + id + ", idUser=" + idUser + ", shotOne=" + shotOne + ", shotTwo=" + shotTwo
				+ ", successPercentaje=" + successPercentaje + "]";
	}
	
	

}
