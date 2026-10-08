package com.unai.core.controldeflujo.bucles;

/*
 * FOR
 *
 * El bucle for permite repetir un bloque de código.
 *
 * Su estructura básica es:
 *
 *     for (inicialización; condición; actualización) {
 *         // código que se repite
 *     }
 *
 * La inicialización se ejecuta una sola vez, antes de comenzar.
 *
 * La condición se comprueba antes de cada iteración.
 * Si es true, se ejecuta el bloque.
 * Si es false, el bucle termina.
 *
 * La actualización se ejecuta después de cada iteración.
 *
 * Flujo:
 *
 *     inicialización
 *          ↓
 *     condición
 *       ↓    ↓
 *     true  false → fin
 *       ↓
 *     bloque
 *       ↓
 *     actualización
 *       ↓
 *     condición
 *
 * Es habitual utilizar una variable contador:
 *
 *     for (int i = 0; i < 5; i++) {
 *         ...
 *     }
 *
 * En este caso, i toma los valores:
 *
 *     0, 1, 2, 3, 4
 *
 * La variable declarada dentro del for pertenece al ámbito
 * del propio bucle.
 *
 * También podemos modificar el contador de otras formas:
 *
 *     i++
 *     i--
 *     i += 2
 *     i *= 2
 *
 * Incluso podemos omitir alguna de las partes del for,
 * aunque debemos tener cuidado con los bucles infinitos.
 *
 */

public class For {

    public static void main(String[] args) {

        // Repetir 5 veces

        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración: " + i);
        }

        // Contar de 1 a 10

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Contar hacia atrás

        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        // Incrementar de dos en dos

        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        // La variable i solo existe dentro del for

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        // System.out.println(i); // Error

        // Un for puede tener varias variables

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println(i + " - " + j);
        }
    }
}