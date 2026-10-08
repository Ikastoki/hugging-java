package com.unai.core.entradasalida;

/*
 * SYSTEM.ERR
 *
 * System.err representa la salida de error estándar de Java.
 *
 * Se utiliza normalmente para mostrar:
 *
 *     - Errores
 *     - Advertencias
 *     - Mensajes de diagnóstico
 *
 * Al igual que System.out, proporciona métodos como:
 *
 *     print()
 *     println()
 *     printf()
 *
 * La diferencia principal es:
 *
 *     System.out -> salida normal
 *     System.err -> salida de error
 */

public class SystemErr {

    public static void main(String[] args) {

        // Salida normal
        System.out.println("Programa iniciado");

        // Mensaje de error
        System.err.println("Se ha producido un error");

        // También podemos utilizar variables
        String mensaje = "Archivo no encontrado";

        System.err.println(mensaje);

        // Salida formateada
        int codigo = 404;

        System.err.printf("Error: código %d%n", codigo);
    }
}