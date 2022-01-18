package nivel3;


public class Floristeria {
	private String nombre;
	
	FactoryFloristeria productFloristeria = new FactoryFloristeria();
	
	public void addStock(String tipoProducto, String nombre, String caracteristica, String precio) {
		Producto producto = productFloristeria.getProducto(tipoProducto);
		producto.setProducto(caracteristica, nombre, precio);
		System.out.println(producto.getNombre());
		System.out.println(producto.getPrecio());
		System.out.println(producto.getCaracteristica());
	}
	//stock -- > consultar, agregar, eliminar, 
	//venta --> ticket, suma de saldo 

	//stock
	//venta --> ticket 

}
