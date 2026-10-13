package com.unai.core.excepciones.personalizadas;

// UNCHECKED EXCEPTIONS PERSONALIZADAS

// Son excepciones creadas por el programador que heredan de RuntimeException.
// El compilador no obliga a capturarlas con try-catch ni a declararlas con throws.
// Se utilizan habitualmente para representar errores de programación,
// argumentos no válidos o estados incorrectos.
// Se lanzan explícitamente mediante throw.
// Pueden incluir un constructor que pase el mensaje a super().

// Ejemplo

class EdadNoValidaException extends RuntimeException {

    public EdadNoValidaException(String mensaje) {
        super(mensaje);
    }
}

public class UncheckedExceptionsPersonalizada {

    static void comprobarEdad(int edad) {
        if (edad < 18) {
            throw new EdadNoValidaException(
                    "La edad debe ser de al menos 18 años.");
        }

        System.out.println("Edad válida.");
    }

    public static void main(String[] args) {
        comprobarEdad(16);
    }
}