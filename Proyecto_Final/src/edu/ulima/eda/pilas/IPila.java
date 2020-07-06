/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.pilas;

import paquete.clases.Comprobante;
/**
 *
 * @author Juan Diego Rojas
 */
public interface IPila {
    public void apilar(Comprobante item);
    public Comprobante desapilar();
    public boolean estaVacia();
}
