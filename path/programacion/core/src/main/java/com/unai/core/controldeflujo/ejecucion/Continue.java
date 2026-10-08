package com.unai.core.controldeflujo.ejecucion;

/*
 * CONTINUE
 *
 * La palabra continue termina únicamente la iteración actual
 * del bucle y pasa a la siguiente iteración.
 *
 * Cuando Java encuentra un continue:
 *
 *     1. Se detiene la iteración actual.
 *     2. No ejecuta el código restante de esa iteración.
 *     3. Continúa con la siguiente iteración.
 *
 * Se puede utilizar en:
 *
 *     - for
 *     - while
 *     - do-while
 *
 * Diferencia principal:
 *
 *     break
 *     → termina completamente el bucle.
 *
 *     continue
 *     → salta únicamente la iteración actual.
 *
 */

public class Continue {

    public static void main(String[] args) {

        // Saltar los números pares

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }

        // Saltar un valor concreto

        int[] numeros = { 10, 20, 30, 40, 50 };

        for (int numero : numeros) {

            if (numero == 30) {
                continue;
            }

            System.out.println(numero);
        }

        // continue en un while

        int contador = 0;

        while (contador < 5) {

            contador++;

            if (contador == 3) {
                continue;
            }

            System.out.println(contador);
        }
    }
}