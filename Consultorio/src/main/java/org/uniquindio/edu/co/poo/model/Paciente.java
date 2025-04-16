package org.uniquindio.edu.co.poo.model;

import java.time.LocalDate;

public record Paciente(
        String historiaClinicaId,
        String nombre,
        String apellido,
        int edad,
        String telefono,
        String direccion,
        LocalDate fechaUltimaConsulta,
        int cantidadTratamientos
) {}