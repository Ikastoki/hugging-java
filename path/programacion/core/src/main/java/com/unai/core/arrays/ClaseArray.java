package com.unai.core.arrays;

// ============================================================
// CLASE ARRAYS
// ============================================================
//
// La clase Arrays pertenece al paquete java.util:
//
// import java.util.Arrays;
//
// Proporciona métodos útiles para trabajar con arrays.
//
// Algunos de los métodos más utilizados son:
//
// Arrays.toString(array)
// Convierte un array en una representación de texto.
//
// Arrays.sort(array)
// Ordena los elementos del array.
//
// Arrays.equals(array1, array2)
// Comprueba si dos arrays tienen los mismos elementos
// en el mismo orden.
//
// Arrays.fill(array, valor)
// Rellena todas las posiciones del array con un valor.
//
// Arrays.copyOf(array, nuevoTamaño)
// Crea una copia del array con el tamaño indicado.
//
// Arrays.binarySearch(array, valor)
// Busca un elemento mediante búsqueda binaria.
// El array debe estar ordenado previamente.
//
// Los métodos de Arrays son estáticos, por lo que se utilizan
// directamente mediante el nombre de la clase:
//
// Arrays.sort(numeros);
//
// ============================================================

// Ejemplo

import java.util.Arrays;

public class ClaseArray {

    public static void main(String[] args) {

        int[] numeros = { 40, 10, 30, 20 };

        // Mostrar el array
        System.out.println(Arrays.toString(numeros));

        // Ordenar
        Arrays.sort(numeros);

        System.out.println(Arrays.toString(numeros));

        // Comparar arrays
        int[] otros = { 10, 20, 30, 40 };

        System.out.println(Arrays.equals(numeros, otros)); // true

        // Rellenar un array
        int[] valores = new int[3];

        Arrays.fill(valores, 5);

        System.out.println(Arrays.toString(valores)); // [5, 5, 5]

        // Copiar un array
        int[] copia = Arrays.copyOf(numeros, 6);

        System.out.println(Arrays.toString(copia));

        // Buscar un elemento
        int posicion = Arrays.binarySearch(numeros, 30);

        System.out.println(posicion); // 2
    }
}
