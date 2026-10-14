package com.unai.core.memoria.modelo;

// GARBAGE COLLECTION

// Es el proceso mediante el cual la JVM recupera la memoria del
// heap ocupada por objetos que ya no son accesibles.
//
// El programador no llama al GC ni libera memoria manualmente,
// a diferencia de lenguajes como C o C++.
//
// CÓMO DECIDE EL GC QUÉ RECOLECTAR
//
// Parte de un conjunto de puntos de partida llamados raíces
// (GC roots), entre los que están las referencias de las pilas
// de los hilos y los atributos estáticos.
// Desde cada raíz se sigue la cadena de referencias: los objetos
// alcanzables son los vivos; el resto se recolecta.
// El algoritmo básico se conoce como marcar y barrer
// (mark and sweep): se marcan los vivos y se libera el resto.
//
// LA JVM LO HACE POR SU CUENTA
//
// System.gc() solo es una sugerencia a la JVM.
// No obliga a ejecutar el GC ni garantiza cuándo se hará.
// En la práctica suele provocar una recolección, pero el
// comportamiento no está especificado.
//
// Cuando el GC trabaja, puede haber pausas en la ejecución
// de los hilos, llamadas stop-the-world.
//
// Las diferentes implementaciones de GC (G1, ZGC, Shenandoah...)
// y sus parámetros se estudian en el bloque de gestión de memoria.

// Ejemplo

import java.lang.ref.WeakReference;

public class GarbageCollection {

    static class ObjetoTemporal {
    }

    public static void main(String[] args) {

        // La referencia fuerte mantiene vivo al objeto.
        ObjetoTemporal objeto = new ObjetoTemporal();

        // La referencia débil (WeakReference) no impide que el
        // objeto sea recolectado: get() devuelve el objeto mientras
        // siga vivo y null una vez recolectado.
        WeakReference<ObjetoTemporal> referenciaDebil =
                new WeakReference<>(objeto);

        System.out.println("Objeto vivo: " + (referenciaDebil.get() != null));

        // Se pierde la única referencia fuerte.
        objeto = null;

        // System.gc() es una sugerencia, no una orden.
        // Se repite la llamada por si la JVM no hiciera nada
        // la primera vez.
        while (referenciaDebil.get() != null) {
            System.gc();
        }

        // El GC ha recuperado el espacio del objeto.
        System.out.println("Objeto vivo: " + (referenciaDebil.get() != null));
    }
}

// Salida:
// Objeto vivo: true
// Objeto vivo: false
