package com.unai.core.excepciones.manejoexcepciones;

// EXCEPCIONES ENCADENADAS

// Una excepción encadenada contiene otra excepción como causa.
// Se utiliza cuando se captura una excepción y se lanza otra
// para comunicar el error a una capa superior.
// Permite conservar la excepción original y consultar su causa
// mediante getCause().
// El constructor de muchas excepciones permite indicar la causa
// como segundo argumento.
// También se puede establecer la causa con initCause().

// Ejemplo

public class ExcepcionesEncadenadas {

    static void procesarNumero() {
        try {
            int numero = Integer.parseInt("abc");
            System.out.println(numero);

        } catch (NumberFormatException e) {
            throw new IllegalStateException(
                    "No se pudo procesar el número.", e);
        }
    }

    public static void main(String[] args) {
        try {
            procesarNumero();

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            System.out.println("Causa original: " + e.getCause());
        }
    }
}