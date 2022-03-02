package com.s502.s502.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Game")
public class GameModel {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private Long id;
	private Long idUser;
	private double shotOne;
	private double shotTwo;
	private double successPercentaje;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
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
		return "GameModel [id=" + id + ", idUser=" + idUser + ", shotOne=" + shotOne + ", shotTwo=" + shotTwo
				+ ", successPercentaje=" + successPercentaje + "]";
	}
	
	
}
