/*Exercici 2. Creu una classe anomenada GenericMethods amb un mètode genèric denominat 'f()' que accepti tres arguments,
 *  cadascun dels quals ha de ser d'un tipus parametritzat diferent.*/
package S106Nivell1Exercici2;

public class Main {

	public static void main(String[] args) {
		
		GenericMethods a=new GenericMethods();
		//vemos que puedo llamar a f con el tipo de argumento que quiera
		a.f(7,"hola",new Persona("isabel",44));
		a.f(new Persona("isabel",44),7,"hola");
		a.f(2, 2, 2);
	}
}
