package com.unai.core.poo.encapsulacion;

// ============================================================
// INMUTABILIDAD
// ============================================================
//
// Un objeto inmutable es aquel cuyo estado no cambia después
// de haber sido creado.
//
// Para diseñar objetos inmutables, normalmente:
//
// - Se declaran los atributos como private.
// - Se utiliza final para impedir reasignar los atributos.
// - Se inicializan los atributos en el constructor.
// - No se proporcionan setters.
// - Se evita exponer referencias a objetos mutables internos.
//
// final impide reasignar un atributo, pero no convierte
// automáticamente en inmutable al objeto al que hace referencia.
//
// Una vez creado un objeto inmutable, para representar otros
// valores se crea normalmente una nueva instancia.
//
// Ventajas:
// - Estado predecible.
// - Menos errores por modificaciones inesperadas.
// - Más facilidad para compartir objetos entre partes del código.
//
// ============================================================

// Ejemplo

class Persona {

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

    // No existen setters para modificar los atributos.
}

public class Inmutabilidad {

    public static void main(String[] args) {

        Persona persona = new Persona("Ana", 25);

        System.out.println(persona.getNombre()); // Ana
        System.out.println(persona.getEdad()); // 25

        // No permitido:
        // persona.setNombre("Laura");
        // persona.edad = 30;

        // Para representar otros datos, creamos otro objeto.
        Persona otraPersona = new Persona("Laura", 30);

        System.out.println(otraPersona.getNombre()); // Laura
        System.out.println(otraPersona.getEdad()); // 30
    }
}