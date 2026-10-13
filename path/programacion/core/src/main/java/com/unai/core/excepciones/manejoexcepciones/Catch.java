package com.unai.core.excepciones.manejoexcepciones;

// CATCH

// Captura una excepción compatible con el tipo indicado.
// Se ejecuta únicamente si ocurre una excepción compatible dentro del try.
// Recibe un objeto que contiene información sobre la excepción.
// Puede haber varios bloques catch para gestionar distintos tipos de excepciones.
// Los bloques catch se evalúan en orden.
// Las excepciones más específicas deben colocarse antes que las más generales.
// Si ningún catch es compatible, la excepción se propaga.

// Ejemplo

public class Catch {
    public static void main(String[] args) {

        try {
            int numero = Integer.parseInt("hola");
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.out.println("El texto no es un número válido.");
        }

        System.out.println("El programa continúa.");
    }
}