/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgsoft.DTO;

import java.util.Date;

/**
 *
 * @author murilo.goedert
 */
public class Parcela {
    
    public Date vencimento;
    public double valor;

    public Parcela(Date vencimento, double valor) {
        this.vencimento = vencimento;
        this.valor = valor;
    }
    
    

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
