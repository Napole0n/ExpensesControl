/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgsoft.util;

import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongotest.Veiculo;

/**
 *
 * @author murilo.goedert
 */
public class Teste {

    public static void main(String[] args) throws UnknownHostException {

        /* MongoClient mClient = MongoProvider.getClient("localhost", 27017);
        DB database = mClient.getDB("MyDb");
        DBCollection coll = database.getCollection("Fornecedores");

        Fornecedor forn1 = new Fornecedor("Nardelli", "124896000124");
        Fornecedor forn2 = new Fornecedor("Unibox", "895411000124");
        Fornecedor forn3 = new Fornecedor("Cravil", "9884755000124");
        Fornecedor forn4 = new Fornecedor("Sezinho", "48756000124");
        Fornecedor forn5 = new Fornecedor("Imperatriz", "1124796000124");

        //inserindo individualmente
        coll.insert(MongoAdapter.adapt(forn1));
        coll.insert(MongoAdapter.adapt(forn2));

        //inserindo como lista
        coll.insert(MongoAdapter.adapt(Arrays.asList(new Fornecedor[]{forn3, forn4, forn5})));
         */
        final Morphia morphia = new Morphia();

// tell Morphia where to find your classes
// can be called multiple times with different packages or classes
        morphia.mapPackage("org.mongotest");

// create the Datastore connecting to the default port on the local host
        final Datastore datastore = morphia.createDatastore(new MongoClient(), "MyDb");
        datastore.ensureIndexes();

        Veiculo v = new Veiculo(1, "Fiat Uno", 9000d);

        datastore.save(v);

    }

}
