/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgsoft.excontrol.DTO;

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

    public Parcela() {
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

    @Override
    public String toString() {
        return "Parcela{" + "vencimento=" + vencimento + ", valor=" + valor + '}';
    }

    
    
}
