package org.uniquindio.edu.co.poo.model;

public class Limusina extends Vehiculo {
    private int nPuertas;

    public Limusina(String marca, String modelo, String placa, int nPuertas) {
        super(marca, modelo, placa);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + ", nPuertas: " + nPuertas;
    }
}
