package com.unai.core.excepciones.manejoexcepciones;

// THROW Y THROWS

// THROW

// Lanza una excepción de forma explícita.
// Se utiliza dentro de un método o bloque de código.
// Recibe un objeto de excepción.
// La ejecución continúa buscando un bloque catch compatible
// o propagando la excepción si no se captura.

// THROWS

// Se declara en la firma de un método.
// Indica las excepciones que el método puede propagar.
// No lanza la excepción por sí mismo.
// Con excepciones checked, permite declarar que el método
// delega su gestión al código que lo invoca.
// Las excepciones unchecked no necesitan declararse con throws.

// Ejemplo

public class ThrowThrows {

    static void comprobarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("Debes ser mayor de edad.");
        }
        System.out.println("Acceso permitido.");
    }

    static void dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("División entre cero.");
        }
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        try {
            comprobarEdad(16);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            dividir(10, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}