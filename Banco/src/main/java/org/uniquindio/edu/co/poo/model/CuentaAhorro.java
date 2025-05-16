package org.uniquindio.edu.co.poo.model;

public class CuentaAhorro extends Cuenta {
    private double tasaInteres;

    public CuentaAhorro(String numeroCuenta, Cliente titular, double tasaInteres) {
        super(numeroCuenta, titular);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Cuenta de Ahorro con interés: " + tasaInteres);
    }
}