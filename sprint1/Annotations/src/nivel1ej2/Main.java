package nivel1ej2;

public class Main {
	
	public static void main(String[] args) {
		
		Alumno a1 = new Alumno("José", 12);
		Aula c5 = new Aula("Pancho", 15, 45);
		a1.imprimirAlumno();
		c5.imprimirAula();
		c5.calcularNota(15);
		
	}
}
