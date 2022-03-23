package nivel1ej2;

public class Jefe {
	
	private int bonus;
	
	public Jefe(String n, String d, int c, int b) {
		super(n, d, c);
		bonus = b;
	}
	
	@Override
	public void tipoEmp() {
		System.out.println("Esto es la clase Jefe");
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public void canvioDepartamento(String nuevoDep) {
		super.canvioDepartamento(nuevoDep);
	}

}
