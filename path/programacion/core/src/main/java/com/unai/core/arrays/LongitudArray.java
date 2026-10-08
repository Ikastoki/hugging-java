package com.unai.core.arrays;

// ============================================================
// LONGITUD DE UN ARRAY
// ============================================================
//
// Los arrays tienen una propiedad llamada length.
//
// array.length
//
// Devuelve el número de elementos que contiene el array.
//
// Por ejemplo:
//
// int[] numeros = {10, 20, 30};
//
// numeros.length → 3
//
// Como los índices empiezan en 0, el último índice siempre es:
//
// array.length - 1
//
// Por ejemplo:
//
// numeros.length → 3
// último índice → 2
//
// En un array multidimensional:
//
// matriz.length
//
// indica el número de filas.
//
// Y:
//
// matriz[fila].length
//
// indica el número de elementos de esa fila.
//
// Importante:
// length es una propiedad, no un método.
// Por eso se escribe:
//
// numeros.length
//
// y no:
//
// numeros.length()
//
// ============================================================

// Ejemplo

public class LongitudArray {

    public static void main(String[] args) {

        int[] numeros = { 10, 20, 30, 40 };

        System.out.println(numeros.length); // 4

        // Último elemento
        System.out.println(numeros[numeros.length - 1]); // 40

        // Array multidimensional
        int[][] matriz = {
                { 10, 20 },
                { 30, 40, 50 }
        };

        System.out.println(matriz.length); // 2 filas
        System.out.println(matriz[0].length); // 2 elementos
        System.out.println(matriz[1].length); // 3 elementos
    }
}
