package com.unai.core.excepciones.personalizadas;

// BUENAS PRÁCTICAS DE MANEJO DE EXCEPCIONES

// Capturar únicamente las excepciones que se puedan gestionar.
// Evitar capturar Exception o Throwable de forma indiscriminada.
// No utilizar bloques catch vacíos: gestionar el error o registrarlo.
// Mostrar mensajes claros y útiles para entender qué ha ocurrido.
// No utilizar excepciones para controlar el flujo normal del programa.
// Utilizar excepciones específicas en lugar de excepciones genéricas.
// Liberar recursos mediante try-with-resources cuando corresponda.
// Mantener la información de la causa al lanzar otra excepción.
// No exponer información sensible en los mensajes de error.
// Utilizar checked exceptions cuando el llamador deba gestionar
// una condición recuperable; unchecked para errores de uso o estado.
// No capturar una excepción si no se puede resolver ni aportar contexto.
// Evitar registrar y relanzar la misma excepción repetidamente,
// para no duplicar los mensajes de error.

// Ejemplo

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BuenasPracticas {

    static String leerArchivo(Path ruta) {
        try {
            return Files.readString(ruta);

        } catch (IOException e) {
            throw new IllegalStateException(
                    "No se pudo leer el archivo: " + ruta, e);
        }
    }

    public static void main(String[] args) {
        try {
            String contenido = leerArchivo(Path.of("datos.txt"));
            System.out.println(contenido);

        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());
            // La causa original se conserva en e.getCause().
        }
    }
}
