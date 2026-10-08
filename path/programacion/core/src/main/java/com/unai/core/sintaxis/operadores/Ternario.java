package com.unai.core.sintaxis.operadores;

/*
 * OPERADOR TERNARIO
 *
 * Permite evaluar una condición y elegir entre dos valores.
 *
 * Sintaxis:
 *
 *     condición ? valorSiTrue : valorSiFalse;
 *
 * Si la condición es true, se obtiene valorSiTrue.
 *
 * Si la condición es false, se obtiene valorSiFalse.
 *
 * Es equivalente a un if-else sencillo.
 */

public class Ternario {

    public static void main(String[] args) {

        int edad = 20;

        String resultado = edad >= 18 ? "Mayor de edad" : "Menor de edad";

        System.out.println(resultado); // Mayor de edad

        // También puede utilizarse con números
        int a = 10;
        int b = 5;

        int mayor = a > b ? a : b;

        System.out.println(mayor); // 10
    }
}