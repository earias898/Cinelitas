/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinelitas.Cinelitas.entity;

import java.io.Serializable;
import java.util.Date;




public class Salas implements Serializable{

    private long ID_Sala;
    
    private long ID_Pelicula;
    private String Nombre_Pelicula;
    private int Costo_Entrada;
    private Date Fecha;
    private int Capacidad;

    public long getId() {
        return ID_Sala;
    }
    
    public void setId(long ID_Sala) {
        this.ID_Sala = ID_Sala;
    }
        
    public void setId_Pelicula(long ID_Pelicula) {
        this.ID_Pelicula = ID_Pelicula;
    }

    public long getId_Pelicula() {
        return ID_Pelicula;
    }
    
    public String getPelicula() {
        return Nombre_Pelicula;
    }

    public void setPelicula(String Nombre_Pelicula) {
        this.Nombre_Pelicula = Nombre_Pelicula;
    }

    public int getCosto() {
        return Costo_Entrada;
    }

    public void setCosto(int Costo_Entrada) {
        this.Costo_Entrada = Costo_Entrada;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }
    

}
