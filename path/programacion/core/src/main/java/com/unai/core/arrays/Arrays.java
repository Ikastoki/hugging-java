package com.unai.core.arrays;

// ============================================================
// ARRAYS
// ============================================================
//
// Un array es una estructura que permite almacenar varios
// elementos del mismo tipo.
//
// Los elementos de un array:
// - Tienen el mismo tipo.
// - Se almacenan en posiciones consecutivas.
// - Se acceden mediante un índice.
//
// Los índices empiezan siempre en 0.
//
// Por ejemplo:
//
// int[] numeros = {10, 20, 30, 40};
//
// Índices:
//
//  0    1    2    3
//  ↓    ↓    ↓    ↓
// 10   20   30   40
//
// numeros[0] → 10
// numeros[1] → 20
// numeros[3] → 40
//
// Un array tiene una longitud fija.
// Una vez creado, su tamaño no puede cambiar.
//
// ============================================================

// Ejemplo

public class Arrays {

    public static void main(String[] args) {

        int[] numeros = { 10, 20, 30, 40, 50 };

        System.out.println(numeros[0]);
        System.out.println(numeros[2]);
        System.out.println(numeros[4]);
    }
}

/*
 * Resultado:
 * 
 * 10
 * 30
 * 50
 */