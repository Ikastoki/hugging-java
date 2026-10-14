package com.unai.core.jvm.herramientas;

// JVM DIAGNOSTICS

// Son los mecanismos con los que se observa lo que ocurre por
// dentro de la JVM sin modificar el código del programa.
//
// REGISTROS (LOGS)
//
// -Xlog:gc             -> registra cada recolección de basura.
// -Xlog:class+load    -> registra cada clase cargada.
// -Xlog:os+thread     -> registra la creación de hilos.
//
// VOLCADO DE HEAP EN OUTOFMEMORYERROR
//
// -XX:+HeapDumpOnOutOfMemoryError
// -XX:HeapDumpPath=ruta/del/fichero.hprof
//
// Genera un fichero con el estado completo del heap cuando se
// produce un OutOfMemoryError, para analizarlo después.
//
// JAVA FLIGHT RECORDER (JFR)
//
//     -XX:StartFlightRecording=duration=60s,filename=salida.jfr
//
// Graba eventos de la JVM (CPU, memoria, GC, hilos) con un
// coste muy bajo. El fichero se analiza con JMC.
//
// HERRAMIENTAS DE LA LÍNEA DE COMANDOS
//
// jps, jstack, jmap, jcmd y jstat inspeccionan procesos en
// ejecución. Se ven en los temas siguientes.
//
// JMX
//
// Permite consultar métricas de la JVM y modificar algunas
// configuraciones en ejecución, habitualmente desde frameworks
// de monitorización.

// Ejemplo

public class JvmDiagnostics {

    public static void main(String[] args) {

        // Este programa no requiere diagnóstico para funcionar:
        // las opciones de diagnóstico se añaden al arrancarlo.
        System.out.println("Programa en ejecución");

        // Registros de GC y de carga de clases:
        //
        //     java -Xlog:gc -Xlog:class+load \
        //         com.unai.core.jvm.herramientas.JvmDiagnostics
        //
        // Volcado de heap si hay agotamiento de memoria:
        //
        //     java -XX:+HeapDumpOnOutOfMemoryError \
        //         -XX:HeapDumpPath=heap.hprof \
        //         com.unai.core.jvm.herramientas.JvmDiagnostics

        System.out.println("Añade las opciones de diagnóstico al arrancar");
    }
}

// Salida:
// Programa en ejecución
// Añade las opciones de diagnóstico al arrancar
