/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import edu.ulima.eda.pilas.Pila;
import paquete.clases.*;
import edu.ulima.eda.listas.*;
/**
 *
 * @author Juan Diego Rojas
 */
public class Lista_Comprobantes extends ListaEnlazada {
    ListaEnlazada lista = new ListaEnlazada();
    private double totalEncomiendas, totalGiros, totalGeneral;

    public void Totales(){
        while (!Lista_Comprobantes.estaVacia()){
            Comprobante x = pila.desapilar();

            if(x.getTipoTexto == "Giro"){
                totalGiros += x.getmonto;
                totalGeneral += x.getmonto;

            }else{
                totalEncomiendas += x.getmonto;
                totalGeneral += x.getmonto;
            }

            lista.insertarAlFinal(x);
        }
    }



public static void main(String[] args) {

        Pila z = new Pila();
        Comprobante t = new Comprobante (1,"CiudadOrigen","CiudadDestino",150);
        z.desapilar();

    }
}