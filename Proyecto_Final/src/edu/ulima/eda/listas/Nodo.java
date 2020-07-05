/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.listas;

/**
 *
 * @author Juan Diego Rojas
 */
public class Nodo {
    private int info;
    private Nodo siguiente;
    
    public Nodo(int info){
        this.info = info;
        this.siguiente = null;
    }
    
    public int info(){
        return info;
    }
    
    public Nodo siguiente(){
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
}
