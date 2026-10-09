package com.unai.core.poo.herencia;

// JERARQUÍAS DE CLASES
//
// Una jerarquía organiza las clases mediante relaciones de herencia.
//
// La clase padre contiene características comunes.
// Las clases hijas heredan esas características y pueden añadir
// comportamientos propios o sobrescribir métodos.
//
// Java permite heredar de una sola clase directamente mediante extends.
// Una clase puede tener varias clases hijas.
//
// Ejemplo de jerarquía:
//
//                 Animal
//                /      \
//             Perro      Gato
//               |
//         PerroPastor
//
// Animal es la clase padre.
// Perro y Gato heredan de Animal.
// PerroPastor hereda de Perro y, de forma indirecta, de Animal.
//
// Todas estas clases heredan directa o indirectamente de Object.
//
// Una clase hija puede sobrescribir métodos con @Override.
// El tipo de una referencia no cambia la clase real del objeto.
//
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
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}

class PerroPastor extends Perro {
    public void vigilar() {
        System.out.println("El perro pastor está vigilando");
    }
}

public class Jerarquias {
    public static void main(String[] args) {
        PerroPastor pastor = new PerroPastor();

        // Hereda métodos de Animal a través de Perro
        pastor.comer();

        // Utiliza el método sobrescrito en Perro
        pastor.hacerSonido();

        // Método propio de PerroPastor
        pastor.vigilar();

        // Una referencia de tipo Animal puede apuntar a un Perro
        Animal animal = new Perro();
        animal.hacerSonido(); // Guau

        // Todas las clases heredan de Object
        System.out.println(pastor.toString());
    }
}