package org.uniquindio.edu.co.poo.model;


import java.util.ArrayList;

public abstract class Vehiculo {
    protected String id;
    protected String modelo;
    protected int anioFabricacion;
    protected int kilometraje;
    protected EstadoOperativo estadoOperativo;
    protected ArrayList<Mision> misionesCompletadas;

    public Vehiculo(String id, String modelo, int anioFabricacion,
                    int kilometraje, String estadoOperativo) {
        this.id = id;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
        this.estadoOperativo = estadoOperativo;
        this.misionesCompletadas = 0;
    }

    public void registrarMision() {
        misionesCompletadas++;
    }

    public int getMisionesCompletadas() {
        return misionesCompletadas;
    }

    public String getId() {
        return id;
    }
}
