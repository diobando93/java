package ej8;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	
	LinkedHashMap<String,Integer> listaLHM = new LinkedHashMap<String,Integer>();

    listaLHM.put("uno",1);
    listaLHM.put("dos",2);
    listaLHM.put("tres",3);
    listaLHM.put("cuatro",4);

    System.out.println(listaLHM);

    Set<Entry<String,Integer>> entrySet = listaLHM.entrySet();
    ArrayList<Map.Entry<String,Integer>> listaAL = new ArrayList<>();

    listaAL.addAll(entrySet); 


    Collections.sort(listaAL, new Comparator <Map.Entry<String,Integer>>() {
        public int comparador(Map.Entry<String,Integer> entry1,Map.Entry<String,Integer> entry2) {
            return Integer.compare(entry1.getValue(),  entry2.getValue());
        }

        @Override
        public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
  } );

    System.out.println(listaAL);
    listaLHM.clear();

    for (Map.Entry<String,Integer> cosas:listaAL) {
        listaLHM.put(cosas.getKey(), cosas.getValue());
    }
     System.out.println(listaLHM);


  }

}
