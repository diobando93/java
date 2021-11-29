package nivel1ej2;

public class Alumno {
	
	private String nombre;
	private int edad;

	public Alumno(String nombre, int edad) {
		
		nombre = nombre;
		edad = edad;
		
	}
	
	public void imprimirAlumno() {
		
		System.out.println("Alumno");
		
	}
	
	/**
     * @deprecated
     * This method is no longer acceptable to compute time between versions.
     * @param examen
     */
    @Deprecated
    public void calcularNota(int examen) {
    	System.out.println("Calcula nota");
    }
	
}
