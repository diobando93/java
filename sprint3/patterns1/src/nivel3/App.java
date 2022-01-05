package nivel3;

public class App {
	
	public static void main(String [] args) {
		
		Broker lm = new Broker();
		
		lm.takeOrder(new Acelerar());
		lm.takeOrder(new Arrancar());
		lm.takeOrder(new Frenar());
		
		Vehiculo coche = new Vehiculo();
		coche.setNombre("coche");
		Vehiculo bicicleta = new Vehiculo();
		bicicleta.setNombre("bicileta");
		Vehiculo avion = new Vehiculo();
		avion.setNombre("avion");
		Vehiculo barco = new Vehiculo();
		barco.setNombre("barco");
		
		GestorMetodos gm = new GestorMetodos();
		gm.execute(lm, coche);
		gm.execute(lm, bicicleta);
		gm.execute(lm, avion);
		gm.execute(lm, barco);
		
	}

}
