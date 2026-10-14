package com.unai.core.jvm.herramientas;

// JSTACK

// Jstack muestra el volcado de hilos (thread dump) de un proceso
// Java: cada hilo, su estado y la pila de llamadas que está
// ejecutando.
//
//     jstack PID
//
// Información que aporta:
//
// - Estado de cada hilo: RUNNABLE, WAITING, TIMED_WAITING,
//   BLOCKED o TERMINATED.
// - Las llamadas en curso de cada hilo.
// - Los bloqueos que espera cada hilo y quién los tiene.
// - Los interbloqueos (deadlocks) detectados, señalados con
//   "Found one Java-level deadlock".
//
// Es la herramienta clave cuando una aplicación no responde:
// permite ver en qué están los hilos en ese momento.
//
// Opciones: -l añade información de bloqueos y propiedad.
//
// En este ejemplo se provoca un interbloqueo de forma intencionada
// para verlo con jstack. Es un ejemplo negativo: el programa queda
// bloqueado a propósito y hay que terminarlo con Ctrl+C.

// Ejemplo

import java.util.concurrent.CountDownLatch;

public class Jstack {

    static final Object recursoA = new Object();
    static final Object recursoB = new Object();

    // Cuenta las señales de los dos hilos: evita que uno de ellos
    // consiga los dos recursos antes de que el otro empiece.
    // CountDownLatch pertenece a java.util.concurrent y se verá
    // en el bloque de concurrencia.
    static final CountDownLatch listos = new CountDownLatch(2);

    static void caminoUno() {
        synchronized (recursoA) {
            listos.countDown();
            esperarSenales();

            // Quiere recursoB, que tiene el otro hilo.
            synchronized (recursoB) {
                System.out.println("Hilo uno: recursos obtenidos");
            }
        }
    }

    static void caminoDos() {
        synchronized (recursoB) {
            listos.countDown();
            esperarSenales();

            // Quiere recursoA, que tiene el otro hilo.
            synchronized (recursoA) {
                System.out.println("Hilo dos: recursos obtenidos");
            }
        }
    }

    static void esperarSenales() {
        try {
            listos.await();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {

        Thread hiloUno = new Thread(() -> caminoUno(), "hilo-uno");
        Thread hiloDos = new Thread(() -> caminoDos(), "hilo-dos");

        hiloUno.start();
        hiloDos.start();

        // Cada hilo tiene un recurso y espera el del otro:
        // interbloqueo permanente.
        System.out.println("Interbloqueo provocado; el programa queda bloqueado");
        System.out.println("Detener con Ctrl+C");
    }
}

// Uso:
//
// 1. Ejecutar este ejemplo; se bloqueará a propósito.
// 2. Obtener su PID con jps.
// 3. Ejecutar jstack PID en otra terminal.
//
// En el volcado aparecerá:
//
//     Found one Java-level deadlock:
//     "hilo-uno":
//       waiting to lock monitor ... (recursoB)
//       which is held by "hilo-dos"
//     "hilo-dos":
//       waiting to lock monitor ... (recursoA)
//       which is held by "hilo-uno"
//
// Salida antes de bloquearse:
// Interbloqueo provocado; el programa queda bloqueado
// Detener con Ctrl+C
