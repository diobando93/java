/*Creu una interfície amb dos mètodes i una classe que implementi aquesta interfície i afegeixi un tercer mètode.
 *  En una altra classe, creu un mètode genèric amb una mena d'argument que estigui limitat per la interfície i
 *   demostri que els mètodes de la interfície són invocables dins d'aquest mètode genèric. En 'main()', passi una 
 *   instància de la classe implementadora al mètode genèric.*/

package s106Nivell2Exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OtraClase c= new OtraClase();
		
		
		//llamamos al metodo de la interfaz dentro del metodo generico
		c.llamadaMetodos(new claseQueImplementa("hola"));
	}

}
