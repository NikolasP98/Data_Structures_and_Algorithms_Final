/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;
import edu.ulima.eda.pilas.Pila;
/**
 *
 * @author Nikolas
 */
public class ClienteCorporativo {
    Pila p = new Pila();
    private int ruc;
    private String razonSocial;
    
    // TODO: desarrollar la clase de lista de comprobantes (llamado Lista_Comprobantes)
    // luego, enchufarlo aqui abajo. Utiliza la estructura de PILA (LIFO)
    private Lista_Comprobantes lista;
    
    
    // TODO: Revisar Constructor (?) (No se si esta bien o mal xd)
    public ClienteCorporativo(int ruc, String razonSocial, Lista_Comprobantes lista) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.lista = lista;
    }

    // Getters y Setters
    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Lista_Comprobantes getLista() {
        return lista;
    }

    
    public void setLista(Lista_Comprobantes lista) {
        this.lista = lista;
    }

    // Metodos
    public void AgregarComprobante(Comprobante t){
        // TODO: llamar el metodo de Lista_Comprobante que agrega comprobantes a la lista.
        
        // TODO: Poner MostrarElementos en ventana
        
    }
    
    public static void main(String[] args) {
        
        Pila z = new Pila();
        Comprobante t = new Comprobante (1,"CiudadOrigen","CiudadDestino",150);
        z.apilar(t);
        z.mostrarElementos();
    }
}