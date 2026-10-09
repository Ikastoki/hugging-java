package com.unai.core.modificadores;

// Bloques de inicialización

// Se escriben entre llaves, sin static.
// Se ejecutan cada vez que se crea un objeto.
// Se ejecutan antes del constructor.
// Si hay varios bloques, se ejecutan en orden de aparición.
// Se utilizan para compartir inicialización entre constructores.

// Ejemplo completo
public class BloquesDeInicializacion {

    String nombre;
    int edad;

    // Bloque de inicialización de instancia
    {
        nombre = "Sin nombre";
        edad = 0;

        System.out.println("Se ejecuta el bloque de inicialización");
    }

    // Constructor
    public BloquesDeInicializacion(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

        System.out.println("Se ejecuta el constructor");
    }

    public void mostrarDatos() {
        System.out.println(nombre + " - " + edad);
    }

    public static void main(String[] args) {

        BloquesDeInicializacion persona1 = new BloquesDeInicializacion("Ana", 25);
        persona1.mostrarDatos();

        BloquesDeInicializacion persona2 = new BloquesDeInicializacion("Luis", 30);
        persona2.mostrarDatos();
    }
}

// Salida:
// Se ejecuta el bloque de inicialización
// Se ejecuta el constructor
// Ana - 25
// Se ejecuta el bloque de inicialización
// Se ejecuta el constructor
// Luis - 30
