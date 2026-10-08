package com.unai.core.entradasalida;

/*
 * FORMATEO DE SALIDA
 *
 * Permite controlar el formato con el que se muestran
 * los datos en la consola.
 *
 * Se utiliza principalmente:
 *
 *     System.out.printf()
 *
 * Algunos especificadores habituales:
 *
 *     %s   -> String
 *     %d   -> número entero
 *     %f   -> número decimal
 *     %.2f -> decimal con 2 cifras
 *     %c   -> carácter
 *     %b   -> boolean
 *     %n   -> salto de línea
 *
 * Los valores se colocan después de la cadena de formato.
 */

public class FormateoSalida {

    public static void main(String[] args) {

        String nombre = "Ana";
        int edad = 25;
        double altura = 1.68;
        boolean activo = true;

        // Texto
        System.out.printf("Nombre: %s%n", nombre);

        // Entero
        System.out.printf("Edad: %d%n", edad);

        // Decimal
        System.out.printf("Altura: %f%n", altura);

        // Decimal con 2 cifras
        System.out.printf("Altura: %.2f%n", altura);

        // Boolean
        System.out.printf("Activo: %b%n", activo);

        // Varios valores
        System.out.printf(
                "Nombre: %s, Edad: %d, Altura: %.2f%n",
                nombre,
                edad,
                altura);
    }
}
