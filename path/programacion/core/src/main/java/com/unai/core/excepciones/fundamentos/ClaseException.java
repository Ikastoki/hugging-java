package com.unai.core.excepciones.fundamentos;

// Exception

// Exception hereda de Throwable.
// Representa situaciones que una aplicación puede gestionar.
// Sus subclases se dividen en dos grupos:
//
// Checked exceptions:
// El compilador obliga a capturarlas con try-catch
// o declararlas con throws.
// Ejemplo: IOException.
//
// Unchecked exceptions:
// Son las que heredan de RuntimeException.
// No es obligatorio capturarlas ni declararlas.
// Ejemplo: IllegalArgumentException.
//
// Se pueden utilizar try-catch para gestionar excepciones
// y permitir que el programa continúe.

// Ejemplo completo
public class ClaseException {

    public static void main(String[] args) {

        try {
            // Lanzar una excepción de tipo Exception.
            throw new Exception("Ha ocurrido un problema");

        } catch (Exception e) {
            // Gestionar la excepción.
            System.out.println("Mensaje: " + e.getMessage());
        }

        System.out.println("El programa continúa.");
    }
}

// Salida:
// Mensaje: Ha ocurrido un problema
// El programa continúa.