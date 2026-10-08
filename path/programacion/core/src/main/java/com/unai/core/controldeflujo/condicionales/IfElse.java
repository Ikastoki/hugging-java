package com.unai.core.controldeflujo.condicionales;

/*
 * IF-ELSE
 *
 * Permite ejecutar un bloque de código si una condición
 * es verdadera y otro bloque si es falsa.
 *
 * Sintaxis:
 *
 *     if (condición) {
 *         // si es true
 *     } else {
 *         // si es false
 *     }
 *
 * La condición debe devolver un boolean.
 */

public class IfElse {

    public static void main(String[] args) {

        int edad = 16;

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        int numero = 7;

        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}