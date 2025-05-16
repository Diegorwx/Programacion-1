package org.uniquindio.edu.co.poo.model;

public abstract class Usuario {
    protected String id;
    protected String nombre;
    protected String correo;
    protected String contraseña;

    public Usuario(String id, String nombre, String correo, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public abstract void mostrarMenu();
}