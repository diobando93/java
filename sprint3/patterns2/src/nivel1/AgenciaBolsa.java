package nivel1;

public class AgenciaBolsa extends Observador{
	
	private String name;
	
	AgenciaBolsa(String name) {
		this.name = name;
	}

	@Override
	public void notificar() {
		// TODO Auto-generated method stub
		System.out.println("Agencia: " + name + " notificada!");
		
	}
	
}
