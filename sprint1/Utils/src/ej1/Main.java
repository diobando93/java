package ej1;


import java.io.File;
import java.util.Arrays;


public class Main {
	
	public static void main(String[] args) {
        File directorio = new File("c:/"); //directorio a listar                                             
        String[] lista = directorio.list();
        //Arrays.sort(lista);
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
}
