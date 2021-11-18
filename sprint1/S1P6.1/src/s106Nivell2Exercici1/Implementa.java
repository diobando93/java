package s106Nivell2Exercici1;

public class Implementa implements MyInterface {
		
	public Implementa() {
	
	}
//creamos un tercer metodo
	public void metode3() {
		System.out.println("Es el metodo3");
	}

	@Override
	public void generic1() {
		System.out.println("Es el metodo generic1");		
	}

	@Override
	public void generic2() {
		System.out.println("Es el metodo generic2");
	}
}
