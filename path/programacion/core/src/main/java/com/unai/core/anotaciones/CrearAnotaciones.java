package com.unai.core.anotaciones;

// CREAR ANOTACIONES

// Se declara una anotación con la palabra clave @interface,
// de forma parecida a como se declara una interfaz.
//
// Una anotación puede declarar elementos, que aparecen como métodos
// sin cuerpo. Al aplicar la anotación se les asigna un valor.
//
//     @interface Informacion {
//         String autor();
//         int version();
//     }
//
//     @Informacion(autor = "Ana", version = 2)
//     class Ejemplo {
//     }
//
// Tipos permitidos en los elementos: tipos primitivos, String, Class,
// enums, otras anotaciones y arrays de estos tipos.
// No se pueden devolver void ni tipos de referencia genéricos.
//
// Los elementos sin valor por defecto son obligatorios al aplicar
// la anotación; si falta alguno, produce un error de compilación.
// Se puede asignar un valor por defecto con default.
//
// Los elementos sin parámetros se llaman marcadores y se escriben
// solos, sin paréntesis.
//
//     @interface Validado {
//     }
//
//     @Validado
//     class Ejemplo {
//     }
//
// Si la anotación tiene un único elemento llamado value, se puede
// escribir el valor sin nombre.
//
//     @interface Etiqueta {
//         String value();
//     }
//
//     @Etiqueta("importante")
//     class Ejemplo {
//     }
//
// Los valores se fijan en el momento de aplicar la anotación y no
// pueden modificarse después.
//
// Por defecto, una anotación creada por el programador se guarda en
// el fichero .class pero no puede leerse durante la ejecución.
// Para poder leerla se utiliza la anotación @Retention, que veremos
// en los siguientes temas.

// Ejemplo

public class CrearAnotaciones {

    // Anotación con dos elementos. El elemento version tiene un
    // valor por defecto, por lo que no es obligatorio al aplicarla.
    @interface Informacion {
        String autor();

        int version() default 1;
    }

    // Anotación marcador: no tiene elementos.
    @interface Validado {
    }

    // Anotación con un único elemento value, que permite
    // escribir el valor sin nombre.
    @interface Etiqueta {
        String value();
    }

    // Uso de la anotación con elementos con nombre.
    // version no se indica porque ya tiene valor por defecto.
    @Informacion(autor = "Ana")
    static class Servicio {

        // Uso de una anotación marcador.
        @Validado
        public void procesar() {
            System.out.println("Procesando...");
        }
    }

    // Uso de la forma abreviada del elemento value.
    @Etiqueta("principal")
    static class Componente {
    }

    public static void main(String[] args) {
        Servicio servicio = new Servicio();

        servicio.procesar();

        // Las anotaciones anteriores se han aplicado correctamente.
        // Para leer sus valores en ejecución necesitamos retención
        // RUNTIME y reflexión; lo veremos al final del bloque.
        System.out.println("Anotaciones aplicadas");
    }
}

// Salida:
// Procesando...
// Anotaciones aplicadas
