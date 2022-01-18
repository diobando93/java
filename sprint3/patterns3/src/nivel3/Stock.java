package nivel3;

import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.DBCollection;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;

public class Stock {
	
	private static MongoDB conection = new MongoDB();
	
	
	
	@SuppressWarnings("deprecation")
	public void listProduct() {
		//conection.connectDatabase();
		conection.listStock();
	}
	
	public void insertProduct() {
		
	}
	
	public void deleteProduct() {
		
	}
	
	
	
	//consultar stock
	
	//agregar productos
	
	//eliminar productos

}
