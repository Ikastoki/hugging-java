package com.unai.core.metodos.fundamentos;

/*
 * QUÉ ES UN MÉTODO
 *
 * Un método es un bloque de código que agrupa instrucciones
 * para realizar una tarea concreta.
 *
 * Un método puede:
 *
 *     - Recibir datos mediante parámetros.
 *     - Ejecutar instrucciones.
 *     - Devolver un resultado.
 *     - No devolver ningún resultado.
 *
 * La estructura general es:
 *
 *     modificadores tipoRetorno nombre(parámetros) {
 *         // código
 *         return valor;
 *     }
 *
 * Por ejemplo:
 *
 *     static int sumar(int a, int b) {
 *         return a + b;
 *     }
 *
 * Aquí:
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
 *     return a + b
 *     → valor que devuelve.
 *
 * Un método se ejecuta cuando es invocado.
 *
 */

public class Metodos {

    public static void main(String[] args) {

        // Invocamos el método

        int resultado = sumar(10, 20);

        System.out.println(resultado);

        saludar();
    }

    // Método que recibe parámetros y devuelve un valor

    static int sumar(int a, int b) {

        return a + b;
    }

    // Método que no recibe parámetros ni devuelve un valor

    static void saludar() {

        System.out.println("Hola");
    }
}