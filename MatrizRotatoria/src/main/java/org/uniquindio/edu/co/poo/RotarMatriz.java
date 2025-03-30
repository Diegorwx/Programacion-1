package org.uniquindio.edu.co.poo;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class RotarMatriz {
    public static int[][] rotarMatrizComoRuleta(int[][] matriz, int k) {
        if (matriz == null || matriz.length == 0) {
            return new int[0][0];
        }

        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int giro = 0; giro < k; giro++) {
            int[][] nuevaMatriz = new int[filas][columnas];

            // Copiar la matriz original
            for (int i = 0; i < filas; i++) {
                nuevaMatriz[i] = Arrays.copyOf(matriz[i], columnas);
            }

            // Rotar la capa exterior
            for (int j = 0; j < columnas - 1; j++) {
                nuevaMatriz[0][j + 1] = matriz[0][j];
            }
            for (int i = 0; i < filas - 1; i++) {
                nuevaMatriz[i + 1][columnas - 1] = matriz[i][columnas - 1];
            }
            for (int j = columnas - 1; j > 0; j--) {
                nuevaMatriz[filas - 1][j - 1] = matriz[filas - 1][j];
            }
            for (int i = filas - 1; i > 0; i--) {
                nuevaMatriz[i - 1][0] = matriz[i][0];
            }

            matriz = nuevaMatriz;
        }

        return matriz;
    }

    public static void main(String[] args) {
        int filas = obtenerEntero("Ingrese el número de filas:");
        int columnas = obtenerEntero("Ingrese el número de columnas:");

        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = obtenerEntero("Ingrese el elemento en la posición (" + i + ", " + j + "):");
            }
        }

        int k = obtenerEntero("Ingrese el número de giros:");
        int[][] matrizRotada = rotarMatrizComoRuleta(matriz, k);

        StringBuilder resultado = new StringBuilder("Matriz rotada:\n");
        for (int[] fila : matrizRotada) {
            resultado.append(Arrays.toString(fila)).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private static int obtenerEntero(String mensaje) {
        int valor;
        while (true) {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                return valor;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
