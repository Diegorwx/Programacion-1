package org.uniquindio.edu.co.poo.model;

public class ServicioCorreo {
    public void enviarCorreo(String destinatario, String asunto, String mensaje) {
        System.out.println("Correo enviado a " + destinatario + ": " + asunto);
    }
}
