package com.unai.core.controldeflujo.bucles;

/*
 * BUCLES ANIDADOS
 *
 * Un bucle anidado es un bucle que se encuentra dentro
 * de otro bucle.
 *
 * El bucle exterior controla las iteraciones principales.
 *
 * Por cada iteración del bucle exterior,
 * el bucle interior se ejecuta completamente.
 *
 * Ejemplo:
 *
 *     for (int i = 0; i < 3; i++) {
 *
 *         for (int j = 0; j < 2; j++) {
 *             ...
 *         }
 *     }
 *
 * El bucle interior se ejecuta 2 veces por cada iteración
 * del bucle exterior.
 *
 * Por tanto:
 *
 *     3 × 2 = 6 iteraciones del bucle interior.
 *
 * Los bucles anidados pueden utilizarse con for, while
 * y do-while.
 *
 * Es habitual utilizar diferentes variables de control
 * para distinguir los niveles:
 *
 *     i → bucle exterior
 *     j → bucle interior
 *
 * Ejemplo:
 */

public class BuclesAnidados {

    public static void main(String[] args) {

        // Bucle for dentro de otro for

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 2; j++) {
                System.out.println(
                        "i = " + i + ", j = " + j);
            }
        }

        // Ejemplo: tabla de multiplicar

        for (int tabla = 1; tabla <= 3; tabla++) {

            System.out.println("Tabla del " + tabla);

            for (int numero = 1; numero <= 10; numero++) {
                System.out.println(
                        tabla + " x " + numero
                                + " = " + (tabla * numero));
            }
        }

        // Ejemplo con una matriz

        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                System.out.print(matriz[fila][columna] + " ");
            }

            System.out.println();
        }
    }
}