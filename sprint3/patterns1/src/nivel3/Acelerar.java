package nivel3;

public class Acelerar implements Order{

	@Override
	public void execute(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Aceleradando " + vehiculo.getNombre());
	}
	
	

}
