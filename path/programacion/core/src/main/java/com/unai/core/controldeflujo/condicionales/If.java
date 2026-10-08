package com.unai.core.controldeflujo.condicionales;

/*
 * IF
 *
 * if permite ejecutar un bloque de código cuando una condición
 * se cumple.
 *
 * Sintaxis:
 *
 *     if (condición) {
 *         // código
 *     }
 *
 * La condición debe producir un valor boolean:
 *
 *     true  -> se ejecuta el bloque
 *     false -> no se ejecuta
 */

public class If {

    public static void main(String[] args) {

        int edad = 20;

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        }

        int numero = 10;

        if (numero > 0) {
            System.out.println("El número es positivo");
        }

        boolean tienePermiso = true;

        if (tienePermiso) {
            System.out.println("Puede entrar");
        }
    }
}
