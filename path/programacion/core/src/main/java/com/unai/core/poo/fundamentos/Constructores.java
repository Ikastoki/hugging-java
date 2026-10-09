package com.unai.core.poo.fundamentos;

// ============================================================
// CONSTRUCTORES
// ============================================================
//
// Un constructor permite inicializar un objeto cuando se crea
// mediante la palabra reservada new.
//
// Características:
// - Tiene el mismo nombre que la clase.
// - No tiene tipo de retorno, ni siquiera void.
// - Se ejecuta al crear una instancia.
// - Puede recibir parámetros.
// - Puede haber varios constructores con diferentes parámetros
//   (sobrecarga de constructores).
//
// Si no declaramos ningún constructor, Java proporciona
// un constructor por defecto sin parámetros.
//
// Si declaramos cualquier constructor, Java ya no proporciona
// automáticamente ese constructor sin parámetros.
//
// ============================================================

// Ejemplo

class Persona {

    String nombre;
    int edad;

    // Constructor sin parámetros declarado explícitamente
    Persona() {
        nombre = "Sin nombre";
        edad = 0;
    }

    // Constructor con parámetros
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public class Constructores {

    public static void main(String[] args) {

        // Invoca el constructor sin parámetros
        Persona persona1 = new Persona();

        // Invoca el constructor con parámetros
        Persona persona2 = new Persona("Ana", 25);

        System.out.println(persona1.nombre); // Sin nombre
        System.out.println(persona1.edad); // 0

        System.out.println(persona2.nombre); // Ana
        System.out.println(persona2.edad); // 25
    }
}