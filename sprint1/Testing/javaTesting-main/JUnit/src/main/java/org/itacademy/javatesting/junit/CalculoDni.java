package org.itacademy.javatesting.junit;

public class CalculoDni {

	private String letra;
	
	public CalculoDni(int pepe) {
		String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
		int modulo= pepe % 23;
		this.letra = juegoCaracteres.charAt(modulo)+"";	
	}
	
	public String getLetra() {
		return letra;
	}
	

}
