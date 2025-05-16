package org.uniquindio.edu.co.poo.model;

import java.util.List;

public class Administrador extends Usuario {
    private List<Empleado> empleados;

    public Administrador(String id, String nombre, String correo, String contraseña, List<Empleado> empleados) {
        super(id, nombre, correo, contraseña);
        this.empleados = empleados;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public void mostrarMenu() {
        System.out.println("Menú del Administrador");
    }
}