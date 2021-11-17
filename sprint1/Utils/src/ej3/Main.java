package ej3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Arrays;


public class Main {
	
	public static void main(String[] args) throws IOException {
		FileWriter fl = new FileWriter("test1.txt");
		PrintWriter pw = new PrintWriter(fl);
		
		 buscarEnDirectorio(new File("C:\\Program Files\\Common Files\\microsoft shared"), pw);

    }
	
	public static void buscarEnDirectorio(File directorio, PrintWriter pw) throws IOException {
		
        System.out.println("D " + directorio);
        File[] listado = directorio.listFiles();
        if (listado!=null) {
            for(File file:listado) {
                if (file.isDirectory())
                    buscarEnDirectorio(file, pw);
                else {
                	pw.println("F "+file+"-"+new Date(file.lastModified()));
                    System.out.println("F "+file+"-"+new Date(file.lastModified()));
                }
            }
        }else {
        	pw.println("D "+directorio);
           System.out.println("D "+directorio);
        }
    }
	

}