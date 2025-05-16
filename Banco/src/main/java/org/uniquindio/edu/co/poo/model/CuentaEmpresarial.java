package org.uniquindio.edu.co.poo.model;

public class CuentaEmpresarial extends Cuenta {
    private double montoMaximoTransaccion;

    public CuentaEmpresarial(String numeroCuenta, Cliente titular, double montoMaximoTransaccion) {
        super(numeroCuenta, titular);
        this.montoMaximoTransaccion = montoMaximoTransaccion;
    }

    @Override
    public void retirar(double monto) {
        if (monto <= montoMaximoTransaccion) {
            super.retirar(monto);
        } else {
            System.out.println("Excede el monto máximo por transacción");
        }
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Cuenta Empresarial con límite de transacción: " + montoMaximoTransaccion);
    }
}

