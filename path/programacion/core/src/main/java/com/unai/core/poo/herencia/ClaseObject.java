package com.unai.core.poo.herencia;

// CLASE OBJECT
//
// Object es la clase raíz de la jerarquía de clases de Java.
// Toda clase hereda directa o indirectamente de Object.
//
// Si no se indica otra clase con extends, Java hereda de Object
// automáticamente.
//
// Por ejemplo:
// class Persona {}
// equivale a:
// class Persona extends Object {}
//
// MÉTODOS IMPORTANTES DE OBJECT
//
// toString()
// Devuelve una representación textual del objeto.
// Conviene sobrescribirlo para mostrar información útil.
//
// equals(Object obj)
// Compara objetos según el criterio definido por la clase.
// Por defecto, compara si ambas referencias apuntan al mismo objeto.
//
// hashCode()
// Devuelve un valor hash del objeto.
// Si dos objetos son iguales según equals(), deben tener el mismo hashCode().
//
// getClass()
// Devuelve el objeto Class que representa la clase real del objeto.
//
// MÉTODOS QUE CONVIENE CONOCER
//
// clone()
// Permite crear una copia del objeto, sujeto a sus restricciones.
//
// wait(), notify() y notifyAll()
// Permiten coordinar hilos mediante el monitor del objeto.
//
// finalize()
// Está obsoleto y desaconsejado; no debe utilizarse para gestionar recursos.

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Persona otra)) {
            return false;
        }

        return this.edad == otra.edad
                && this.nombre.equals(otra.nombre);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nombre, edad);
    }
}

public class ClaseObject {
    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", 25);
        Persona p2 = new Persona("Ana", 25);

        // toString(): representación textual
        System.out.println(p1);

        // equals(): compara el contenido según nuestra implementación
        System.out.println(p1.equals(p2)); // true

        // getClass(): obtiene la clase real del objeto
        System.out.println(p1.getClass().getSimpleName()); // Persona

        // Aunque tienen el mismo contenido, son objetos distintos
        System.out.println(p1 == p2); // false
    }
}