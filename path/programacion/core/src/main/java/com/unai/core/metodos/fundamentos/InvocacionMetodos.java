package com.unai.core.metodos.fundamentos;

/*
 * INVOCACIÓN DE MÉTODOS
 *
 * Invocar un método significa llamar al método para que
 * Java ejecute las instrucciones que contiene.
 *
 * La forma básica es:
 *
 *     nombreMetodo();
 *
 * Si el método necesita argumentos:
 *
 *     nombreMetodo(argumento1, argumento2);
 *
 * Si devuelve un valor, podemos guardar el resultado:
 *
 *     int resultado = nombreMetodo();
 *
 * Un método puede invocar a otro método.
 *
 * Cuando Java encuentra una llamada a un método:
 *
 *     1. Se detiene temporalmente el código actual.
 *     2. Ejecuta el método llamado.
 *     3. Si existe un valor de retorno, lo devuelve.
 *     4. Continúa la ejecución desde el punto de la llamada.
 *
 */

public class InvocacionMetodos {

    // Método sin parámetros y sin retorno

    static void saludar() {
        System.out.println("Hola");
    }

    // Método con parámetros y sin retorno

    static void saludarPersona(String nombre) {
        System.out.println("Hola, " + nombre);
    }

    // Método con parámetros y retorno

    static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Invocación de un método sin parámetros

        saludar();

        // Invocación pasando un argumento

        saludarPersona("Ana");

        // Invocación pasando dos argumentos

        int resultado = sumar(10, 20);

        System.out.println(resultado);

        // También podemos utilizar el resultado
        // directamente en una expresión

        System.out.println(sumar(5, 3));
    }
}