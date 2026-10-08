package com.unai.core.entradasalida;
/*
 * SCANNER
 *
 * Scanner es una clase de Java que permite leer datos
 * procedentes de una entrada.
 *
 * Para utilizarla debemos importarla:
 *
 *     import java.util.Scanner;
 *
 * Para leer desde el teclado utilizamos:
 *
 *     new Scanner(System.in)
 *
 * Algunos métodos habituales:
 *
 *     nextLine() -> lee una línea completa de texto.
 *     next()    -> lee una palabra.
 *     nextInt() -> lee un entero.
 *     nextDouble() -> lee un decimal.
 *
 * Cuando terminamos de utilizar Scanner podemos cerrarlo
 * mediante close().
 */

import java.util.Scanner;

public class ClaseScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Leer texto
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        // Leer un entero
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        // Leer un decimal
        System.out.print("Introduce tu altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);

        scanner.close();
    }
}