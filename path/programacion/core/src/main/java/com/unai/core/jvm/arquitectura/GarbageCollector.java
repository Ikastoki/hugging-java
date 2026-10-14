package com.unai.core.jvm.arquitectura;

// GARBAGE COLLECTOR

// El garbage collector es el componente del execution engine
// encargado de recuperar la memoria del heap que ya no se usa.
// Trabaja sobre el heap definido en las runtime data areas.
//
// ESTRUCTURA DEL HEAP
//
// El heap se divide en generaciones:
//
//     Heap
//     +-------------------+----------------------+
//     | Generación joven  | Generación antigua   |
//     | eden | superviv.  | objetos de más edad |
//     +-------------------+----------------------+
//
// - La generación joven alberga los objetos recién creados
//   (eden) y los que sobreviven a una recolección (supervivientes).
// - La generación antigua alberga los objetos que han sobrevivido
//   durante mucho tiempo.
//
// La mayoría de los objetos son de vida corta, y esa es la base
// del diseño: la recolección de la generación joven es frecuente
// y rápida; la de la antigua, menos frecuente.
//
// FUNCIONAMIENTO
//
// - La JVM identifica los objetos vivos a partir de las raíces
//   (referencias de las pilas y atributos estáticos).
// - Los hilos del recolector trabajan en paralelo con los hilos
//   del programa, pero en determinados momentos los paran todos:
//   son los puntos seguros (safepoints) y provocan las pausas
//   de recolección.
//
// Existen varios recolectores con distintas estrategias; se ven
// en el bloque de gestión de memoria. Su elección cambia el
// rendimiento, nunca el comportamiento del programa.

// Ejemplo

public class GarbageCollector {

    static class Objeto {
        int[] datos = new int[100];
    }

    public static void main(String[] args) {

        // Muchos objetos de vida corta: viven y mueren en la
        // generación joven, sin llegar nunca a la antigua.
        int creados = 0;

        for (int i = 0; i < 1000; i++) {
            Objeto temporal = new Objeto();
            creados++;
        }

        // Un objeto de vida larga: sobrevive a las recolecciones
        // y con el tiempo se traslada a la generación antigua.
        Objeto permanente = new Objeto();

        System.out.println("Objetos de vida corta: " + creados);
        System.out.println("Objeto de vida larga: " + permanente.datos.length);

        // Se suelta la referencia; el objeto queda en el heap
        // hasta que el GC lo recolecte.
        permanente = null;

        System.out.println("Referencia soltada");
    }
}

// Salida:
// Objetos de vida corta: 1000
// Objeto de vida larga: 100
// Referencia soltada
