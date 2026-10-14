package com.unai.core.jvm.arquitectura;

// RUNTIME DATA AREAS

// Son las regiones de memoria que la JVM utiliza durante la
// ejecución. Están definidas en la especificación de la JVM.
//
// Compartidas por todos los hilos:
//
// Heap
// Donde viven los objetos y los arrays. Se crea al arrancar la
// JVM y crece según necesidad. Si se llena, OutOfMemoryError.
//
// Method area (Metaspace)
// Guarda la definición de las clases cargadas: estructura de la
// clase, constantes, datos de los métodos y el objeto Class.
//
// Propias de cada hilo:
//
// JVM stack (pila)
// Una pila por hilo, con un marco por cada método en curso.
// Si se desborda, StackOverflowError.
//
// PC register (contador de programa)
// Una sola celda por hilo que guarda la dirección de la
// instrucción que se está ejecutando.
//
// Native method stack
// La pila que utilizan los métodos escritos en lenguajes nativos,
// invocados mediante JNI.
//
// Además, la JVM gestiona estructuras internas como el runtime
// constant pool de cada clase, con las referencias simbólicas
// que usan las instrucciones del bytecode.
//
// El bloque de modelo de memoria describía estas regiones desde
// el punto de vista del programa; aquí se ven como partes de la
// arquitectura de la JVM.

// Ejemplo

public class RuntimeDataAreas {

    static class Dato {
        int valor;
    }

    public static void main(String[] args) {

        // El nombre del hilo actual. main es el hilo principal.
        // Thread se estudiará en el bloque de concurrencia.
        String hilo = Thread.currentThread().getName();

        System.out.println("Hilo: " + hilo);

        // Este objeto vive en el heap, compartido por todos los
        // hilos.
        Dato dato = new Dato();
        dato.valor = 10;

        // Este contador de programa apunta ahora a la instrucción
        // en curso de este método.
        System.out.println("Heap compartido: " + dato.valor);

        // La pila de este hilo guarda sus marcos; el contador de
        // programa avanza instrucción a instrucción dentro del
        // marco actual.
        int resultado = doblar(dato.valor);

        System.out.println("Pila del hilo main: " + resultado);
    }

    static int doblar(int valor) {
        return valor * 2;
    }
}

// Salida:
// Hilo: main
// Heap compartido: 10
// Pila del hilo main: 20
