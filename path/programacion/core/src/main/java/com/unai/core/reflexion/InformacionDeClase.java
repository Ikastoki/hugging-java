package com.unai.core.reflexion;

// OBTENER INFORMACIÓN DE UNA CLASE

// A partir del objeto Class se puede obtener un resumen completo
// de la clase: sus campos, métodos, constructores, superclase,
// interfaces y anotaciones.
//
// Métodos principales:
//
// getDeclaredFields()  -> campos declarados en la propia clase,
//                          con cualquier modificador de acceso.
// getFields()          -> solo los campos públicos, incluidos los
//                          heredados.
// getDeclaredMethods() -> métodos declarados en la propia clase.
// getMethods()         -> solo los métodos públicos, incluidos los
//                          heredados.
// getDeclaredConstructors() -> constructores de la clase.
// getConstructors()    -> solo los constructores públicos.
//
// Todos devuelven arrays. El orden en que aparecen los miembros
// no está garantizado, así que conviene ordenarlos antes de
// mostrarlos.
//
// Los arrays son copias: modificarlos no afecta a la clase.

// Ejemplo

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;

public class InformacionDeClase {

    public static class Persona {

        String nombre;
        int edad;

        public Persona(String nombre) {
            this.nombre = nombre;
        }

        void saludar() {
            System.out.println("Hola");
        }

        String obtenerNombre() {
            return nombre;
        }
    }

    public static void main(String[] args) {

        Class<Persona> clase = Persona.class;

        // Campos declarados, ordenados alfabéticamente.
        Field[] campos = clase.getDeclaredFields();
        Arrays.sort(campos, Comparator.comparing(Field::getName));

        for (Field campo : campos) {
            System.out.println("Campo: " + campo.getName());
        }

        // Superclase e interfaces.
        System.out.println("Superclase: " + clase.getSuperclass().getSimpleName());
        System.out.println("Interfaces: " + clase.getInterfaces().length);

        // Resumen de miembros.
        System.out.println("Métodos declarados: " + clase.getDeclaredMethods().length);
        System.out.println("Constructores públicos: " + clase.getConstructors().length);
    }
}

// Salida:
// Campo: edad
// Campo: nombre
// Superclase: Object
// Interfaces: 0
// Métodos declarados: 2
// Constructores públicos: 1
