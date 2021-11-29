package nivel1ej2;

public class Aula extends Alumno{

	public Aula(String nombre, int edad, int capacidad) {
		super(nombre, edad);
		capacidad = capacidad;
		// TODO Auto-generated constructor stub
	}
	
	public void imprimirAula() {
		System.out.println("Aula");
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void calcularNota(int examen) {
		super.calcularNota(examen);
	}

}
