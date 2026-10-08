package com.unai.core.sintaxis.operadores;

/*
 * OPERADORES DE DESPLAZAMIENTO
 *
 * Trabajan moviendo los bits de un número.
 *
 * <<   desplazamiento a la izquierda
 * >>   desplazamiento a la derecha
 * >>>  desplazamiento a la derecha sin signo
 *
 *
 * DESPLAZAMIENTO A LA IZQUIERDA (<<)
 *
 * Mueve los bits hacia la izquierda.
 *
 *     5 = 0101
 *
 *     5 << 1
 *
 *     1010 = 10
 *
 * En números positivos, desplazar una posición a la izquierda
 * equivale normalmente a multiplicar por 2.
 *
 *
 * DESPLAZAMIENTO A LA DERECHA (>>)
 *
 * Mueve los bits hacia la derecha.
 *
 *     10 = 1010
 *
 *     10 >> 1
 *
 *     0101 = 5
 *
 * En números positivos, desplazar una posición a la derecha
 * equivale normalmente a dividir entre 2.
 *
 *
 * DESPLAZAMIENTO A LA DERECHA SIN SIGNO (>>>)
 *
 * También desplaza los bits hacia la derecha,
 * pero rellena los espacios de la izquierda con ceros.
 *
 * Es especialmente importante cuando trabajamos con
 * números negativos.
 */

public class Desplazamiento {

    public static void main(String[] args) {

        int numero = 5; // 0101

        // Desplazar a la izquierda
        int izquierda = numero << 1;

        System.out.println(izquierda); // 10

        // Desplazar a la derecha
        int derecha = 10; // 1010
        int resultado = derecha >> 1;

        System.out.println(resultado); // 5

        // Varios desplazamientos
        int valor = 4;

        System.out.println(valor << 1); // 8
        System.out.println(valor << 2); // 16
        System.out.println(valor >> 1); // 2
        System.out.println(valor >> 2); // 1
    }
}