package nivel3;

public class Arbol implements Producto{
	
	private String nombre;
	private double altura;
	private double precio;
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public void setProducto(String altura, String nombre, double precio) {
		// TODO Auto-generated method stub
		System.out.println("Arbol: " + nombre + " de altura " + altura + "a un precio " + precio );
		
	}



	


	

	


}
