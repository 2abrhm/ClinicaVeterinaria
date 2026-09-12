/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ficus.clinicaveterinaria.modelo;

/**
 *
 * @author abrah
 */

import java.util.ArrayList;
import java.util.List;

public class Propietario {
    
    private String nombre;
    private String dni;
    private List<Mascota> mascotas;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    public List<Mascota> getMascotas() { return mascotas; }
    
}
