package com.unai.core.controldeflujo.condicionales;

/*
 * SWITCH
 *
 * switch permite ejecutar diferentes bloques de código
 * dependiendo del valor de una expresión.
 *
 * Sintaxis tradicional:
 *
 *     switch (valor) {
 *         case valor1:
 *             // código
 *             break;
 *
 *         case valor2:
 *             // código
 *             break;
 *
 *         default:
 *             // código si no coincide ningún caso
 *     }
 *
 * case define un posible valor.
 *
 * break detiene la ejecución del switch.
 *
 * default se ejecuta cuando ningún case coincide.
 *
 * Si olvidamos break, la ejecución continúa en los siguientes
 * casos (fall-through).
 */

public class Switch {

    public static void main(String[] args) {

        int dia = 3;

        switch (dia) {

            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miércoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            default:
                System.out.println("Otro día");
        }
    }
}