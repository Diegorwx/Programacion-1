package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.Circulo;
import org.uniquindio.edu.co.poo.model.Cuadrado;
import org.uniquindio.edu.co.poo.model.Figura;
import org.uniquindio.edu.co.poo.model.Triangulo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();

        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo:"));
        figuras.add(new Circulo(radio));

        double ladoCuadrado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cuadrado:"));
        figuras.add(new Cuadrado(ladoCuadrado));

        double ladoTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del triángulo equilátero:"));
        figuras.add(new Triangulo(ladoTriangulo));

        System.out.println(figuras);

    }
}
