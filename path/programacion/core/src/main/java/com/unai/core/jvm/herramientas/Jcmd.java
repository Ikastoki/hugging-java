package com.unai.core.jvm.herramientas;

// JCMD

// Jcmd envía comandos a una JVM en ejecución. Es la herramienta
// unificada que sustituye en la práctica a jps, jstack y jmap para
// tareas del día a día.
//
//     jps                       -> obtener el PID
//     jcmd PID help             -> lista de comandos disponibles
//
// Comandos más utilizados:
//
// VM.version          -> versión de la JVM y del sistema.
// VM.flags            -> opciones con las que funciona.
// VM.command_line     -> línea de arranque completa.
// GC.heap_info        -> estado del heap.
// GC.run              -> solicita una recolección.
// Thread.print        -> volcado de hilos, como jstack.
// GC.class_histogram  -> histograma de objetos, como jmap -histo.
// JFR.start           -> inicia Java Flight Recorder.
//
// Ventajas frente a las herramientas antiguas:
//
// - Un solo comando para muchas tareas.
// - Usa el mismo mecanismo de adjunción que jps.
// - Devuelve información más completa y estructurada.
//
// Limitación: solo actúa sobre JVM locales, no remotas.

// Ejemplo

public class Jcmd {

    public static void main(String[] args) {

        System.out.println("Programa en ejecución");

        // Se mantiene vivo para poder enviarle comandos.
        // Thread se estudiará en el bloque de concurrencia.
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
// 2. Obtener el PID con jps.
// 3. Enviar comandos desde otra terminal:
//
//     jcmd PID VM.version
//     jcmd PID VM.flags
//     jcmd PID GC.heap_info
//     jcmd PID GC.class_histogram
//     jcmd PID Thread.print
//     jcmd PID GC.run
//
// Salida de esta terminal:
// Programa en ejecución
// (60 segundos en bloque)
// Proceso terminado
