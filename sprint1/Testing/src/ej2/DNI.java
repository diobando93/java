package ej2;

public class DNI {
	
	//private int numDNI;
	private final char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	
	/*
	public DNI() {
		numDNI = 0;
	}
	
	public DNI(int num) {
		this.numDNI = num;
	}

	public int getNumDNI() {
		return numDNI;
	}

	public void setNumDNI(int numDNI) {
		this.numDNI = numDNI;
	}
	*/
	public String obtenerLetra(int numeroDNI) {
		int resto;
		resto = numeroDNI % 23;
		System.out.println("DNI: " +numeroDNI+letras[resto]);
		char letra = letras[resto];
		System.out.println(letra);
		return letra + "";
	}

}
