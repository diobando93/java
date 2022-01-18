package nivel3;

import java.util.ArrayList;

public class App {

	public static void main(String [] args) {
		
		double precio = 24.3;
	
		
		CambioMonedaInjector injector = null;
		
		Consumer app = null;
		
		System.out.println("La licuadora oster cuesta " + precio + " en USD, en otras monedas cuesta: ");
		
		//cambio a euros
		injector = new EuroInjector();
		app = injector.getConsumer();
		app.procesarCambio(precio);
		
		//cambio a pesos
		injector = new PesoColombianoInjector();
		app = injector.getConsumer();
		app.procesarCambio(precio);
		
		//cambio a libra esterlina
		injector = new LibraEsterlinaInjector();
		app = injector.getConsumer();
		app.procesarCambio(precio);
		
		
	}
	
}
