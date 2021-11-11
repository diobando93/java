package ej8;
import java.util.*;
import java.util.Map.Entry;

import ej7.Habitacion;


public class Main {
	
	public static void main(String[] args) {
		 
		
		LinkedHashMap<String, Habitacion> habitacionesHash = new LinkedHashMap<String, Habitacion>(); 
        habitacionesHash.put("20", new Habitacion("James",20));
        habitacionesHash.put("10", new Habitacion("Mary",10));
        habitacionesHash.put("80", new Habitacion("John",80));
        habitacionesHash.put("40", new Habitacion("Amanda",40));
	    /*
		LinkedHashMap<String, Integer> habitacionesHash = new LinkedHashMap<String, Integer>(); 
		habitacionesHash.put("jalisco", 5);
	    habitacionesHash.put("mexicodf", 8);
	    habitacionesHash.put("tijuana", 10);
	    habitacionesHash.put("tetoticlan", 4); 
	    HashMap<String,Integer> lista = new HashMap<>() ;
        Habitacion [] habitacionesArray = {new Habitacion("James",20),
        		new Habitacion("Mary",10),
        		new Habitacion("John",80),
        		new Habitacion("Amanda",40)};
        
        for(int i=0; i < habitacionesArray.length; i++) {
        	System.out.println(habitacionesArray[i]);
        }
        
        Arrays.sort(habitacionesArray);
        
        for(Habitacion temp: habitacionesArray) {
        	System.out.println(temp);
        }
	    
	    
	    
	    */
        
        HashMap<String, Habitacion> habitacionsorted = new HashMap();
        SortedSet<String> keys = new TreeSet<>(habitacionesHash.keySet());
        for(String key : keys) {
        	Habitacion value = habitacionesHash.get(key);
        	System.out.println(key + "-" + value);
        	habitacionsorted.put(key, value);
        	
        }
        
	    
	    System.out.println(habitacionsorted);
	   // Arrays.sort(habitacionsorted);
	    
	    
	    
		 
	}
}
