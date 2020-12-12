import com.mongodb.DB;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;


/**
 *
 * @author anthony
 */
public class Connection {
    
    public DB connect() throws UnknownHostException {
        // Creating a Mongo client
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("JavaSmartHomeSystem");
        System.out.println("Connected!");
        return db;
    }

    public void closeConnection(MongoClient client) {
        client.close();
        System.out.println("DisConnected!");
    }
    
}
