package nivel3;

public class Frenar implements Order{

	@Override
	public void execute(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Frenando " + vehiculo.getNombre());
	}
	
	

}
