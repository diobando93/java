package cat.barcelonactiva.s01.t07.n2;

import java.lang.annotation.Annotation;

import com.google.gson.Gson;


public class AlumneWrapper {

	// 1. Descarga GSON:
	// https://repo1.maven.org/maven2/com/google/code/gson/gson/2.6.2/gson-2.6.2.jar

	// 2. Agrega GSON a tu proyecto: Pulsa con el botón derecho sobre tu proyecto, y
	// en Build Path > Add External Archives, selecciona el jar descargado.

	// 3. Importalo en la clase que requieras usarlo: import com.google.gson.*;

	// Jackson es otra librería que podéis usar para serializar/deserializar
	// mediante JSON:
	// https://www.baeldung.com/jackson-object-mapper-tutorial

	public void serialitzaUnAlumne(Alumne alumne) {

		String nomFitxer = this.getFileToSerialize();
		String contingutJSON = this.getJSONString(alumne);

		MyBufferedWriter myBufferedWriter = new MyBufferedWriter();
		myBufferedWriter.escribir(nomFitxer, contingutJSON, false);

	}

	public void serialitzaArrayAlumnes(Alumne[] alumnes) {

		String nomFitxer = this.getFileToSerialize();
		String contingutJSON = this.getJSONString(alumnes);

		MyBufferedWriter myBufferedWriter = new MyBufferedWriter();
		myBufferedWriter.escribir(nomFitxer, contingutJSON, false);

	}

	private String getJSONString(Alumne alumne) {

		Gson gson = new Gson();
		String JSON = gson.toJson(alumne);
		return JSON;
	}

	private String getJSONString(Alumne[] alumnes) {

		Gson gson = new Gson();
		String JSON = gson.toJson(alumnes);
		return JSON;
	}

	public String getFileToSerialize() {
		String result = null;

		Class<?> metadataAlumne = Alumne.class;

		Annotation[] classAnnotations = metadataAlumne.getAnnotations();
		if (classAnnotations != null && classAnnotations.length > 0) {
			for (Annotation a : classAnnotations) {
				System.out.println(a.toString());

				if (a instanceof FileDestinationAnnotation) {
					FileDestinationAnnotation fileDestinationAnnotation = (FileDestinationAnnotation) a;
					result = fileDestinationAnnotation.Folder() + fileDestinationAnnotation.FileName();
				}
			}
		}

		return result;
	}

}
