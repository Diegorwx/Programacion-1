package org.uniquindio.edu.co.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nombre;
    private List<Cliente> clientes;
    private List<Empleado> empleados;
    private List<Cuenta> cuentas;
    private List<Transaccion> transacciones;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.cuentas = new ArrayList<>();
        this.transacciones = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void registrarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }
}
