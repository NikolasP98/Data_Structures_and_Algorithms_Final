/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.listas;

/**
 *
 * @author JC
 */
public class ListaEnlazada {
    private Nodo L;

    //Constructor
    public ListaEnlazada(){
        this.L = null;
    }
    
    public Nodo getL() {
        return L;
    }

    public void mostrarElementos(){
	//Obtener referencia al primer nodo (variable ptr)
        Nodo ptr = L;
	//Mientras existan mas nodos por procesar
        while(ptr != null){
            //Procesamos la informacion del nodo actual: ptr.info()
            System.out.print(ptr.info() + " --> ");
            ptr = ptr.siguiente();
        }
        System.out.println("null");
    }
    
    public void insertarAlInicio(int valor){
        //Creacion de nodo
        Nodo nuevoNodo = new Nodo(valor);
        //Si la lista esta vacia
        if(L == null){
            //Unico elemento no tiene sucesor
            nuevoNodo.setSiguiente(null);
        //Si no esta vacia
        }else{
            //El nodo sucesor del nuevoNodo sera el primero de la lista original
            nuevoNodo.setSiguiente(L);
        }
        //El nodo inicial (L) de la lista enlazada ahora sera nuevoNodo
        L = nuevoNodo;
    }
    
    public void insertarAlFinal(int valor){
        //Crear nuevo nodo
        Nodo nuevoElemento = new Nodo(valor); 
        //Si la lista esta vacia, insertar al inicio
        if(L == null){
                insertarAlInicio(valor);
        }else{
            //Si no esta vacia, recorremos hasta encontrar el ultimo nodo
            Nodo ptr = L;
            //Ultimo nodo: aquel que tiene como siguiente el valor null
            while(ptr.siguiente() != null){
                    ptr = ptr.siguiente();
            }  
            ptr.setSiguiente(nuevoElemento);        
            //El siguiente del nodo creado debe ser nulo (es el ultimo)
            nuevoElemento.setSiguiente(null);
        }
    }

    public void insertarAntes(int item, int ref){
        //Creacion del nuevo nodo
        Nodo nuevoNodo = new Nodo(item);
        //Necesitamos 2 referencias: elemento de valor "ref" y el anterior a este
        Nodo ptr = L, anterior = null;
        while(ptr != null && ptr.info() != ref){
            anterior = ptr;
            ptr = ptr.siguiente();
        }
        if(ptr != null){
            if(anterior == null){
                insertarAlInicio(item);
            }else{
                //Luego del bucle, "ptr" apunta al nodo de valor "ref"
                //El nodo predecesor de "ptr" (anterior) debe tener como siguiente a nuestro nodo
                anterior.setSiguiente(nuevoNodo);
                //El nodo siguiente de nuevoNodo debe ser el de valor "ref" (ptr)
                nuevoNodo.setSiguiente(ptr);        
            }        
        }
    }

    public void eliminarInicio(){
        //Si la lista no esta vacia
        if(L != null){
            //El nuevo primer elemento es el segundo de la lista original
            L = L.siguiente();
        }
    }
    
    public void eliminarFinal(){
        Nodo ptr = L;
        Nodo anterior = null;
        if(ptr != null){ //Lista no vacia
            while(ptr.siguiente() != null){ //para encontrar el ultimo elemento
                anterior = ptr;
                ptr = ptr.siguiente();
            }// Al salir del bucle: ptr - ultimo nodo, anterior - penultimo nodo
            if(anterior == null){//Si la lista tiene solo un elemento
                eliminarInicio();
            }else{
                //
                anterior.setSiguiente(null);
            }
        }
    }
        
    public void eliminarElemento(int valor){
        if(L != null){
            if(L.info() == valor){
                eliminarInicio();
            }else{
                Nodo ptr = L.siguiente();
                Nodo anterior = L;
                while(ptr != null && ptr.info() != valor){
                    anterior = ptr;
                    ptr = ptr.siguiente();
                }
                if(ptr != null){
                    anterior.setSiguiente(ptr.siguiente());                   
                }
            }
        }
    }
    
}

