package n2ej1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
	
		List<String> datos =Arrays.asList("axl", "155136", "factorial", "queso", "patio", "015ferc",
				"ycombinatio", "tech pstarts", "2121", "esprots");
		
		List <String> ascendente = datos.stream()
				.sorted(Comparator.comparing(a -> a.length()))
				.collect(Collectors.toList());
			
		System.out.println(ascendente);
		
		List <String> descendente = datos.stream()
				.sorted(Comparator.comparingInt(String::length).reversed())
				.collect(Collectors.toList())
				;
		
		System.out.println(descendente);
		
		List<String> caracter = datos.stream()
				.sorted(Comparator.comparingInt(i -> i.charAt(0)))
				.collect(Collectors.toList());
		
		System.out.println(caracter);
		
		List<String> letraE = datos.stream()
				//.sorted(Comparator.comparing(a -> a.length()))
				.sorted(Comparator.comparing(a -> !a.contains("e")))
				.collect(Collectors.toList());
		
		System.out.println(letraE);
		
		List<String> numero4 = datos.stream()
				.map(a -> a.replaceAll("a", "4"))
				.collect(Collectors.toList());
		
		System.out.println(numero4);
		
		List<String> numericos = datos.stream()
				.filter(a -> a.matches("[0-9]+"))
				.collect(Collectors.toList());
		
		System.out.println(numericos);
		
		
		
		Operations sum = (x, y) -> x+y;
		System.out.println(sum.operation(4.5f, 45.1f));
		
		Operations resta = (x, y) -> x-y;
		System.out.println(resta.operation(4.5f, 1.5f));
		
		Operations mult = (x, y) -> x*y;
		System.out.println(mult.operation(4.5f, 1.5f));
		
		Operations div = (x, y) -> x/y;
		System.out.println(div.operation(4f, 1.5f));
		
	}	
	

	
}
