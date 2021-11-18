/*Exercici 4. Modifiqui al seu torn el punt anterior de manera que els arguments que rep 'f()' sigui una llista 
 * d'arguments variable indefinida.*/
package s106Nivell1Exercici4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		GenericMethods a=new GenericMethods();
		//vemos que puedo llamar a f con un array del tipo de argumento que quiera
		
		ArrayList<Integer> numeros=new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		ArrayList<String> palabras=new ArrayList<String>();
		palabras.add("hola");
		palabras.add("adios");
		palabras.add("hello");
		
		ArrayList<Persona> personas=new ArrayList<Persona>();
		personas.add(new Persona("isabel",43));
		personas.add(new Persona("Ana",23));
		personas.add(new Persona("Sonia",41));
		
		//al imprimir vemos que puede acceder a todo
		a.f(numeros);
		a.f(palabras);
		a.f(personas);
	}
}
