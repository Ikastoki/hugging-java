package com.unai.core.arrays;

// ============================================================
// RECORRIDO DE ARRAYS
// ============================================================
//
// Recorrer un array significa acceder a sus elementos
// normalmente desde la primera posición hasta la última.
//
// Como los índices empiezan en 0, podemos recorrer un array
// utilizando su propiedad length:
//
// for (int i = 0; i < numeros.length; i++) {
//     System.out.println(numeros[i]);
// }
//
// length indica el número de elementos del array.
//
// También podemos utilizar el enhanced for:
//
// for (int numero : numeros) {
//     System.out.println(numero);
// }
//
// El enhanced for es útil cuando solo necesitamos los valores
// y no necesitamos conocer el índice.
//
// ============================================================

public class RecorrerArray {

    public static void main(String[] args) {

        int[] numeros = { 10, 20, 30, 40, 50 };

        // Recorrido utilizando el índice
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice: " + i);
            System.out.println("Valor: " + numeros[i]);
        }

        // Recorrido utilizando enhanced for
        for (int numero : numeros) {
            System.out.println("Valor: " + numero);
        }
    }
}