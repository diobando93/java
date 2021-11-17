package ej5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		int[]  pepe = {1,2,3}; //creo un valor para extrear datos
		int[] jose = null;
		try { 
			String archivo = "pruebaSerializable.txt"; //creo un archivo que recogera datos
			FileOutputStream file = new FileOutputStream(archivo);
			ObjectOutputStream f = new ObjectOutputStream(file);
			f.writeObject(pepe); 
			f.close();
			
			} 
		catch (Exception e) {
			e.getMessage();
		}
		
		
		try {
			String archivo = "pruebaSerializable.txt"; //recojo el archivo en la raiz
			FileInputStream arch = new FileInputStream(archivo) ;
			ObjectInputStream arc = new ObjectInputStream(arch) ;
			
			jose = (int[]) arc.readObject(); //cogemos los datos del archivo y se lo añadimos a la nueva variable
			System.out.println(jose);
			arc.close();
			arch.close();

		}
		catch (Exception e) {
			e.getMessage();
		}
		
	}

}
