package com.unai.core.controldeflujo.bucles;

/*
 * WHILE
 *
 * El bucle while repite un bloque de código mientras
 * una condición sea true.
 *
 * Su estructura básica es:
 *
 *     while (condición) {
 *         // código que se repite
 *     }
 *
 * La condición se comprueba ANTES de cada iteración.
 *
 * Si la condición es true:
 *     → se ejecuta el bloque
 *
 * Si la condición es false:
 *     → el bucle termina
 *
 * Como la condición se comprueba antes de entrar,
 * un while puede ejecutarse cero veces.
 *
 * Es importante modificar dentro del bucle las variables
 * que afectan a la condición cuando sea necesario.
 * De lo contrario podemos crear un bucle infinito.
 *
 */

public class While {

    public static void main(String[] args) {

        // Contar de 1 a 5

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // Un while puede no ejecutarse ninguna vez

        int numero = 10;

        while (numero < 5) {
            System.out.println("No se ejecutará");
            numero++;
        }

        // Ejemplo con una condición

        int contador = 0;

        while (contador < 3) {
            System.out.println("Hola");
            contador++;
        }
    }
}