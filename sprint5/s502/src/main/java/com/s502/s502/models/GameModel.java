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
	private int shotOne;
	private int shotTwo;
	private String item;
	
	
	
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
	public int getShotOne() {
		return shotOne;
	}
	public void setShotOne(int shotOne) {
		this.shotOne = shotOne;
	}
	public int getShotTwo() {
		return shotTwo;
	}
	public void setShotTwo(int shotTwo) {
		this.shotTwo = shotTwo;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "GameModel [id=" + id + ", idUser=" + idUser + ", shotOne=" + shotOne + ", shotTwo=" + shotTwo
				+ ", item=" + item + "]";
	}

	
	
}
