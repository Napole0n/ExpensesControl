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
public class Rateio {

    private CentroDeCusto ccu;
    private int percentual;

    public Rateio(CentroDeCusto ccu, int percentual) {
        this.ccu = ccu;
        this.percentual = percentual;
    }
    
    public Rateio(){}

    public CentroDeCusto getCcu() {
        return ccu;
    }

    public void setCcu(CentroDeCusto ccu) {
        this.ccu = ccu;
    }

    public int getPercentual() {
        return percentual;
    }

    public void setPercentual(int percentual) {
        this.percentual = percentual;
    }

    @Override
    public String toString() {
        return "Rateio{" + "ccu=" + ccu + ", percentual=" + percentual + '}';
    }
    
    

}
