package com.unai.core.sintaxis.conversion;

/*
 * CASTING
 *
 * El casting es la conversión explícita de un valor de un tipo
 * a otro tipo compatible.
 * 
 * Es otra forma de llamar a la conversión explicita, pero es lo mismo.
 *
 * Se utiliza mediante la sintaxis:
 *
 *     (tipoDestino) valor
 *
 * Es especialmente habitual cuando convertimos un tipo con mayor
 * rango a otro con menor rango.
 *
 * Ejemplo:
 *
 *     int numero = 100;
 *     byte resultado = (byte) numero;
 *
 * A diferencia de una conversión implícita, aquí indicamos
 * explícitamente a Java que queremos realizar la conversión.
 *
 * El casting puede provocar pérdida de información:
 *
 * - Al pasar de un tipo grande a uno pequeño, el valor puede no caber.
 * - Al pasar de decimal a entero, se elimina la parte decimal.
 * - Al reducir la precisión de un número, pueden perderse datos.
 *
 * El casting también puede utilizarse para controlar cómo se evalúa
 * una expresión.
 */

public class Casting {

    public static void main(String[] args) {

        // De int a byte
        int numero = 100;
        byte resultado = (byte) numero;

        System.out.println(resultado); // 100

        // De double a int: se elimina la parte decimal
        double decimal = 10.75;
        int entero = (int) decimal;

        System.out.println(entero); // 10

        // Casting para realizar una división decimal
        int a = 5;
        int b = 2;

        double division = (double) a / b;

        System.out.println(division); // 2.5
    }
}