 /*Creu un mètode genèric que prengui com a argument un contenidor Holder<List<?>>. Determini quins mètodes pot o no
 *  invocar per al contenidor Holder i per a la llista List. Repeteixi l'exercici per a un argument de tipus 
 *  List<Holder<?>>.*/
package s106Nivell3Exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//llamamos a las 2 funciones para que veamos los funcionamientos de los metrodos
		System.out.println("new Holder<List<?>> holder");
		Holder.f1(new Holder<List<?>>());
		System.out.println();
		System.out.println("List<Holder<?>> list = new ArrayList<Holder<?>>();");
		List<Holder<?>> list = new ArrayList<Holder<?>>();
		Holder.f2(list);
	}

}
