package org.uniquindio.edu.co.poo.model;

public class Triangulo extends Figura {
    private double lado;

    public Triangulo(double lado) {
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
        return "Triángulo Equilátero { lado = " + lado + ", área = "
                + calcularArea() + ", perímetro = " + calcularPerimetro() + " }";
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3)/4) * (lado * lado);
    }

    public double calcularPerimetro() {
        return lado * 3;
    }

}
