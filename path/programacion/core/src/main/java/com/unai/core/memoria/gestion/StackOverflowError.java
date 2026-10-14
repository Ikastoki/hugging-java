package com.unai.core.memoria.gestion;

// STACKOVERFLOWERROR

// Es un Error que lanza la JVM cuando la pila de un hilo no puede
// crecer más. Cada llamada a un método añade un marco, y si se
// supera el tamaño máximo de la pila, se lanza este Error.
//
// La causa más frecuente es una recursión sin condición de parada,
// o una recursión demasiado profunda para el tamaño asignado.
//
// El tamaño de la pila de cada hilo se configura con -Xss.
// Un tamaño pequeño permite menos profundidad de llamadas; un
// tamaño grande consume más memoria nativa por hilo.
//
// StackOverflowError no debe confundirse con OutOfMemoryError:
//
// - StackOverflowError: no cabe un marco más en la pila de un hilo.
// - OutOfMemoryError: no hay memoria para objetos, arrays u otras
//   estructuras.
//
// Es técnicamente posible capturarlo, pero no es una práctica
// recomendable en producción: el estado del programa puede ser
// inconsistente. La solución es corregir la recursión.
//
// Nota de nombre: en este paquete hay una clase llamada
// StackOverflowError, que oculta a java.lang.StackOverflowError.
// Por eso el código la referencia por su nombre completo.

// Ejemplo

public class StackOverflowError {

    // Recursión sin condición de parada.
    static void sinFin(int nivel) {
        sinFin(nivel + 1);
    }

    public static void main(String[] args) {

        try {
            sinFin(0);

            System.out.println("No se debería llegar aquí");

        } catch (java.lang.StackOverflowError e) {
            System.out.println("La pila del hilo se ha desbordado");
        }

        System.out.println("El ejemplo termina tras capturar el Error");
    }
}

// Salida:
// La pila del hilo se ha desbordado
// El ejemplo termina tras capturar el Error
