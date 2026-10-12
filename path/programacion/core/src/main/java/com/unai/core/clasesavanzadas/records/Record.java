package com.unai.core.clasesavanzadas.records;

// Record

// Se declara con la palabra clave record.
// Los componentes se indican entre paréntesis.
// Java genera automáticamente:
// - Un atributo private final por cada componente.
// - Un constructor canónico.
// - Un método de acceso por componente, con el nombre del componente.
// - equals() y hashCode().
// - toString().
//
// Los componentes no se pueden reasignar después de construir el record.
// Un record no puede extender otra clase, pero sí puede implementar interfaces.
// No se pueden declarar atributos de instancia adicionales.
// Puede contener métodos, constructores y atributos static.

// Ejemplo completo
public class Record {

    // Declaración de un record.
    record Persona(String nombre, int edad) {

        // Método propio del record.
        public void mostrarDatos() {
            System.out.println(nombre + " tiene " + edad + " años.");
        }
    }

    public static void main(String[] args) {

        // Crear un objeto del record.
        Persona persona = new Persona("Ana", 25);

        // Acceder a los componentes mediante sus métodos de acceso.
        System.out.println(persona.nombre());
        System.out.println(persona.edad());

        // Invocar un método propio.
        persona.mostrarDatos();

        // Métodos generados automáticamente.
        System.out.println(persona);
    }
}

// Salida:
// Ana
// 25
// Ana tiene 25 años.
// Persona[nombre=Ana, edad=25]
// ---------------------------------

/*
 * ¿Cuándo utilizar cada uno?
 * 
 * record: DTOs, respuestas de una API, datos de configuración y objetos que
 * representan datos.
 * 
 * Clase tradicional: entidades con identidad propia, atributos modificables,
 * herencia de otra clase o necesidades específicas de encapsulación y
 * comportamiento.
 * 
 * Una precisión: record no significa que todos los objetos sean profundamente
 * inmutables. Sus componentes son finales, pero si uno contiene una lista
 * mutable, por ejemplo, esa lista todavía podría modificarse.
 */