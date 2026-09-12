/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ficus.clinicaveterinaria;

/**
 *
 * @author abrah
 */

import com.ficus.clinicaveterinaria.controller.VeterinariaControlador;
import com.ficus.clinicaveterinaria.vista.VeterinariaVista;

public class ClinicaVeterinaria {

public static void main(String[] args) {
        VeterinariaVista vista = new VeterinariaVista();
        VeterinariaControlador controlador = new VeterinariaControlador(vista);

        controlador.iniciarFlujo();
    }    
    
    
}
