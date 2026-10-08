package com.unai.core.metodos.sobrecarga;

/*
 * RESOLUCIÓN DE MÉTODOS
 *
 * Cuando invocamos un método, Java debe determinar
 * qué versión del método corresponde a esa llamada.
 *
 * Esto es especialmente importante cuando existe
 * sobrecarga de métodos.
 *
 * Ejemplo:
 *
 *     sumar(10, 20)
 *
 * Si existen:
 *
 *     sumar(int, int)
 *     sumar(double, double)
 *
 * Java debe decidir cuál utilizar.
 *
 * Para resolver la llamada, el compilador tiene en cuenta
 * principalmente:
 *
 *     - Nombre del método.
 *     - Número de argumentos.
 *     - Tipos de los argumentos.
 *     - Compatibilidad entre argumentos y parámetros.
 *
 * Java intenta encontrar la coincidencia más adecuada.
 *
 * Primero se favorece una coincidencia directa de tipos.
 *
 * Si no existe, pueden entrar en juego conversiones permitidas,
 * como algunas conversiones implícitas.
 *
 */

class Calculadora {

    static void mostrar(int numero) {
        System.out.println("int");
    }

    static void mostrar(double numero) {
        System.out.println("double");
    }

    static void mostrar(String texto) {
        System.out.println("String");
    }
}

public class Resolucion {

    public static void main(String[] args) {

        // El argumento es int
        // Se selecciona mostrar(int)

        Calculadora.mostrar(10);

        // El argumento es double
        // Se selecciona mostrar(double)

        Calculadora.mostrar(10.5);

        // El argumento es String
        // Se selecciona mostrar(String)

        Calculadora.mostrar("Hola");

        // Una variable también determina el tipo
        // que se utiliza para resolver la llamada

        int numero = 20;

        Calculadora.mostrar(numero);
    }
}
