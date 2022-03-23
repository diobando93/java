package nivel1ej1;

public class Jefe extends Empleado{
	
	private int bonus;
	
	public Jefe(String n, String d, int c, int b) {
		super(n, d, c);
		bonus = b;
	}
	
	@Override
	public void tipoEmp() {
		System.out.println("Esto es la clase Jefe");
	}

}
