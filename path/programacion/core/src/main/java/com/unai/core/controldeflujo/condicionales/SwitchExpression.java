package com.unai.core.controldeflujo.condicionales;

/*
 * SWITCH EXPRESSIONS
 *
 * Una switch expression es un switch que produce un valor.
 *
 * Se puede guardar directamente el resultado en una variable:
 *
 *     int resultado = switch (valor) {
 *         ...
 *     };
 *
 * Las ramas modernas utilizan ->.
 *
 * Con -> no existe fall-through:
 * cuando una rama coincide, se ejecuta únicamente esa rama.
 *
 * Cada rama puede devolver directamente un valor:
 *
 *     case 1 -> "Uno";
 *
 * Si necesitamos varias instrucciones dentro de una rama,
 * utilizamos llaves y la palabra yield para devolver el valor:
 *
 *     case 1 -> {
 *         ...
 *         yield resultado;
 *     }
 *
 * Una switch expression debe ser exhaustiva.
 * Normalmente esto significa incluir un case default.
 *
 * También podemos utilizar varios valores en un mismo case:
 *
 *     case 1, 2, 3 -> "Pequeño";
 *
 * La diferencia importante con el switch tradicional es que
 * aquí switch es una expresión que produce un resultado.
 *
 * Ejemplo:
 */

public class SwitchExpression {

    public static void main(String[] args) {

        int numero = 2;

        String resultado = switch (numero) {
            case 1 -> "Uno";
            case 2 -> "Dos";
            case 3 -> "Tres";
            default -> "Otro número";
        };

        System.out.println(resultado);

        // Varios valores en un mismo case

        int mes = 7;

        String estacion = switch (mes) {
            case 12, 1, 2 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Mes inválido";
        };

        System.out.println(estacion);

        // Una rama con varias instrucciones

        int nota = 8;

        String resultadoNota = switch (nota) {

            case 10 -> "Sobresaliente";

            case 9, 8 -> {
                String mensaje = "Muy buena nota";
                yield mensaje;
            }

            case 7, 6 -> "Aprobado";

            default -> "Suspenso";
        };

        System.out.println(resultadoNota);
    }
}
