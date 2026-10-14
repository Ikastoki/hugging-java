package com.unai.core.reflexion;

// CLASS

// Class es la clase de Java que representa a una clase en tiempo
// de ejecución. Cada clase cargada tiene un único objeto Class,
// guardado en la metaspace.
//
// Se obtiene de tres formas:
//
//     objeto.getClass()      -> Class<?> del objeto.
//     Clase.class            -> Class<Clase>.
//     Class.forName("nombre") -> carga la clase si hace falta.
//
// A partir del objeto Class se puede consultar casi todo:
//
// getName()        -> nombre completo, con paquete.
// getSimpleName()  -> nombre sin paquete.
// getPackage()     -> paquete de la clase.
// getSuperclass()  -> clase padre.
// getInterfaces() -> interfaces implementadas.
// isInterface(), isArray(), isEnum(), isPrimitive().
// getModifiers()   -> modificadores de acceso.
//
// Class es genérica: Class<Persona> guarda el tipo de la clase,
// lo que permite comprobar tipos en tiempo de ejecución.

// Ejemplo

import java.util.ArrayList;
import java.util.List;

public class ClaseClass {

    static class Animal {
    }

    static class Perro extends Animal {
    }

    public static void main(String[] args) {

        // Nombre completo y nombre simple.
        System.out.println(String.class.getName());
        System.out.println(String.class.getSimpleName());

        // Jerarquía de clases.
        System.out.println("Padre de String: " + String.class.getSuperclass().getName());
        System.out.println("Padre de Object: " + Object.class.getSuperclass());

        // Interfaces de una clase.
        Class<?>[] interfaces = ArrayList.class.getInterfaces();

        for (Class<?> interfaz : interfaces) {
            System.out.println("ArrayList implementa: " + interfaz.getName());
        }

        // Naturaleza de la clase.
        System.out.println("¿Perro es interfaz?: " + Perro.class.isInterface());
        System.out.println("¿String[] es array?: " + String[].class.isArray());
    }
}

// Salida:
// java.lang.String
// String
// Padre de String: java.lang.Object
// Padre de Object: null
// ArrayList implementa: java.util.List
// ArrayList implementa: java.util.RandomAccess
// ArrayList implementa: java.lang.Cloneable
// ArrayList implementa: java.io.Serializable
// ¿Perro es interfaz?: false
// ¿String[] es array?: true
//
// Solo aparecen las interfaces implementadas directamente:
// Collection llega a través de List.
