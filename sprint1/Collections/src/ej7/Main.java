package ej7;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Set;
import java.util.*;

public class Main {

	public static void main(String [] args) {
        HashMap<String,Integer> lista = new HashMap<>() ;

        //le añadimos material
        lista.put("uno",1);
        lista.put("dos",2);
        lista.put("tres",3);
        lista.put("cuatro",4);

        //imprimimos hashmap
        System.out.println(lista);

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

	}
	
}

