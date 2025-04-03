package org.uniquindio.edu.co.poo.model;

public abstract class Figura {

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Figura { área = " + calcularArea() +
                ", perímetro = " + calcularPerimetro() + " }";
    }
}
