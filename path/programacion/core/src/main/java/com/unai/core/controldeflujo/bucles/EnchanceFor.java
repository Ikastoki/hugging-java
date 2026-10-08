package com.unai.core.controldeflujo.bucles;

/*
 * ENHANCED FOR
 *
 * El enhanced for permite recorrer elementos de un array
 * o de una colección de forma sencilla.
 *
 * Su estructura básica es:
 *
 *     for (Tipo elemento : array) {
 *         // código
 *     }
 *
 * En cada iteración, la variable "elemento" contiene
 * el siguiente elemento del array o colección.
 *
 * No necesitamos utilizar un índice:
 *
 *     for (int i = 0; i < array.length; i++)
 *
 * En su lugar:
 *
 *     for (int elemento : array)
 *
 * El enhanced for es especialmente útil cuando solo
 * necesitamos acceder a los elementos y no necesitamos
 * conocer su posición.
 *
 * No debemos confundir:
 *
 *     elemento
 *
 * con:
 *
 *     índice
 *
 * La variable del enhanced for contiene el VALOR,
 * no la posición del elemento.
 *
 */

public class EnchanceFor {

    public static void main(String[] args) {

        // Recorrer un array de enteros

        int[] numeros = { 10, 20, 30, 40, 50 };

        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Recorrer un array de Strings

        String[] nombres = {
                "Ana",
                "Luis",
                "Marta"
        };

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // También podemos utilizarlo con expresiones

        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        System.out.println("Suma: " + suma);
    }
}