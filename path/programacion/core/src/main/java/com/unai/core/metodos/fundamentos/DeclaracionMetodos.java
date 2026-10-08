package com.unai.core.metodos.fundamentos;
/*
 * DECLARACIÓN DE MÉTODOS
 *
 * La estructura general de un método es:
 *
 *     modificadores tipoRetorno nombre(parámetros) {
 *         // cuerpo del método
 *     }
 *
 * Una declaración puede contener:
 *
 *     - Modificadores
 *     - Tipo de retorno
 *     - Nombre del método
 *     - Parámetros
 *     - Cuerpo del método
 *
 * Ejemplo:
 *
 *     static int sumar(int a, int b) {
 *         return a + b;
 *     }
 *
 *     static
 *     → modificador.
 *
 *     int
 *     → tipo de retorno.
 *
 *     sumar
 *     → nombre del método.
 *
 *     int a, int b
 *     → parámetros.
 *
 *     { ... }
 *     → cuerpo del método.
 *
 * Si el método no devuelve ningún valor, utilizamos void.
 *
 *     static void saludar() {
 *         System.out.println("Hola");
 *     }
 *
 * Si no necesita parámetros, los paréntesis permanecen vacíos.
 *
 *     static void saludar() {
 *         ...
 *     }
 *
 * Si devuelve un valor, normalmente debe utilizar return
 * con un valor compatible con el tipo de retorno.
 *
 */

public class DeclaracionMetodos {

    // Método sin parámetros y sin valor de retorno

    static void saludar() {
        System.out.println("Hola");
    }

    // Método con parámetros y sin valor de retorno

    static void saludarPersona(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    // Método sin parámetros y con valor de retorno

    static int obtenerNumero() {
        return 10;
    }

    // Método con parámetros y con valor de retorno

    static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        saludar();

        saludarPersona("Ana");

        int numero = obtenerNumero();

        int resultado = sumar(10, 20);

        System.out.println(numero);
        System.out.println(resultado);
    }
}
