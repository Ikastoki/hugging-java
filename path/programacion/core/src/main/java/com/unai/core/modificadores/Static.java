package com.unai.core.modificadores;

// STATIC
//
// La palabra reservada static indica que un miembro pertenece
// a la clase y no a cada instancia.
//
// ATRIBUTOS STATIC
//
// Existe una única variable compartida por todas las instancias
// de la clase.
// Si una instancia modifica ese atributo, el cambio es visible
// desde las demás.
//
// MÉTODOS STATIC
//
// Se pueden invocar directamente utilizando el nombre de la clase.
// No necesitan crear un objeto para ejecutarse.
// No pueden acceder directamente a atributos o métodos de instancia,
// porque estos pertenecen a un objeto concreto.
//
// Los métodos static no se sobrescriben como los métodos de instancia.
// Si una subclase declara un método static con la misma firma,
// se produce ocultación de métodos.
//
// BLOQUES STATIC
//
// Se ejecutan cuando la clase se inicializa.
// Se utilizan para inicializar atributos estáticos complejos.
//
// IMPORTANTE
//
// - Se recomienda acceder a miembros estáticos mediante el nombre
//   de la clase, por ejemplo Contador.total.
// - main es static porque la JVM puede ejecutarlo sin crear
//   primero un objeto Main.
// - static final se utiliza habitualmente para declarar constantes
//   compartidas por toda la clase.

// EJEMPLO

class Contador {
    // Atributo compartido por todas las instancias
    static int total = 0;

    // Atributo propio de cada instancia
    String nombre;

    public Contador(String nombre) {
        this.nombre = nombre;
        total++;
    }

    // Método de instancia: necesita un objeto
    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }

    // Método estático: pertenece a la clase
    public static void mostrarTotal() {
        System.out.println("Total de objetos: " + total);
    }
}

public class Static {
    public static void main(String[] args) {
        Contador c1 = new Contador("Ana");
        Contador c2 = new Contador("Luis");

        c1.mostrarNombre(); // Nombre: Ana
        c2.mostrarNombre(); // Nombre: Luis

        // Acceso al atributo compartido
        System.out.println(Contador.total); // 2

        // Llamada al método estático sin crear otro objeto
        Contador.mostrarTotal(); // Total de objetos: 2
    }
}