package ej2;
import java.util.ArrayList;

public class jUnit {
	
	public void verificar(ArrayList<String> numerosDNI) {
		
		for(int i = 0; i < numerosDNI.size(); i++) {
			
			 if(numerosDNI.get(i).length() == 8) {
				 System.out.println("Numeros de DNI bien");
				 
			 }else {
				 System.out.println("Numeros de DNI MAL");
				 
			 }
				 
		
		}
		
		
	}
	
	
}

