/*Creu una interfície amb dos mètodes i una classe que implementi aquesta interfície i afegeixi un tercer mètode.
 *  En una altra classe, creu un mètode genèric amb una mena d'argument que estigui limitat per la interfície i
 *   demostri que els mètodes de la interfície són invocables dins d'aquest mètode genèric. En 'main()', passi una 
 *   instància de la classe implementadora al mètode genèric.*/

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
