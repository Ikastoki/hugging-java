package com.unai.core.poo.encapsulacion;

// ============================================================
// MODIFICADORES DE ACCESO
// ============================================================
//
// Los modificadores de acceso controlan la visibilidad
// de las clases, atributos, constructores y métodos.
//
// public:
// Permite acceder desde cualquier lugar donde la clase
// sea accesible.
//
// protected:
// Permite acceder desde el mismo paquete y también desde
// subclases, incluso si están en otro paquete.
//
// private:
// Permite acceder únicamente desde la propia clase.
//
// default (sin modificador):
// Permite acceder desde las clases del mismo paquete.
//
// Resumen:
//
// public    → cualquier lugar con acceso a la clase
// protected → mismo paquete y subclases
// default   → mismo paquete
// private   → misma clase
//
// Una clase de nivel superior solo puede ser public
// o tener acceso default; no puede ser private ni protected.
//
// ============================================================

// Ejemplo

class Persona {

    public String nombre = "Ana";

    protected int edad = 25;

    String ciudad = "Vitoria"; // Acceso default

    private double salario = 2000.0;

    public void mostrarNombre() {
        System.out.println(nombre);
    }

    protected void mostrarEdad() {
        System.out.println(edad);
    }

    void mostrarCiudad() {
        System.out.println(ciudad);
    }

    private void mostrarSalario() {
        System.out.println(salario);
    }

    public void mostrarDatosPrivados() {
        // La propia clase sí puede acceder a sus miembros private.
        mostrarSalario();
    }
}

public class ModificadoresDeAcceso {

    public static void main(String[] args) {

        Persona persona = new Persona();

        System.out.println(persona.nombre);
        System.out.println(persona.edad);
        System.out.println(persona.ciudad);

        // No permitido: salario es private.
        // System.out.println(persona.salario);

        persona.mostrarNombre();
        persona.mostrarEdad();
        persona.mostrarCiudad();

        // No permitido: mostrarSalario() es private.
        // persona.mostrarSalario();

        persona.mostrarDatosPrivados();
    }
}