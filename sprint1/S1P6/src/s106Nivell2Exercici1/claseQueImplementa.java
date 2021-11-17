package s106Nivell2Exercici1;

public class claseQueImplementa implements MiInterfaz {
	String palabra;
		
	public claseQueImplementa(String palabra) {
		this.palabra=palabra;
	}

	//implementamos los 2 metodos de la interfaz
	@Override
	public int getTamany() {
		return palabra.length();
	}

	@Override
	public void imprimirObjeto() {
		System.out.println(palabra);
		
	}
	
	//creamos un tercer metodo
	public void tercerMetodo() {
		System.out.println("soy el tercer metodo");
	}
}
