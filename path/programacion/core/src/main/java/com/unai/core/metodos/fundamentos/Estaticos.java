package com.unai.core.metodos.fundamentos;

/*
 * MÉTODOS ESTÁTICOS
 *
 * Un método estático es un método que pertenece a la clase
 * en lugar de pertenecer a una instancia concreta de la clase.
 *
 * Se declara utilizando la palabra clave static:
 *
 *     static tipoRetorno nombreMetodo() {
 *         ...
 *     }
 *
 * Un método static puede invocarse directamente mediante
 * el nombre de la clase:
 *
 *     NombreClase.nombreMetodo();
 *
 * Si estamos dentro de la misma clase, podemos escribir
 * directamente el nombre del método:
 *
 *     nombreMetodo();
 *
 * No necesitamos crear un objeto para utilizar un método
 * estático.
 *
 * Los métodos estáticos pueden acceder directamente
 * a otros miembros estáticos de la clase.
 *
 * Un método estático no puede acceder directamente
 * a miembros de instancia, porque estos pertenecen
 * a objetos concretos.
 *
 * Ejemplo:
 */

class Calculadora {

    static int sumar(int a, int b) {
        return a + b;
    }

    static int multiplicar(int a, int b) {
        return a * b;
    }
}

public class Estaticos {

    static int numero = 10;

    static void mostrarNumero() {
        System.out.println(numero);
    }

    public static void main(String[] args) {

        // Invocación mediante el nombre de la clase

        int resultado = Calculadora.sumar(10, 20);

        System.out.println(resultado);

        // Otro método estático

        int producto = Calculadora.multiplicar(5, 4);

        System.out.println(producto);

        // Desde la misma clase

        mostrarNumero();
    }

}