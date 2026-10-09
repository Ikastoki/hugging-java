package com.unai.core.modificadores;

// Miembros de instancia

// Los miembros de instancia pertenecen a cada objeto.
// Cada objeto tiene su propia copia de los atributos.
// Para acceder a ellos, normalmente se necesita una instancia.

// Atributos de instancia
// Cada objeto tendrá su propio nombre y edad.

// Métodos de instancia
// Pueden acceder a los atributos de su objeto mediante this.
// Se invocan a través de una instancia.

// Ejemplo completo
public class MiembrosDeInstancia {

    // Atributos de instancia
    String nombre;
    int edad;

    // Constructor
    public MiembrosDeInstancia(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método de instancia
    void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {

        // Cada objeto tiene sus propios valores.
        MiembrosDeInstancia persona1 = new MiembrosDeInstancia("Ana", 25);
        MiembrosDeInstancia persona2 = new MiembrosDeInstancia("Luis", 30);

        // Invocar métodos de instancia.
        persona1.mostrarDatos();
        persona2.mostrarDatos();

        // Modificar un atributo afecta solo a ese objeto.
        persona1.edad = 26;

        persona1.mostrarDatos();
        persona2.mostrarDatos();
    }
}