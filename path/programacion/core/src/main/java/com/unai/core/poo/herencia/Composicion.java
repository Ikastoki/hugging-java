package com.unai.core.poo.herencia;

// COMPOSICIÓN FRENTE A HERENCIA
//
// HERENCIA
//
// Se utiliza extends para heredar atributos y métodos de otra clase.
// Representa una relación "es un".
// Permite reutilizar y sobrescribir comportamientos.
// Puede generar un acoplamiento fuerte entre las clases.
//
// Ejemplo:
// Un Perro es un Animal.
//
// COMPOSICIÓN
//
// Una clase contiene referencias a objetos de otras clases.
// Representa una relación "tiene un".
// Permite combinar comportamientos de distintos objetos.
// Facilita cambiar componentes sin modificar la jerarquía de clases.
//
// Ejemplo:
// Un Coche tiene un Motor.
//
// DIFERENCIA PRINCIPAL
//
// Herencia: reutilización mediante una relación entre clases.
// Composición: reutilización mediante objetos que colaboran.
//
// Se suele preferir la composición cuando la relación "tiene un"
// representa mejor el problema o cuando interesa cambiar componentes
// de forma independiente.

// EJEMPLO DE HERENCIA

class Animal {
    public void comer() {
        System.out.println("El animal está comiendo");
    }
}

class Perro extends Animal {
    public void ladrar() {
        System.out.println("Guau");
    }
}

// EJEMPLO DE COMPOSICIÓN

class Motor {
    public void arrancar() {
        System.out.println("Motor arrancado");
    }
}

class Coche {
    private final Motor motor;

    public Coche() {
        this.motor = new Motor();
    }

    public void arrancar() {
        motor.arrancar();
        System.out.println("El coche está listo");
    }
}

public class Composicion {
    public static void main(String[] args) {
        // Herencia: Perro es un Animal
        Perro perro = new Perro();
        perro.comer();
        perro.ladrar();

        // Composición: Coche tiene un Motor
        Coche coche = new Coche();
        coche.arrancar();
    }
}
