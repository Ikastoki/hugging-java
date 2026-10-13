package com.unai.core.excepciones.manejoexcepciones;

// FINALLY

// El bloque finally contiene código que se ejecuta normalmente tanto si ocurre
// una excepción como si no ocurre.
// Se utiliza habitualmente para realizar tareas de limpieza o liberar recursos.
// Es opcional y se coloca después de los bloques catch.
// Puede utilizarse con try sin catch, siempre que exista finally.
// No se garantiza su ejecución si la JVM termina abruptamente.

// Ejemplo

public class Finally {
    public static void main(String[] args) {

        try {
            int resultado = 10 / 2;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: división entre cero.");
        } finally {
            System.out.println("Bloque finally ejecutado.");
        }
    }
}
