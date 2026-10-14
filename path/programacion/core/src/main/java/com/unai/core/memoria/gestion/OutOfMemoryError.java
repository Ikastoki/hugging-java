package com.unai.core.memoria.gestion;

// OUTOFMEMORYERROR

// Es un Error que lanza la JVM cuando no puede obtener más memoria
// para el programa. No es una excepción: representa un problema
// del que el programa rara vez puede recuperarse.
//
// Causas habituales:
//
// - El heap se llena porque la aplicación crea más objetos de los
//   que puede mantener, a menudo por una fuga de memoria.
// - El tamaño máximo del heap (-Xmx) es insuficiente para la
//   carga real de la aplicación.
// - Se intenta crear un array demasiado grande para el heap.
// - La metaspace se llena, normalmente por crear demasiadas
//   clases o muchos class loaders.
// - No se pueden crear hilos nuevos: se agota la memoria nativa.
//
// Un caso especial es el mensaje GC overhead limit exceeded:
// la JVM ha pasado casi todo el tiempo recolectando y recuperando
// muy poca memoria, y decide abandonar.
//
// Cómo actuar:
//
// - Confirmar el tipo de error y el mensaje.
// - Buscar fugas de memoria.
// - Revisar la configuración de memoria de la JVM.
// - Analizar un volcado de heap con herramientas como jmap.
//
// Nota de nombre: en este paquete hay una clase llamada
// OutOfMemoryError, que oculta a java.lang.OutOfMemoryError.
// Por eso el código la referencia por su nombre completo.

// Ejemplo

public class OutOfMemoryError {

    public static void main(String[] args) {

        try {
            // Un array de este tamaño no puede reservarse nunca:
            // supera el número máximo de elementos de un array.
            // La JVM lanza OutOfMemoryError de inmediato.
            byte[] memoria = new byte[Integer.MAX_VALUE];

            System.out.println("No se debería llegar aquí");

        } catch (java.lang.OutOfMemoryError e) {

            // El mensaje concreto depende del caso:
            // "Java heap space" o
            // "Requested array size exceeds VM limit".
            System.out.println("No se puede reservar más memoria");
        }

        System.out.println("El programa continúa, aunque la memoria no basta");
    }
}

// Salida:
// No se puede reservar más memoria
// El programa continúa, aunque la memoria no basta
