/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgsoft.excontrol.mongo;

import java.io.IOException;
import org.mgsoft.excontrol.DTO.CentroDeCusto;
import org.mgsoft.excontrol.DTO.Despesa;
import org.mgsoft.excontrol.DTO.DespesaPontual;
import org.mgsoft.excontrol.DTO.Fornecedor;
import org.mgsoft.excontrol.DTO.Rateio;
import org.mgsoft.excontrol.factory.DespesaFactory;

public class test {

    public static void main(String[] args) throws IOException {

        MongoUtil utl = new MongoUtil("test");
        DespesaFactory df = new DespesaFactory();
        CentroDeCusto c = new CentroDeCusto(4105, "TI");

        Fornecedor f = new Fornecedor("Inventti", "123456789");
        Fornecedor f2 = new Fornecedor("RDois", "14481119");
        Rateio r = new Rateio(c, 100);

        //Despesa d = df.criarDespesaMensal("NFE-Pack", 2400d, new Rateio[]{r}, 1234, f, 5, new Date());
        //Despesa d3 = df.criarDespesaPontual("Cameras para a Possilga", 250.41d, new Rateio[]{r}, 1222, f2);

       // utl.save(f2);
        //utl.save(d3);

        Despesa d2 = utl.db.get(DespesaPontual.class, 0);
        System.out.println(d2);
        
        
    }

}
