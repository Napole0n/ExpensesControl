/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgsoft.mongo;

import java.io.IOException;
import org.mgsoft.DTO.CentroDeCusto;
import org.mgsoft.DTO.DespesaMensal;
import org.mgsoft.DTO.Fornecedor;
import org.mgsoft.DTO.Rateio;

/**
 *
 * @author murilo.goedert
 */
public class test {

    public static void main(String[] args) throws IOException {

        CentroDeCusto c = new CentroDeCusto(4105, "TI");
        CentroDeCusto c2 = new CentroDeCusto(4202, "Telefonista");

        Rateio r1 = new Rateio(4105, 50);
        Rateio r2 = new Rateio(4202, 50);

        Fornecedor f = new Fornecedor("Fabio Leonardo Will", "123234343");
       // DespesaMensal d1 = new DespesaMensal("Conta do banco", 1250d, c, 123, f, 1);
        
        
        DespesaMensal d2 = new DespesaMensal("Cameras do Fabio", 300d, new CentroDeCusto[]{c, c2}, new Rateio[]{r1, r2}, 1234, f, 1);

        MongoUtil mu = new MongoUtil("test");

        mu.save(c2);
        mu.save(f);
        mu.save(d2);

    }

}
