package com.unai.core.memoria.gestion;

// MEMORY LEAKS

// Una fuga de memoria ocurre cuando el programa ya no necesita
// ciertos objetos, pero algo sigue manteniéndolos vivos, por lo
// que el GC no puede recolectarlos.
//
// En Java no se pierde memoria en el sentido de que queden
// agujeros: la memoria se pierde porque queda ocupada por
// objetos inútiles que siguen siendo accesibles.
//
// Causas habituales:
//
// - Colecciones estáticas a las que se les añaden elementos pero
//   nunca se les quitan.
// - Cachés sin límite de tamaño.
// - Listeners u observadores que no se dan de baja.
// - Recursos abiertos que no se cierran.
// - Atributos que guardan referencias a objetos grandes sin
//   necesidad.
//
// Las referencias circulares no son una fuga en Java: el GC sabe
// recolectar grupos de objetos que solo se referencian entre sí.
//
// Síntomas: la aplicación consume cada vez más memoria y acaba
// lanzando OutOfMemoryError, a veces tras un largo periodo de
// funcionamiento anormal.
//
// Detección: herramientas de diagnóstico como jmap, los volcados
// de heap (heap dump) y analizadores de memoria.

// Ejemplo

import java.util.ArrayList;
import java.util.List;

public class MemoryLeaks {

    // Una colección estática vive mientras la clase esté cargada.
    // Todo lo que se añade a la lista permanece accesible.
    static List<String> registros = new ArrayList<>();

    static void registrar(String evento) {

        // En un programa real, cada registro podría ser un objeto
        // mucho mayor. Aquí se ve el principio.
        for (int i = 0; i < 10000; i++) {
            registros.add(evento + i);
        }
    }

    public static void main(String[] args) {

        registrar("evento");
        System.out.println("Registros: " + registros.size());

        registrar("evento");
        System.out.println("Registros: " + registros.size());

        // Ninguno de esos 20000 elementos puede ser recolectado:
        // la referencia estática los mantiene vivos.
        // La memoria solo se recupera al quitarlos de la lista.
        registros.clear();

        System.out.println("Registros tras limpiar: " + registros.size());
    }
}

// Salida:
// Registros: 10000
// Registros: 20000
// Registros tras limpiar: 0
