package com.unai.core.controldeflujo.condicionales;

/*
 * ELSE-IF
 *
 * Permite comprobar varias condiciones diferentes.
 *
 * Sintaxis:
 *
 *     if (condición1) {
 *         // código
 *     } else if (condición2) {
 *         // código
 *     } else {
 *         // código si ninguna condición se cumple
 *     }
 *
 * Java evalúa las condiciones de arriba hacia abajo.
 *
 * Cuando encuentra una condición true, ejecuta su bloque
 * y deja de comprobar las siguientes condiciones.
 *
 * El else final es opcional.
 */

public class ElseIf {

    public static void main(String[] args) {

        int nota = 7;

        if (nota >= 9) {
            System.out.println("Sobresaliente");
        } else if (nota >= 7) {
            System.out.println("Notable");
        } else if (nota >= 5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
    }
}
