package org.uniquindio.edu.co.poo.app;


import org.uniquindio.edu.co.poo.model.AutoDeportivo;
import org.uniquindio.edu.co.poo.model.Furgoneta;
import org.uniquindio.edu.co.poo.model.Limusina;
import org.uniquindio.edu.co.poo.model.Vehiculo;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Ford", "2023", "AKD 264");

        Limusina limusina = new Limusina("BMW", "2015", "UGP 053", 6);
        AutoDeportivo autoDeportivo= new AutoDeportivo("Ferrari", "GH67", "AFK 382", "500 cc");
        Furgoneta furgoneta= new Furgoneta("Toyota", "SS21", "VNO 840", 300);

        System.out.println("Datos del Vehículo:");
        System.out.println(vehiculo.mostrarDatos());

        System.out.println(limusina.mostrarDatos());

    }
}