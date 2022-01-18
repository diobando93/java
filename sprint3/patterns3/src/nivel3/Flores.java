package nivel3;

public class Flores implements Producto{
	private String nombre;
	private String color;
	private double precio;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public void setProducto(String color, String nombre, double precio) {
		// TODO Auto-generated method stub
		System.out.println("Flor: " + nombre + " de color " + color + "a un precio " + precio );
		
	}


	
	

}
