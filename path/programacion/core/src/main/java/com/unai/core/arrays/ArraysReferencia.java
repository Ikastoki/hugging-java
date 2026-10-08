package com.unai.core.arrays;

// ============================================================
// ARRAYS DE TIPOS DE REFERENCIA
// ============================================================
//
// Un array de tipos de referencia almacena referencias a objetos.
//
// Algunos ejemplos de tipos de referencia:
//
// - String
// - Integer
// - Persona
// - Scanner
// - Cualquier clase
//
// Por ejemplo:
//
// String[] nombres = {"Ana", "Luis", "Marta"};
//
// Cada posición contiene una referencia a un objeto String.
//
// A diferencia de un array de tipos primitivos, un array de
// referencias puede contener null.
//
// Si creamos un array de referencias sin inicializar sus
// elementos, todas las posiciones empiezan siendo null.
//
// String[] nombres = new String[3];
//
// nombres[0] → null
// nombres[1] → null
// nombres[2] → null
//
// Crear el array no crea automáticamente los objetos.
//
// También podemos crear objetos y guardar sus referencias:
//
// Persona[] personas = new Persona[2];
//
// personas[0] = new Persona("Ana");
// personas[1] = new Persona("Luis");
//
// ============================================================

// Ejemplo

public class ArraysReferencia {

    public static void main(String[] args) {

        // Array de referencias a String
        String[] nombres = new String[3];

        // Inicialmente contienen null
        System.out.println(nombres[0]); // null

        // Guardamos referencias a objetos String
        nombres[0] = "Ana";
        nombres[1] = "Luis";
        nombres[2] = "Marta";

        System.out.println(nombres[0]); // Ana
        System.out.println(nombres[1]); // Luis
        System.out.println(nombres[2]); // Marta

        // Array de referencias a Integer
        Integer[] numeros = new Integer[3];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = null;

        System.out.println(numeros[0]); // 10
        System.out.println(numeros[2]); // null
    }
}