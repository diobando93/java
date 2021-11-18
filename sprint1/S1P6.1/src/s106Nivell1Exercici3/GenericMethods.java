package s106Nivell1Exercici3;

import java.util.Iterator;

public class GenericMethods < T >   {
	//construimos la funcion de manera que el primer parametrpo objeto 1 siempre sea un int en los demas seguimos pudiendo
	//meter lo que queramos
	public  void f(int objeto1, T objeto2, T objeto3) {
		System.out.println("funcion");
		System.out.println("objecte1: " +objeto1);
		System.out.println("objecte2: " +objeto2);
		System.out.println("objecte3: " +objeto3);
		
	}

	
}
