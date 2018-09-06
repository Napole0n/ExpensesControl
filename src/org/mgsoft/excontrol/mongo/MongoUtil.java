package org.mgsoft.excontrol.mongo;

import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.io.IOException;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/*
 * @author murilo.goedert
 */
public class MongoUtil {

    Morphia morph = new Morphia();
    Datastore db;

    public MongoUtil(String dbName) throws IOException {
        MongoConfigHelper helper = new MongoConfigHelper();
        morph.mapPackage(helper.getMappedPackages(), true);
        db = morph.createDatastore(new MongoClient(helper.getServerAdress(), helper.getServerPort()), dbName);
    }

    public Datastore getDataStore() {
        return db;
    }

    public Morphia getMorphia() {
        return morph;
    }

    public void save(Object o) {
        db.save(o);

    }

    public void remove(DBObject o) {
        db.delete(o);
    }

}
