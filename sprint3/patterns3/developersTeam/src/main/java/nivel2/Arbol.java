package nivel2;

public class Arbol implements IProducto{
	
	private String nombre;
	private double precio;
	private String altura;
	public static final String NOMBRE_TABLA = "arbol";
	
	public Arbol(String nombre, String altura, double precio) {
		this.nombre = nombre;
		this.altura = altura;
		this.precio = precio;
	}
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}
	
	public String getAltura() {
		return altura;
	}
	
	@Override
	public String getNombreTabla() {
		// TODO Auto-generated method stub
		return NOMBRE_TABLA;
	}

	@Override
	public String getInsertQuery() {
		// TODO Auto-generated method stub
		return "(default, '"+this.getNombre()+"', "+this.getAltura()+", "+this.getPrecio()+")";
	}

}
