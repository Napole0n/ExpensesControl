/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgsoft.excontrol.DTO;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;


/**
 *
 * @author murilo.goedert
 */
@Entity("centro_de_custo")
public class CentroDeCusto {

    public CentroDeCusto(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    
    public CentroDeCusto(){}

    @Id
    private int id;
    
    private String descricao;

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

    @Override
    public String toString() {
        return "CentroDeCusto{" + "id=" + id + ", descricao=" + descricao + '}';
    }
    
    

}