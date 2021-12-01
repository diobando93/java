package n3ej1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		listaAlumnos.add(new Alumno("Marta", "Java", 4.98, 27));
		listaAlumnos.add(new Alumno("Gabriel", "Java", 6.98, 24));
		listaAlumnos.add(new Alumno("Edu", "Node", 7.98, 37));
		
		System.out.println(listaAlumnos);
		
	}

}
