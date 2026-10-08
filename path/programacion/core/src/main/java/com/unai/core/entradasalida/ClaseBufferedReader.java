package com.unai.core.entradasalida;
/*
 * BUFFEREDREADER
 *
 * BufferedReader es una clase de java.io que permite leer texto
 * de forma eficiente utilizando un búfer.
 *
 * Se utiliza normalmente junto con un Reader:
 *
 *     BufferedReader reader =
 *         new BufferedReader(new FileReader("archivo.txt"));
 *
 * Su método más utilizado es:
 *
 *     readLine()
 *
 * que lee una línea completa y devuelve un String.
 *
 * Cuando no quedan más líneas, readLine() devuelve null.
 *
 * También puede utilizarse para leer desde la entrada estándar
 * combinándolo con InputStreamReader:
 *
 *     System.in -> InputStreamReader -> BufferedReader
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClaseBufferedReader {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("datos.txt"));

        // Leer una línea
        String linea = reader.readLine();

        System.out.println(linea);

        // Leer todas las líneas
        String otraLinea;

        while ((otraLinea = reader.readLine()) != null) {
            System.out.println(otraLinea);
        }

        reader.close();
    }
}
