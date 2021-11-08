package ej6;
import java.util.LinkedList;
import java.util.Random; 
import java.util.ListIterator;

public class Main {
	
	public static void main(String [] args) {
		
		Random generaRandom = new Random();
		LinkedList<Integer> alOne = new LinkedList<Integer>();

		
		for (int i= 0; i < 7; i++) {
			alOne.add(generaRandom.nextInt(20));
		}
		
		System.out.println(alOne);
		ListIterator<Integer> itOne = alOne.listIterator(alOne.size());
		
		while(itOne.hasPrevious()) {
			
			System.out.println("hola");
			
		}
		
	}

}
