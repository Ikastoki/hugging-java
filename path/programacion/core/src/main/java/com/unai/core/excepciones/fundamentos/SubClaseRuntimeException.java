package com.unai.core.excepciones.fundamentos;

// RuntimeException

// Hereda de Exception.
// Representa excepciones no comprobadas (unchecked).
// No es obligatorio capturarlas con try-catch
// ni declararlas mediante throws.
// Suelen producirse por errores de lógica o datos inesperados.
//
// Algunos ejemplos:
// ArithmeticException: operación aritmética no válida.
// NullPointerException: acceso a una referencia null.
// IllegalArgumentException: argumento no válido.
// IndexOutOfBoundsException: índice fuera de los límites.
//
// Se pueden gestionar con try-catch cuando sea necesario,
// pero es preferible corregir la causa si se trata de un error
// de programación.

// Ejemplo
public class SubClaseRuntimeException {

    public static void main(String[] args) {

        try {
            int numero = Integer.parseInt("hola");

            System.out.println(numero);

        } catch (RuntimeException e) {
            // NumberFormatException hereda de RuntimeException.
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("El programa continúa.");
    }
}

// Salida aproximada:
// Error: For input string: "hola"
// El programa continúa.