package nivel2ej1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyBufferedWriter {
	
	public void escribir(String fichero, String contenido, boolean agregarAlContenidoExistente) {
		
		File file = new File(fichero);
		FileWriter canal = null;
		BufferedWriter bw = null;
		
		try {
			canal = new FileWriter(file, agregarAlContenidoExistente);
			bw = new BufferedWriter(canal);
			if(contenido != null && contenido.length() > 0) {
				bw.write(contenido);
				System.out.println("Se ha generado el fichero+"+fichero);
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
			
		}finally {
			if(bw != null) {
				try {
					bw.close();
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
	}

}
