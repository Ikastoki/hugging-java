package com.unai.core.modificadores;

// PROTECTED
//
// protected permite acceder al miembro:
//
// - Desde cualquier clase del mismo paquete.
// - Desde las clases hijas, incluso si están en otro paquete,
//   respetando las reglas de acceso de Java.
//
// Se puede utilizar en atributos, métodos y constructores.
// No se utiliza para clases de nivel superior.
//
// DIFERENCIA CON PUBLIC Y PRIVATE
//
// public: acceso desde cualquier lugar donde sea accesible.
// protected: acceso desde el mismo paquete y desde subclases,
//            con las restricciones correspondientes.
// private: acceso únicamente desde la clase que lo declara.
//
// IMPORTANTE
//
// Una clase hija puede acceder a un miembro protected heredado.
// Si está en otro paquete, no puede acceder a ese miembro mediante
// cualquier objeto de la clase padre; el acceso está restringido
// al contexto de la subclase.
//
// Se suele utilizar protected cuando una clase quiere permitir
// que sus subclases reutilicen o sobrescriban parte de su
// implementación.

// EJEMPLO

class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    protected void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    public void presentar() {
        // Acceso al atributo protected heredado
        System.out.println("Soy " + nombre);

        // Acceso al método protected heredado
        mostrarNombre();
    }
}

public class Protected {
    public static void main(String[] args) {
        Perro perro = new Perro("Toby");

        perro.presentar();

        // No se permite acceder directamente desde una clase
        // no relacionada que esté fuera del paquete:
        // System.out.println(perro.nombre);
        // perro.mostrarNombre();
    }
}