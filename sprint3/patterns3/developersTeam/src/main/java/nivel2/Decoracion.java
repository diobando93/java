package nivel2;

public class Decoracion implements IProducto{
	
	private String nombre;
	private double precio;
	private String material;
	public static final String NOMBRE_TABLA = "objeto_deco";
	
	public Decoracion(String nombre, String material, double precio) {
		this.nombre = nombre;
		if (material.equalsIgnoreCase("Fusta") || (material.equalsIgnoreCase("plastic"))){
			this.material = material;
		}else {
			System.out.println("Material incorrecte.");
			this.material = null;
		}
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
	
	public String getMaterial() {
		return material;
	}
	
	@Override
	public String getNombreTabla() {
		// TODO Auto-generated method stub
		return NOMBRE_TABLA;
	}
	@Override
	public String getInsertQuery() {
		// TODO Auto-generated method stub
		return "(default, '"+this.getNombre()+"', '"+this.getMaterial()+"', "+this.getPrecio()+")";
	}
	
	
	
}
