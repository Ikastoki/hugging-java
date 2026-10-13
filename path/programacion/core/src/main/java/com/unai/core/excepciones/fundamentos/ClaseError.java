package com.unai.core.excepciones.fundamentos;

// Error

// Error hereda de Throwable.
// Representa problemas graves durante la ejecución.
// No es una subclase de Exception.
// Generalmente, no está pensado para gestionarse
// como los errores habituales de una aplicación.
//
// Algunos ejemplos:
// OutOfMemoryError: la JVM no puede asignar más memoria.
// StackOverflowError: la pila de llamadas se desborda.
// NoClassDefFoundError: no se encuentra una clase
// que estaba disponible cuando se compiló el programa.
//
// No se deben provocar estos errores deliberadamente
// en aplicaciones normales.

// Ejemplo ilustrativo de la jerarquía
public class ClaseError {

    public static void main(String[] args) {

        try {
            // Ejemplo de un error grave de la JVM:
            // Error error = new OutOfMemoryError("Memoria agotada");
            // throw error;

            System.out.println("Ejecución normal");
        } catch (Exception e) {
            // Este catch no captura objetos de tipo Error,
            // porque Error no hereda de Exception.
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}

// Salida:
// Ejecución normal