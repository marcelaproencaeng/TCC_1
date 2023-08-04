package mongodb.fundatec.org.mongodb;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.mongodb.MongoClientSettings.*;

@SpringBootApplication
public class MongodbApplication {

    public static void main(String[] args) {
//        String uri = "mongodb+srv://marcela:rootroot@fundatec.ttbcqmq.mongodb.net/?retryWrites=true&w=majority";

////        MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017));
//        MongoDatabase database = mongoClient.getDatabase("fundatec");
//        MongoCollection<Document> collection = database.getCollection("novacol");
//
//        Document doc = new Document();
//        doc.put("name", "somalia");
//        doc.put("state", "casado");
//
//        collection.insertOne(doc);
        // Replace the placeholder with your Atlas connection string
//        ConnectionString connectionString = new ConnectionString("mongodb://host1:27017,host2:27017,host3:27017/");
//        MongoClient mongoClient = MongoClients.create(connectionString);
        String uri = "mongodb+srv://marcela:rootroot@fundatec.ttbcqmq.mongodb.net/?retryWrites=true&w=majority";
        MongoClient mongoClient = MongoClients.create(uri);
        // Construct a ServerApi instance using the ServerApi.builder() method
        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        MongoClientSettings settings = builder()
                .applyConnectionString(new ConnectionString(uri))
                .serverApi(serverApi)
                .build();
        // Create a new client and connect to the server
        try (mongoClient = MongoClients.create(settings)) {
            MongoDatabase database = mongoClient.getDatabase("admin");
            try {
                // Send a ping to confirm a successful connection
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
            } catch (MongoException me) {
                System.err.println(me);
            }
        }

    }
}
//    }

//		SpringApplication.run(MongodbApplication .class,args);
//}
//
//}
