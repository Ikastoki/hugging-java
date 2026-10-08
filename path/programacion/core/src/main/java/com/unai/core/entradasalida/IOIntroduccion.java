package com.unai.core.entradasalida;

/*
 * JAVA I/O BÁSICO
 * (Una introducción, más detalles en persistencia y gestión de ficheros)
 *
 * I/O significa Input / Output:
 *
 *     Input  -> entrada de datos
 *     Output -> salida de datos
 *
 * Java utiliza principalmente streams (flujos) para mover datos.
 *
 * Entrada:
 *
 *     System.in
 *
 * Salida normal:
 *
 *     System.out
 *
 * Salida de errores:
 *
 *     System.err
 *
 * Para trabajar con archivos existen clases del paquete:
 *
 *     java.io
 *
 * Algunas clases importantes son:
 *
 *     InputStream  -> entrada de datos en bytes.
 *     OutputStream -> salida de datos en bytes.
 *     Reader       -> entrada de texto.
 *     Writer       -> salida de texto.
 *
 * Para leer y escribir archivos también existen clases como:
 *
 *     FileReader
 *     FileWriter
 *
 * En Java moderno también existe java.nio.file,
 * que proporciona herramientas más modernas para trabajar
 * con archivos y directorios.
 *
 * La idea fundamental es:
 *
 *     Fuente de datos -> programa -> destino de datos
 *
 * Por ejemplo:
 *
 *     teclado -> programa -> consola
 *
 * o:
 *
 *     archivo -> programa -> archivo
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOIntroduccion {

    public static void main(String[] args) throws IOException {

        // Escribir texto en un archivo
        FileWriter writer = new FileWriter("datos.txt");

        writer.write("Hola Java");
        writer.close();

        // Leer texto desde un archivo
        FileReader reader = new FileReader("datos.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        String linea = bufferedReader.readLine();

        System.out.println(linea);

        bufferedReader.close();
    }
}