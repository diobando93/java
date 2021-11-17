package ej5;
import java.util.ArrayList;
import java.util.Random; 
import java.util.ListIterator;

public class Main {
	
	public static void main(String[] args) {
		
		Random generaRandom = new Random();
		ArrayList<Integer> alOne = new ArrayList<Integer>();
		ArrayList<Integer> alTwo = new ArrayList<Integer>();
		
		for (int i= 0; i < 5; i++) {
			alOne.add(generaRandom.nextInt(20));
		}
		
		ListIterator<Integer> itOne = alOne.listIterator(alOne.size());
		
		System.out.println(alOne);
		
        while(itOne.hasPrevious()) {
        	
        	alTwo.add(itOne.previous());
        	
        }
        
        System.out.println(alTwo);
        
	}
	
}
