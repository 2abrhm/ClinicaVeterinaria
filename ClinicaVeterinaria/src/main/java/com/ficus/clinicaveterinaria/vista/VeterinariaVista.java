/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ficus.clinicaveterinaria.vista;

/**
 *
 * @author abrah
 */

import java.util.List;
import java.util.Scanner;
import com.ficus.clinicaveterinaria.modelo.*;

public class VeterinariaVista {
 
    public void mostrarPropietariosConMascotas(List<Propietario> propietarios) {
        System.out.println("=== LISTADO DE PROPIETARIOS Y MASCOTAS ===");
        for (Propietario p : propietarios) {
            System.out.println("Propietario: " + p.getNombre());
            for (Mascota m : p.getMascotas()) {
                System.out.println("  - Mascota: " + m.getNombre() + " | Especie: " + m.getEspecie());
            }
            System.out.println("----------------------------------------");
        }
    }

    public void mostrarConsultas(List<Consulta> consultas) {
        System.out.println("\n=== REGISTRO DE CONSULTAS ===");
        for (Consulta c : consultas) {
            System.out.println("Fecha: " + c.getFecha() + " | Motivo: " + c.getMotivo());
            System.out.println("  Mascota: " + c.getMascota().getNombre());
            System.out.println("  Atendido por: Dr. " + c.getVeterinario().getNombre());
            System.out.println("----------------------------------------");
        }
    }

    public void mostrarMedicamentosRecetados(List<Consulta> consultas) {
        System.out.println("\n=== MEDICAMENTOS RECETADOS POR CONSULTA ===");
        for (Consulta c : consultas) {
            System.out.println("Consulta de " + c.getMascota().getNombre() + " (" + c.getFecha() + "):");
            if (c.getMedicamentos().isEmpty()) {
                System.out.println("  (Sin medicamentos recetados)");
            } else {
                for (Medicamento m : c.getMedicamentos()) {
                    System.out.println("  - " + m.getNombre() + " | Dosis: " + m.getDosis());
                }
            }
            System.out.println("----------------------------------------");
        }
    }
    
}
