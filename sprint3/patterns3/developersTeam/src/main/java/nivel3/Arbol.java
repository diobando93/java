package nivel3;

public class Arbol implements IProducto{
	
	private String nombre;
	private String altura;
	private double precio;
	
	
	@Override
	public void setCaracteristicas() {
		// TODO Auto-generated method stub
		this.nombre = Utiles.pedirAtributo("nombre");
		this.altura = Utiles.pedirAtributo("altura");
		this.precio = Utiles.pedirDouble("precio");
	}
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String getAtributo() {
		// TODO Auto-generated method stub
		return altura;
	}
	
	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Arbol";
	}

	@Override
	public String toString() {
		return "Arbol [nombre=" + nombre + ", altura=" + altura + ", precio=" + precio + "]";
	}
	
	
	
	
	
}
