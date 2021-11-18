package ejercicio4;

import java.util.ArrayList;

public class GenericMethods <T> {
	public  void f(ArrayList <T> objetos) {
		
		System.out.println("----------------");
		
		for (int i = 0; i < objetos.size() ; i++){
			
			System.out.println("objeto"+i+ ": " +objetos.get(i));
		}

	}
}
