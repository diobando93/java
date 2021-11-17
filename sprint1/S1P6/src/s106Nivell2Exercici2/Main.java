/*Creu dues interfícies i una classe que implementi ambdues. Creu dos mètodes genèrics, un l'argument de paràmetre dels
 *  quals estigui limitat per la primera interfície i un altre l'argument de paràmetre de la qual estigui limitat per la
 *   segona interfície. Creu una instància de la classe que implementa totes dues interfícies i demostri que es pot utilitzar
 *    amb tots dos mètodes genèrics.*/
package s106Nivell2Exercici2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos un objeto de la clase generica y llamamos a sus 2 metodos
		ClaseGenerica claseGenerica = new ClaseGenerica ();
		claseGenerica.llamandoA1(new ClaseQueImplementa());
		claseGenerica.llamandoA2(new ClaseQueImplementa());
	}

}
