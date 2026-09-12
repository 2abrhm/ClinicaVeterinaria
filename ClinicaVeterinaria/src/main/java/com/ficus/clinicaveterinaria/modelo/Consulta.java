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

public class Consulta {
    
    private String fecha;
    private String motivo;
    private Mascota mascota;
    private Veterinario veterinario;
    private List<Medicamento> medicamentos;

    public Consulta(String fecha, String motivo, Mascota mascota, Veterinario veterinario) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.medicamentos = new ArrayList<>();
    }

    public void agregarMedicamento(Medicamento medicamento) {
        this.medicamentos.add(medicamento);
    }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
    public Mascota getMascota() { return mascota; }
    public void setMascota(Mascota mascota) { this.mascota = mascota; }
    public Veterinario getVeterinario() { return veterinario; }
    public void setVeterinario(Veterinario veterinario) { this.veterinario = veterinario; }
    public List<Medicamento> getMedicamentos() { return medicamentos;}
    
}
