package org.uniquindio.edu.co.poo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Consultorio {
    private String nombre;
    private String direccion;
    private List<Odontologo> listaOdontologos;
    private List<Paciente> listaPacientes;

    public Consultorio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaOdontologos = new ArrayList<>();
        this.listaPacientes = new ArrayList<>();
    }

    public void registrarOdontologo(Odontologo odontologo) {
        listaOdontologos.add(odontologo);
    }

    public void registrarNuevoPaciente(Paciente nuevoRegistro) {
        listaPacientes.add(nuevoRegistro);
    }

    public List<Paciente> obtenerPacientesConMasDe5Tratamientos() {
        return listaPacientes.stream()
                .filter(paciente -> paciente.cantidadTratamientos() > 5)
                .collect(Collectors.toList());
    }

    // Getters
    public List<Odontologo> getListaOdontologos() { return listaOdontologos; }
    public List<Paciente> getListaPacientes() { return listaPacientes; }
}
