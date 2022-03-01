package com.s502.s502.models;

public class Ranking implements Comparable<Ranking>{
	
	private Long id;
	private Double successPercentaje;
	

	
	public Ranking(Long id, Double successPercentaje) {
		this.id = id;
		this.successPercentaje = successPercentaje;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getSuccessPercentaje() {
		return successPercentaje;
	}
	public void setSuccessPercentaje(Double successPercentaje) {
		this.successPercentaje = successPercentaje;
	}
	
	
	
	@SuppressWarnings("deprecation")
	@Override
	public int compareTo(Ranking o) {
		return new Double(successPercentaje).compareTo(o.successPercentaje);
	}


	@Override
	public String toString() {
		return "Ranking [id=" + id + ", successPercentaje=" + successPercentaje + "]";
	}
	
}
