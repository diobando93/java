package ej2;

import java.io.File;
import java.util.Date;
import java.util.Arrays;


public class Main {
	
	public static void main(String[] args) {
		
		
		 buscarEnDirectorio(new File("C:\\Program Files"));

    }
	
	public static void buscarEnDirectorio(File directorio) {
        System.out.println("D " + directorio);
        File[] listado = directorio.listFiles();
        if (listado!=null) {
            for(File file:listado) {
                if (file.isDirectory())
                    buscarEnDirectorio(file);
                else {
                    System.out.println("F "+file+"-"+new Date(file.lastModified()));
                }
            }
        }else {
           System.out.println("A "+directorio);
        }
    }



}