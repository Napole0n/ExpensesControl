/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgsoft.excontrol.mongo;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONObject;

/**
 *
 * @author murilo.goedert
 */
public class MongoConfigHelper {

    private final JSONObject configObg;
    private String jsonObjPath = "src/org/mgsoft/excontrol/mongo/conf.json";

    public MongoConfigHelper(String jsonFilePath) {
        this.jsonObjPath = jsonFilePath;
        JSONObject ob;
        try {
            ob = new JSONObject(readConfig(jsonFilePath));
        } catch (IOException ex) {
            JSONObject b = new JSONObject();
            b.put("mongo_port", 27017);
            b.put("mongo_adress", "localhost");
            b.put("mapped_package", "org.mgsoft.DTO");
            ob = b;
        }
        this.configObg = ob;
    }

    public MongoConfigHelper() throws IOException {
        this.configObg = new JSONObject(readConfig(jsonObjPath));
    }

    public void setServerParameters(String adress, int port) throws IOException {
        configObg.remove("mongo_adress");
        configObg.remove("mongo_port");
        configObg.put("mongo_adress", adress);
        configObg.put("mongo_port", port);
        burn();
    }

    public String getServerAdress() {
        return configObg.getString("mongo_adress");
    }

    public int getServerPort() {
        return configObg.getInt("mongo_port");
    }

    public void setMappedPackage(String packg) throws IOException {
        configObg.remove("mapped_package");
        configObg.put("mapped_package", packg);
        burn();

    }

    public String getMappedPackages() {
        String ret = configObg.getString("mapped_package");
        if (ret == null) {
            System.err.println("Não existem pacotes mapeados no arquivo de configuracao");
        }
        return ret;
    }

    private String readConfig(String filePath) throws IOException {
        return String.join("\n", Files.readAllLines(Paths.get(filePath)));
    }

    private void burn() throws IOException {
        FileWriter wr = new FileWriter(jsonObjPath);
        wr.write(configObg.toString());
        wr.close();
    }

}
