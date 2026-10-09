package com.unai.core.poo.fundamentos;

// ============================================================
// PROGRAMACIÓN ORIENTADA A OBJETOS (POO)
// ============================================================
//
// La POO organiza un programa utilizando clases y objetos.
//
// Una clase es una plantilla que define los datos y
// comportamientos que tendrán sus objetos.
//
// Un objeto es una instancia de una clase.
//
// Una instancia es la particularización, realización específica u ocurrencia de una determinada clase.
//
// La POO se basa en cuatro principios fundamentales:
//
// Encapsulación:
// Agrupa datos y comportamientos y permite controlar el acceso
// al estado interno de los objetos.
//
// Herencia:
// Permite crear clases nuevas a partir de otras clases,
// reutilizando y especializando sus características.
//
// Polimorfismo:
// Permite utilizar una referencia de un tipo común para
// trabajar con objetos que tienen diferentes implementaciones.
//
// Abstracción:
// Permite representar lo esencial de algo y ocultar detalles
// innecesarios de implementación.
//
// La POO facilita la organización, reutilización y mantenimiento
// del código.
//
// ============================================================

// Ejemplo

class Coche {

    String marca;
    int velocidad;

    void acelerar() {
        velocidad += 10;
    }

    void mostrarVelocidad() {
        System.out.println("Velocidad: " + velocidad);
    }
}

public class POO {

    public static void main(String[] args) {

        // Crear un objeto de la clase Coche
        Coche coche = new Coche();

        // Asignar valores a sus atributos
        coche.marca = "Toyota";
        coche.velocidad = 0;

        // Utilizar sus métodos
        System.out.println("Marca: " + coche.marca);

        coche.acelerar();
        coche.acelerar();

        coche.mostrarVelocidad(); // Velocidad: 20
    }
}
