/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgsoft.excontrol.tests;

import java.io.IOException;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mgsoft.excontrol.DTO.CentroDeCusto;
import org.mgsoft.excontrol.DTO.Despesa;
import org.mgsoft.excontrol.DTO.DespesaMensal;
import org.mgsoft.excontrol.DTO.DespesaPontual;
import org.mgsoft.excontrol.DTO.Fornecedor;
import org.mgsoft.excontrol.DTO.Rateio;
import org.mgsoft.excontrol.factory.DespesaFactory;
import org.mgsoft.excontrol.mongo.MongoUtil;

/**
 *
 * @author murilo.goedert
 */
public class TestGravacaoELeitura {

    public TestGravacaoELeitura() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void test() throws IOException {
        MongoUtil mutil = new MongoUtil("tests");
        DespesaFactory fac = new DespesaFactory();
        CentroDeCusto c = new CentroDeCusto(4105, "TI");

        Rateio r = new Rateio(c, 100);

        Fornecedor f = new Fornecedor("Inventti", "123456789");
        Despesa d1 = fac.criarDespesaMensal("NFE-Pack", 2400d, new Rateio[]{r}, 1234, f, 5, new Date());
        Despesa d2 = fac.criarDespesaPontual("Camera Ração", 240.80d, new Rateio[]{r}, 1234, f);
        d2.setId(1);

        mutil.save(f);
        mutil.save(d1);
        mutil.save(d2);

        Despesa dRet = mutil.getDataStore().get(DespesaMensal.class, 0);
        Despesa dRet2 = mutil.getDataStore().get(DespesaPontual.class, 1);
        Fornecedor fRet = mutil.getDataStore().get(Fornecedor.class, "123456789");

        assertEquals(((DespesaMensal) d1).toString(), ((DespesaMensal) dRet).toString());
        assertEquals(((DespesaPontual) d2).toString(), ((DespesaPontual) dRet2).toString());
        assertEquals(f.toString(), fRet.toString());

    }

}
