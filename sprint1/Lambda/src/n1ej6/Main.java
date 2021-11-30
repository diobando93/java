package n1ej6;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void main(String [] args) {
		
		
		ArrayList<String> month = new ArrayList<String>();
		month.add("Enero");
		month.add("Febrero");
		month.add("Marzo");
		month.add("Abril");
		month.add("Mayo");
		month.add("Junio");
		month.add("Julio");
		month.add("Agosto");
		month.add("Septiembre");
		month.add("Octubre");
		month.add("Noviembre");
		month.add("Diciembre");
		
		

		
	}
	
	/*
	 * 		String[] months = {"enero", "febrero", "marzo"};
		Consumer<String[]>method = imprime
		.method.accept(months);
	public static void imprime(ArrayList<String> meses) {
		
		Arrays.stream(meses).forEach(System.out::println);
		
	}
	*/
	
	public static void imprime(String[] months) {
		
		Arrays.stream(months).forEach(System.out::println);
		
	}

}

