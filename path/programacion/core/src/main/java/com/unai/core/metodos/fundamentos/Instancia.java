package com.unai.core.metodos.fundamentos;

/*
 * MÉTODOS DE INSTANCIA
 *
 * Un método de instancia es un método que pertenece
 * a un objeto concreto de una clase.
 *
 * A diferencia de un método estático, un método de instancia
 * NO utiliza static.
 *
 * Ejemplo:
 *
 *     class Persona {
 *
 *         void saludar() {
 *             System.out.println("Hola");
 *         }
 *     }
 *
 * Para utilizar el método necesitamos crear un objeto:
 *
 *     Persona persona = new Persona();
 *
 * Y después invocarlo sobre ese objeto:
 *
 *     persona.saludar();
 *
 * Cada objeto puede tener sus propios datos de instancia.
 *
 * Un método de instancia puede acceder directamente
 * a esos datos.
 *
 */

class Persona {

    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }

    void saludar() {
        System.out.println("Hola, soy " + nombre);
    }

    void cambiarNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
}

public class Instancia {

    public static void main(String[] args) {

        // Creamos dos objetos diferentes

        Persona persona1 = new Persona("Ana");
        Persona persona2 = new Persona("Luis");

        // Cada objeto invoca su propio método

        persona1.saludar();

        persona2.saludar();

        // Modificamos el estado de un objeto

        persona1.cambiarNombre("Marta");

        persona1.saludar();
        persona2.saludar();
    }
}