package com.unai.core.clasesavanzadas.records;

// Métodos de records

// Métodos de acceso
// Java genera un método por cada componente.
// Se utiliza el nombre del componente, sin get.
// Ejemplo: persona.nombre().

// Métodos personalizados
// Se pueden crear métodos de instancia para operar con los datos.
// Pueden devolver valores o realizar acciones.

// Métodos estáticos
// Se declaran con static y pertenecen al propio record.
// No pueden acceder directamente a componentes de instancia.

// Métodos generados automáticamente
// toString(): representa los datos del record como texto.
// equals(): compara los componentes.
// hashCode(): calcula un hash basado en los componentes.

// Ejemplo
public class MetodosRecord {

    record Persona(String nombre, int edad) {

        // Método de instancia
        boolean esMayorDeEdad() {
            return edad >= 18;
        }

        // Método de instancia
        void mostrarDatos() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
        }

        // Método estático
        static Persona crearMenor(String nombre) {
            return new Persona(nombre, 10);
        }
    }

    public static void main(String[] args) {

        Persona persona = new Persona("Ana", 25);

        // Métodos de acceso generados automáticamente
        System.out.println(persona.nombre());
        System.out.println(persona.edad());

        // Métodos personalizados
        persona.mostrarDatos();
        System.out.println(persona.esMayorDeEdad());

        // Método estático
        Persona menor = Persona.crearMenor("Luis");
        System.out.println(menor);

        // Métodos generados automáticamente
        System.out.println(persona.toString());
        System.out.println(persona.equals(new Persona("Ana", 25)));
    }
}

// Salida:
// Ana
// 25
// Nombre: Ana
// Edad: 25
// true
// Persona[nombre=Luis, edad=10]
// Persona[nombre=Ana, edad=25]
// true