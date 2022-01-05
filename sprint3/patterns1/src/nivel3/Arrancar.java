package nivel3;

public class Arrancar implements Order{

	@Override
	public void execute(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Arrancando " + vehiculo.getNombre());
	}
	
	

}
