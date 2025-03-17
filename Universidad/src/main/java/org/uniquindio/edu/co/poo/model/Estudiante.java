package org.uniquindio.edu.co.poo.model;

import java.util.ArrayList;


public class Estudiante {

    private String nombre;
    private String identificacion;
    private ArrayList <Nota> listaNotas;


    public Estudiante(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.listaNotas = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public ArrayList<Nota> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Nota> listaNotas) {
        this.listaNotas = listaNotas;
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", listaNotas=" + listaNotas +
                '}';
    }



    public String registrarNota(String nombreNota, float valorNota) {

        if (valorNota < 0 || valorNota > 5) {
            return "El valor de la nota debe estar entre 0 y 5.";
        }

        if (buscarNota(nombreNota) != null) {
            return "La nota con ese nombre ya está registrada.";
        }

        listaNotas.add(new Nota(nombreNota, valorNota));
        return "La nota fue registrada con éxito";
    }


    public float calcularDefinitiva() {
        if (listaNotas.isEmpty()) {
            return 0;  // Si no hay notas, el promedio es 0
        }

        float suma = 0;
        for (Nota nota : listaNotas) {
            suma += nota.getValor(); // Sumar todas las notas
        }

        return suma / listaNotas.size(); // Dividir por la cantidad de notas
    }

    public String actualizarNota(String nombreNota, float nuevoValorNota) {
        String mensaje = "";

        Nota notaEncontrada = buscarNota (nombreNota);
        if (notaEncontrada != null) {
            mensaje = notaEncontrada.actualizarNota(nuevoValorNota);
        }else{
            mensaje = "La nota no esta registrada";
        }
        return mensaje;
    }

    private Nota buscarNota(String nombreNota) {
        for (Nota nota : listaNotas) {
            if (nota.getNombre().equals(nombreNota)) {
                return nota;
            }
        }
        return null;
    }


    public float calcularMejoraParaAprobar() {
        float promedioActual = calcularDefinitiva();
        if (promedioActual >= 3.0f) {
            return 0;
        }

        float sumaNotas = 0;
        int cantidadNotas = 0;

        for (Nota nota : listaNotas) {
            if (nota != null) {
                sumaNotas += nota.getValor();
                cantidadNotas++;
            }
        }



        float sumaNecesaria = (3.0f * cantidadNotas) - sumaNotas;

        // Buscar la nota con menor calificación para determinar el cambio mínimo necesario
        float menorNota = Float.MAX_VALUE;
        for (Nota nota : listaNotas) {
            if (nota != null && nota.getValor() < menorNota) {
                menorNota = nota.getValor();
            }
        }

        float mejoraNecesaria = menorNota + sumaNecesaria;

        // Asegurar que la mejora no supere 5.0
        return Math.min(5.0f, Math.max(0, mejoraNecesaria));
    }

    public float obtenerNotaPorIndice(int indice) {
        if (indice >= 0 && indice < listaNotas.size()) {
            return listaNotas.get(indice).getValor();
        }
        return -1; // Si el índice es inválido o no hay nota en esa posición
    }
}