package nivel3;

public class LibraEsterlina implements CambioMoneda{

	@Override
	public void cambio(double precio) {
		// TODO Auto-generated method stub
		System.out.println("Libra esterlina " + precio * 0.74);
	}

}
