package ej7;
import java.lang.reflect.Array;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Set;
import java.util.*;
import java.util.LinkedList;

public class Main {

	public static void main(String [] args) {

        
        HashMap<String, Habitacion> habitacionesHash = new HashMap<String, Habitacion>(); 
        habitacionesHash.put("20", new Habitacion("James",20));
        habitacionesHash.put("10", new Habitacion("Mary",10));
        habitacionesHash.put("80", new Habitacion("John",80));
        habitacionesHash.put("40", new Habitacion("Amanda",40));
        
        for(Map.Entry<String, Habitacion> entry : habitacionesHash.entrySet()) {
        	
        	String key = entry.getKey();
        	Habitacion value = entry.getValue();
        	System.out.println(key + " - " + value);
        	
        }
        System.out.println("------------------");
        
        LinkedList<String> lista = new LinkedList<String>(habitacionesHash.keySet());
        System.out.println(lista);
        
        
        /*
         * 
         * 
         * 
         * 
         * 
         * 
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
 //le añadimos material
        lista.put("puerta",4);
        lista.put("casa",1);
        lista.put("j",3);
        lista.put("poojh",2);

        //imprimimos hashmap
        System.out.println(lista);
        Set<java.util.Map.Entry<String, Integer>> listaEntry = lista.entrySet();
        ArrayList<Map.Entry<String,Integer>> listaAL = new  ArrayList<Map.Entry<String,Integer>>();
        listaAL.addAll(listaEntry);
        System.out.println(listaAL);
        Collections.sort(listaAL, new Comparator<Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String,Integer> entry1, Map.Entry<String,Integer> entry2) {
                return Integer.compare(entry1.getValue(),  entry2.getValue());
            }
     
            }); // revisar bien el cierre de la fila Collections.sort()
        //extraemos su material en un entrySet
        Set<java.util.Map.Entry<String, Integer>> listaEntry = lista.entrySet();

        //Creamos un ArrayList para añadirlo el material del hashmap a través del entrySet.
        ArrayList<Map.Entry<String,Integer>> listaAL = new  ArrayList<Map.Entry<String,Integer>>();
        listaAL.addAll(listaEntry);

        System.out.println(listaAL);

        //ordenamos el ArrayList de forma alfabética
        Collections.sort(listaAL, new Comparator<Map.Entry<String,Integer>>() {
        @Override
        public int compare(Map.Entry<String,Integer> entry1, Map.Entry<String,Integer> entry2) {
            return Integer.compare(entry1.getValue(),  entry2.getValue());
        }
 
        }); // revisar bien el cierre de la fila Collections.sort()

//imprimimos para ver resultado
        System.out.println(listaAL);

        //creamos LinkedHashMap y añadimos el material del ArrayList
        LinkedHashMap<String,Integer> listaHM = new LinkedHashMap<String,Integer>() ;

        //añadimos los valores del ArrayList sorteado a un LinkedHashMap, que se ordena por orden de introducción
        for (Map.Entry<String,Integer> entry:listaAL) {
            listaHM.put(entry.getKey(),entry.getValue());
        }
        System.out.println(listaHM);
*/
	}
	
	
}

