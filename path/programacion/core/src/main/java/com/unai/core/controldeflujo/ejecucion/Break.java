package com.unai.core.controldeflujo.ejecucion;

/*
 * BREAK
 *
 * La palabra break termina inmediatamente el bucle
 * en el que se encuentra.
 *
 * Cuando Java encuentra un break:
 *
 *     1. Termina el bucle.
 *     2. Salta fuera del bucle.
 *     3. Continúa ejecutando el código posterior.
 *
 * Se puede utilizar en:
 *
 *     - for
 *     - while
 *     - do-while
 *     - switch
 *
 */

public class Break {

    public static void main(String[] args) {

        // Detener un for cuando i llega a 5

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }

        System.out.println("Fin del bucle");

        // Buscar un número y detener el recorrido

        int[] numeros = { 10, 20, 30, 40, 50 };

        for (int numero : numeros) {

            if (numero == 30) {
                break;
            }

            System.out.println(numero);
        }

        // break dentro de un while

        int contador = 0;

        while (contador < 10) {

            if (contador == 3) {
                break;
            }

            System.out.println(contador);
            contador++;
        }
    }
}