package org.uniquindio.edu.co.poo.model;

public class Nota {

    private String nombre;
    private float valor;

    public Nota(String nombre, float valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        if (valor >= 0.0f && valor <= 5.0f) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("El valor de la nota debe estar entre 0.0 y 5.0");
        }
    }

    @Override
    public String toString() {
        return "Nota{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                '}';
    }


    public String actualizarNota(float nuevoValorNota) {
        if (nuevoValorNota < 0.0f || nuevoValorNota > 5.0f) {
            return "Error: La nota debe estar entre 0.0 y 5.0";
        }
        setValor(nuevoValorNota);
        return "Nota actualizada correctamente.";
    }
}
