package nivel3;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;

public class MongoDB {
	private static final String uri = "mongodb://127.0.0.1:27017";
	private static final String DB = "Floristeria";
	
	public void conectar() {
		try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase(DB);
            MongoCollection<Document> collection = database.getCollection("Stock");
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
