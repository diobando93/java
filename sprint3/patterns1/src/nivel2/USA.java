package nivel2;

public class USA implements FactoryAgenda{

	@Override
	public String getTelefono(String tel) {
		// TODO Auto-generated method stub
		return 001 + tel;
	}

	@Override
	public String getDireccion(String calle, String nombre, String cp) {
		// TODO Auto-generated method stub
		return nombre + calle + cp;
	}



	
}
