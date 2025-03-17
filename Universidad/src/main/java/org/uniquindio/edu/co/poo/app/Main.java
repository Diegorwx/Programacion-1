package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.Universidad;
import org.uniquindio.edu.co.poo.model.Estudiante;
import org.uniquindio.edu.co.poo.model.Nota;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Universidad universidad = new Universidad("Uniquindio", "Cra17A");

        // Registrar estudiantes y notas
        int cantidadEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes:"));
        for (int i = 0; i < cantidadEstudiantes; i++) {
            String nombre = JOptionPane.showInputDialog(null, " Ingresar el nombre del estudiante");
            String identificacion = JOptionPane.showInputDialog(null, " Ingresar la identificación");
            universidad.registrarEstudiante(nombre, identificacion);

            for (int j = 0; j < 5; j++) {
                String nombreNota = "Nota " + (j + 1);
                float valorNota = -1;
                while (true) {
                    try {
                        valorNota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de " + nombreNota + " para " + nombre + " (0 - 5):"));
                        if (valorNota >= 0 && valorNota <= 5) break;
                        JOptionPane.showMessageDialog(null, "La nota debe estar entre 0 y 5.");
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese un número decimal.");
                    }
                }
                universidad.registrarNota(identificacion, nombreNota, valorNota);
            }
        }

        while (true) {
            String opcion = JOptionPane.showInputDialog("""
                    Seleccione una opción:
                    1. Mostrar notas y promedio de un estudiante
                    2. Mostrar lista de estudiantes con su promedio
                    3. Predicción de aprobación
                    4. Mejor estudiante por nota específica
                    5. Salir
                    """);

            switch (opcion) {
                case "1":
                    String idEstudiante = JOptionPane.showInputDialog("Ingrese la identificación del estudiante:");
                    Estudiante estudiante = universidad.buscarEstudiante(idEstudiante);

                    if (estudiante != null) {
                        StringBuilder infoNotas = new StringBuilder("Notas de " + estudiante.getNombre() + ":\n");

                        for (Nota nota : estudiante.getListaNotas()) {
                            if (nota != null) {
                                infoNotas.append(nota.getNombre()).append(": ").append(nota.getValor()).append("\n");
                            }
                        }

                        infoNotas.append("\nPromedio: ").append(String.format("%.2f", estudiante.calcularDefinitiva()));
                        JOptionPane.showMessageDialog(null, infoNotas.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "El estudiante no está registrado.");
                    }
                    break;

                case "2":
                    universidad.mostrarListaEstudiantes();
                    break;

                case "3":
                    universidad.predecirAprobacion();
                    break;

                case "4":
                    int indiceNota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la nota a analizar (1-5):")) - 1;
                    universidad.mejorEstudiantePorNota(indiceNota);
                    break;

                case "5":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente de nuevo.");
            }
        }
    }
}