package org.uniquindio.edu.co.poo.model;

public class Furgoneta extends Vehiculo {
    private int carga;

    public Furgoneta(String marca, String modelo, String placa, int carga) {
        super(marca, modelo, placa);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String mostrarDatos() {
        return super.mostrarDatos() + ", " + carga;
    }
}
