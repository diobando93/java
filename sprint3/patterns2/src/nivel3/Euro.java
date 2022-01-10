package nivel3;

public class Euro implements CambioMoneda{

	@Override
	public void cambio(double precio) {
		// TODO Auto-generated method stub
		
		precio = precio  * 0.80;
		System.out.println("Euro " + precio);
	}




	
	

}
