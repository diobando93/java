package ej2;
import java.util.ArrayList;

import ej1.Month;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<String> numerosDNI = new ArrayList<String>();
		
		DNI dni = new DNI();
		jUnit prueba = new jUnit();
		
		numerosDNI.add(52541358); 
		dni.obtenerLetra(numerosDNI.get(0));
		
	}
}
