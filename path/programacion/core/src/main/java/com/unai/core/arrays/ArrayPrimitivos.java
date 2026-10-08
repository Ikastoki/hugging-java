package com.unai.core.arrays;

// ============================================================
// ARRAYS DE TIPOS PRIMITIVOS
// ============================================================
//
// Un array puede almacenar valores de cualquier tipo primitivo
// de Java:
//
// - byte
// - short
// - int
// - long
// - float
// - double
// - char
// - boolean
//
// Por ejemplo:
//
// int[] numeros = {10, 20, 30};
//
// Cada posición contiene directamente un valor int.
//
// numeros[0] → 10
// numeros[1] → 20
// numeros[2] → 30
//
// Si creamos un array de un tipo primitivo sin proporcionar
// valores, cada elemento recibe el valor por defecto:
//
// int    → 0
// double → 0.0
// boolean → false
// char   → '\u0000'
//
// Los arrays de tipos primitivos tienen tamaño fijo una vez
// creados.
//
// ============================================================

public class ArrayPrimitivos {

    public static void main(String[] args) {

        int[] edades = { 20, 25, 30 };

        double[] precios = { 10.5, 20.75, 30.0 };

        boolean[] resultados = { true, false, true };

        char[] letras = { 'A', 'B', 'C' };

        // Acceder a los elementos
        System.out.println(edades[0]); // 20
        System.out.println(precios[1]); // 20.75
        System.out.println(resultados[2]); // true
        System.out.println(letras[0]); // A

        // Array de int creado sin valores
        int[] numeros = new int[3];

        System.out.println(numeros[0]); // 0
        System.out.println(numeros[1]); // 0
        System.out.println(numeros[2]); // 0
    }
}