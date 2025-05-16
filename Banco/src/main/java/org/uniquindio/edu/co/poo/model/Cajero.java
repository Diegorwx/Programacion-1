package org.uniquindio.edu.co.poo.model;

public class Cajero extends Usuario implements Transaccionable {

    public Cajero(String id, String nombre, String correo, String contraseña) {
        super(id, nombre, correo, contraseña);
    }

    @Override
    public void transferir(Cuenta origen, Cuenta destino, double monto) {
        origen.retirar(monto);
        destino.depositar(monto);
    }

    @Override
    public void generarReporte() {
        System.out.println("Reporte generado por Cajero");
    }

    @Override
    public void mostrarMenu() {
        System.out.println("Menú del Cajero");
    }
}