package nivel3;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Conexion {
	
	
	MongoClient mongoClient = new MongoClient("localhost", 27017);
	DB database = mongoClient.getDB("Floristeria");
	//MongoClient client = new MongoClient("localhost", 27017);
	//MongoDatabase database = client.getDatabase("Floristeria");
		
	public void insertarProducto(IProducto producto) {
		BasicDBObject document = new BasicDBObject();
		document.put("nombre", producto.getNombre());
		document.put("atributo", producto.getAtributo());
		document.put("precio", producto.getPrecio());
		document.put("tipo", producto.getTipo());
		DBCollection collection = database.getCollection("Producto");		
		collection.insert(document);
	}
	
	public boolean existeDocumento(String nombreProducto) {
		boolean existe = false;
		DBCollection collection = database.getCollection("Producto");
		BasicDBObject findDocument = new BasicDBObject("nombre", nombreProducto);
		DBCursor cursor = collection.find(findDocument);
		while (cursor.hasNext()) {
		    System.out.println(cursor.next());
		    if(cursor != null){
				existe = true;
			}
		}
		return existe;
	}
	
	//Funci�n copiada de mostrarDocumentos,para no alterarla:
	public void mostrarDocumentos(String tipoDocumento, String nombreColeccion) {
		DBCollection collection = database.getCollection(nombreColeccion);
		DBCursor resultDocuments = devuelveIterable(tipoDocumento, collection);
		DBCursor it = (DBCursor) resultDocuments.iterator();
		if(it.hasNext()) {
			while(it.hasNext()) {
				System.out.println(it.next().toString());
			}
		}else {
			System.out.println("No hay resultados para "+tipoDocumento);
		}
	}
	
	public DBCursor devuelveIterable(String tipoDocumento, DBCollection c) {
		DBCursor resultDocuments;
		if(tipoDocumento == null) {
			resultDocuments = c.find();
		}else {
			BasicDBObject findDocument = new BasicDBObject("tipo", tipoDocumento);
			resultDocuments = c.find(findDocument);
		}
		return resultDocuments;
	}
	
	public void añadirVenta(String nombreProducto) {
		DBCollection collectionProducto = database.getCollection("Producto");
		
		BasicDBObject documentoProducto = new BasicDBObject("nombre", nombreProducto);
		BasicDBObject documentoEncontrado = (BasicDBObject) collectionProducto.findAndRemove(documentoProducto);
		
		BasicDBObject documentoTicket = new BasicDBObject("nombre", nombreProducto);
		documentoTicket.append("atributo", documentoEncontrado.getString("atributo"));
		documentoTicket.append("precio", documentoEncontrado.getDouble("precio"));
		documentoTicket.append("tipo", documentoEncontrado.getString("tipo"));	
		
		DBCollection collectionTicket = database.getCollection("Ticket");
		collectionTicket.insert(documentoTicket);
	}
	
	public double sumarFacturacion() {
		double sumatorio = 0.0;
		double aux = 0;
		String precio;
		DBCollection collection = database.getCollection("Ticket");
		DBCursor cursor = collection.find();
		while(cursor.hasNext()) {
			aux = (double) cursor.next().get("precio");
			sumatorio = aux + sumatorio;
		}
		return sumatorio;
	}

}
