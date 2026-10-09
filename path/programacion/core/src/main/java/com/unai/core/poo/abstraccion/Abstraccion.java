package com.unai.core.poo.abstraccion;

// ABSTRACCIÓN
//
// La abstracción permite definir comportamientos generales
// sin especificar necesariamente cómo se implementan.
//
// Se centra en QUÉ hace un objeto, no en CÓMO lo hace.
//
// En Java se consigue principalmente mediante:
// - Clases abstractas.
// - Interfaces.
//
// Una clase abstracta se declara con abstract.
// No se puede instanciar directamente.
//
// Puede contener:
// - Métodos abstractos, sin implementación.
// - Métodos concretos, con implementación.
// - Atributos y constructores.
//
// Las clases hijas deben implementar los métodos abstractos,
// salvo que también sean abstractas.
//
// La abstracción permite definir una estructura común
// y dejar que cada clase concreta proporcione los detalles.

// EJEMPLO

abstract class Figura {
    // Método abstracto: no tiene implementación
    public abstract double calcularArea();

    // Método concreto: tiene implementación
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

public class Abstraccion {
    public static void main(String[] args) {
        // No se puede crear directamente una Figura:
        // Figura figura = new Figura(); // Error

        // Podemos usar la abstracción mediante referencias
        // del tipo Figura.
        Figura rectangulo = new Rectangulo(5, 3);
        Figura circulo = new Circulo(2);

        rectangulo.mostrarArea();
        circulo.mostrarArea();
    }
}