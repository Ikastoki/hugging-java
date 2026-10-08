package com.unai.core.sintaxis.operadores;

/*
 * OPERADORES DE ASIGNACIÓN
 *
 * El operador = asigna un valor a una variable.
 *
 *     variable = valor;
 *
 * Java también permite combinar una operación aritmética
 * con la asignación:
 *
 *     +=   suma y asigna
 *     -=   resta y asigna
 *     *=   multiplica y asigna
 *     /=   divide y asigna
 *     %=   calcula el resto y asigna
 *
 * Por ejemplo:
 *
 *     numero += 5;
 *
 * equivale a:
 *
 *     numero = numero + 5;
 */

public class Asignación {

    public static void main(String[] args) {

        // Asignación simple
        int numero = 10;

        // Suma y asignación
        numero += 5;
        System.out.println(numero); // 15

        // Resta y asignación
        numero -= 3;
        System.out.println(numero); // 12

        // Multiplicación y asignación
        numero *= 2;
        System.out.println(numero); // 24

        // División y asignación
        numero /= 4;
        System.out.println(numero); // 6

        // Módulo y asignación
        numero %= 4;
        System.out.println(numero); // 2
    }
}