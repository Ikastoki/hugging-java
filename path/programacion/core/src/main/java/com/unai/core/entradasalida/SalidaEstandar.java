package com.unai.core.entradasalida;

/*
 * SALIDA ESTÁNDAR
 *
 * La salida estándar es el canal utilizado por un programa
 * para mostrar información normalmente en la consola.
 *
 * En Java se accede mediante:
 *
 *     System.out
 *
 * Los métodos más utilizados son:
 *
 *     println()  -> muestra el contenido y añade un salto de línea.
 *     print()    -> muestra el contenido sin salto de línea.
 *
 *     System.out.println("Hola");
 *     System.out.print("Hola");
 *
 * La salida estándar se utiliza para mostrar información,
 * resultados o mensajes al usuario.
 */

public class SalidaEstandar {

    public static void main(String[] args) {

        // Muestra un mensaje y salta a la siguiente línea
        System.out.println("Hola Java");

        // Muestra un mensaje sin salto de línea
        System.out.print("Hola ");
        System.out.print("Java");

        // También podemos mostrar variables
        int edad = 25;

        System.out.println();
        System.out.println(edad);

        // Podemos combinar texto y valores
        System.out.println("Edad: " + edad);
    }
}