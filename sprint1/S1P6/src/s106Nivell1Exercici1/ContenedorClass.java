package s106Nivell1Exercici1;

import java.util.ArrayList;
import java.util.Arrays;

public class ContenedorClass {
	private Persona[] personas=new Persona[3];
	
	public ContenedorClass (Persona persona1,Persona persona2,Persona persona3) {
		personas[0]=persona1;
		personas[1]=persona2;
		personas[2]=persona3;	
	}
	
	public Persona getPersonas(int pos) {//extreure
		return personas[pos];
	}
	public Persona[] getPersonas() {//extreure
		return personas;
	}

	public void setPersonas(Persona[] personas) {//afegir
		this.personas = personas;
	}
	public void setPersona(int pos, Persona persona) {//afegir
		this.personas[pos] = persona;
	}

	@Override
	public String toString() {
		return "ContenedorClass [personas=" + Arrays.toString(personas) + "]";
	}
	
	
}
