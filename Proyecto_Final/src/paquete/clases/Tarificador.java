/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;
import paquete.grafo.Grafo;

/**
 *
 * @author Nikolas
 */
public class Tarificador {
	private String origen, destino;
	
	private int distancia;
        
	private final double costo = 3.5;

    public Tarificador(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
        
        
    }

    Tarificador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double calcularPrecio(){
        Grafo t = new Grafo(); 
        double precio_tot = costo * t.caminoOptimo(this.origen, this.destino);
        return precio_tot;
    }
    public static void main(String[] args) {
        Tarificador p = new Tarificador("San Miguel","Surco");
        System.out.println(p.calcularPrecio());
    }
}
