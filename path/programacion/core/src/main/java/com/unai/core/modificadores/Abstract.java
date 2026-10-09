package com.unai.core.modificadores;

// ABSTRACT
//
// CLASE ABSTRACTA
//
// Se declara con abstract class.
// No se puede instanciar directamente.
// Puede contener atributos, constructores, métodos concretos
// y métodos abstractos.
//
// MÉTODO ABSTRACTO
//
// Se declara con abstract y no tiene cuerpo.
// Termina con punto y coma.
// Obliga a las clases hijas concretas a implementar ese método,
// salvo que ya esté implementado en una clase intermedia.
//
// REGLAS IMPORTANTES
//
// - Una clase puede ser abstract aunque no tenga métodos abstractos.
// - Si una clase tiene un método abstracto, debe ser abstracta.
// - Una clase concreta debe implementar los métodos abstractos heredados.
// - Un método abstract no puede ser private, static ni final.
// - Una clase abstract puede extender otra clase e implementar interfaces.
//
// DIFERENCIA CON FINAL
//
// abstract permite que una clase sea extendida y que sus métodos
// abstractos sean implementados o sobrescritos.
// final impide heredar de una clase o sobrescribir un método final.

// EJEMPLO

abstract class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    // Cada vehículo define su forma de desplazarse
    public abstract void desplazarse();

    // Método concreto compartido
    public void mostrarMarca() {
        System.out.println("Marca: " + marca);
    }
}

class Coche extends Vehiculo {
    public Coche(String marca) {
        super(marca);
    }

    @Override
    public void desplazarse() {
        System.out.println("El coche circula por carretera");
    }
}

class Barco extends Vehiculo {
    public Barco(String marca) {
        super(marca);
    }

    @Override
    public void desplazarse() {
        System.out.println("El barco navega por el agua");
    }
}

public class Abstract {
    public static void main(String[] args) {
        // No se puede instanciar Vehiculo directamente:
        // Vehiculo v = new Vehiculo("Marca"); // Error

        Vehiculo coche = new Coche("Toyota");
        Vehiculo barco = new Barco("Yamaha");

        coche.mostrarMarca();
        coche.desplazarse();

        barco.mostrarMarca();
        barco.desplazarse();
    }
}