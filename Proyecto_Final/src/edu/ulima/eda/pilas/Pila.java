/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.pilas;

import edu.ulima.eda.listas.ListaEnlazada;

/**
 *
 * @author JC
 */
public class Pila implements IPila{
    private ListaEnlazada lista;
    
    public Pila(){
        lista = new ListaEnlazada();
    }
    
    public boolean estaVacia(){
        return (lista.getL() == null);
    }
    
    public void apilar(Integer valor){
        lista.insertarAlInicio(valor);
    }
    
    public Integer desapilar(){
        Integer respuesta = null;
        if(!this.estaVacia()){
            //Obtener el valor del primer elemento (cima)
            respuesta = lista.getL().info();
            //Eliminar el primer elemento (cima)
            lista.eliminarInicio();
        }
        return respuesta;
    }
    
    public void mostrarElementos(){
        System.out.print("cima --> ");
        lista.mostrarElementos();
    }
}
