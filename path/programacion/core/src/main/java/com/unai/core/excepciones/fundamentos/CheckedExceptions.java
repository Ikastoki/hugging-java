package com.unai.core.excepciones.fundamentos;

// Checked exceptions

// Son subclases de Exception que no heredan de RuntimeException.
// El compilador comprueba que se gestionen o declaren.
// Se pueden gestionar mediante try-catch.
// También se pueden propagar mediante throws.
//
// Ejemplos:
// IOException: error de entrada/salida.
// SQLException: error al trabajar con bases de datos.
// ClassNotFoundException: no se encuentra una clase.
//
// Si no se capturan ni se declaran, el código no compila.

// Ejemplo
import java.io.IOException;

public class CheckedExceptions {

    // El método declara que puede lanzar IOException.
    static void ejecutarOperacion() throws IOException {
        throw new IOException("Error de entrada/salida");
    }

    public static void main(String[] args) {

        try {
            ejecutarOperacion();

        } catch (IOException e) {
            // Gestionar la excepción comprobada.
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("El programa continúa.");
    }
}

// Salida:
// Error: Error de entrada/salida
// El programa continúa.