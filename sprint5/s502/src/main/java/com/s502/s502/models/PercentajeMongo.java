package com.s502.s502.models;

public class PercentajeMongo implements Comparable<PercentajeMongo>{
	
	private String id;
	private String name;
	private Double percentaje;
	
	
	
	
	public PercentajeMongo(String id, String name, Double percentaje) {
		this.id = id;
		this.name = name;
		this.percentaje = percentaje;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	
	@Override
	public int compareTo(PercentajeMongo o) {
		
		return new Double(percentaje).compareTo(o.percentaje);
	}

	@Override
	public String toString() {
		return "PercentajeMongo [id=" + id + ", name=" + name + ", percentaje=" + percentaje + "]";
	}
	
	
	
	
}
