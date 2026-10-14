package com.unai.core.anotaciones;

// ANOTACIONES EN TIEMPO DE EJECUCIÓN

// Una anotación con retención RUNTIME se guarda en el fichero .class
// y puede consultarse mientras se ejecuta el programa.
//
// La JVM expone esa información mediante la API de reflexión,
// del paquete java.lang.reflect.
// La reflexión se estudiará en detalle en su propio bloque;
// aquí utilizamos únicamente lo necesario para leer anotaciones.
//
// Forma básica de lectura:
//
//     Clase clase = NombreClase.class;   // referencia a la clase
//     if (clase.isAnnotationPresent(Revision.class)) {
//         Revision anotacion = clase.getAnnotation(Revision.class);
//         System.out.println(anotacion.autor());
//     }
//
// - NombreClase.class obtiene el objeto Class que representa a la clase.
// - isAnnotationPresent comprueba si la anotación está presente.
// - getAnnotation devuelve el objeto de la anotación, o null si no
//   existe.
// - Los elementos se leen invocándolos como si fueran métodos.
//
// Si la anotación es repetible, se utiliza getAnnotationsByType
// para obtener todas las repeticiones.
//
// Es el mecanismo utilizado por frameworks que se configuran
// mediante anotaciones: Spring (@Autowired), JPA (@Entity)
// o JUnit (@Test).

// Ejemplo

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TiempoDeEjecucion {

    // Retención RUNTIME: necesaria para poder leerla en ejecución.
    @Retention(RetentionPolicy.RUNTIME)
    @interface Revision {
        String autor();

        String descripcion() default "sin descripción";
    }

    // Anotación repetible, también con retención RUNTIME.
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(Etiquetas.class)
    @interface Etiqueta {
        String value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface Etiquetas {
        Etiqueta[] value();
    }

    @Revision(autor = "Ana", descripcion = "Revisión final")
    @Etiqueta("principal")
    @Etiqueta("demo")
    static class Servicio {

        public void procesar() {
            System.out.println("Procesando...");
        }
    }

    public static void main(String[] args) {
        Servicio servicio = new Servicio();
        servicio.procesar();

        // Objeto Class que representa a la clase Servicio.
        Class<Servicio> clase = Servicio.class;

        // Comprobación de presencia y lectura de elementos.
        if (clase.isAnnotationPresent(Revision.class)) {
            Revision revision = clase.getAnnotation(Revision.class);

            System.out.println("Autor: " + revision.autor());
            System.out.println("Descripción: " + revision.descripcion());
        }

        // Lectura de todas las repeticiones de una anotación repetible.
        Etiqueta[] etiquetas = clase.getAnnotationsByType(Etiqueta.class);

        for (Etiqueta etiqueta : etiquetas) {
            System.out.println("Etiqueta: " + etiqueta.value());
        }
    }
}

// Salida:
// Procesando...
// Autor: Ana
// Descripción: Revisión final
// Etiqueta: principal
// Etiqueta: demo
