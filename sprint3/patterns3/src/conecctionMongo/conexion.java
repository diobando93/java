package conecctionMongo;

import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import org.bson.conversions.Bson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Sorts;

public class conexion {
	
	public static void main( String[] args ) {
        // Replace the uri string with your MongoDB deployment's connection string
        String uri = "mongodb://127.0.0.1:27017";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("citoapp");
            MongoCollection<Document> collection = database.getCollection("medicos");
            Bson projectionFields = Projections.fields(
                    Projections.excludeId());
            Document doc = collection.find()
                    .projection(projectionFields)
                    .first();
            if (doc == null) {
                System.out.println("No results found.");
            } else {
                System.out.println(doc.toJson());
            }
        }
    }
}
