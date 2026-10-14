package com.unai.core.jvm.herramientas;

// JMAP

// Jmap (Memory Map) informa del uso de memoria de un proceso Java
// en ejecución.
//
//     jmap PID
//
// Opciones principales:
//
// -histo:live
// Muestra un histograma de los objetos del heap: clase, número de
// instancias y bytes ocupados. El filtro live fuerza una
// recolección antes, para contar solo los objetos vivos.
//
//     jmap -histo:live PID
//
// -heap
// Muestra la configuración y el uso del heap por generaciones.
//
// -dump
// Genera un volcado de heap (heap dump) en fichero, para analizarlo
// con una herramienta de visualización.
//
//     jmap -dump:format=b,file=heap.bin,live PID
//
// Es la herramienta habitual para investigar una fuga de memoria
// o un OutOfMemoryError: el histograma muestra qué clases ocupan
// más memoria, y el volcado permite ver qué mantiene vivos esos
// objetos.

// Ejemplo

import java.util.ArrayList;
import java.util.List;

public class Jmap {

    static class Registro {
        byte[] contenido = new byte[1024];
    }

    // Objetos que permanecen vivos: la referencia estática
    // impide que el GC los recolecte.
    static List<Registro> registros = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < 5000; i++) {
            registros.add(new Registro());
        }

        System.out.println("Registros en memoria: " + registros.size());
        System.out.println("Mantenido por la referencia estática");

        // Se mantiene vivo para poder inspeccionarlo.
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Proceso terminado");
    }
}

// Uso:
//
// 1. Ejecutar este ejemplo.
// 2. Obtener su PID con jps.
// 3. Ejecutar jmap -histo:live PID en otra terminal.
//
// En el histograma aparecerán dos líneas relevantes: la clase
// Registro, con unas 5000 instancias, y los arrays de bytes [B,
// que cada Registro referencia y que el histograma lista por
// separado con muchos más bytes:
//
//      num     #instances         #bytes  class name
//     ------------------------------------------------
//        1:         5000          80000  com.unai...Jmap$Registro
//        2:        13770        5590560  [B
//
// El número de [B es mayor porque el propio JVM crea arrays
// internos además de los del programa.
//
// Salida de esta terminal:
// Registros en memoria: 5000
// Mantenido por la referencia estática
// (60 segundos en bloque)
// Proceso terminado
