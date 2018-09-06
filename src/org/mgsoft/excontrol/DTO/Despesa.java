/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgsoft.excontrol.DTO;

import java.util.Arrays;
import java.util.Date;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

/**
 *
 * @author murilo.goedert
 */
@Entity("despesas")
public abstract class Despesa {

    @Id
    private int id;
    private String descricao;
    private boolean isMensal;
    private boolean comRateio;
    private double valor;
    private int pedido;
    private final Date dataCadastro;
    private Rateio[] rateios;
    private String[] notasFiscais;
    @Reference
    private Fornecedor fornecedor;

    {
        this.dataCadastro = new Date();
    }

    public Despesa(
            String descricao,
            double valor,
            int pedido,
            Rateio[] rateios,
            Fornecedor fornecedor) {
        this.descricao = descricao;
        this.valor = valor;
        this.pedido = pedido;
        this.rateios = rateios;
        this.fornecedor = fornecedor;
    }

    public CentroDeCusto getCentroDeCusto() {
        return rateios[0].getCcu();
    }

    //Auto-Generated
    public Despesa() {
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
                + valor + ", pedido=" + pedido
                + ", rateios=" + Arrays.toString(rateios) + ", notasFiscais="
                + Arrays.toString(notasFiscais) + ", fornecedor=" + fornecedor + '}';
    }

}
