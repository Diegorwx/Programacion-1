package org.uniquindio.edu.co.poo.model;

public class CuentaCorriente extends Cuenta {
    private double limiteSobregiro;

    public CuentaCorriente(String numeroCuenta, Cliente titular, double limiteSobregiro) {
        super(numeroCuenta, titular);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double monto) {
        if (monto <= saldo + limiteSobregiro) {
            saldo -= monto;
        } else {
            System.out.println("Límite de sobregiro excedido");
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Cuenta Corriente con sobregiro: " + limiteSobregiro);
    }
}
