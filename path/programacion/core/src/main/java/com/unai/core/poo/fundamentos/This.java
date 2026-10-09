package com.unai.core.poo.fundamentos;

// ============================================================
// THIS
// ============================================================
//
// this hace referencia al objeto actual.
//
// Se utiliza principalmente para:
//
// - Diferenciar atributos de parámetros con el mismo nombre.
// - Invocar otros constructores de la misma clase.
// - Llamar a métodos del objeto actual.
//
// Cuando un parámetro tiene el mismo nombre que un atributo,
// podemos utilizar this para distinguirlos:
//
// this.nombre = nombre;
//
// - this.nombre: atributo del objeto actual.
// - nombre: parámetro recibido.
//
// También podemos utilizar this() para llamar a otro
// constructor de la misma clase.
//
// La llamada this() debe ser la primera instrucción del
// constructor.
//
// ============================================================

// Ejemplo

class Persona {

    String nombre;
    int edad;

    Persona() {
        // LLama al constructor de abajo
        this("Sin nombre", 0);
    }

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
}

public class This {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Ana", 25);

        persona1.mostrarDatos();
        persona2.mostrarDatos();
    }
}
