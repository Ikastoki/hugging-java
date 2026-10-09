package com.unai.core.poo.fundamentos;

// ============================================================
// CLASES
// ============================================================
//
// Una clase define la estructura y el comportamiento de
// los objetos que se crean a partir de ella.
//
// Una clase puede contener:
//
// - Atributos: representan los datos o el estado.
// - Métodos: representan los comportamientos.
// - Constructores: permiten inicializar los objetos.
//
// La sintaxis básica es:
//
// class NombreClase {
//     // Atributos
//     // Constructores
//     // Métodos
// }
//
// Por convención, los nombres de las clases empiezan
// con mayúscula y utilizan UpperCamelCase.
//
// Por ejemplo: Persona, Coche, CuentaBancaria.
//
// Para crear un objeto se utiliza normalmente new:
//
// Persona persona = new Persona();
//
// Una clase puede definir muchos objetos diferentes.
// Cada objeto tiene su propio estado de instancia.
//
// ============================================================

// Ejemplo

class Persona {

    // Atributos
    String nombre;
    int edad;

    // Método
    void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}

public class Clases {

    public static void main(String[] args) {

        // Crear el primer objeto
        Persona persona1 = new Persona();
        persona1.nombre = "Ana";
        persona1.edad = 25;

        // Crear el segundo objeto
        Persona persona2 = new Persona();
        persona2.nombre = "Luis";
        persona2.edad = 30;

        // Cada objeto tiene sus propios valores
        persona1.saludar(); // Hola, soy Ana
        persona2.saludar(); // Hola, soy Luis
    }
}