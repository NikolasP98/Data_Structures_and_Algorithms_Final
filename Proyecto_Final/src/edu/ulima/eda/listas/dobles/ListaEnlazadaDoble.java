/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.listas.dobles;

/**
 *
 * @author Juan Diego Rojas
 */
public class ListaEnlazadaDoble {
    private NodoDoble I;
    private NodoDoble F;
    
    public ListaEnlazadaDoble(){
        I = null;
        F = null;
    }

    public NodoDoble getI() {
        return I;
    }

    public NodoDoble getF() {
        return F;
    }

    public void insertarAlInicio(int dato){
        NodoDoble nodo = new NodoDoble(dato);
        if(I == null){
            F = nodo;
        }else{
            nodo.setSiguiente(I);
            I.setAnterior(nodo);
        }
        I = nodo;
    }
    
    public void insertarAlFinal(int dato){
        NodoDoble nodo = new NodoDoble(dato);
        if(F == null){
            I = nodo;
        }else{
            nodo.setAnterior(F);
            F.setSiguiente(nodo);
        }
        F = nodo;
    }
    
    public void eliminar(int valor){
        NodoDoble ptr = I;
        boolean encontrado = false;
        while(ptr != null && encontrado == false){
            if(ptr.info() == valor){
                encontrado = true;
            }else{
                ptr = ptr.siguiente();
            }
        }
        if(ptr.anterior() == null){
            I = ptr.siguiente();
            I.setAnterior(null);
        }else if(ptr.siguiente != null){
            ptr.anterior().setSiguiente(ptr.siguiente());
            ptr.siguiente().setAnterior(ptr.anterior());
        }else{
            ptr.anterior.setSiguiente(null);
        }
    }
    
    public void eliminarPrimero(){
        Integer valor = null;
        if(I == F){
            I = null;
            F = null;
        }else if(I != null){
            NodoDoble siguiente = I.siguiente();
            if(siguiente != null){
                siguiente.setAnterior(null);
            }            
            I = siguiente;
        }
    }
    

    
    public void mostrar(){
        NodoDoble ptr = I;
        while(ptr != null){
            System.out.print(ptr.info() + " -> ");
            ptr = ptr.siguiente();
        }
        System.out.println("null");
    }
    
    
    public void mostrarAlReves(){
        NodoDoble ptr = F;
        while(ptr != null){
            System.out.print(ptr.info() + " -> ");
            ptr = ptr.anterior();
        }
        System.out.println("null");
    }
}
