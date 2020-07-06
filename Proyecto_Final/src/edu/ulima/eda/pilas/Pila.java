/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulima.eda.pilas;

import edu.ulima.eda.listas.ListaEnlazada;
import edu.ulima.eda.pilas.IPila;
import paquete.clases.Comprobante;
/**
 *
 * @author JC
 */
public class Pila implements IPila{
    private Comprobante[] datos;
    int cima;
    private static final int TAM_MAX = 50;

    public Pila(){
        datos = new Comprobante[TAM_MAX];
        cima = -1;
    }

    public boolean estaVacia(){
        boolean estado = (cima == -1);
        return estado;
    }

    public boolean estaLlena(){
        boolean estado = (cima + 1 == TAM_MAX);
        return estado;
    }

    public void apilar(Comprobante F){
        if(!this.estaLlena()){
            //cima vale 0
            cima++;
            datos[cima] = F;
            ;
        }
    }

    public Comprobante desapilar(){
        Comprobante valor = null;
        if(!this.estaVacia()){
            valor = datos[cima];
            cima--;
        }
        return valor;
    }

    public void mostrarElementos(){
        for(int i = 0; i <= cima; i++){
            System.out.print(datos[i].verInfo() + " -> ");
        }
        System.out.println("CIMA");
    }



}
