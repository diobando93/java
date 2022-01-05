package nivel2;

public class Colombia implements FactoryAgenda{

	@Override
	public String getTelefono(String tel) {
		// TODO Auto-generated method stub
		return 57 + tel;
	}

	@Override
	public String getDireccion(String calle, String nombre, String cp) {
		// TODO Auto-generated method stub
		return nombre + calle + cp;
	}



	
}
