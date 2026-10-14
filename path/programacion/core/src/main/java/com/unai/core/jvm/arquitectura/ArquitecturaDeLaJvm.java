package com.unai.core.jvm.arquitectura;

// ARQUITECTURA DE LA JVM

// La JVM (Java Virtual Machine) es el componente que ejecuta el
// bytecode de Java. Forma parte del entorno de ejecución y está
// definida por una especificación propia, independiente del
// sistema operativo: por eso el mismo bytecode se ejecuta en
// distintas plataformas.
//
// Componentes principales:
//
// CLASS LOADER SUBSYSTEM
// Carga, verifica, enlaza e inicializa las clases, y las lleva a
// la metaspace.
//
// RUNTIME DATA AREAS
// Las regiones de memoria donde se guarda todo durante la
// ejecución: heap, pilas de hilos y metaspace.
//
// EXECUTION ENGINE
// Ejecuta el bytecode. Combina un intérprete, que ejecuta las
// instrucciones una a una, con el compilador JIT, que traduce a
// código nativo las partes más utilizadas. Incluye también al
// garbage collector.
//
// NATIVE METHOD INTERFACE (JNI) Y LIBRERÍAS NATIVAS
// Permiten que el código Java invoque código del sistema
// operativo, y a la inversa.
//
// Recorrido completo:
//
//     Código fuente (.java)
//              |
//         javac (compilador del JDK)
//              v
//       Bytecode (.class)
//              |
//     +--------v--------------------------------+
//     | Class Loader Subsystem                 |
//     | carga -> verifica -> enlaza -> inicia  |
//     +--------+--------------------------------+
//              |
//     +--------v--------------------------------+
//     | Runtime Data Areas                      |
//     | heap | pilas | metaspace               |
//     +--------+--------------------------------+
//              |
//     +--------v--------------------------------+
//     | Execution Engine                        |
//     | intérprete | JIT | GC                   |
//     +--------+--------------------------------+
//              |
//     JNI y librerías nativas del sistema
//
// Existen varias implementaciones de JVM: la más extendida es
// HotSpot, la de OpenJDK y Oracle. Otras son OpenJ9 o GraalVM.

// Ejemplo

public class ArquitecturaDeLaJvm {

    static class Persona {
        String nombre;
    }

    public static void main(String[] args) {

        // La definición de la clase Persona se carga en la
        // metaspace mediante el class loader.
        System.out.println("Clase cargada: " + Persona.class.getSimpleName());

        // El objeto se crea en el heap.
        Persona persona = new Persona();
        persona.nombre = "Ana";

        // La variable local vive en la pila del hilo main.
        System.out.println("Objeto en el heap: " + persona.nombre);

        // Las instrucciones de este método las ejecuta el
        // execution engine: primero el intérprete y, si el
        // método se ejecuta muchas veces, también el JIT.
        int total = sumar(2, 3);

        System.out.println("Execution engine: " + total);
    }

    static int sumar(int a, int b) {
        return a + b;
    }
}

// Salida:
// Clase cargada: Persona
// Objeto en el heap: Ana
// Execution engine: 5
