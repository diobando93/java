package com.nivel1.nivel1.models;

public class SueldoModel {
	
	private String empleo;
	private double sueldo;
	
	public SueldoModel(String empleo, double sueldo) {
		// TODO Auto-generated constructor stub
		this.empleo = empleo;
		this.sueldo = sueldo;
	}
	public String getEmpleo() {
		return empleo;
	}
	public void setEmpleo(String empleo) {
		this.empleo = empleo;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "SueldoModel [empleo=" + empleo + ", sueldo=" + sueldo + "]";
	}
	
	
}
