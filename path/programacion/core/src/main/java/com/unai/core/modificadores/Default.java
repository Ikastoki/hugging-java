package com.unai.core.modificadores;

// default

// Si no se indica public, protected ni private,
// el acceso es de tipo default (package-private).
// Solo se permite el acceso desde el mismo paquete.

// Archivo: Persona.java

class Persona {

    // Atributo con acceso default
    String nombre = "Ana";

    // Método con acceso default
    void saludar() {
        System.out.println("Hola, " + nombre);
    }
}

// Archivo: Main.java
// Ambos archivos deben pertenecer al mismo paquete.

class Default {

    public static void main(String[] args) {

        Persona persona = new Persona();

        // Se puede acceder porque ambas clases
        // pertenecen al mismo paquete.
        System.out.println(persona.nombre);

        persona.saludar();
    }
}

// Desde una clase de otro paquete no se podría acceder
// directamente a nombre ni invocar saludar().

// Importante:
// default también puede referirse a una implementación
// de método en una interfaz, pero es un uso diferente.