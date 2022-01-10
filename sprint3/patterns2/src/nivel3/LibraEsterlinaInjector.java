package nivel3;

public class LibraEsterlinaInjector implements CambioMonedaInjector{

	@Override
	public Consumer getConsumer() {
		// TODO Auto-generated method stub
		return new DICambioMoneda(new LibraEsterlina());
	}
	
	

}
