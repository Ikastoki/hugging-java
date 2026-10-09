package com.unai.core.poo.polimorfismo;

// POLIMORFISMO
//
// Polimorfismo significa "muchas formas".
//
// Permite tratar objetos de distintas clases mediante un tipo común,
// como una clase padre o una interfaz.
//
// Con la herencia, varias clases pueden sobrescribir un mismo método.
// Al invocarlo, Java ejecuta la implementación correspondiente
// a la clase real del objeto.
//
// El tipo de la referencia determina qué métodos se pueden llamar
// directamente en compilación.
// La clase real del objeto determina qué implementación sobrescrita
// se ejecuta en tiempo de ejecución.
//
// Ejemplo:
// Animal animal = new Perro();
// animal.hacerSonido();
//
// La referencia es de tipo Animal, pero el objeto es un Perro.
// Por eso se ejecuta la implementación de Perro.
//
// El polimorfismo permite trabajar con distintos tipos de objetos
// sin tener que comprobar manualmente su clase en cada caso.

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
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        // Una referencia de tipo Animal apunta a un Perro
        Animal animal1 = new Perro();

        // La misma referencia base puede apuntar a un Gato
        Animal animal2 = new Gato();

        animal1.hacerSonido(); // Guau
        animal2.hacerSonido(); // Miau

        // Podemos recorrer distintos animales de forma uniforme
        Animal[] animales = {
                new Perro(),
                new Gato(),
                new Animal()
        };

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
