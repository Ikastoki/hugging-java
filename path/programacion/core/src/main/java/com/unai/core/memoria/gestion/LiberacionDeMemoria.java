package com.unai.core.memoria.gestion;

// LIBERACIÓN DE MEMORIA

// En Java, la memoria del heap se libera de forma automática.
// Cuando un objeto deja de ser accesible, el garbage collection
// recupera su espacio. No existe ninguna instrucción equivalente
// a free() o delete().
//
// Lo que el programador sí debe liberar son los recursos externos
// que un objeto pueda haber abierto: ficheros, conexiones de red,
// sockets o conexiones de base de datos.
// Esos recursos pertenecen al sistema operativo y no los gestiona
// el GC. Se liberan con try-with-resources e implements AutoCloseable.
// Al cerrarse el recurso, la memoria del objeto asociado también
// queda disponible para el GC.
//
// System.gc() solo solicita a la JVM que considere ejecutar una
// recolección. No garantiza que se haga ni cuándo.
//
// Java tuvo los métodos finalize() y runFinalization(), ya
// obsoletos. No deben utilizarse: su ejecución no está garantizada
// y complican la gestión de recursos.
//
// También existen las referencias débiles (WeakReference) y suaves
// (SoftReference), que permiten conservar objetos sin impedir que
// sean recolectados. Son útiles para implementar cachés.

// Ejemplo

public class LiberacionDeMemoria {

    // Recurso externo simulado: su memoria se libera con el GC,
    // pero el recurso que representa debe liberarse explícitamente.
    static class Recurso implements AutoCloseable {

        @Override
        public void close() {
            System.out.println("Recurso liberado");
        }
    }

    static void procesar() {

        // try-with-resources cierra el recurso automáticamente,
        // aunque el bloque lance una excepción.
        try (Recurso recurso = new Recurso()) {
            System.out.println("Trabajando con el recurso");
        }

        // Al salir del método, la referencia a este objeto
        // desaparece y el objeto queda listo para el GC.
        Object temporal = new Object();
        temporal = null;

        System.out.println("Objeto temporal sin referencias");
    }

    public static void main(String[] args) {

        procesar();

        // Sugerencia al GC, no una orden.
        System.gc();

        System.out.println("El GC liberará la memoria cuando lo considere");
    }
}

// Salida:
// Trabajando con el recurso
// Recurso liberado
// Objeto temporal sin referencias
// El GC liberará la memoria cuando lo considere
