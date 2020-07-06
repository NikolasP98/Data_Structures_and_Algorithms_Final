/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.listas;
import paquete.clases.Comprobante;
/**
 *
 * @author Juan Diego Rojas
 */
public class Nodo {
    private Comprobante info;
    private Nodo siguiente;
    
    public Nodo(Comprobante info){
        this.info = info;
        this.siguiente = null;
    }
    
    public Comprobante info(){
        return info;
    }
    
    public Nodo siguiente(){
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
}
