package nivel1ej1;

public class Aula extends Alumno{

	public Aula(String nombre, int edad, int capacidad) {
		super(nombre, edad);
		capacidad = capacidad;
		// TODO Auto-generated constructor stub
	}
	
	public void imprimirAula() {
		System.out.println("Aula");
	}

}
