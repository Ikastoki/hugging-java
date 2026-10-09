package com.unai.core.poo.abstraccion;

// CLASES ABSTRACTAS
//
// Una clase abstracta se declara utilizando la palabra reservada abstract.
//
// No se puede crear un objeto directamente de una clase abstracta.
// Puede contener atributos, constructores, métodos concretos
// y métodos abstractos.
//
// Un método abstracto se declara sin cuerpo y termina en punto y coma.
// Solo puede declararse dentro de una clase abstracta o una interfaz.
//
// Una clase hija concreta debe implementar todos los métodos abstractos
// heredados que no estén implementados en niveles intermedios.
//
// Una clase abstracta puede tener constructor, que se ejecuta cuando
// se crea una instancia de una clase hija.
//
// Sirve para compartir código y definir una base común para varias clases.

// EJEMPLO

abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Cada tipo de empleado calcula su sueldo de forma diferente
    public abstract double calcularSueldo();

    // Método concreto compartido por las clases hijas
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Sueldo: " + calcularSueldo());
    }
}

class EmpleadoFijo extends Empleado {
    private double sueldoMensual;

    public EmpleadoFijo(String nombre, double sueldoMensual) {
        super(nombre);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    }
}

class EmpleadoPorHoras extends Empleado {
    private int horas;
    private double precioHora;

    public EmpleadoPorHoras(String nombre, int horas, double precioHora) {
        super(nombre);
        this.horas = horas;
        this.precioHora = precioHora;
    }

    @Override
    public double calcularSueldo() {
        return horas * precioHora;
    }
}

public class ClasesAbstractas {
    public static void main(String[] args) {
        // No se puede instanciar Empleado directamente:
        // Empleado empleado = new Empleado("Ana"); // Error

        Empleado fijo = new EmpleadoFijo("Ana", 2000);
        Empleado temporal = new EmpleadoPorHoras("Luis", 80, 12.5);

        fijo.mostrarInformacion();
        temporal.mostrarInformacion();
    }
}