package com.unai.core.sintaxis.conversion;

/*
 * AUTOBOXING Y UNBOXING
 *
 * Autoboxing es la conversión automática de un tipo primitivo
 * a su tipo envoltorio correspondiente.
 *
 * Ejemplo:
 *
 *     int numero = 10;
 *     Integer objeto = numero;
 *
 * Java convierte automáticamente int -> Integer.
 *
 * Unboxing es el proceso contrario: la conversión automática
 * de un tipo envoltorio a su tipo primitivo.
 *
 * Ejemplo:
 *
 *     Integer objeto = 10;
 *     int numero = objeto;
 *
 * Java convierte automáticamente Integer -> int.
 *
 * Correspondencias principales:
 *
 *     boolean -> Boolean
 *     byte    -> Byte
 *     short   -> Short
 *     int     -> Integer
 *     long    -> Long
 *     float   -> Float
 *     double  -> Double
 *     char    -> Character
 *
 * El autoboxing y el unboxing son útiles cuando necesitamos
 * trabajar con objetos en lugar de tipos primitivos.
 */

public class AutoboxingYUnboxing {

    public static void main(String[] args) {

        // Autoboxing: int -> Integer
        int numero = 10;
        Integer objeto = numero;

        // Unboxing: Integer -> int
        Integer valor = 20;
        int resultado = valor;

        System.out.println(objeto); // 10
        System.out.println(resultado); // 20

        // También puede ocurrir automáticamente en expresiones
        Integer a = 10;
        Integer b = 5;

        int suma = a + b;

        System.out.println(suma); // 15
    }
}