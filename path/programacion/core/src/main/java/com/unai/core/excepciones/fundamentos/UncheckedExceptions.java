package com.unai.core.excepciones.fundamentos;

// Unchecked exceptions

// Son excepciones que heredan de RuntimeException.
// El compilador no obliga a capturarlas con try-catch
// ni a declararlas mediante throws.
// Pueden producirse durante la ejecución del programa.
//
// Algunos ejemplos:
// NullPointerException: utilizar una referencia null.
// ArithmeticException: operación aritmética no válida.
// IllegalArgumentException: argumento no válido.
// NumberFormatException: texto que no se puede convertir a número.
// IndexOutOfBoundsException: índice fuera de los límites.
//
// Aunque no es obligatorio capturarlas, se pueden gestionar
// con try-catch cuando sea necesario.

// Ejemplo
public class UncheckedExceptions {

    public static void main(String[] args) {

        // No es obligatorio capturar NumberFormatException.
        try {
            int numero = Integer.parseInt("hola");
            System.out.println(numero);

        } catch (NumberFormatException e) {
            System.out.println("El texto no es un número válido.");
        }

        System.out.println("El programa continúa.");
    }
}

// Salida:
// El texto no es un número válido.
// El programa continúa.