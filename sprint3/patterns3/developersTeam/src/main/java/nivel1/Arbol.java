package nivel1;

public class Arbol extends Producto{
	
	private String nombre;
	private double altura;
	private double precio;
	
	public Arbol(String nombre, double altura, double precio) {
		super();
		this.nombre = nombre;
		this.altura = altura;
		this.precio = precio;
	}
		
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
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
		return "Arbol [nombre=" + nombre + ", altura=" + altura + ", precio=" + precio + "]";
	}
	 
}
