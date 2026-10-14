package com.unai.core.memoria.modelo;

// CICLO DE VIDA DE LOS OBJETOS

// El ciclo de vida de un objeto, dentro del heap, es el siguiente:
//
//     CREACIÓN -> EN USO -> INACCESIBLE -> RECOLECTADO
//
// CREACIÓN
//
// El objeto se crea con new, que reserva espacio en el heap
// y ejecuta el constructor de la clase.
//
// EN USO
//
// El objeto vive mientras exista alguna referencia accesible
// que apunte a él, desde la pila, otro objeto o un array.
// Se puede acceder a sus atributos y invocar sus métodos.
//
// INACCESIBLE
//
// Cuando se pierden todas las referencias, el objeto queda
// huérfano en el heap. Pasa a ser candidato a ser recolectado,
// aunque todavía ocupa memoria.
// Que sea candidato no significa que se recolecte de inmediato:
// lo decide el GC en el momento que considere oportuno.
//
// RECOLECTADO
//
// El GC recupera el espacio del objeto y lo devuelve al heap
// para que pueda ser reutilizado.
//
// Java tuvo un mecanismo de finalización (finalize()) que se
// ejecutaba antes de recolectar el objeto. Está obsoleto y no
// debe utilizarse: su ejecución no es fiable ni está garantizada.
// Para liberar recursos, se utilizan los bloques try-with-resources
// y la interfaz AutoCloseable.

// Ejemplo

public class CicloDeVida {

    static class Partida {

        // El constructor se ejecuta en el momento de la creación.
        Partida() {
            System.out.println("Creado: constructor ejecutado");
        }

        void jugar() {
            System.out.println("En uso: método invocado");
        }
    }

    // La referencia al objeto es local a este método.
    static void jugarPartida() {

        Partida partida = new Partida();

        partida.jugar();

        // Al terminar el método, su marco de pila se elimina
        // y con él la referencia partida.
        System.out.println("Fin del método: la referencia local desaparece");
    }

    public static void main(String[] args) {

        jugarPartida();

        // El objeto sigue en el heap, pero sin ninguna
        // referencia que apunte a él.
        System.out.println("El objeto queda inaccesible en el heap");

        // El GC lo reciclará cuando lo considere oportuno.
        System.out.println("Pendiente de recolección por el GC");
    }
}

// Salida:
// Creado: constructor ejecutado
// En uso: método invocado
// Fin del método: la referencia local desaparece
// El objeto queda inaccesible en el heap
// Pendiente de recolección por el GC
