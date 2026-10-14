package com.unai.core.anotaciones;

// RETENCIÓN DE ANOTACIONES

// La metaanotación @Retention define cuánto tiempo se conserva
// una anotación. Recibe un valor del enum RetentionPolicy,
// de java.lang.annotation.
//
// SOURCE
// La anotación se utiliza durante la compilación y se descarta.
// No aparece en el fichero .class.
// Ejemplos integrados: @Override, @SuppressWarnings.
//
// CLASS
// La anotación se guarda en el fichero .class, pero la JVM no la
// lee durante la ejecución. Solo puede consultarse con herramientas
// externas que inspeccionen el bytecode, como javap.
// Es el valor por defecto de las anotaciones creadas por
// el programador.
//
// RUNTIME
// La anotación se guarda en el fichero .class y puede consultarse
// durante la ejecución mediante reflexión.
// Ejemplo integrado: @Deprecated.
//
// Se declara así, sobre la anotación:
//
//     @Retention(RetentionPolicy.RUNTIME)
//     @interface Revision {
//     }
//
// Si no se indica ninguna retención, se asume CLASS.

// Ejemplo

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Retencion {

    // Se descarta tras la compilación.
    // No llega al fichero .class.
    @Retention(RetentionPolicy.SOURCE)
    @interface SoloCompilacion {
    }

    // Se guarda en el .class, pero la JVM no la lee en ejecución.
    // Es el mismo comportamiento que si no indicáramos @Retention.
    @Retention(RetentionPolicy.CLASS)
    @interface EnBytecode {
    }

    // Se guarda en el .class y puede leerse durante la ejecución.
    @Retention(RetentionPolicy.RUNTIME)
    @interface EnEjecucion {
    }

    // Las tres se pueden aplicar sin problemas.
    // Lo que cambia es dónde acaba cada una.
    @SoloCompilacion
    @EnBytecode
    @EnEjecucion
    static class Ejemplo {
    }

    public static void main(String[] args) {
        System.out.println("Anotación SOURCE: solo durante la compilación");
        System.out.println("Anotación CLASS: en el .class, sin leer en ejecución");
        System.out.println("Anotación RUNTIME: en el .class, legible en ejecución");

        // Podemos inspeccionar el bytecode con:
        //
        //     javap -v com.unai.core.anotaciones.Retencion$Ejemplo
        //
        // En la salida aparecerán EnBytecode y EnEjecucion,
        // pero no SoloCompilacion.
    }
}

// Salida:
// Anotación SOURCE: solo durante la compilación
// Anotación CLASS: en el .class, sin leer en ejecución
// Anotación RUNTIME: en el .class, legible en ejecución
