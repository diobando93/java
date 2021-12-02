package n3ej1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {
		
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		listaAlumnos.add(new Alumno("Marta", "Java", 4.98, 27));
		listaAlumnos.add(new Alumno("Gabriel", "Java", 6.98, 24));
		listaAlumnos.add(new Alumno("Edu", "Node", 7.98, 37));
		listaAlumnos.add(new Alumno("Arnold", "PHP", 5.5, 40));
		listaAlumnos.add(new Alumno("Asaf", "Node", 7.98, 37));
		listaAlumnos.add(new Alumno("Emma", "Data Science", 8, 37));
		listaAlumnos.add(new Alumno("Carolina", "PHP", 4, 37));
		listaAlumnos.add(new Alumno("Vero", "PHP", 5, 37));
		
		//System.out.println(listaAlumnos);
		
		listaAlumnos.stream().flatMap(student -> Stream.of("Nombre: " +
		student.getNombre() + ", Age: " + student.getEdad()))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		listaAlumnos.stream().flatMap(student -> Stream.of("Nombre: " +
				student.getNombre() + ", Curso: " + student.getCurso()))
				.collect(Collectors.toList())
				.forEach(System.out::println);
		
		List<Alumno> letraA = listaAlumnos.stream()
				.filter(s -> s.getNombre().startsWith("A"))
				.collect(Collectors.toList());
		System.out.println("Alumnos con A: " + letraA);
		
		listaAlumnos.stream().filter(s -> s.getNota() >= 5)
		.forEach(System.out::print);
		
		listaAlumnos.stream().filter(s -> s.getCurso().equals("Node"))
		.forEach(System.out::print);
		
		
		
	}

}
