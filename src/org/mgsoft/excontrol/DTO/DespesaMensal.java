/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgsoft.excontrol.DTO;

import java.util.Arrays;
import org.mongodb.morphia.annotations.Entity;

/**
 *
 * @author murilo.goedert
 */
@Entity("despesas")
public class DespesaMensal extends Despesa {

    private Parcela[] parcelas;

    public DespesaMensal(
            String desc,
            double valor,
            Rateio[] rats,
            int pedido,
            Fornecedor forn
    ) {
        super(desc, valor, pedido,
                rats, forn);
    }

    public DespesaMensal() {
    }

    public Parcela[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(Parcela[] parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public String toString() {
        return super.toString() + "parcelas=" + Arrays.toString(parcelas) + '}';
    }

}
