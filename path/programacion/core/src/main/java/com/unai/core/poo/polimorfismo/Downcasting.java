package com.unai.core.poo.polimorfismo;

// DOWNCASTING
//
// El downcasting convierte una referencia de tipo padre
// en una referencia de tipo hijo.
//
// Ejemplo:
// Animal animal = new Perro();
// Perro perro = (Perro) animal;
//
// Es necesario escribir el tipo de destino entre paréntesis.
//
// ¿PARA QUÉ SIRVE?
//
// Una referencia de tipo Animal solo permite acceder directamente
// a los métodos declarados en Animal.
//
// Si el objeto real es un Perro y necesitamos llamar a un método
// exclusivo de Perro, podemos hacer downcasting.
//
// IMPORTANTE
//
// El downcasting no transforma el objeto ni cambia su clase real.
// Solo cambia el tipo de la referencia.
//
// Si el objeto no es realmente compatible con el tipo de destino,
// se produce ClassCastException.
//
// instanceof permite comprobar el tipo antes de convertir.

// EJEMPLO

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

    public void ladrar() {
        System.out.println("El perro está ladrando");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}

public class Downcasting {
    public static void main(String[] args) {
        // Upcasting: conversión implícita
        Animal animal = new Perro();

        animal.hacerSonido(); // Guau

        // No compila: ladrar() no existe en Animal
        // animal.ladrar();

        // Downcasting: conversión explícita
        Perro perro = (Perro) animal;
        perro.ladrar(); // El perro está ladrando

        // Comprobar antes de convertir
        Animal otroAnimal = new Gato();

        if (otroAnimal instanceof Perro) {
            Perro otroPerro = (Perro) otroAnimal;
            otroPerro.ladrar();
        } else {
            System.out.println("El objeto no es un Perro");
        }
    }
}