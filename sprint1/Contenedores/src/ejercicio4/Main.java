package ejercicio4;

import java.util.ArrayList;


public class Main {
	
	public static void main(String[] args) {
		
		GenericMethods a=new GenericMethods();
		
		ArrayList<Chocolatina> chocolates=new ArrayList<Chocolatina>();
		chocolates.add(new Chocolatina("kinder"));
		chocolates.add(new Chocolatina("Milka"));
		chocolates.add(new Chocolatina("Galak"));
		
		ArrayList<String> palabras=new ArrayList<String>();
		palabras.add("KO");
		palabras.add("Punch");
		palabras.add("Problems");
		
		ArrayList<Double> numeros=new ArrayList<Double>();
		numeros.add(4.5656247485);
		numeros.add(1.02);
		numeros.add(2.0);
		numeros.add(3.666);
		
		a.f(numeros);
		a.f(chocolates);
		a.f(palabras);
		
		
		

	}

}


