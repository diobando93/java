/*Exercici 1. Creu una classe contenidora que emmagatzemi tres objectes del mateix tipus, juntament amb els mètodes per a 
 * emmagatzemar i extreure aquests objectes i un constructor per a inicialitzar els tres.*/

package s106Nivell1Exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContenedorClass contenedor=new ContenedorClass(new Persona("isabel",44),new Persona("Ana",23),new Persona("Maria",13));
		
		System.out.println(contenedor);
	
	}

}
