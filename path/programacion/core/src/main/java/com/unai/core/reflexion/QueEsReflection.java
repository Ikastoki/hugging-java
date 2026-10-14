package com.unai.core.reflexion;

// QUÉ ES REFLECTION

// Reflection (reflexión) es la API que permite inspeccionar y
// modificar clases, objetos, métodos, campos y anotaciones en
// tiempo de ejecución, aunque no se conozcan al escribir el
// código.
//
// Se apoya en dos elementos:
//
// - java.lang.Class, el objeto que representa a una clase.
// - java.lang.reflect, con las clases Method, Field, Constructor
//   y Array.
//
// La información procede de las clases cargadas en la metaspace:
// la JVM la expone mediante esos objetos.
//
// Usos habituales:
//
// - Frameworks que inyectan dependencias o configuran objetos
//   llamando a métodos cuyo nombre leen de la configuración.
// - Frameworks de pruebas y de persistencia.
// - Serializadores, validadores y herramientas de desarrollo.
//
// Inconvenientes:
//
// - Rompe la encapsulación: se puede acceder a miembros private.
// - Es más lento que una llamada directa.
// - No hay comprobación de tipos en compilación: si el nombre de
//   un método cambia, el fallo ocurre en ejecución.
// - El sistema de módulos limita el acceso a clases internas del
//   JDK.

// Ejemplo

public class QueEsReflection {

    public static void main(String[] args) {

        String texto = "Java";

        // Forma 1: desde un objeto, getClass().
        Class<?> desdeObjeto = texto.getClass();

        // Forma 2: el literal .class de una clase.
        Class<?> desdeClase = String.class;

        // Forma 3: por nombre, en tiempo de ejecución.
        Class<?> porNombre = null;

        try {
            porNombre = Class.forName("java.lang.String");

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
        }

        // Las tres formas dan el mismo objeto Class.
        System.out.println("Misma clase: " + (desdeObjeto == desdeClase));
        System.out.println("Misma clase: " + (desdeClase == porNombre));

        // A partir de aquí ya se puede inspeccionar la clase.
        System.out.println("Nombre: " + desdeClase.getName());
    }
}

// Salida:
// Misma clase: true
// Misma clase: true
// Nombre: java.lang.String
