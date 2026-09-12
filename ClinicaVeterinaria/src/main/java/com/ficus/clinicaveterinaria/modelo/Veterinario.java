/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ficus.clinicaveterinaria.modelo;

/**
 *
 * @author abrah
 */
public class Veterinario {
    
    private String nombre;
    private String tarjetaProfesional;

    public Veterinario(String nombre, String tarjetaProfesional) {
        this.nombre = nombre;
        this.tarjetaProfesional = tarjetaProfesional;
    }
    
    public void recetar(Medicamento medicamento, Consulta consulta){
        consulta.agregarMedicamento(medicamento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }
    
    
    
}
