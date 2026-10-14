package com.unai.core.memoria.gestion;

// GARBAGE COLLECTORS

// Son las distintas implementaciones del recolector de basura
// que incluye la JVM. El comportamiento del programa es el mismo
// con cualquiera de ellos: lo que cambia es cómo y cuándo
// recuperan la memoria.
//
// Tipos principales:
//
// Serial
// Un único hilo realiza la recolección. Adecuado para aplicaciones
// pequeñas con poca memoria.
//
// Parallel (Throughput)
// Varios hilos trabajan a la vez para reducir el tiempo total de
// recolección. Prioriza el rendimiento global sobre las pausas.
//
// G1 (Garbage First)
// Recolector por defecto desde Java 9. Divide el heap en regiones
// y trabaja con un objetivo de pausa configurable
// (-XX:MaxGCPauseMillis).
//
// ZGC y Shenandoah
// Diseñados para heaps grandes y pausas muy cortas, del orden de
// milisegundos o menos.
//
// Epsilon
// No recolecta nada. Sirve para pruebas y mediciones.
//
// Se elige el recolector al arrancar la JVM, por ejemplo con
// -XX:+UseG1GC o -XX:+UseZGC. Si no se indica nada, la JVM
// elige uno por defecto según la versión y el hardware.
//
// Cómo se reparten los objetos: los de vida corta predominan
// sobre los de vida larga, y ese es el principio en el que se
// basan los recolectores generacionales, que separan el heap
// en generación joven y generación antigua.

// Ejemplo

public class GarbageCollectors {

    static class Elemento {
        int valor;
    }

    public static void main(String[] args) {

        // Objetos de vida corta: se crean y se descartan dentro
        // del bucle. Son candidatos a la generación joven.
        long suma = 0;

        for (int i = 0; i < 1000; i++) {
            Elemento elemento = new Elemento();
            elemento.valor = i;
            suma += elemento.valor;
        }

        // Objeto de vida larga: se conserva una referencia.
        // Acaba pasando a la generación antigua.
        Elemento permanente = new Elemento();
        permanente.valor = 42;

        // El resultado es idéntico con cualquier recolector.
        // Se puede comprobar ejecutando con otros:
        //
        //     java -XX:+UseSerialGC GarbageCollectors
        //     java -XX:+UseZGC GarbageCollectors
        System.out.println("Suma: " + suma);
        System.out.println("Permanente: " + permanente.valor);
    }
}

// Salida:
// Suma: 499500
// Permanente: 42
