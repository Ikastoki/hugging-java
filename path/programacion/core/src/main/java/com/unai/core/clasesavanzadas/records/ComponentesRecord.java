package com.unai.core.clasesavanzadas.records;

// Componentes de un record

// Los componentes se declaran entre paréntesis.
// Cada componente tiene un tipo y un nombre.
// El orden de los componentes determina el orden del constructor.
// Java genera un atributo private final por cada componente.
// Java genera un método de acceso con el nombre del componente,
// sin utilizar el prefijo get.
// Los componentes no se pueden reasignar después de construir el objeto.

// Ejemplo
public class ComponentesRecord {

    // nombre, edad y email son los componentes del record.
    record Persona(String nombre, int edad, String email) {
    }

    public static void main(String[] args) {

        // Crear un objeto proporcionando todos los componentes
        // en el mismo orden en que fueron declarados.
        Persona persona = new Persona(
                "Ana",
                25,
                "ana@email.com");

        // Acceder a los componentes mediante sus métodos.
        System.out.println(persona.nombre());
        System.out.println(persona.edad());
        System.out.println(persona.email());

        // Mostrar todos los componentes.
        System.out.println(persona);
    }
}

// Salida:
// Ana
// 25
// ana@email.com
// Persona[nombre=Ana, edad=25, email=ana@email.com]