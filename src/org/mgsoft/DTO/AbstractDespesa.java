/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgsoft.DTO;

import java.util.Date;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

/**
 *
 * @author murilo.goedert
 */
@Entity("despesas")
public abstract class AbstractDespesa {

    @Id
    private int id;
    private String descricao;
    private boolean isMensal;
    private boolean comRateio;
    private double valor;
    @Reference
    private CentroDeCusto[] ccus;
    private int pedido;
    private final Date dataCadastro;
    private Rateio[] rateios;
    private String[] notasFiscais;
    @Reference
    private Fornecedor fornecedor;

    {
        this.dataCadastro = new Date();
    }

    public AbstractDespesa(
            String descricao,
            double valor,
            CentroDeCusto[] ccus,
            int pedido,
            Rateio[] rateios,
            Fornecedor fornecedor) {
        this.descricao = descricao;
        this.valor = valor;
        this.ccus = ccus;
        this.pedido = pedido;
        this.rateios = rateios;
        this.fornecedor = fornecedor;
    }
    
    public AbstractDespesa(){
        
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isIsMensal() {
        return isMensal;
    }

    public void setIsMensal(boolean isMensal) {
        this.isMensal = isMensal;
    }

    public boolean isComRateio() {
        return comRateio;
    }

    public void setComRateio(boolean comRateio) {
        this.comRateio = comRateio;
    }

    public double isValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public CentroDeCusto[] getCcus() {
        return ccus;
    }

    public void setCcus(CentroDeCusto[] ccus) {
        this.ccus = ccus;
    }

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public Rateio[] getRateios() {
        return rateios;
    }

    public void setRateios(Rateio[] rateios) {
        this.rateios = rateios;
    }

    public String[] getNotasFiscais() {
        return notasFiscais;
    }

    public void setNotasFiscais(String[] notasFiscais) {
        this.notasFiscais = notasFiscais;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Despesa{" + "id=" + id + ", descricao="
                + descricao + ", isMensal=" + isMensal
                + ", comRateio=" + comRateio + ", valor="
                + valor + ", ccus=" + ccus + ", pedido=" + pedido
                + ", rateios=" + rateios + ", notasFiscais="
                + notasFiscais + ", fornecedor=" + fornecedor + '}';
    }

}
