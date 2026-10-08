package com.unai.core.metodos.fundamentos;

/*
 * ARGUMENTOS
 *
 * Un argumento es el valor que proporcionamos a un método
 * cuando lo invocamos.
 *
 * Ejemplo:
 *
 *     static int sumar(int a, int b) {
 *         return a + b;
 *     }
 *
 *     int resultado = sumar(10, 20);
 *
 * En este caso:
 *
 *     a y b
 *     → son parámetros.
 *
 *     10 y 20
 *     → son argumentos.
 *
 * Los argumentos se asignan a los parámetros
 * correspondientes según su posición.
 *
 *     sumar(10, 20)
 *
 *     a = 10
 *     b = 20
 *
 * El tipo de los argumentos debe ser compatible
 * con el tipo de los parámetros.
 *
 * También podemos pasar variables como argumentos.
 *
 */

public class Argumentos {

    static int sumar(int a, int b) {
        return a + b;
    }

    static void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    static void mostrarDatos(String nombre, int edad) {
        System.out.println(
                nombre + " tiene " + edad + " años.");
    }

    public static void main(String[] args) {

        // Valores literales como argumentos

        int resultado = sumar(10, 20);

        System.out.println(resultado);

        // Variables como argumentos

        int numero1 = 5;
        int numero2 = 8;

        int suma = sumar(numero1, numero2);

        System.out.println(suma);

        // Una expresión también puede ser un argumento

        int total = sumar(10 + 5, 20 * 2);

        System.out.println(total);

        // Argumento String

        saludar("Ana");

        // Varios argumentos

        String nombre = "Luis";
        int edad = 25;

        mostrarDatos(nombre, edad);
    }
}