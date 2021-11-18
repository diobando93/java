package ejercicio1;
import java.util.Arrays;

public class Contenedora {
	
	private Chocolatina[] chocolates = new Chocolatina[3];
	
	public Contenedora(Chocolatina chocolate1, Chocolatina chocolate2, Chocolatina chocolate3) {
		chocolates[0] = chocolate1;
		chocolates[1] = chocolate2;
		chocolates[2] = chocolate2;
		
	}



	public Chocolatina[] getChocolates() {
		return chocolates;
	}



	public void setChocolates(Chocolatina[] chocolates) {
		this.chocolates = chocolates;
	}



	@Override
	public String toString() {
		return "Contenedora [chocolates=" + Arrays.toString(chocolates) + "]";
	}
	

}
