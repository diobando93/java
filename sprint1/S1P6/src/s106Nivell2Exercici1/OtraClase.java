package s106Nivell2Exercici1;

public class OtraClase {
	
	//creamos otra clase generica que invoca los 2 metodos genericos
	
	public static<T extends MiInterfaz> void llamadaMetodos(T t) 
	{
		t.getTamany();
		t.imprimirObjeto();
	}
}
