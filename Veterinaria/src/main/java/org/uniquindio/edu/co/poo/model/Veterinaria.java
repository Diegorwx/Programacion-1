package org.uniquindio.edu.co.poo.model;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public class Veterinaria {
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private String nit;
    private List<Mascota> listaMascotas;

    public Veterinaria(String nombre, String direccion,
                       String telefono, String correo, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.nit = nit;
        this.listaMascotas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public List<Mascota> getMascotas() {
        return listaMascotas;
    }

    public void setMascotas(List<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }


    public String registrarMascota(String nombre, String especie, String raza, byte edad, String genero, String color, float peso) {
        // Verificar si la mascota ya está registrada por nombre y especie
        for (Mascota mascota : listaMascotas) {
            if (mascota.getNombre().equalsIgnoreCase(nombre) && mascota.getEspecie().equalsIgnoreCase(especie)) {
                return "La mascota con nombre " + nombre + " ya está registrada.";
            }
        }

        // Crear nueva mascota con un ID único
        String id = UUID.randomUUID().toString();
        Mascota nuevaMascota = new Mascota(id, nombre, especie, raza, edad, genero, color, peso);
        listaMascotas.add(nuevaMascota);
        return "Mascota registrada con éxito. ID: " + id;
    }

    /**
     * Busca una mascota en la veterinaria por su ID.
     */
    public Mascota buscarMascotaPorId(String id) {
        for (Mascota mascota : listaMascotas) {
            if (mascota.getId().equals(id)) {
                return mascota;
            }
        }
        return null; // Retorna null si no encuentra la mascota
    }

    /**
     * Obtiene una lista de mascotas con más de 10 años de edad.
     */
    public List<Mascota> obtenerMascotasMayoresA10Anios() {
        List<Mascota> mascotasMayores = new ArrayList<>();
        for (Mascota mascota : listaMascotas) {
            if (mascota.getEdad() > 10) {
                mascotasMayores.add(mascota);
            }
        }
        return mascotasMayores;
    }



}
