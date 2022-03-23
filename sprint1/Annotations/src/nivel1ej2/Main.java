package nivel1ej2;

public class Main {
	
	public static void main(String[] args) {
		
		Empleado emp = new Empleado("Sonia", "RRHH", 2354);
		Jefe jf = new Jefe("Romeo", "Finanzas", 10, 50000);
		
		jf.canvioDepartamento("Informatica");
		
	}
}
