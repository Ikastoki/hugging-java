package com.unai.core.clasesavanzadas.sealed;

// Pattern matching con sealed classes

// Pattern matching
// Permite comprobar el tipo de un objeto y asignarlo
// a una variable del tipo correspondiente.
// Evita tener que utilizar instanceof seguido de un casting.

// Con sealed classes
// Java conoce las subclases directas permitidas.
// Un switch puede comprobar todos los tipos posibles.
// Si se contemplan todos los casos, no hace falta default.

// Ejemplo completo
public class PatternMatching {

    sealed interface Figura
            permits Circulo, Rectangulo {
    }

    record Circulo(double radio) implements Figura {
    }

    record Rectangulo(double ancho, double alto)
            implements Figura {
    }

    static double calcularArea(Figura figura) {

        // Pattern matching con switch.
        // Cada caso comprueba el tipo y obtiene sus datos.
        return switch (figura) {
            case Circulo c ->
                Math.PI * c.radio() * c.radio();

            case Rectangulo r ->
                r.ancho() * r.alto();
        };
    }

    public static void main(String[] args) {

        Figura figura1 = new Circulo(3);
        Figura figura2 = new Rectangulo(4, 5);

        System.out.println(calcularArea(figura1));
        System.out.println(calcularArea(figura2));
    }
}

// Salida:
// 28.274333882308138
// 20.0