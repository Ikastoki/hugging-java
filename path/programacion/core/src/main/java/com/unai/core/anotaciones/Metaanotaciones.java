package com.unai.core.anotaciones;

// METAANOTACIONES

// Son anotaciones que se aplican sobre la declaración de otra
// anotación, para definir cómo se comporta esa anotación.
// Se encuentran en el paquete java.lang.annotation.
//
// @Target
// Indica dónde se puede aplicar la anotación.
// Recibe uno o varios valores del enum ElementType:
//
//     TYPE            -> clases, interfaces, enums, records.
//     FIELD           -> atributos.
//     METHOD          -> métodos.
//     PARAMETER       -> parámetros.
//     CONSTRUCTOR     -> constructores.
//     LOCAL_VARIABLE  -> variables locales.
//
// Si no se indica @Target, la anotación puede aplicarse
// en casi todas las declaraciones.
//
// @Retention
// Indica cuánto tiempo se conserva la anotación.
// Se verá en detalle en el siguiente tema.
//
// @Documented
// Hace que la anotación aparezca en la documentación generada
// por Javadoc.
//
// @Inherited
// Hace que una anotación aplicada a una clase sea visible también
// en sus subclases. Solo funciona con anotaciones cuyo objetivo
// sean tipos.
//
// @Repeatable
// Permite aplicar la misma anotación varias veces en el mismo lugar.
// Requiere declarar también un contenedor cuyo único elemento value
// devuelva un array del tipo repetible.

// Ejemplo

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

public class Metaanotaciones {

    // Solo puede aplicarse a clases y métodos.
    // Se conserva en el fichero .class (retención por defecto).
    @Target({ ElementType.TYPE, ElementType.METHOD })
    @interface Revision {
        String autor();
    }

    // Anotación repetible, con su contenedor Etiquetas.
    @Repeatable(Etiquetas.class)
    @interface Etiqueta {
        String value();
    }

    // Contenedor que almacena las repeticiones de @Etiqueta.
    @interface Etiquetas {
        Etiqueta[] value();
    }

    // Aplicada a una clase, uno de sus métodos y varias veces
    // en forma de etiquetas.
    @Revision(autor = "Ana")
    @Etiqueta("principal")
    @Etiqueta("demo")
    static class Servicio {

        @Revision(autor = "Luis")
        public void procesar() {
            System.out.println("Procesando...");
        }
    }

    public static void main(String[] args) {
        Servicio servicio = new Servicio();

        servicio.procesar();

        // @Target ha permitido aplicar @Revision a la clase y al método.
        // Si se aplicara a un atributo, produciría un error de compilación.
        System.out.println("Anotaciones aplicadas correctamente");
    }
}

// Salida:
// Procesando...
// Anotaciones aplicadas correctamente
