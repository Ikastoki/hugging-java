package com.unai.core.arrays;

// ============================================================
// ARRAYS IRREGULARES
// ============================================================
//
// Un array irregular (jagged array) es un array bidimensional
// donde las filas pueden tener diferentes longitudes.
//
// Por ejemplo:
//
// int[][] numeros = {
//     {10, 20},
//     {30, 40, 50},
//     {60}
// };
//
// Las filas tienen diferentes tamaños:
//
// fila 0 → 2 elementos
// fila 1 → 3 elementos
// fila 2 → 1 elemento
//
// Cada fila es realmente un array independiente.
//
// Podemos consultar la longitud de cada fila:
//
// numeros[0].length → 2
// numeros[1].length → 3
// numeros[2].length → 1
//
// Para recorrerlo correctamente, el segundo bucle debe utilizar
// la longitud de la fila actual:
//
// numeros[fila].length
//
// ============================================================

public class ArraysIrregulares {

    public static void main(String[] args) {

        int[][] numeros = {
                { 10, 20 },
                { 30, 40, 50 },
                { 60 }
        };

        // Recorrer un array irregular
        for (int fila = 0; fila < numeros.length; fila++) {

            for (int columna = 0; columna < numeros[fila].length; columna++) {
                System.out.println(numeros[fila][columna]);
            }
        }

        // Longitud de cada fila
        System.out.println(numeros[0].length); // 2
        System.out.println(numeros[1].length); // 3
        System.out.println(numeros[2].length); // 1
    }
}