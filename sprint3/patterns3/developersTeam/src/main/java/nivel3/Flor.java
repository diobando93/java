package nivel3;

public class Flor implements IProducto{
	
	private String nombre;
	private String color;
	private double precio;
	
	@Override
	public void setCaracteristicas() {
		this.nombre = Utiles.pedirAtributo("nombre");
		this.color = Utiles.pedirAtributo("color");
		this.precio = Utiles.pedirDouble("precio");
	}
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	@Override
	public String getAtributo() {
		// TODO Auto-generated method stub
		return color;
	}
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}
	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Flor";
	}

	@Override
	public String toString() {
		return "Flor [nombre=" + nombre + ", color=" + color + ", precio=" + precio + "]";
	}
	
	
}
