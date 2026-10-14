package com.unai.core.anotaciones;

// ANOTACIONES EN TIEMPO DE COMPILACIÓN

// Son anotaciones cuya información interesa mientras dura
// la compilación y que no necesitan estar disponibles en ejecución.
//
// Anotaciones SOURCE
// El compilador las utiliza y las descarta.
// Nunca aparecen en el fichero .class.
// Ejemplos integrados:
//
// - @Override, que comprueba que existe un método equivalente
//   en la superclase o interfaz.
// - @SuppressWarnings, que silencia advertencias del compilador.
// - @FunctionalInterface, que valida el número de métodos abstractos.
//
// Anotaciones CLASS
// El compilador las guarda en el fichero .class, pero la JVM no
// las lee durante la ejecución. Solo pueden consultarse con
// herramientas que inspeccionen el bytecode, como javap.
//
//     javap -v com.unai.core.anotaciones.TiempoDeCompilacion$Servicio
//
// En la salida aparece el atributo RuntimeInvisibleAnnotations,
// que contiene las anotaciones de retención CLASS.
// Las de retención RUNTIME aparecen en RuntimeVisibleAnnotations.
//
// También existen procesadores de anotaciones, herramientas que
// se ejecutan durante la compilación y leen anotaciones SOURCE o
// CLASS para generar código o realizar comprobaciones adicionales.
// Es la base de herramientas como Lombok o MapStruct, aunque
// su uso va más allá de este bloque.

// Ejemplo

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TiempoDeCompilacion {

    // Anotación propia de retención CLASS.
    // Se guarda en el bytecode, pero no se lee en ejecución.
    @Retention(RetentionPolicy.CLASS)
    @interface DocumentadoInternamente {
        String descripcion();
    }

    // @Override, @DocumentadoInternamente y @Deprecated
    // actúan durante la compilación de este fichero.
    // @Override y @Deprecated son integradas; la propia se descarta
    // o se guarda en el .class según su retención.
    @DocumentadoInternamente(descripcion = "Servicio interno")
    static class Servicio {

        @Override
        public String toString() {
            return "Servicio";
        }

        @Deprecated
        public void metodoAntiguo() {
        }
    }

    // Silencia la advertencia del compilador.
    // Esta anotación tiene retención SOURCE: se usa aquí
    // y no llega al fichero .class.
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Servicio servicio = new Servicio();

        System.out.println(servicio);

        // La anotación DocumentadoInternamente no puede consultarse
        // en ejecución, porque su retención es CLASS.
        // Se comprueba inspeccionando el bytecode con javap -v.
    }
}

// Salida:
// Servicio
