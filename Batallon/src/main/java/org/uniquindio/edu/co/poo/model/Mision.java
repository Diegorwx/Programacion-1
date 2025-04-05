package org.uniquindio.edu.co.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mision {
    private LocalDate fecha;
    private String ubicacion;
    private List<Vehiculo> vehiculos;

    public Mision(LocalDate fecha, String ubicacion) {
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        vehiculo.registrarMision();
    }
}
