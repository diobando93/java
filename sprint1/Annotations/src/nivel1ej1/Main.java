package nivel1ej1;

public class Main {
	public static void main(String[] args) {
		
		Empleado emp = new Empleado("Sonia", "RRHH", 2354);
		Jefe jf = new Jefe("Romeo", "Finanzas", 10, 50000);
		
		emp.tipoEmp();
		jf.tipoEmp();
		
	}
}
