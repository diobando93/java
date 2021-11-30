package n1ej5;

import java.util.ArrayList;

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
		
		month.forEach(months -> System.out.println(months));
		
	}

}
