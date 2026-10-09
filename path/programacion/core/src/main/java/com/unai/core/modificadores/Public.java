package com.unai.core.modificadores;

// PUBLIC
//
// public permite acceder al elemento desde cualquier paquete,
// siempre que el módulo permita ese acceso.
//
// Puede utilizarse en:
// - Clases de nivel superior.
// - Atributos.
// - Métodos.
// - Constructores.
//
// CLASES PUBLIC
//
// Una clase de nivel superior declarada public puede utilizarse
// desde otros paquetes si es accesible.
// En un archivo .java solo puede haber una clase de nivel superior
// public y el archivo debe tener su mismo nombre.
//
// MÉTODOS PUBLIC
//
// Se pueden invocar desde cualquier lugar donde la clase
// y el método sean accesibles.
//
// ATRIBUTOS PUBLIC
//
// Se pueden leer y modificar directamente desde otros lugares
// donde sean accesibles.
// Por encapsulación, normalmente se prefiere usar atributos private
// y proporcionar métodos públicos cuando sea necesario.
//
// CONSTRUCTORES PUBLIC
//
// Permiten crear objetos desde otros lugares donde la clase
// sea accesible.

// EJEMPLO

class Persona {
    public String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}

public class Public {
    public static void main(String[] args) {
        // Constructor público
        Persona persona = new Persona("Ana");

        // Atributo público
        System.out.println(persona.nombre);

        // Método público
        persona.saludar();
    }
}