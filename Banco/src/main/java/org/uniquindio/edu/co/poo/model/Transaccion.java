package org.uniquindio.edu.co.poo.model;

import java.util.Date;

public class Transaccion {
    private Date fecha;
    private String tipo;
    private double monto;
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;

    public Transaccion(String tipo, double monto, Cuenta cuentaOrigen, Cuenta cuentaDestino) {
        this.fecha = new Date();
        this.tipo = tipo;
        this.monto = monto;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
    }
}