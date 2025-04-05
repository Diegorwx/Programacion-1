package org.uniquindio.edu.co.poo.model;

public class Blindado extends Vehiculo {
    private String nivelBlindaje;

    public Blindado(String id, String modelo, int anioFabricacion, int kilometraje, String estado, String nivelBlindaje) {
        super(id, modelo, anioFabricacion, kilometraje, estado);
        this.nivelBlindaje = nivelBlindaje;
    }

}
