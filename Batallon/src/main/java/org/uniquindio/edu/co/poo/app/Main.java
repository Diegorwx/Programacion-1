package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Batallon batallon = new Batallon();

        // Agregar vehículos
        TransporteTropas t1 = new TransporteTropas("T001", "Humvee", 2015, 50000, "Disponible", 8);
        Blindado b1 = new Blindado("B001", "Tanque M1", 2012, 70000, "Disponible", "Alto");
        VehiculoApoyo a1 = new VehiculoApoyo("A001", "Camión logístico", 2018, 40000, "Disponible", "Logística");

        batallon.agregarVehiculo(t1);
        batallon.agregarVehiculo(b1);
        batallon.agregarVehiculo(a1);

        // Registrar misiones
        Mision m1 = new Mision(LocalDate.now(), "Zona Norte");
        m1.agregarVehiculo(t1);
        m1.agregarVehiculo(b1);
        batallon.registrarMision(m1);

        // Simular múltiples misiones
        for (int i = 0; i < 51; i++) {
            t1.registrarMision();
        }

        // Obtener vehículos con más de 50 misiones
        List<Vehiculo> paraReemplazo = batallon.obtenerVehiculosParaReemplazo();
        System.out.println("Vehículos para evaluación y posible reemplazo:");
        for (Vehiculo v : paraReemplazo) {
            System.out.println("ID: " + v.getId());
        }
    }
}