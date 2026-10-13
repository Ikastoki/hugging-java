package com.unai.core.excepciones.manejoexcepciones;

// TRY

// Permite encerrar código que puede lanzar una excepción.
// Debe acompañarse de al menos un bloque catch o finally.
// Si ocurre una excepción, se interrumpe la ejecución del try
// y Java busca un catch compatible.
// Si no ocurre ninguna excepción, el bloque se ejecuta normalmente.
// El bloque try no gestiona por sí mismo la excepción.

// Ejemplo

public class Try {
    public static void main(String[] args) {

        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: división entre cero");
        }

        System.out.println("El programa continúa");
    }
}
