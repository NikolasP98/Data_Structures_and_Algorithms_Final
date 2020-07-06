/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import edu.ulima.eda.pilas.Pila;
import paquete.clases.*;
import edu.ulima.eda.pilas.*;
/**
 *
 * @author Juan Diego Rojas
 */
public class Lista_Comprobantes extends Pila {
    
    

public static void main(String[] args) {
        
        Pila z = new Pila();
        Comprobante t = new Comprobante (1,"CiudadOrigen","CiudadDestino",150);
        z.desapilar();
        
    }
}