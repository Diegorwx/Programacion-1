package org.uniquindio.edu.co.poo.model;

public abstract class Cuenta {
    protected String numeroCuenta;
    protected double saldo;
    protected Cliente titular;

    public Cuenta(String numeroCuenta, Cliente titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            this.saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    public abstract void mostrarDetalles();
}
