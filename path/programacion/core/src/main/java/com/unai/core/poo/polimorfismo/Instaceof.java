package com.unai.core.poo.polimorfismo;

// INSTANCEOF
//
// Comprueba si un objeto es compatible con un tipo determinado.
//
// Sintaxis:
// objeto instanceof Tipo
//
// Devuelve true si el objeto es una instancia del tipo indicado
// o de uno de sus subtipos compatibles.
//
// Devuelve false si no es compatible o si la referencia es null.
//
// Se utiliza habitualmente para comprobar el tipo de un objeto
// antes de realizar un downcasting.
//
// Desde Java 16, instanceof permite declarar una variable de patrón:
// if (objeto instanceof Perro perro) { ... }
//
// Si la comprobación tiene éxito, la variable perro queda disponible
// dentro del bloque correspondiente, sin necesidad de un cast explícito.

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

public class Instaceof {
    public static void main(String[] args) {
        Animal animal1 = new Perro();
        Animal animal2 = new Gato();
        Animal animal3 = null;

        System.out.println(animal1 instanceof Perro); // true
        System.out.println(animal1 instanceof Animal); // true
        System.out.println(animal2 instanceof Perro); // false
        System.out.println(animal3 instanceof Animal); // false

        // Comprobar el tipo y acceder al método específico
        if (animal1 instanceof Perro perro) {
            perro.ladrar();
        }

        // También funciona con un objeto de otra subclase
        if (animal2 instanceof Perro perro) {
            perro.ladrar();
        } else {
            System.out.println("El animal no es un perro");
        }
    }
}
