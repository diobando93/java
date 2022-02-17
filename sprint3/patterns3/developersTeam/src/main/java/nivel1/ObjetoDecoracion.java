package nivel1;

public class ObjetoDecoracion extends Producto{
	
	private String nombre;
	private String material;
	private double precio;
	
	public ObjetoDecoracion(String nombre, String material, double precio) {
		super();
		this.nombre = nombre;
		this.material = material;
		this.precio = precio;
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String getNombre() {
		return nombre;
	}
	@Override
	public double getPrecio() {
		return precio;
	}
	@Override
	public String toString() {
		return "ObjectoDecoracion [nombre=" + nombre + ", material=" + material + ", precio=" + precio + "]";
	}
	
}
