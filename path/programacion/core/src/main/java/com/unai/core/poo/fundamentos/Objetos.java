package com.unai.core.poo.fundamentos;

// ============================================================
// OBJETOS
// ============================================================
//
// Un objeto es una instancia creada a partir de una clase.
//
// Cada objeto puede tener:
//
// - Estado: valores almacenados en sus atributos.
// - Comportamiento: acciones que puede realizar mediante
//   sus métodos.
//
// Para crear un objeto normalmente utilizamos new:
//
// Persona persona = new Persona();
//
// Aquí:
// - Persona es el tipo (la clase).
// - persona es la variable de referencia.
// - new Persona() crea una nueva instancia.
//
// Dos objetos de una misma clase tienen estados independientes.
//
// Las variables de referencia permiten acceder a los objetos
// mediante el operador punto:
//
// persona.nombre
// persona.saludar()
//
// ============================================================

// Ejemplo

class Persona {

    String nombre;
    int edad;

    void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}

public class Objetos {

    public static void main(String[] args) {

        // Crear dos objetos
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        // Asignar estado a cada objeto
        persona1.nombre = "Ana";
        persona1.edad = 25;

        persona2.nombre = "Luis";
        persona2.edad = 30;

        // Consultar sus atributos
        System.out.println(persona1.nombre); // Ana
        System.out.println(persona2.nombre); // Luis

        // Invocar sus métodos
        persona1.saludar(); // Hola, soy Ana
        persona2.saludar(); // Hola, soy Luis
    }
}