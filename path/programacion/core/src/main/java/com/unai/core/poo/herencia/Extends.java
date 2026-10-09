package com.unai.core.poo.herencia;

// ============================================================
// EXTENDS
// ============================================================
//
// extends establece una relación de herencia entre dos clases.
//
// Sintaxis:
//
// class ClaseHija extends ClasePadre {
//     // Atributos y métodos propios
// }
//
// La clase hija puede utilizar los miembros heredados que
// sean accesibles desde ella.
//
// También puede añadir nuevos métodos y sobrescribir métodos
// heredados.
//
// Java solo permite extender directamente una clase.
//
// Si no se indica extends, una clase ordinaria hereda
// implícitamente de Object.
//
// ============================================================

// Ejemplo

class Vehiculo {

    String marca;

    void arrancar() {
        System.out.println("El vehículo está arrancando");
    }
}

class Coche extends Vehiculo {

    int numeroPuertas;

    void mostrarMarca() {
        System.out.println("Marca: " + marca);
    }
}

public class Extends {

    public static void main(String[] args) {

        Coche coche = new Coche();

        // Atributo heredado de Vehiculo
        coche.marca = "Toyota";

        // Atributo propio de Coche
        coche.numeroPuertas = 5;

        // Método heredado
        coche.arrancar();

        // Método propio
        coche.mostrarMarca();

        System.out.println("Puertas: " + coche.numeroPuertas);
    }
}

/*
 * Salida:
 * 
 * El vehículo está arrancando
 * Marca: Toyota
 * Puertas: 5
 */