package nivel3;

public class Decoracion implements Producto{

	private String nombre;
	private String tipo;
	private double precio;
		
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public void setProducto(String tipo, String nombre, double precio) {
		// TODO Auto-generated method stub
		System.out.println("Decoracion " + nombre + " de tipo " + tipo + "a un precio " + precio );
		
	}


	
	
	
	
	

}
