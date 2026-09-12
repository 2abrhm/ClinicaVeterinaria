/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ficus.clinicaveterinaria.controller;

/**
 *
 * @author abrah
 */

import java.util.ArrayList;
import java.util.List;
import com.ficus.clinicaveterinaria.modelo.*;
import com.ficus.clinicaveterinaria.vista.VeterinariaVista;

public class VeterinariaControlador {
    
  private List<Propietario> propietarios;
    private List<Consulta> consultas;
    private VeterinariaVista vista;

    public VeterinariaControlador(VeterinariaVista vista) {
        this.vista = vista;
        this.propietarios = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public void iniciarFlujo() {
        
        Propietario p1 = new Propietario("Carlos Gomez", "12345678");
        Mascota m1 = new Mascota("Firulais", "Perro", p1);
        p1.agregarMascota(m1);

        Propietario p2 = new Propietario("Ana Martinez", "87654321");
        Mascota m2 = new Mascota("Michi", "Gato", p2);
        p2.agregarMascota(m2);

        this.propietarios.add(p1);
        this.propietarios.add(p2);

        Veterinario v1 = new Veterinario("Perez", "TP-12345");
        Veterinario v2 = new Veterinario("Lopez", "TP-67890");

        Consulta c1 = new Consulta("2026-03-30", "Chequeo general", m1, v1);
        Medicamento med1 = new Medicamento("Amoxicilina", "500mg");
        v1.recetar(med1, c1);

        Consulta c2 = new Consulta("2026-03-31", "Vacunacion", m2, v2);
        Medicamento med2 = new Medicamento("Desparasitante", "10ml");
        v2.recetar(med2, c2);

        this.consultas.add(c1);
        this.consultas.add(c2);

        // Delegar impresion a la vista
        vista.mostrarPropietariosConMascotas(propietarios);
        vista.mostrarConsultas(consultas);
        vista.mostrarMedicamentosRecetados(consultas);
    }
    
}
