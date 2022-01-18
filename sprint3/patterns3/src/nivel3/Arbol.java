package nivel3;

public class Arbol implements Producto{
	
	private String nombre;
	private String caracteristica;
	private String precio;
	
	
	@Override
	public String getNombre() {
		return nombre;
	}


	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	@Override
	public String getPrecio() {
		return precio;
	}


	@Override
	public void setPrecio(String precio) {
		this.precio = precio;
	}



	@Override
	public void setProducto(String caracteristica, String nombre, String precio) {
		setCaracteristica(caracteristica);
		setNombre(nombre);
		setPrecio(precio);
		//System.out.println("Flor: " + nombre + " de color " + color + "a un precio " + precio );	
	}



	@Override
	public String getCaracteristica() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String setCaracteristica(String caracteristica) {
		// TODO Auto-generated method stub
		return caracteristica;
		
	}
	
	






}
