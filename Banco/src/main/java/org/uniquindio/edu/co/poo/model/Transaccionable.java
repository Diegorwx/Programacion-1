package org.uniquindio.edu.co.poo.model;

public interface Transaccionable {
    void transferir(Cuenta origen, Cuenta destino, double monto);
    void generarReporte();
}

