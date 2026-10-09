package com.unai.core.poo.polimorfismo;

// UPCASTING
//
// El upcasting convierte una referencia de tipo hijo
// en una referencia de tipo padre.
//
// Ejemplo:
// Perro perro = new Perro();
// Animal animal = perro;
//
// También puede escribirse directamente:
// Animal animal = new Perro();
//
// El upcasting es implícito: no necesita casting explícito.
//
// El objeto sigue siendo un Perro; no se transforma en un Animal.
// Lo que cambia es el tipo de la referencia.
//
// Mediante la referencia padre solo podemos acceder directamente
// a los miembros disponibles en el tipo padre.
// Si un método está sobrescrito, se ejecuta la versión
// correspondiente a la clase real del objeto.
//
// Es habitual utilizar upcasting para aplicar polimorfismo.

// EJEMPLO

class Animal {
    public void comer() {
        System.out.println("El animal está comiendo");
    }

    public void hacerSonido() {
        System.out.println("Sonido genérico");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }

    public void ladrar() {
        System.out.println("El perro está ladrando");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        Perro perro = new Perro();

        // Upcasting implícito
        Animal animal = perro;

        // Métodos disponibles en Animal
        animal.comer();

        // Se ejecuta la versión sobrescrita de Perro
        animal.hacerSonido(); // Guau

        // No compila: ladrar() no está declarado en Animal
        // animal.ladrar();

        // La referencia original sigue siendo de tipo Perro
        perro.ladrar();
    }
}
