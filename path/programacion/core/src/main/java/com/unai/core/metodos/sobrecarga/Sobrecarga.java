package com.unai.core.metodos.sobrecarga;

/*
 * SOBRECARGA DE MÉTODOS
 *
 * La sobrecarga permite definir varios métodos con el mismo
 * nombre dentro de una clase.
 *
 * Para que exista sobrecarga, los métodos deben diferenciarse
 * en sus parámetros:
 *
 *     - Número de parámetros.
 *     - Tipo de los parámetros.
 *     - Orden de los tipos de los parámetros.
 *
 * El tipo de retorno NO es suficiente para diferenciar
 * dos métodos.
 *
 * Ejemplo:
 *
 *     sumar(int, int)
 *     sumar(int, int, int)
 *     sumar(double, double)
 *
 * Todos tienen el mismo nombre, pero diferentes parámetros.
 *
 * Cuando invocamos el método, Java determina cuál utilizar
 * según los argumentos proporcionados.
 *
 */

class Calculadora {

    // Dos parámetros int

    static int sumar(int a, int b) {
        return a + b;
    }

    // Tres parámetros int

    static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Dos parámetros double

    static double sumar(double a, double b) {
        return a + b;
    }

    // Un parámetro int

    static int sumar(int a) {
        return a;
    }
}

public class Sobrecarga {

    public static void main(String[] args) {

        int resultado1 = Calculadora.sumar(10, 20);

        int resultado2 = Calculadora.sumar(10, 20, 30);

        double resultado3 = Calculadora.sumar(10.5, 20.5);

        int resultado4 = Calculadora.sumar(10);

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
    }
}
