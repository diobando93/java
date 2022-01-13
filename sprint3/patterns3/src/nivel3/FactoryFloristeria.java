package nivel3;

public class FactoryFloristeria {
	
	public Producto getProducto(String tipo) {
		if(tipo == null){
	         return null;
	      }		
	      if(tipo.equalsIgnoreCase("Arbol")){
	         return new Arbol();
	         
	      } else if(tipo.equalsIgnoreCase("Flor")){
	         return new Flores();
	         
	      } else if(tipo.equalsIgnoreCase("Decoracion")){
	         return new Decoracion();
	      }
		return null;
	}

}
