package org.uniquindio.edu.co.poo.model;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String placa;

    public Vehiculo(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String mostrarDatos(){
        return "Marca: " + marca + ", Modelo: " + modelo + ", Placa: " + placa;
    }

}
