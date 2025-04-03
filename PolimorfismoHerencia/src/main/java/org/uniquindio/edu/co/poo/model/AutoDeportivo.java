package org.uniquindio.edu.co.poo.model;

public class AutoDeportivo extends Vehiculo {
    private String cilindraje;

    public AutoDeportivo(String marca, String modelo, String placa, String cilindraje) {
        super(marca, modelo, placa);
        this.cilindraje = cilindraje;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + ", " + cilindraje;
    }
}
