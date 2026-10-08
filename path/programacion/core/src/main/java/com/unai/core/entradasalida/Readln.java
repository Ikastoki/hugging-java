package com.unai.core.entradasalida;

/*
 * READLN
 *
 * Desde Java 23 existe la clase java.io.IO como API de preview.
 *
 * Proporciona métodos sencillos para trabajar con la consola:
 *
 *     print()
 *     println()
 *     readln()
 *
 * readln() permite mostrar un mensaje y leer una línea de texto
 * desde la consola.
 *
 * Por ejemplo:
 *
 *     String nombre = readln("Nombre: ");
 *
 * En Java 23, las clases implícitamente declaradas pueden utilizar
 * directamente estos métodos sin importar java.io.IO explícitamente.
 *
 * También podemos utilizar IO.readln() de forma explícita.
 *
 * IMPORTANTE:
 *
 * java.io.IO fue introducida en Java 23 como API de preview,
 * por lo que requiere habilitar las funcionalidades de preview.
 */

// Ejemplo práctico con clase implícitamente declarada
// Java 23+

import java.io.*;

public class Readln {
    void main() {

        String nombre = IO.readln(); // Equivalente a Kotlin's readln()
        int edad = IO.readInt(); // Lee directamente un entero
        double precio = IO.readDouble(); // Lee directamente un double
    }
}
