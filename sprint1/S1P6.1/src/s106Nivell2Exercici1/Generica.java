package s106Nivell2Exercici1;

public class Generica {
	
	//creamos otra clase generica que invoca los 2 metodos genericos
	
	public static<T extends MyInterface> void llamadaMetodos(T t) 
	{
		//t.generic1();
		//t.generic2();
	}
}
