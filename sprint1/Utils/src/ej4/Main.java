package ej4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		File fl = new File("test1.txt");
		FileReader fr = new FileReader(fl);
		BufferedReader br = new BufferedReader(fr);
		String linea = br.readLine();
		System.out.println();

		while(linea != null) {
		    System.out.println(linea);
		    linea = br.readLine();
		}

		br.close();
		
		
    }

	

}