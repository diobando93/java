package nivel2ej1;

import java.lang.annotation.*;
import com.google.gson.Gson;

public class NbaPlayerWrapper {
	
	public void serializarJugador(NbaPlayer player) {
		
		String nomFichero = this.getFileToSerialize();
		String contingutJSON = this.getJSONString(player);
		MyBufferedWriter mi_bw = new MyBufferedWriter();
		mi_bw.escribir(nomFichero, contingutJSON, false);
	}
	
	
	public void serialitzaArrayJugadors(NbaPlayer[] players) {
		String nomFichero = this.getFileToSerialize();
		String contingutJSON = this.getJSONString(players);
		MyBufferedWriter mi_bw = new MyBufferedWriter();
		mi_bw.escribir(nomFichero, contingutJSON, false);
	}
	
	
	private String getJSONString(NbaPlayer player) {
		Gson gson = new Gson();
		String JSON = gson.toJson(player);
		return JSON;
	}
	
	
	private String getJSONString(NbaPlayer[] players) {
		Gson gson = new Gson();
		String JSON = gson.toJson(players);
		return JSON;
	}
	
	
	public String getFileToSerialize() {
		String result = null;
		Class<?> metadataNbaPlayer = NbaPlayer.class;
		
		Annotation[] classAnnotations = metadataNbaPlayer.getAnnotations();
		if(classAnnotations != null && classAnnotations.length > 0) {
			for(Annotation a: classAnnotations) {
				System.out.println(a.toString());
				
				if(a instanceof FileDestinationAnnotation) {
					FileDestinationAnnotation fileDestinationAnnotation = (FileDestinationAnnotation) a;
					result = fileDestinationAnnotation.Folder() + fileDestinationAnnotation.FileName();
				}
			}
		}
		return result;
	}

}
