/*Creu una interf�cie amb dos m�todes i una classe que implementi aquesta interf�cie i afegeixi un tercer m�tode.
 *  En una altra classe, creu un m�tode gen�ric amb una mena d'argument que estigui limitat per la interf�cie i
 *   demostri que els m�todes de la interf�cie s�n invocables dins d'aquest m�tode gen�ric. En 'main()', passi una 
 *   inst�ncia de la classe implementadora al m�tode gen�ric.*/

package s106Nivell2Exercici1;

public class Main {

	public static void main(String[] args) {

		Implementa impl = new Implementa();
		Generica gen = new Generica();
		gen.llamadaMetodos(impl);
		gen.llamadaMetodos("2");
		gen.llamadaMetodos(2);
		
	}

}
