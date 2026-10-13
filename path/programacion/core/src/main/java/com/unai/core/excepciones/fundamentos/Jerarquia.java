package com.unai.core.excepciones.fundamentos;

// Jerarquía de excepciones

//La jerarquía de excepciones en Java organiza los errores 
// y las excepciones mediante una estructura de herencia. 
// Todas derivan de Throwable, que tiene dos ramas principales: 
// Error y Exception.

// Throwable
// Es la clase base de los objetos que se pueden lanzar
// mediante throw y capturar mediante catch.
//
// Error
// Representa problemas graves relacionados normalmente
// con la JVM o los recursos del sistema.
// Ejemplo: OutOfMemoryError.
//
// Exception
// Representa situaciones que una aplicación puede gestionar.
//
// RuntimeException
// Es una subclase de Exception.
// Sus excepciones son unchecked: no es obligatorio
// capturarlas ni declararlas con throws.
//
// Checked exceptions
// Son las subclases de Exception que no son RuntimeException.
// Deben capturarse o declararse con throws.

// Jerarquía simplificada:
//
// Object
//   └── Throwable
//       ├── Error
//       │   └── OutOfMemoryError
//       └── Exception
//           ├── IOException          (checked)
//           └── RuntimeException    (unchecked)
//               ├── ArithmeticException
//               ├── NullPointerException
//               └── IllegalArgumentException

import java.io.IOException;

public class Jerarquia {

    public static void main(String[] args) {

        // Ejemplo de RuntimeException.
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Excepción aritmética");
        }

        // Ejemplo de una excepción checked.
        // IOException debe capturarse o declararse con throws.
        try {
            throw new IOException("Error de entrada/salida");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Salida:
// Excepción aritmética
// Error de entrada/salida