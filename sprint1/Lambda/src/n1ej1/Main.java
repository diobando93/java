package n1ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String [] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Silvia");
		names.add("Kate");
		names.add("Amy");
		names.add("Axl");
		names.add("Ann");
		names.add("Sophia");
		names.add("Oliver");
		
		System.out.println(aAnd3(names));
	}
	
	public static List<String> aAnd3(List<String> names){
		List<String> aAnd3Selected = names.stream()
				.filter(n -> n.startsWith("A") && n.length() == 3)
				.collect(Collectors.toList());
		return aAnd3Selected;
	}

}

