package nivel1;

public class App {
	
	public static void main(String [] args) {
		
		Subject subject = new Subject();
		
		subject.agregar(new AgenciaBolsa("ATM"));
		subject.agregar(new AgenciaBolsa("NYC"));
		subject.agregar(new AgenciaBolsa("per capita"));
		
		subject.notificarAgencias();
	}

}
