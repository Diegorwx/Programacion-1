package org.uniquindio.edu.co.poo.model;

import java.util.List;

public class Cliente extends Usuario {
    private List<Cuenta> cuentas;

    public Cliente(String id, String nombre, String correo, String contraseña, List<Cuenta> cuentas) {
        super(id, nombre, correo, contraseña);
        this.cuentas = cuentas;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    @Override
    public void mostrarMenu() {
        System.out.println("Menú del Cliente");
    }
}