package com.unai.core.entradasalida;

/*
 * SYSTEM.OUT
 *
 * System.out representa la salida estándar de Java.
 *
 * System -> clase que proporciona acceso a recursos del sistema.
 *
 * out -> flujo de salida estándar de tipo PrintStream.
 *
 * Los métodos más utilizados son:
 *
 *     print()   -> muestra contenido sin salto de línea.
 *     println() -> muestra contenido y añade un salto de línea.
 *     printf()  -> permite mostrar contenido con formato.
 */

public class SystemOut {

    public static void main(String[] args) {

        // print()
        System.out.print("Hola ");
        System.out.print("Java");

        // println()
        System.out.println();
        System.out.println("Nueva línea");

        // Mostrar variables
        String nombre = "Carlos";
        int edad = 25;

        System.out.println(nombre);
        System.out.println(edad);

        // Concatenar texto y variables
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        // printf() para salida formateada
        System.out.printf("Nombre: %s, Edad: %d%n", nombre, edad);
    }
}