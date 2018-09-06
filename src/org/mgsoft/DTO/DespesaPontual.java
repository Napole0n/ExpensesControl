/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgsoft.DTO;

import org.mongodb.morphia.annotations.Embedded;

/**
 *
 * @author murilo.goedert
 */
@Embedded
public class DespesaPontual extends AbstractDespesa {
    
    public DespesaPontual(
            String desc,
            double valor,
            CentroDeCusto cc,
            int pedido,
            Fornecedor forn
    ) {
        super(desc, valor, new CentroDeCusto[]{cc}, pedido,
                new Rateio[0], forn);
        
        super.setIsMensal(false);
        super.setComRateio(false);
    }
    
    public DespesaPontual(
            String desc,
            double valor,
            CentroDeCusto[] ccs,
            Rateio[] rateios,
            int pedido,
            Fornecedor forn
    ) {
        super(desc, valor, ccs, pedido,
                rateios, forn);
        super.setComRateio(true);
        super.setIsMensal(false);
    }
    
}
