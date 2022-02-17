package nivel1;

public class Flor extends Producto{
	
	private String nombre;
	private String color;
	private double precio;
	
	public Flor(String nombre, String color, double precio) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.precio = precio;
	}

	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
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
		return "Flor [nombre=" + nombre + ", color=" + color + ", precio=" + precio + "]";
	}
	

}
