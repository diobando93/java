package s106Nivell2Exercici2;

public class ClaseGenerica{

	//clase generica con 2 metodos cada uno de los cuales tendra como parametro una de las 2 interfaces
	public static <T extends MiInterfaz1>void llamandoA1(T t){
		t.metodo1();
	}
	public static <T extends MiInterfaz2>void llamandoA2(T t){
		t.metodo2();
	}
	 
	
	
}
