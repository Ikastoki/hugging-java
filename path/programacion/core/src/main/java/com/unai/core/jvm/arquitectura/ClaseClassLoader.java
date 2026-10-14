package com.unai.core.jvm.arquitectura;

// CLASS LOADER

// El class loader es el subsistema encargado de cargar las clases
// en tiempo de ejecución. Su trabajo consiste, resumidamente, en
// localizar el fichero .class, leerlo y crear el objeto Class
// correspondiente en la metaspace.
//
// Tipos de cargadores, de más genérico a más concreto:
//
// Bootstrap
// Carga las clases del núcleo de Java, como java.lang.String o
// java.util.List. Está implementado en código nativo y en Java se
// representa como null.
//
// Platform
// Carga las clases de las plataformas de módulos.
//
// Application
// Carga las clases del classpath de la aplicación.
//
// Cargadores personalizados
// Permite crear cargadores propios, algo habitual en servidores
// de aplicaciones y sistemas de plugins.
//
// Modelo de delegación (delegación hacia el padre)
// Cuando un cargador necesita una clase, primero pregunta a su
// padre. Solo la carga él si ningún ancestor la encuentra.
// Así se evita que una aplicación pueda sustituir clases del
// núcleo y que la misma clase se cargue dos veces.
//
// La carga es perezosa: una clase se carga normalmente cuando
// se utiliza por primera vez, no al arrancar el programa.
//
// Un mismo nombre de clase cargado por dos cargadores distintos
// produce dos tipos distintos, incompatibles entre sí.

// Ejemplo

public class ClaseClassLoader {

    public static void main(String[] args) {

        // String pertenece al núcleo: su cargador es bootstrap
        // y se representa como null.
        ClassLoader cargadorDeString = String.class.getClassLoader();

        System.out.println("Cargador de String: " + cargadorDeString);

        // Las clases de la aplicación usan el cargador application.
        ClassLoader cargadorDeEstaClase = ClaseClassLoader.class.getClassLoader();

        System.out.println("Cargador de esta clase: " + cargadorDeEstaClase.getName());

        // Cada cargador tiene su propio padre.
        System.out.println("Padre: " + cargadorDeEstaClase.getParent().getName());

        // Class.forName solicita la carga de una clase por su
        // nombre completo. Aquí ya estaría cargada, porque
        // ArrayList se usa en el programa.
        try {
            Class<?> clase = Class.forName("java.util.ArrayList");

            System.out.println("Cargada: " + clase.getName());

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
        }
    }
}

// Salida:
// Cargador de String: null
// Cargador de esta clase: app
// Padre: platform
// Cargada: java.util.ArrayList
