package com.unai.core.entradasalida;

/*
 * SYSTEM.CONSOLE
 *
 * System.console() devuelve un objeto Console que permite
 * interactuar directamente con la consola.
 *
 * Se obtiene mediante:
 *
 *     System.console()
 *
 * Si el programa no se está ejecutando desde una consola real,
 * puede devolver null.
 *
 * Algunos métodos importantes de Console son:
 *
 *     readLine()       -> lee una línea de texto.
 *     readPassword()   -> lee una contraseña sin mostrarla.
 *     printf()         -> muestra texto con formato.
 *
 * System.console() es diferente de Scanner:
 *
 *     Scanner -> herramienta general para leer datos.
 *     Console -> interacción específica con una consola.
 */

import java.io.Console;

public class SystemConsole {

    public static void main(String[] args) {

        Console console = System.console();

        if (console != null) {

            // Leer texto
            String nombre = console.readLine("Nombre: ");

            // Leer una contraseña sin mostrarla
            char[] password = console.readPassword("Contraseña: ");

            console.printf("Hola, %s%n", nombre);

        } else {

            System.out.println("No hay una consola disponible.");
        }
    }
}
