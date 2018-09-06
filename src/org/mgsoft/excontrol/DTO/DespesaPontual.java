/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgsoft.excontrol.DTO;

/**
 *
 * @author murilo.goedert
 */
public class DespesaPontual extends Despesa {

    public DespesaPontual(
            String desc,
            double valor,
            Rateio[] rats,
            int pedido,
            Fornecedor forn
    ) {
        super(desc, valor, pedido,
                rats, forn);
    }
    
    public DespesaPontual(){}
}
