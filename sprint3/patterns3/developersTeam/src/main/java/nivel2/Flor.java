package nivel2;

public class Flor implements IProducto{
	
	private String nombre;
	private double precio;
	private String color;
	public static final String NOMBRE_TABLA = "flor";
	
	public Flor(String nombre, String color, double precio) {
		this.nombre = nombre;
		this.color = color;
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
	
	public String getColor() {
		return color;
	}

	@Override
	public String getNombreTabla() {
		// TODO Auto-generated method stub
		return NOMBRE_TABLA;
	}

	@Override
	public String getInsertQuery() {
		// TODO Auto-generated method stub
		return "(default, '"+this.getNombre()+"', '"+this.getColor()+"', "+this.getPrecio()+")";
	}
	
	

}
