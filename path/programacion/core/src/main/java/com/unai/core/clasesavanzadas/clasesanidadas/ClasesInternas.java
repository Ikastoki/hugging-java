package com.unai.core.clasesavanzadas.clasesanidadas;

// Clases internas

// Una clase interna se declara dentro de otra clase.
// No utiliza static en su declaración.
// Puede acceder a los atributos y métodos de la clase externa,
// incluidos los miembros private.
// Para crear un objeto de una clase interna,
// primero se necesita un objeto de la clase externa.

// Ejemplo
public class ClasesInternas {

    private String nombre = "Ana";

    // Clase interna
    class ClaseInterna {

        void mostrarNombre() {
            // Puede acceder al atributo private de la clase externa.
            System.out.println("Nombre: " + nombre);
        }

        void mostrarClaseExterna() {
            // Main.this hace referencia al objeto externo actual.
            System.out.println("Clase externa: " + ClasesInternas.this.nombre);
        }
    }

    public static void main(String[] args) {

        // Crear un objeto de la clase externa.
        ClasesInternas externa = new ClasesInternas();

        // Crear la clase interna asociada a ese objeto externo.
        ClasesInternas.ClaseInterna interna = externa.new ClaseInterna();

        // Invocar métodos de la clase interna.
        interna.mostrarNombre();
        interna.mostrarClaseExterna();
    }
}

// Salida:
// Nombre: Ana
// Clase externa: Ana
