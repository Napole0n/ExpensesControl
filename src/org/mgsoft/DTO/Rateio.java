/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgsoft.DTO;

/**
 *
 * @author murilo.goedert
 */
public class Rateio {
    
    private int ccuId;
    private int percentual;

    public Rateio(int ccuId, int percentual) {
        this.ccuId = ccuId;
        this.percentual = percentual;
    }

    
    
    public int getCcuId() {
        return ccuId;
    }

    public void setCcuId(int ccuId) {
        this.ccuId = ccuId;
    }

    public int getPercentual() {
        return percentual;
    }

    public void setPercentual(int percentual) {
        this.percentual = percentual;
    }
    
    
    
}
