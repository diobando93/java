/*Exercici 3. Modifiqui el punt anterior de manera que un dels arguments de 'f()' no sigui parametritzat.*/
package s106Nivell1Exercici3;


public class Main {

	public static void main(String[] args) {
		
		GenericMethods a=new GenericMethods();
		//si intentamos meter algo que no sea int en la primera posicion fallaria
		//como la primera linea de codigo comentada
		//a.f(new Persona("isabel",44),7,"hola");
		a.f(7,"hola",new Persona("isabel",44));
		a.f(7, new Persona("isabel",44),"hola");
		a.f(2, 2, 2);
	}
}
