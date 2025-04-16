package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.Consultorio;
import org.uniquindio.edu.co.poo.model.Especialidad;
import org.uniquindio.edu.co.poo.model.Odontologo;
import org.uniquindio.edu.co.poo.model.Paciente;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio("Consultorio Dental Central", "Calle 10 #20-30");

        // Registrar odontólogo
        Odontologo odontologo = new Odontologo("123", "Dra. Carolina Gómez", "LIC456", Especialidad.ENDODONCIA);
        consultorio.registrarOdontologo(odontologo);

        // Registrar pacientes
        Paciente p1 = new Paciente("HC001", "Juan","Perez",34, "3124567890", "Carrera 4 #12-55",
                LocalDate.of(2024, 11, 5), 6);
        Paciente p2 = new Paciente("HC002", "Ana","Torres",28, "3120001111", "Av. Siempreviva 123",
                LocalDate.of(2025, 1, 20), 8);

        consultorio.registrarNuevoPaciente(p1);
        consultorio.registrarNuevoPaciente(p2);

        // Filtrar pacientes para revisión gratuita
        List<Paciente> pacientesGratis = consultorio.obtenerPacientesConMasDe5Tratamientos();
        System.out.println("Pacientes con revisión gratuita:");
        for (Paciente paciente : pacientesGratis) {
            System.out.println(paciente.nombre() + " - " + paciente.historiaClinicaId());
        }
    }
}