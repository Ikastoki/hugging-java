package com.unai.core.excepciones.fundamentos;

// Qué son las excepciones

// Una excepción representa un problema ocurrido durante
// la ejecución de un programa.
// Cuando se produce, Java crea o lanza un objeto de excepción.
// Si no se gestiona, puede terminar la ejecución del programa.
// Se pueden gestionar mediante try y catch.
// Las excepciones permiten separar el código normal
// del código encargado de gestionar errores.

// Ejemplo
public class Excepciones {

    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 0;

        try {
            // Esta operación provoca una ArithmeticException
            // porque no se puede dividir un entero entre cero.
            int resultado = numero1 / numero2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            // Se ejecuta cuando se produce esta excepción.
            System.out.println("Error: no se puede dividir entre cero.");
        }

        // El programa continúa después de gestionar la excepción.
        System.out.println("El programa continúa ejecutándose.");
    }
}

// Salida:
// Error: no se puede dividir entre cero.
// El programa continúa ejecutándose.
