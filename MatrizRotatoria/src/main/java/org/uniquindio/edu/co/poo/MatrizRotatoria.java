package org.uniquindio.edu.co.poo;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizRotatoria {
    public static int[][] rotarMatriz(int[][] matriz, int k) {
        if (matriz == null || matriz.length == 0) {
            return new int[0][0];
        }

        int filas = matriz.length;
        int columnas = matriz[0].length;
        int totalElementos = filas * columnas;
        k = k % totalElementos; // Optimiza giros redundantes

        // Convertir la matriz en un array unidimensional
        int[] matrizPlana = new int[totalElementos];
        int indice = 0;
        for (int[] fila : matriz) {
            for (int num : fila) {
                matrizPlana[indice++] = num;
            }
        }

        // Realizar la rotación a la derecha
        int[] matrizRotadaPlana = new int[totalElementos];
        for (int i = 0; i < totalElementos; i++) {
            matrizRotadaPlana[(i + k) % totalElementos] = matrizPlana[i];
        }

        // Reconstruir la matriz
        int[][] matrizRotada = new int[filas][columnas];
        indice = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizRotada[i][j] = matrizRotadaPlana[indice++];
            }
        }

        return matrizRotada;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Ingrese el número de giros: ");
        int k = scanner.nextInt();

        int[][] matrizRotada = rotarMatriz(matriz, k);

        System.out.println("Matriz rotada:");
        for (int[] fila : matrizRotada) {
            System.out.println(Arrays.toString(fila));
        }

        scanner.close();
    }
}