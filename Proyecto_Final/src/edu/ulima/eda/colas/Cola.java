/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.colas;
import edu.ulima.eda.listas.dobles.ListaEnlazadaDoble;
/**
 *
 * @author Juan Diego Rojas
 */
public class Cola implements ICola{
    ListaEnlazadaDoble lista;
    
    public Cola(){
        lista = new ListaEnlazadaDoble();
    }
    
    public boolean estaVacia(){
        //Lista vacia: I (nodo inicial) es nulo y F (nodo final) es nulo
        return (lista.getI() == null && lista.getF() == null);
    }
    
    public void encolar(Integer dato){
        lista.insertarAlFinal(dato);
    }
    
    public Integer desencolar(){
        Integer respuesta = null;
        if(!this.estaVacia()){
            respuesta = lista.getI().info;
            lista.eliminarPrimero();
        }
        return respuesta;
    }
    
    public void mostrarElementos(){
        System.out.print("frente -> ");
        lista.mostrar();
    } 
    
}

