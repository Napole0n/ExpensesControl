/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgsoft.DTO;

import java.util.Date;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;


/**
 *
 * @author murilo.goedert
 */
@Entity("despesas")
public class DespesaMensal extends AbstractDespesa {

    private Date vencContrato;
    private Parcela[] parcelas;

    public DespesaMensal(
            String desc,
            double valor,
            CentroDeCusto cc,
            int pedido,
            Fornecedor forn,
            int numParcelas
    ) {
        super(desc, valor, new CentroDeCusto[]{cc}, pedido,
                new Rateio[0], forn);

        super.setIsMensal(true);
        super.setComRateio(false);
    }

    public DespesaMensal(
            String desc,
            double valor,
            CentroDeCusto[] ccs,
            Rateio[] rateios,
            int pedido,
            Fornecedor forn,
            int numParcelas
    ) {
        super(desc, valor, ccs, pedido,
                rateios, forn);

        super.setIsMensal(true);
        super.setComRateio(true);
    }
    
    private void geraParcelas(int quantidade, double valorTotal){
        
        
        
        Parcela[] parcelas = new Parcela[quantidade];
        
        for(int i=0;i<quantidade;i++){
           
        }
        
    }

    public Date getVencContrato() {
        return vencContrato;
    }

    public void setVencContrato(Date vencContrato) {
        this.vencContrato = vencContrato;
    }

    public Parcela[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(Parcela[] parcelas) {
        this.parcelas = parcelas;
    }

}
