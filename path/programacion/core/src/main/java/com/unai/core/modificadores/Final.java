package com.unai.core.modificadores;

// FINAL
//
// VARIABLE FINAL
//
// Una variable declarada con final solo puede asignarse una vez.
// Debe inicializarse antes de utilizarse.
//
// Si es una variable primitiva, no se puede cambiar su valor.
// Si es una referencia a un objeto, no se puede cambiar la referencia,
// pero sí se puede modificar el objeto si este lo permite.
//
// MÉTODO FINAL
//
// Un método declarado con final no puede sobrescribirse (override)
// en una clase hija.
//
// CLASE FINAL
//
// Una clase declarada con final no puede heredarse mediante extends.
//
// CONSTANTES
//
// Es habitual combinar static final para declarar constantes
// compartidas por toda la clase.
// Por convención, sus nombres se escriben en MAYÚSCULAS.
//
// final no convierte automáticamente un objeto en inmutable.

// EJEMPLO

final class Configuracion {
    static final int MAX_INTENTOS = 3;

    final String aplicacion;

    public Configuracion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public final void mostrarAplicacion() {
        System.out.println(aplicacion);
    }
}

class Usuario {
    final String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
}

public class Final {
    public static void main(String[] args) {
        // Variable primitiva final
        final int edad = 25;
        // edad = 30; // Error: no se puede reasignar

        // Referencia final
        final Usuario usuario = new Usuario("Ana");

        // usuario = new Usuario("Luis"); // Error: otra referencia
        System.out.println(usuario.nombre); // Ana

        // Constante de clase
        System.out.println(Configuracion.MAX_INTENTOS); // 3

        Configuracion config = new Configuracion("Mi aplicación");
        config.mostrarAplicacion();

        // No se puede extender Configuracion porque es final.
        // Tampoco se puede sobrescribir mostrarAplicacion().
    }
}