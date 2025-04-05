package org.uniquindio.edu.co.poo.model;

public class VehiculoApoyo extends Vehiculo {
    private String tipoFuncion;

    public VehiculoApoyo(String id, String modelo, int anioFabricacion, int kilometraje, String estado, String tipoFuncion) {
        super(id, modelo, anioFabricacion, kilometraje, estado);
        this.tipoFuncion = tipoFuncion;
    }
}
