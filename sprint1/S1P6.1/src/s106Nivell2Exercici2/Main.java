/*Creu dues interf�cies i una classe que implementi ambdues. Creu dos m�todes gen�rics, un l'argument de par�metre dels
 *  quals estigui limitat per la primera interf�cie i un altre l'argument de par�metre de la qual estigui limitat per la
 *   segona interf�cie. Creu una inst�ncia de la classe que implementa totes dues interf�cies i demostri que es pot utilitzar
 *    amb tots dos m�todes gen�rics.*/
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
