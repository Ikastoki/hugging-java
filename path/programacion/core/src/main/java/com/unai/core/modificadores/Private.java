package com.unai.core.modificadores;

// private

// Atributos private
// Solo se pueden acceder directamente desde la propia clase.
// Se utilizan para proteger los datos y aplicar encapsulación.

// Imagina que Private es Persona
public class Private {

    private String nombre;
    private int edad;

    // Constructor private
    // Impide crear objetos directamente desde otras clases.
    private Private() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

    // Método private
    // Solo se puede invocar directamente desde la propia clase.
    private void mostrarDatosInternos() {
        System.out.println(nombre + " - " + edad);
    }

    // Los métodos public permiten acceder de forma controlada
    // a los datos privados.

    public void mostrarDatos() {
        mostrarDatosInternos();
    }

    public void cumplirAnios() {
        edad++;
    }

    public static void main(String[] args) {

        // La propia clase puede acceder a sus miembros private.
        Private persona = new Private();

        persona.mostrarDatos();

        persona.cumplirAnios();

        persona.mostrarDatos();

        // Desde otra clase no sería posible:
        // persona.nombre = "Ana";
        // persona.edad = 25;
        // persona.mostrarDatosInternos();
        // new Persona();
    }
}