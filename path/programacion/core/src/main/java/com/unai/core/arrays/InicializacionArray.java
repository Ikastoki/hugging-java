package com.unai.core.arrays;

// ============================================================
// INICIALIZACIÓN DE ARRAYS
// ============================================================
//
// Un array puede inicializarse de diferentes formas.
//
// Podemos crear un array indicando su tamaño:
//
// int[] numeros = new int[5];
//
// Esto crea un array con 5 posiciones.
// Los valores reciben automáticamente el valor por defecto
// de su tipo.
//
// Para int:
// 0
//
// Para double:
// 0.0
//
// Para boolean:
// false
//
// Para tipos de referencia:
// null
//
// También podemos crear un array indicando directamente
// sus valores:
//
// int[] numeros = {10, 20, 30, 40};
//
// En este caso, Java determina automáticamente el tamaño
// según el número de elementos.
//
// También podemos crear primero el array y después asignar
// los valores individualmente:
//
// int[] numeros = new int[3];
//
// numeros[0] = 10;
// numeros[1] = 20;
// numeros[2] = 30;
//
// ============================================================

public class InicializacionArray {

    public static void main(String[] args) {

        // Crear un array indicando su tamaño
        int[] numeros = new int[3];

        // Valores iniciales por defecto
        System.out.println(numeros[0]); // 0

        // Asignar valores individualmente
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        // Inicializar directamente con valores
        int[] edades = { 20, 25, 30, 35 };

        System.out.println(numeros[1]); // 20
        System.out.println(edades[2]); // 30
    }
}