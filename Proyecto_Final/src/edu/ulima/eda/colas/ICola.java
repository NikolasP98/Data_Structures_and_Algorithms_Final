/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.colas;

/**
 *
 * @author Juan Diego Rojas
 */
public interface ICola {
    public boolean estaVacia();
    public Integer desencolar();
    public void encolar(Integer valor);
}

