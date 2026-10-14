package com.unai.core.memoria.modelo;

// MODELO DE MEMORIA DE JAVA

// Cuando se ejecuta un programa Java, la JVM organiza la memoria
// en varias regiones. Las principales son la pila (stack), el
// montón (heap) y la metaspace.
//
// PILA (STACK)
//
// Cada hilo de ejecución tiene su propia pila, creada al iniciarse
// el hilo y destruida cuando termina.
// Al invocar un método, la JVM crea un marco de pila (stack frame)
// que contiene las variables locales del método y sus parámetros.
// Cuando el método termina, su marco se elimina.
// Las variables primitivas se guardan completas en la pila.
// También se guardan en la pila las referencias a objetos,
// pero no los objetos en sí.
// El acceso a la pila es muy rápido.
// Si una pila crece demasiado, por ejemplo por recursión sin fin,
// se lanza StackOverflowError.
//
// HEAP (MONTÓN)
//
// Es un área compartida por todos los hilos.
// En el heap se crean los objetos y los arrays, mediante new.
// Las referencias que apuntan a ellos viven en la pila.
// El heap se crea al arrancar la JVM y se gestiona de forma
// automática: los objetos que dejan de utilizarse se recuperan.
// Si no queda espacio disponible, se lanza OutOfMemoryError.
//
// METASPACE
//
// Almacena la información de las clases cargadas: estructura de la
// clase, métodos, atributos y los propios objetos Class.
// Desde Java 8 reside en memoria nativa del sistema, no en el heap.
//
// Esquema simplificado:
//
//     Pila del hilo            Heap                 Metaspace
//     ----------------   -----------------    -------------------
//     marco de main()    [ objeto Persona ]    clase Persona
//       referencia ----> [  nombre: "Ana" ]    métodos y atributos
//       primitivos       [ objeto Persona ]    objeto Class
//
// Este tema describe dónde se aloja cada dato durante la ejecución.
// No debe confundirse con el modelo de memoria del lenguaje
// (Java Memory Model), que define las reglas de visibilidad entre
// hilos y pertenece a la programación concurrente.

// Ejemplo

public class ModeloDeMemoria {

    static class Persona {

        // Atributo de instancia: forma parte del objeto
        // y vive en el heap.
        String nombre;
    }

    // El parámetro y las variables locales viven en el marco de
    // pila que la JVM crea al invocar este método.
    static void mostrar(Persona persona) {
        System.out.println("Nombre: " + persona.nombre);
    }

    // Recibe una copia del valor de la referencia.
    // La modificación afecta a su propio marco de pila.
    static void cambiarNombre(Persona persona) {
        persona.nombre = "Ana";
    }

    public static void main(String[] args) {

        // new crea el objeto en el heap.
        // persona es una referencia que se guarda en la pila de main.
        Persona persona = new Persona();
        persona.nombre = "Ana";

        // Otra referencia en la pila apuntando al mismo objeto del heap.
        Persona otraReferencia = persona;

        // El objeto no se copia: al modificarlo a través de una
        // referencia, el cambio se ve desde la otra.
        cambiarNombre(otraReferencia);
        System.out.println("Nombre: " + persona.nombre);

        // Cada invocación crea su propio marco con sus variables.
        mostrar(persona);

        // Las copias de valores primitivas son independientes
        // en cada marco de pila.
        int edad = 25;
        cambiarEdad(edad);

        // La variable de main conserva su valor original.
        System.out.println("Edad: " + edad);
    }

    static void cambiarEdad(int edad) {
        edad = 30;
    }
}

// Salida:
// Nombre: Ana
// Nombre: Ana
// Edad: 25
