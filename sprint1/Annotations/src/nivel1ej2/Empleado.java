package nivel1ej2;

public class Empleado {
	
	private String nombre;
	private String departamento;
	private int codigo_empleado;
	
	public Empleado(String n, String dep, int cod) {
		nombre = n;
		departamento = dep;
		codigo_empleado = cod;
	}

	public void tipoEmp() {
		System.out.println("Esto es la clase empleado");
	}
	
	/**
	 * @deprecated
	 * @param nuevoDep
	 */
	@Deprecated 
	public void canvioDepartamento(String nuevoDep) {
		departamento = nuevoDep;
	}

}
