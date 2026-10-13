package com.unai.core.excepciones.fundamentos;

// Throwable

// Es la clase base de Error y Exception.
// Los objetos Throwable pueden lanzarse con throw.
// Se pueden capturar mediante catch.
// Proporciona métodos como:
// getMessage(): devuelve el mensaje del error.
// printStackTrace(): muestra información y la pila de llamadas.
// toString(): devuelve una representación textual.

// No se suele utilizar Throwable directamente para gestionar
// errores habituales; normalmente se utiliza una excepción
// más específica.

// Ejemplo
public class ClaseThrowable {

    public static void main(String[] args) {

        try {
            // Crear y lanzar una excepción.
            throw new Throwable("Ha ocurrido un problema");

        } catch (Throwable e) {

            // Obtener el mensaje de la excepción.
            System.out.println("Mensaje: " + e.getMessage());

            // Mostrar su representación textual.
            System.out.println("Excepción: " + e.toString());
        }

        System.out.println("El programa continúa.");
    }
}

// Salida:
// Mensaje: Ha ocurrido un problema
// Excepción: java.lang.Throwable: Ha ocurrido un problema
// El programa continúa.
