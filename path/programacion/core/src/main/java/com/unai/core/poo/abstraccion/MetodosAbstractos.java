package com.unai.core.poo.abstraccion;

// MÉTODOS ABSTRACTOS
//
// Un método abstracto se declara con la palabra reservada abstract.
// No tiene cuerpo y termina con punto y coma.
//
// Ejemplo:
// public abstract double calcularArea();
//
// Los métodos abstractos solo pueden declararse en clases abstractas
// o interfaces.
//
// Una clase concreta que hereda un método abstracto debe implementarlo
// mediante @Override.
//
// Si una clase hija no implementa todos los métodos abstractos heredados,
// también debe declararse abstract.
//
// Los métodos abstractos no pueden ser private, static ni final:
// - private impediría que las clases hijas los sobrescribieran.
// - static pertenece a la clase y no admite sobrescritura polimórfica.
// - final impide sobrescribir el método.
//
// Sirven para obligar a las clases hijas a proporcionar
// una implementación específica de un comportamiento común.

// EJEMPLO

abstract class Figura {
    // Método abstracto: cada figura calcula su área
    public abstract double calcularArea();

    // Método concreto: utiliza el método abstracto
    public void mostrarArea() {
        System.out.println("Área: " + calcularArea());
    }
}

class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class MetodosAbstractos {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(4, 3);
        Figura circulo = new Circulo(2);

        rectangulo.mostrarArea(); // Área: 12.0
        circulo.mostrarArea(); // Área: 12.566...

        // Una clase concreta no puede dejar sin implementar
        // el método abstracto calcularArea().
    }
}