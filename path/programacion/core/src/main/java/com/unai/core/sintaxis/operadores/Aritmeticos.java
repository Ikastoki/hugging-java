package com.unai.core.sintaxis.operadores;

/*
 * OPERADORES ARITMÉTICOS
 *
 * Se utilizan para realizar operaciones matemáticas.
 *
 * +   suma
 * -   resta
 * *   multiplicación
 * /   división
 * %   módulo o resto
 *
 * También existen:
 *
 * ++  incremento
 * --  decremento
 *
 * Si ambos operandos son enteros, la división devuelve un entero
 * y se elimina la parte decimal.
 *
 * Si al menos uno de los operandos es decimal, el resultado
 * puede conservar la parte decimal.
 */

public class Aritmeticos {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Operaciones básicas
        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3
        System.out.println(a % b); // 1

        // División decimal
        double resultado = (double) a / b;

        System.out.println(resultado); // 3.333...

        // Incremento
        int numero = 5;

        numero++;
        System.out.println(numero); // 6

        // Decremento
        numero--;

        System.out.println(numero); // 5
    }
}