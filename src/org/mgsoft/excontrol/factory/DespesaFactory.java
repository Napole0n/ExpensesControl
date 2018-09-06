/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgsoft.excontrol.factory;

import java.util.Calendar;
import java.util.Date;
import org.mgsoft.excontrol.DTO.Despesa;
import org.mgsoft.excontrol.DTO.DespesaMensal;
import org.mgsoft.excontrol.DTO.DespesaPontual;
import org.mgsoft.excontrol.DTO.Fornecedor;
import org.mgsoft.excontrol.DTO.Parcela;
import org.mgsoft.excontrol.DTO.Rateio;

/**
 *
 * @author murilo.goedert
 */
public class DespesaFactory {

    public Despesa criarDespesaMensal(
            String desc,
            double valor,
            Rateio[] rats,
            int pedido,
            Fornecedor forn,
            int numeroParcelas,
            Date dataInicio) {

        DespesaMensal desp = new DespesaMensal(desc, valor, rats, pedido, forn);
        desp.setParcelas(criaParcelas(dataInicio, numeroParcelas, valor));
        desp.setIsMensal(true);

        if (rats.length > 1) {
            desp.setComRateio(true);
        }

        return desp;
    }

    public Despesa criarDespesaPontual(String desc,
            double valor,
            Rateio[] rats,
            int pedido,
            Fornecedor forn
    ) {
        DespesaPontual desp = new DespesaPontual(desc, valor, rats, pedido, forn);
        desp.setIsMensal(false);
        if (rats.length > 1) {
            desp.setComRateio(true);
        }

        return desp;
    }

    private Parcela[] criaParcelas(Date dataInicio, int qtd, double valorTotal) {
        Calendar c = Calendar.getInstance();
        c.setTime(dataInicio);
        c.add(Calendar.MONTH, 1);
        double valParc = valorTotal / qtd;
        Parcela[] ret = new Parcela[qtd];

        for (int i = 0; i < qtd; i++) {
            ret[i] = new Parcela(c.getTime(), valParc);
            c.add(Calendar.MONTH, 1);
        }

        return ret;
    }

}
