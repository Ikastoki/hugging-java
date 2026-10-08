package com.unai.core.metodos.sobrecarga;

/*
 * PASO DE ARGUMENTOS
 *
 * Cuando invocamos un método, proporcionamos argumentos.
 *
 * Los argumentos se corresponden con los parámetros
 * del método según su posición.
 *
 * Ejemplo:
 *
 *     static int sumar(int a, int b) {
 *         return a + b;
 *     }
 *
 *     sumar(10, 20);
 *
 * Aquí:
 *
 *     a ← 10
 *     b ← 20
 *
 * Los tipos de los argumentos deben ser compatibles
 * con los tipos de los parámetros.
 *
 * Los argumentos pueden ser:
 *
 *     - Valores literales.
 *     - Variables.
 *     - Expresiones.
 *     - Valores devueltos por otros métodos.
 *
 * La cantidad de argumentos también debe coincidir
 * con la cantidad de parámetros, salvo mecanismos
 * específicos como los varargs, que veremos más adelante.
 *
 */

public class PasoArgumentos {

    static int sumar(int a, int b) {
        return a + b;
    }

    static void mostrar(String nombre, int edad) {
        System.out.println(
                nombre + " tiene " + edad + " años.");
    }

    static int duplicar(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {

        // Valores literales

        int resultado1 = sumar(10, 20);

        System.out.println(resultado1);

        // Variables

        int numero1 = 5;
        int numero2 = 8;

        int resultado2 = sumar(numero1, numero2);

        System.out.println(resultado2);

        // Expresiones

        int resultado3 = sumar(10 + 5, 20 * 2);

        System.out.println(resultado3);

        // Resultado de otro método

        int resultado4 = sumar(
                duplicar(5),
                duplicar(10));

        System.out.println(resultado4);

        // Varios tipos de argumentos

        String nombre = "Ana";
        int edad = 25;

        mostrar(nombre, edad);
    }
}