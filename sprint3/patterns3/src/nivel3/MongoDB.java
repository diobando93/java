package nivel3;

import java.util.Iterator;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
//import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;

public class MongoDB {
	
	private static final String uri = "mongodb://127.0.0.1:27017";
	private static final String DB = "Floristeria";
	private static final String Coleccion = "Stock"; 
    private MongoDatabase mongodb; 
    MongoClient mongoClient = new MongoClient();
	
    public MongoClient connectDatabase(){
    	mongoClient = new MongoClient("localhost", 27017);
    	System.out.println("Conexión correcta");
        return mongoClient;
    }
    
    public void disconnect() {
        mongoClient.close();
    }
    
    
    @SuppressWarnings("deprecation")
	public void listStock(){ 
        // To return all documents in a collection, call the find method without a criteria document.
        // Para devolver todos los documentos en una colección, llamamos al método find sin ningún documento <b>criteria</b>
        FindIterable<Document> iterable = getMongodb().getCollection(Coleccion).find();
        // Iterate the results and apply a block to each resulting document.
        // Iteramos los resultados y aplicacimos un bloque para cada documento.
        iterable.forEach(new Block<Document>() {
            @Override
            public void apply(final Document document) {
                System.out.println(document);
            }
        });   
    }
    
    public void insertData(String producto, String caracteristica, String precio, String Prod, String Carac, String Pre){
    	
    	BasicDBObject document = new BasicDBObject();
    	document.put(producto, Prod);
    	document.put(caracteristica, Carac);
    	document.put(precio, Pre);
    	//collection.insert(document);
    
    }        

	public MongoClient getMongoClient() {
		return mongoClient;
	}


	public void setMongoClient(MongoClient mongoClient) {
		this.mongoClient = mongoClient;
	}


	public MongoDatabase getMongodb() {
		return mongodb;
	}


	public void setMongodb(MongoDatabase mongodb) {
		this.mongodb = mongodb;
	}
	
	

		
		
}
