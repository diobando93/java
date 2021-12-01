package n3ej1;

public class Alumno {
	
	private String nombre, curso;
	private double nota;
	private int edad;
	
	public Alumno(String nombre, String curso, double nota, int edad) {
		
		this.nombre = nombre;
		this.curso = curso;
		this.nota = nota;
		this.edad = edad;
	
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", curso=" + curso + ", nota=" + nota + ", edad=" + edad + "]";
	}
	
	

}
