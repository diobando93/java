package nivel1;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observador> observadores = new ArrayList<Observador>();
	private int estado;
	
	public int getEstado() {
		return estado;
	}
	
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public void agregar(Observador observador) {
		observadores.add(observador);
	}
	
	public void notificarAgencias() {
		observadores.forEach(x -> x.notificar());
	}
	

}
