package nivel2;

public class FactoryProductor {
	public FactoryAgenda getPais(TiposFormato TipoPais) {
		FactoryAgenda miembro = null;
		if(TipoPais.equals(TiposFormato.Ecuador)) {
			miembro = new Ecuador();
		}
		if(TipoPais.equals(TiposFormato.Colombia)) {
			miembro = new Colombia();
		}
		if(TipoPais.equals(TiposFormato.USA)) {
			miembro = new USA();
		}
		if(TipoPais.equals(TiposFormato.Spain)) {
			miembro = new Spain();
		}
		return miembro;
	}
}
