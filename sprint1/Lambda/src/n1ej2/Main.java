package n1ej2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		System.out.println(evenOdd(numbers));
		
	}
	
	public static String evenOdd (ArrayList<Integer> numbers) {
		String even = numbers.stream()
				.filter(i -> i%2==0).map(i -> "e" + i)
				.collect(Collectors.joining(","));
		String odd = numbers.stream()
				.filter(i -> i%2!=0).map(i -> "o" + i)
				.collect(Collectors.joining(","));
		return even + "," + odd;
	}

}
