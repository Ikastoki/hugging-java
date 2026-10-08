package com.unai.core.sintaxis.operadores;

/*
 * OPERADORES BIT A BIT
 *
 * Un número entero está formado internamente por bits.
 *
 * Un bit solo puede tener dos valores:
 *
 *     0
 *     1
 *
 * Por ejemplo:
 *
 *     5 = 0101
 *     3 = 0011
 *
 * Los operadores bit a bit comparan estos bits
 * posición por posición.
 *
 *
 * AND (&)
 *
 * Solo produce 1 cuando LOS DOS bits son 1.
 *
 *     0101   -> 5
 *     0011   -> 3
 *     ----
 *     0001   -> 1
 *
 * Por eso:
 *
 *     5 & 3 = 1
 *
 *
 * OR (|)
 *
 * Produce 1 cuando AL MENOS UNO de los bits es 1.
 *
 *     0101   -> 5
 *     0011   -> 3
 *     ----
 *     0111   -> 7
 *
 * Por eso:
 *
 *     5 | 3 = 7
 *
 *
 * XOR (^)
 *
 * Produce 1 cuando los bits SON DIFERENTES.
 *
 *     0101   -> 5
 *     0011   -> 3
 *     ----
 *     0110   -> 6
 *
 * Por eso:
 *
 *     5 ^ 3 = 6
 *
 *
 * NOT (~)
 *
 * Invierte TODOS los bits:
 *
 *     0 -> 1
 *     1 -> 0
 *
 * Por eso el resultado puede parecer extraño:
 *
 *     ~5 = -6
 *
 * Esto ocurre porque los enteros negativos utilizan
 * representación en complemento a dos.
 *
 *
 * IDEA IMPORTANTE
 *
 * No estamos comparando los números 5 y 3 directamente.
 *
 * Estamos trabajando con sus bits:
 *
 *     5 -> 0101
 *     3 -> 0011
 *
 * Y aplicamos la operación bit por bit.
 */

public class BitABit {

    public static void main(String[] args) {

        int a = 5; // 0101
        int b = 3; // 0011

        System.out.println(a & b); // 1
        System.out.println(a | b); // 7
        System.out.println(a ^ b); // 6
        System.out.println(~a); // -6
    }
}