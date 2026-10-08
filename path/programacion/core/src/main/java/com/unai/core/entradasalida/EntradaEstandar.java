package com.unai.core.entradasalida;

/*
 * ENTRADA ESTÁNDAR
 *
 * La entrada estándar es el canal utilizado por un programa
 * para recibir datos, normalmente desde el teclado.
 *
 * En Java se representa mediante:
 *
 *     System.in
 *
 * System.in es un flujo de entrada de datos.
 *
 * Para leer datos de forma sencilla podemos utilizar Scanner,
 * que veremos en el siguiente tema.
 *
 * La idea básica es:
 *
 *     teclado -> System.in -> programa
 */

import java.util.Scanner;

public class EntradaEstandar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");

        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre);

        scanner.close();
    }
}