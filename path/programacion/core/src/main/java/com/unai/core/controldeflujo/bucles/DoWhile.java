package com.unai.core.controldeflujo.bucles;

/*
 * DO-WHILE
 *
 * El bucle do-while repite un bloque de código mientras
 * una condición sea true.
 *
 * Su estructura básica es:
 *
 *     do {
 *         // código que se repite
 *     } while (condición);
 *
 * A diferencia de while, la condición se comprueba
 * DESPUÉS de ejecutar el bloque.
 *
 * Por eso, el bloque se ejecuta al menos una vez,
 * incluso aunque la condición sea false desde el principio.
 *
 * Flujo:
 *
 *     ejecutar bloque
 *          ↓
 *     comprobar condición
 *       ↓        ↓
 *     true      false
 *       ↓        ↓
 *     repetir    fin
 *
 * Es importante escribir el punto y coma después
 * de la condición:
 *
 *     } while (condición);
 *
 */

public class DoWhile {

    public static void main(String[] args) {

        // Se ejecuta varias veces

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        // Se ejecuta al menos una vez,
        // aunque la condición sea false

        int numero = 10;

        do {
            System.out.println("Se ejecuta una vez");
            numero++;
        } while (numero < 5);
    }
}