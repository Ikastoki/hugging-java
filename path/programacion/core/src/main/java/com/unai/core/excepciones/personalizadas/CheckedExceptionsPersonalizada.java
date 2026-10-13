package com.unai.core.excepciones.personalizadas;

// CHECKED EXCEPTIONS PERSONALIZADAS

// Son excepciones creadas por el programador que heredan de Exception,
// pero no directamente de RuntimeException.
// El compilador obliga a capturarlas con try-catch o declararlas
// con throws en los métodos que puedan propagarlas.
// Se utilizan para representar situaciones de error recuperables
// que el código que llama al método debe tener en cuenta.
// Se lanzan explícitamente mediante throw.
// Suelen incluir un constructor que pasa el mensaje a super().

// Ejemplo

class EdadNoValidaException extends Exception {

    public EdadNoValidaException(String mensaje) {
        super(mensaje);
    }
}

public class CheckedExceptionsPersonalizada {

    static void comprobarEdad(int edad) throws EdadNoValidaException {
        if (edad < 18) {
            throw new EdadNoValidaException(
                    "La edad debe ser de al menos 18 años.");
        }

        System.out.println("Edad válida.");
    }

    public static void main(String[] args) {
        try {
            comprobarEdad(16);
        } catch (EdadNoValidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
