package com.unai.core.poo.polimorfismo;

// SOBRECARGA FRENTE A SOBREESCRITURA
//
// SOBRECARGA (OVERLOADING)
//
// Varios métodos tienen el mismo nombre, pero distintos parámetros.
// Pueden variar en número, tipo u orden de los parámetros.
// El tipo de retorno por sí solo no permite sobrecargar un método.
// Se resuelve en tiempo de compilación.
//
// SOBRESCRITURA (OVERRIDING)
//
// Una clase hija redefine un método heredado.
// Debe mantener una firma compatible y un retorno válido.
// Se recomienda usar @Override para que el compilador lo compruebe.
// La implementación se selecciona en tiempo de ejecución.
//
// DIFERENCIA CLAVE
//
// Sobrecarga: mismo nombre, distintos parámetros.
// Sobreescritura: mismo método heredado, nueva implementación.

// EJEMPLO DE SOBRECARGA

class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        return a + b;
    }
}

// EJEMPLO DE SOBREESCRITURA

class Animal {
    public void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

public class Sobrecarga {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Sobrecarga: se elige el método según los argumentos
        System.out.println(calculadora.sumar(2, 3)); // 5
        System.out.println(calculadora.sumar(2, 3, 4)); // 9
        System.out.println(calculadora.sumar(2.5, 3.5)); // 6.0

        // Sobreescritura: se ejecuta la versión de la clase real
        Animal animal = new Perro();
        animal.hacerSonido(); // Guau
    }
}
