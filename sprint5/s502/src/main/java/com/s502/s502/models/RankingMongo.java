package com.s502.s502.models;

public class RankingMongo implements Comparable<RankingMongo>{
	
	private String id;
	private Double successPercentaje;
	
	public RankingMongo(String id, Double successPercentaje) {
		this.id = id;
		this.successPercentaje = successPercentaje;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public int compareTo(RankingMongo o) {

		return new Double(successPercentaje).compareTo(o.successPercentaje);
	}

	@Override
	public String toString() {
		return "Ranking [id=" + id + ", successPercentaje=" + successPercentaje + "]";
	}


}
