package s106Nivell1Exercici4;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericMethods < T >   {
	//construimos la funcion de manera que admita un arrayList de cualquier objeto
	public  void f(ArrayList<T> misObjetos) {
		System.out.println("funcion");
		for (int i=0;i<misObjetos.size();i++){
			
			System.out.println("objecte "+i+ ": " +misObjetos.get(i));
		}
		
		
		
	}

	
}
