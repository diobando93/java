package nivel3;

public class DICambioMoneda implements Consumer{
	
	private CambioMoneda moneda;
	
	public DICambioMoneda(CambioMoneda usd) {
		this.moneda = usd;
	}

	@Override
	public void procesarCambio(double precio) {
		// TODO Auto-generated method stub
		this.moneda.cambio(precio);
		
	}
	
	
}
