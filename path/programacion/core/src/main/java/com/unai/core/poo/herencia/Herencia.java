package com.unai.core.poo.herencia;

// ============================================================
// HERENCIA
// ============================================================
//
// La herencia es uno de los principios de la programación
// orientada a objetos.
//
// Permite crear una clase hija a partir de una clase padre.
//
// Clase padre (superclase):
// Es la clase de la que se heredan características.
//
// Clase hija (subclase):
// Es la clase que hereda de otra y puede añadir sus propios
// atributos y métodos.
//
// Se utiliza extends para establecer la herencia:
//
// class Perro extends Animal
//
// La clase Perro hereda los miembros accesibles de Animal.
//
// La subclase puede:
// - Utilizar los métodos heredados que sean accesibles.
// - Añadir nuevos atributos y métodos.
// - Sobrescribir métodos heredados.
//
// Java permite heredar directamente de una sola clase.
// Sin embargo, una clase puede implementar varias interfaces.
//
// La herencia representa una relación "es un":
// Un perro es un animal.
//
// ============================================================

// Ejemplo

class Animal {

    String nombre;

    void comer() {
        System.out.println(nombre + " está comiendo");
    }
}

class Perro extends Animal {

    void ladrar() {
        System.out.println(nombre + " está ladrando");
    }
}

public class Herencia {

    public static void main(String[] args) {

        Perro perro = new Perro();

        // Atributo heredado de Animal
        perro.nombre = "Bobby";

        // Método heredado de Animal
        perro.comer();

        // Método propio de Perro
        perro.ladrar();
    }
}

/*
 * Salida:
 * 
 * Bobby está comiendo
 * Bobby está ladrando
 */