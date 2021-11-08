package ej1;
import java.util.ArrayList;
import java.util.Iterator;

public class Junit {
	
	public void verificar(ArrayList<Month> monthProve) {
		
		ArrayList<Month> month = new ArrayList<Month>();
		month.add(new Month("Enero"));
		month.add(new Month("Febrero"));
		month.add(new Month("Marzo"));
		month.add(new Month("Abril"));
		month.add(new Month("Mayo"));
		month.add(new Month("Junio"));
		month.add(new Month("Julio"));
		month.add(new Month("Agosto"));
		month.add(new Month("Septiembre"));
		month.add(new Month("Octubre"));
		month.add(new Month("Noviembre"));
		month.add(new Month("Diciembre"));
		
		if(month.size() == monthProve.size()) {
			
			for(int i = 0; i < month.size(); i++) {
				
				if(month.get(i).getName() != monthProve.get(i).getName()) {
					System.out.println("Los meses estan mal posicionados");
					break;
					
				}
				
			}
			
			System.out.println("Meses OK");
			
		}else {
			System.out.println("Hay mas o menos meses");
		}
			
	}

}
