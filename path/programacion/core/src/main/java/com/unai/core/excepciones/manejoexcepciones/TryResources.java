package com.unai.core.excepciones.manejoexcepciones;

// TRY-WITH-RESOURCES

// Permite declarar recursos dentro de un bloque try.
// Los recursos se cierran automáticamente al terminar el bloque,
// tanto si la ejecución finaliza correctamente como si ocurre una excepción.
// Evita tener que cerrar manualmente recursos en un bloque finally.
// Los recursos deben implementar AutoCloseable.
// Se utiliza habitualmente con archivos, flujos de entrada y conexiones.

// Ejemplo

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResources {
    public static void main(String[] args) {

        try (BufferedReader lector = new BufferedReader(new FileReader("archivo.txt"))) {

            String linea = lector.readLine();
            System.out.println(linea);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}
