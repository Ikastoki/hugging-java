package com.unai.core.controldeflujo.condicionales;

/*
 * CONDICIONES ANIDADAS
 *
 * Un if anidado es un if que se encuentra dentro de otro
 * bloque de código condicional.
 *
 * Se utiliza cuando una condición depende de que otra condición
 * se haya cumplido previamente.
 *
 * Ejemplo conceptual:
 *
 *     if (condición1) {
 *
 *         if (condición2) {
 *             // código
 *         }
 *     }
 *
 * Primero se comprueba la condición exterior.
 *
 * Solo si es true se comprueba la condición interior.
 */

public class CondicionesAnidadas {

    public static void main(String[] args) {

        int edad = 20;
        boolean tieneEntrada = true;

        if (edad >= 18) {

            System.out.println("Es mayor de edad");

            if (tieneEntrada) {
                System.out.println("Puede entrar");
            } else {
                System.out.println("No tiene entrada");
            }

        } else {

            System.out.println("Es menor de edad");
        }
    }
}