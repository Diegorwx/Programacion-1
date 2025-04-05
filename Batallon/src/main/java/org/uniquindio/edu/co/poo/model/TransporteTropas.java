package org.uniquindio.edu.co.poo.model;

public class TransporteTropas extends Vehiculo {
    private int capacidadSoldados;

    public TransporteTropas(String id, String modelo, int anioFabricacion, int kilometraje, String estado, int capacidadSoldados) {
        super(id, modelo, anioFabricacion, kilometraje, estado);
        this.capacidadSoldados = capacidadSoldados;
    }
}
