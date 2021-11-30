package n1ej4;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<String> objetos = new ArrayList<String>();
		objetos.add("pera");
		objetos.add("pan");
		objetos.add("casa");
		objetos.add("ojos");
		objetos.add("peso");
		objetos.add("oso");
		objetos.add("vinos");
		objetos.add("taza");
		
		System.out.println(buscarO(objetos));
		
	}
	
	public static List<String> buscarO(List<String> objetos){
		
		List<String> resultado = objetos.stream()
				.filter(n -> n.contains("o") && n.length() == 5)
				.collect(Collectors.toList());
		
		return resultado;
		
	}
	

}
