package com.unai.core.sintaxis.conversion;

/*
 * CONVERSIÓN EXPLÍCITA
 *
 * La conversión explícita ocurre cuando indicamos manualmente
 * el tipo al que queremos convertir un valor.
 *
 * Se realiza mediante casting:
 *
 * (tipo) valor
 *
 *
 * DE UN TIPO MAYOR A UNO MENOR
 *
 * Por ejemplo, convertir int a byte:
 *
 * int numero = 100;
 * byte resultado = (byte) numero;
 *
 * Aquí indicamos explícitamente que queremos convertir el int
 * a byte.
 *
 *
 * POSIBLE PÉRDIDA DE INFORMACIÓN
 *
 * Una conversión explícita puede provocar pérdida de información
 * si el valor no cabe en el tipo de destino.
 *
 * int numero = 130;
 * byte resultado = (byte) numero;
 *
 * El resultado no será 130 porque byte solo puede almacenar
 * valores entre -128 y 127.
 *
 *
 * DECIMALES A ENTEROS
 *
 * También podemos convertir un número decimal a un entero:
 *
 * double numero = 10.99;
 * int resultado = (int) numero;
 *
 * Se elimina la parte decimal.
 *
 * resultado será 10.
 *
 *
 * CHAR Y TIPOS NUMÉRICOS
 *
 * También podemos realizar conversiones explícitas entre char
 * y tipos numéricos:
 *
 * int codigo = 65;
 * char letra = (char) codigo;
 *
 * El resultado será 'A'.
 *
 *
 * CONVERSIÓN IMPLÍCITA VS EXPLÍCITA
 *
 * Implícita:
 *
 * int numero = 100;
 * long resultado = numero;
 *
 * Java realiza la conversión automáticamente.
 *
 *
 * Explícita:
 *
 * long numero = 100;
 * int resultado = (int) numero;
 *
 * Nosotros indicamos la conversión.
 *
 */

public class Explicita {

    public static void main(String[] args) {

        int numero = 100;

        byte resultadoByte = (byte) numero;

        System.out.println("int a byte: " + resultadoByte);

        double decimal = 10.99;

        int resultadoInt = (int) decimal;

        System.out.println("double a int: " + resultadoInt);

        int codigo = 65;

        char letra = (char) codigo;

        System.out.println("65 a char: " + letra);

        int numeroGrande = 130;

        byte resultado = (byte) numeroGrande;

        System.out.println("130 convertido a byte: " + resultado);
    }
}