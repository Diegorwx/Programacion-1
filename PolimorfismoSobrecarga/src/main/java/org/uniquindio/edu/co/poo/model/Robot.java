package org.uniquindio.edu.co.poo.model;

public class Robot {
    private String nombre;
    private String idRobot;

    public Robot(String nombre, String idRobot) {
        this.nombre = nombre;
        this.idRobot = idRobot;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdRobot() {
        return idRobot;
    }

    public void setIdRobot(String idRobot) {
        this.idRobot = idRobot;
    }

    public void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public void saludar(String nombre, String apellidos) {
        System.out.println("Hola " + nombre +" "+ apellidos);
    }

    public void saludar() {
        System.out.println("Hola desconocido");
    }
}
