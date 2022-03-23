package nivel2ej1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader {
	
	public String leer(String fichero) {
		String contenido = null;
		StringBuilder sb = null;
		
		File f = new File(fichero);
		FileReader canal = null;
		BufferedReader br = null;
		
		try {
			canal = new FileReader(f);
			br = new BufferedReader(canal);
			sb = new StringBuilder();
			
			String linea = br.readLine();
			
			while(linea != null) {
				sb.append(linea);
				linea = br.readLine();
			}
			
		}catch(IOException e) {
			System.err.println(e.getMessage());
			
		}finally {
			if(br != null) {
				try {
					br.close();
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
			
			if(canal != null) {
				try {
					canal.close();
				}catch(IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
		
		if(sb != null) {
			contenido = sb.toString();
		}
		
		return contenido;

}
