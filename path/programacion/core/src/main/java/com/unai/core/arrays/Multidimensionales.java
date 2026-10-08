package com.unai.core.arrays;

// ============================================================
// ARRAYS MULTIDIMENSIONALES
// ============================================================
//
// Un array multidimensional es un array que contiene otros
// arrays como elementos.
//
// El caso más común es un array bidimensional:
//
// int[][] matriz;
//
// Podemos imaginarlo como una tabla:
//
//       columna
//       0   1   2
//     ┌───────────
//  0  │ 10  20  30
//  1  │ 40  50  60
//
// El primer índice representa la fila.
// El segundo índice representa la columna.
//
// matriz[0][1] → 20
// matriz[1][2] → 60
//
// Podemos inicializarlo directamente:
//
// int[][] matriz = {
//     {10, 20, 30},
//     {40, 50, 60}
// };
//
// También podemos indicar el número de filas y columnas:
//
// int[][] matriz = new int[2][3];
//
// Para recorrer un array bidimensional normalmente utilizamos
// dos bucles: uno para las filas y otro para las columnas.
//
// ============================================================

public class Multidimensionales {

    public static void main(String[] args) {

        int[][] matriz = {
                { 10, 20, 30 },
                { 40, 50, 60 }
        };

        // Acceder a elementos
        System.out.println(matriz[0][1]); // 20
        System.out.println(matriz[1][2]); // 60

        // Recorrer la matriz
        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.println(matriz[fila][columna]);
            }
        }
    }
}
