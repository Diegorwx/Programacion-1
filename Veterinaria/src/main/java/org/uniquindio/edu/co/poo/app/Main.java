package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.Mascota;
import org.uniquindio.edu.co.poo.model.Veterinaria;



public class Main {
    public static void main(String[] args) {
        Veterinaria veterinaria = new Veterinaria("Amigos Peludos", "Calle 123", "123456789", "contacto@amigospeludos.com", "NIT123");

        // Registrar mascotas
        System.out.println(veterinaria.registrarMascota("Bobby", "Perro", "Labrador", (byte) 12, "Macho", "Dorado", 25.5f));
        System.out.println(veterinaria.registrarMascota("Mimi", "Gato", "Siames", (byte) 5, "Hembra", "Blanco", 4.2f));
        System.out.println(veterinaria.registrarMascota("Toby", "Perro", "Beagle", (byte) 11, "Macho", "Marrón", 10.0f));

        // Mostrar mascotas mayores a 10 años
        System.out.println("Mascotas mayores de 10 años:");
        for (Mascota m : veterinaria.obtenerMascotasMayoresA10Anios()) {
            System.out.println(m);
        }
    }
}
