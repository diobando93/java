package nivel3;

public class PesoColombiano implements CambioMoneda{

	@Override
	public void cambio(double precio) {
		// TODO Auto-generated method stub
		System.out.println("Peso Colombiano " + precio*3600);
	}

}
