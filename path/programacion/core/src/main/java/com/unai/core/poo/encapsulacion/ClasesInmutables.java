package com.unai.core.poo.encapsulacion;

// ============================================================
// CLASES INMUTABLES
// ============================================================
//
// Una clase inmutable está diseñada para que el estado de sus
// objetos no pueda modificarse después de su creación.
//
// Reglas habituales para crear una clase inmutable:
//
// - Declarar la clase como final para impedir que otras clases
//   hereden de ella y alteren su comportamiento.
// - Declarar los atributos como private final.
// - Inicializar todos los atributos en el constructor.
// - No proporcionar setters ni métodos que modifiquen el estado.
// - Si contiene objetos mutables, evitar compartir referencias
//   que permitan modificarlos desde fuera.
//
// IMPORTANTE:
//
// final en un atributo impide reasignar la referencia o el valor,
// pero no hace inmutable automáticamente al objeto referenciado.
//
// Una clase inmutable puede tener atributos diferentes en cada
// instancia. Lo importante es que no cambien después de crearla.
//
// ============================================================

// Ejemplo

final class Persona {

    private final String nombre;
    private final int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

public class ClasesInmutables {

    public static void main(String[] args) {

        Persona persona = new Persona("Ana", 25);

        System.out.println(persona.getNombre()); // Ana
        System.out.println(persona.getEdad()); // 25

        // No existen setters para cambiar sus atributos.
        // persona.setEdad(30); // Error: no existe ese método.

        // Para representar otros datos, creamos otro objeto.
        Persona otraPersona = new Persona("Ana", 30);

        System.out.println(otraPersona.getEdad()); // 30
        System.out.println(persona.getEdad()); // 25
    }
}
