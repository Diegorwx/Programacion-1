package org.uniquindio.edu.co.poo;


import org.uniquindio.edu.co.poo.model.Mensajero;
import org.uniquindio.edu.co.poo.model.Operacion;

import java.util.function.*;


public class Main {
    public static void main(String[] args) {


        //Clases personalizadas

        Mensajero lambdaMensaje= (nombre, edad) -> {
            System.out.println("Bienvenido" + nombre);
            System.out.println("Su edad es " + edad);};
        lambdaMensaje.emitirMensaje(" Diego", 19);


        Operacion mult = (a, b) -> a * b;
        System.out.println("Suma: " + mult.aplicar(11, 5));


        //Clases propias de Java, importadas desde java.util.function.*

        Predicate<Integer> esPar = x -> x % 2 == 0;
        System.out.println("¿Es 8 par? " + esPar.test(8));


        Function<Integer, Integer> duplicar = x -> x * 2;
        System.out.println("Duplicado de un número: " + duplicar.apply(7));



        Supplier<Double> aleatorio = () -> Math.random();
        System.out.println("Número aleatorio: " + aleatorio.get());


        UnaryOperator<Integer> cuadrado = x -> x * x;
        System.out.println("x al cuadrado: " + cuadrado.apply(5));


        BinaryOperator<Integer> maximo = (x, y) -> x > y ? x : y;
        System.out.println("Máximo entre (x) y (y): " + maximo.apply(8, 3));
    }
}