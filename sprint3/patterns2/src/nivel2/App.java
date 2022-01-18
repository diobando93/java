package nivel2;

public class App {
	
	public static void main(String [] args) {
		Pago nike = new Debito();
		Pago adidas = new paypal();
		Zapatos rinconDeportivo = new Zapatos();
		rinconDeportivo.pasarelaPago(nike);
		rinconDeportivo.pasarelaPago(adidas);
		
	}
	
}
