package com.s502.s502.models;

public class Percentaje implements Comparable<Percentaje>{
	
	private Long id;
	private String name;
	private Double percentaje;
	
	
	
	public Percentaje(Long id, String name, Double percentaje) {
		this.id = id;
		this.name = name;
		this.percentaje = percentaje;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPercentaje() {
		return percentaje;
	}
	public void setPercentaje(Double percentaje) {
		this.percentaje = percentaje;
	}
	
	
	
	
	@SuppressWarnings("deprecation")
	@Override
	public int compareTo(Percentaje o) {
		
		return new Double(percentaje).compareTo(o.percentaje);
	}

	@Override
	public String toString() {
		return "Percentaje [id=" + id + ", name=" + name + ", percentaje=" + percentaje + "]";
	}
	
	

}
