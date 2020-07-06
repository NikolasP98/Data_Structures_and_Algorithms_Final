/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Nikolas
 */
public class Comprobante {
    //Conseguir tiempo actual
    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    Date dateobj = new Date();
    
    private int tipo; // 1=Giro ; 2=Encomienda
    private String ciudad_origen, ciudad_destino, tipoTexto, fecha; // fecha sera representado con una cadena. Si se necesitan hacer calculos con ello, utilizar otro metodo o parsea el texto como numeros.
    private double monto;

    public Comprobante(int tipo, String ciudad_origen, String ciudad_destino, double monto) {
        this.tipo = tipo;
        this.ciudad_origen = ciudad_origen;
        this.ciudad_destino = ciudad_destino;
        this.monto = monto;
        
        this.tipoFormato();
        
        this.fecha = df.format(dateobj);
        this.setMonto();
    }
    

    // Getters & Setters
    
    public DateFormat getDf() {
        return df;
    }

    public void setDf(DateFormat df) {
        this.df = df;
    }

    public Date getDateobj() {
        return dateobj;
    }

    public void setDateobj(Date dateobj) {
        this.dateobj = dateobj;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
        this.tipoFormato();
    }

    public String getCiudad_origen() {
        return ciudad_origen;
    }

    public void setCiudad_origen(String ciudad_origen) {
        this.ciudad_origen = ciudad_origen;
    }

    public String getCiudad_destino() {
        return ciudad_destino;
    }

    public void setCiudad_destino(String ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto() {
        
        Tarificador t = new Tarificador(this.ciudad_origen, this.ciudad_destino);
        this.monto = t.calcularPrecio();
    }

    public void tipoFormato(){
        // Darle valor textual al tipo de Comprobante
        if(this.tipo == 1){
            this.tipoTexto = "Giro";
        } else if(this.tipo == 2){
            this.tipoTexto = "Encomienda";
        }
    }
    
    public String verInfo() {
        return "Comprobante:" +
                "\nTipo: " + this.tipoTexto +
                "\nCiudad_origen: " + ciudad_origen +
                "\nCiudad_destino: " + ciudad_destino +
                "\nFecha: " + fecha +
                "\nMonto: " + monto;
    }
    public static void main(String[] args) {
        Comprobante c = new Comprobante(1,"San Miguel","Surco",150);
        c.verInfo();
        
        System.out.println(c.getMonto());
        c.verInfo();
        
    }
}

