package com.unai.core.metodos.fundamentos;

/*
 * PARÁMETROS
 *
 * Un parámetro es una variable que aparece en la declaración
 * de un método y que recibe un valor cuando el método
 * es invocado.
 *
 * Ejemplo:
 *
 *     static int sumar(int a, int b) {
 *         return a + b;
 *     }
 *
 *     a y b
 *     → son parámetros.
 *
 * Cuando invocamos:
 *
 *     sumar(10, 20);
 *
 *     10 y 20
 *     → son los argumentos que reciben los parámetros.
 *
 * Un método puede tener:
 *
 *     - Ningún parámetro.
 *     - Un parámetro.
 *     - Varios parámetros.
 *
 * Cada parámetro tiene un tipo y un nombre:
 *
 *     String nombre
 *     int edad
 *     double precio
 *
 * Los parámetros solo existen dentro del método
 * en el que han sido declarados.
 *
 * Podemos utilizar los parámetros como cualquier otra
 * variable dentro del método.
 *
 */

public class Parametros {

    // Sin parámetros

    static void saludar() {
        System.out.println("Hola");
    }

    // Un parámetro

    static void saludarPersona(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    // Varios parámetros

    static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    // Parámetros de diferentes tipos

    static void mostrarDatos(String nombre, int edad, double altura) {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
    }

    public static void main(String[] args) {

        saludar();

        saludarPersona("Ana");

        int resultado = sumar(10, 20);

        System.out.println(resultado);

        mostrarDatos("Luis", 25, 1.80);
    }
}
