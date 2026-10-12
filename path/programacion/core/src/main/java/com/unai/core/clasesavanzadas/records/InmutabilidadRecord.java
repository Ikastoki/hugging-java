package com.unai.core.clasesavanzadas.records;

// Records e inmutabilidad

// Los componentes de un record son private y final.
// No se pueden reasignar después de construir el objeto.
// No se pueden declarar setters para modificar sus componentes.
// La inmutabilidad de un record no es necesariamente profunda.
// Si un componente referencia un objeto mutable, ese objeto
// todavía puede cambiar.

// Ejemplo con un componente primitivo
// public class InmutabilidadRecord {

//     record Persona(String nombre, int edad) {}

//     public static void main(String[] args) {

//         Persona persona = new Persona("Ana", 25);

//         System.out.println(persona.nombre());
//         System.out.println(persona.edad());

//         // No se puede reasignar un componente:
//         // persona.edad = 26;

//         // Para representar otros datos, se crea otro record.
//         Persona personaActualizada = new Persona("Ana", 26);

//         System.out.println(personaActualizada);
//     }
// }

// Ejemplo de inmutabilidad profunda con una lista
import java.util.List;

record Grupo(String nombre, List<String> miembros) {

    // Copia defensiva para evitar conservar la lista mutable
    // recibida desde fuera.
    Grupo {
        miembros = List.copyOf(miembros);
    }
}

// La lista devuelta es inmodificable y no comparte
// la estructura mutable de la lista original.
