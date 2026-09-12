/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ficus.clinicaveterinaria.modelo;

/**
 *
 * @author abrah
 */
public class Mascota extends Animal {
    
    private Propietario propietario;

    public Mascota(String nombre, String especie, Propietario propietario) {
        super(nombre, especie);
        this.propietario = propietario;
    }

    public Propietario getPropietario() { return propietario; }
    public void setPropietario(Propietario propietario) { this.propietario = propietario;
    
}
}