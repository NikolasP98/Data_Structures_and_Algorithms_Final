/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.pilas;

/**
 *
 * @author Juan Diego Rojas
 */
public interface IPila {
    public void apilar(Integer item);
    public Integer desapilar();
    public boolean estaVacia();
}
