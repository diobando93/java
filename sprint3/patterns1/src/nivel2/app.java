package nivel2;

import java.util.HashMap;

public class app {
	
	public static void main(String [] args) {
		
		FactoryProductor agenda =  new FactoryProductor();
		HashMap<String, String> hm = new HashMap<String, String>();
		FactoryAgenda nueva = agenda.getPais(TiposFormato.Colombia);
		hm.put(nueva.getTelefono("652335237"), nueva.getDireccion("cara", "cristal", "0837"));
		System.out.println(hm);
	}

}
