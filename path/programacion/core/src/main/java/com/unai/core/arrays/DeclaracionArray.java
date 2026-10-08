package com.unai.core.arrays;

// ============================================================
// DECLARACIÓN DE ARRAYS
// ============================================================
//
// Para declarar un array se indica:
// - El tipo de los elementos.
// - El nombre de la variable.
// - Los corchetes [].
//
// La forma recomendada es:
//
// tipo[] nombre;
//
// Ejemplos:
//
// int[] numeros;
// String[] nombres;
// double[] precios;
//
// En este momento solamente estamos declarando la variable.
// Todavía no hemos creado el array.
//
// También existe esta sintaxis:
//
// int numeros[];
//
// Es válida en Java, pero normalmente se recomienda:
//
// int[] numeros;
//
// porque deja más claro que "numeros" es un array.
//
// La declaración también puede combinarse con la creación
// del array:
//
// int[] numeros = new int[5];
//
// Esto crea un array capaz de almacenar 5 elementos.
//
// ============================================================

// Ejemplo

public class DeclaracionArray {

    public static void main(String[] args) {

        // Solo declaración
        int[] numeros;

        // Declaración y creación
        String[] nombres = new String[3];

        // Declaración, creación e inicialización
        double[] precios = { 10.5, 20.0, 35.75 };

        System.out.println(precios[0]);
    }
}
