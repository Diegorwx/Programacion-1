package org.uniquindio.edu.co.poo.model;

import java.util.ArrayList;

public class Parqueadero {

    private String nombre;
    private String ubicacion;
    private String nit;
    private ArrayList <Vehiculo> listaVehiculos;


    public Parqueadero(String nombre, String ubicacion, String nit) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.nit = nit;
        this.listaVehiculos = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }


    @Override
    public String toString() {
        return "Parqueadero{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", nit='" + nit + '\'' +
                ", listaVehiculos=" + listaVehiculos +
                '}';
    }

    public String registrarVehiculo(String marca, String modelo, String placa, String color) {
            String mensaje  = "";

            Vehiculo encontrado = buscarVehiculo(placa);
            if(encontrado != null){// ya existe en el sistema
                mensaje = "El Vehiculo "+ encontrado.getModelo() +" ya existe en el parqueadero";
                return mensaje;
            }
            Vehiculo nuevoVehiculo = new Vehiculo(marca,modelo,placa,color);
            listaVehiculos.add(nuevoVehiculo);
            mensaje = "El vehiculo fue registrado exitosamente";
            return mensaje;
    }

    private Vehiculo buscarVehiculo(String placa) {
        Vehiculo encontrado = null;

        for(Vehiculo vehiculoAux : listaVehiculos){
            if(vehiculoAux.getPlaca().equals(placa)){
                return vehiculoAux;
            }
        }

        return  encontrado;
    }


    public static void ordenarPorPlaca(ArrayList<Vehiculo> vehiculos) {
        int n = vehiculos.size();
        for (int i = 0; i < n - 1; i++) {
            // En cada pasada, se comparan los elementos adyacentes
            for (int j = 0; j < n - i - 1; j++) {
                // Si la placa del vehículo actual es mayor que la del siguiente, se intercambian
                if (vehiculos.get(j).getPlaca().compareTo(vehiculos.get(j + 1).getPlaca()) > 0) {
                    Vehiculo temp = vehiculos.get(j);
                    vehiculos.set(j, vehiculos.get(j + 1));
                    vehiculos.set(j + 1, temp);
                }
            }
        }
    }
}