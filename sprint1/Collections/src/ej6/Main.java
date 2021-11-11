package ej6;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
	LinkedList<Integer> lista = new LinkedList<Integer>();
	
	ListIterator <Integer> iteradorLista = lista.listIterator();
	
	
	while (lista.listIterator() != null ) {
		lista = ingreso(lista);
		System.out.println(lista);
	}
	

	}
	
	public static LinkedList<Integer> ingreso(LinkedList <Integer> lista) {
		Scanner scanner = new Scanner(System.in);
		int entrada;
		String stop = "";
		do {
		System.out.println("introduce un numero o aprete el intro para parar: ") ;
		entrada = scanner.nextInt(); 
		lista.add(lista.size()/2, entrada);
		if (entrada == 0) {
			lista = null;
		}
		return lista;

		} 
		while (stop != "");
		 }
		
	}
	
		
		/*
		
		Random generaRandom = new Random();
		LinkedList<Integer> alOne = new LinkedList<Integer>();

		
		for (int i= 0; i < 7; i++) {
			alOne.add(generaRandom.nextInt(20));
		}
		
		System.out.println(alOne);
		int mitad = alOne.size()/2;
		//System.out.println(mitad);
		//System.out.println(generaRandom.nextInt(5));
		alOne.add(mitad, generaRandom.nextInt(5));
		
		ListIterator<Integer> itOne = alOne.listIterator();
		
		while(itOne.hasNext()) {
			//
			//alOne.add(alOne.size()/2, generaRandom.nextInt(5));
			//alOne.add(5, 7);
			System.out.println(itOne.next());
			//count = count + 1;
			
		}
		
		System.out.println(alOne);
		
		
	}
	//

}
*/

