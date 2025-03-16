package org.uniquindio.edu.co.poo.model;

public class Vehiculo {

    private String marca;
    private String modelo;
    private String placa;
    private String color;


    public Vehiculo(String marca, String modelo, String placa, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "DATOS DEL VEHICULO \n"
                + "Marca: " + marca + "\n"
                + "Modelo: " + modelo + "\n"
                + "Placa: " + placa + "\n"
                + "Color: " + color +"\n\n";
    }
}
