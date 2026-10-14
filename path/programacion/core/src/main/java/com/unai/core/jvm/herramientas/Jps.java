package com.unai.core.jvm.herramientas;

// JPS

// Jps (Java Process Status) lista los procesos Java que se están
// ejecutando en la máquina, con su identificador de proceso (PID).
// Es la herramienta de partida para usar las demás: para inspeccionar
// un proceso con jstack o jmap hace falta su PID.
//
//     jps
//
// Muestra una línea por proceso: PID y nombre de la clase principal.
//
// Opciones principales:
//
// -q     -> solo los PID.
// -l     -> nombre completo de la clase principal.
// -v     -> argumentos de la JVM con los que se arrancó.
// -m     -> argumentos recibidos por el método main.
//
// Requisitos y detalles:
//
// - Debe ejecutarse con un JDK, no solo con un JRE.
// - Solo ve los procesos del mismo usuario.
// - Los procesos locales se detectan mediante el mecanismo de
//   adjunción (attach API).
// - Un proceso desatendido puede no aparecer.

// Ejemplo

public class Jps {

    public static void main(String[] args) {

        System.out.println("Proceso Jps en ejecución");

        // Mantenemos el proceso vivo unos segundos para dar
        // tiempo a inspeccionarlo desde otra terminal.
        // Thread se estudiará en el bloque de concurrencia.
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Proceso terminado");
    }
}

// Uso:
//
// 1. Ejecutar este ejemplo en una terminal.
// 2. En otra terminal, ejecutar jps.
//
//     jps
//     12345 Jps
//     12346 Jps
//
// jps muestra el nombre simple de la clase principal; con -l se
// ve el nombre completo del paquete.
//
// El PID mostrado sirve para las herramientas jstack, jmap y jcmd.
//
// Salida de esta terminal:
// Proceso Jps en ejecución
// (30 segundos en bloque)
// Proceso terminado
