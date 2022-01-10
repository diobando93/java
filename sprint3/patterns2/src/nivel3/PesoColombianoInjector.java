package nivel3;

public class PesoColombianoInjector implements CambioMonedaInjector{

	@Override
	public Consumer getConsumer() {
		// TODO Auto-generated method stub
		return new DICambioMoneda(new PesoColombiano());
	}

	
	
}
