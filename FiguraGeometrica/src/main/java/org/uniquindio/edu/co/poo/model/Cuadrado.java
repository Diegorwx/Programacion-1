package org.uniquindio.edu.co.poo.model;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado { lado = " + lado + ", área = " + calcularArea() +
                ", perímetro = " + calcularPerimetro() + " }\n";
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }

    public double calcularPerimetro(){
        return lado * 4;
    }
}
