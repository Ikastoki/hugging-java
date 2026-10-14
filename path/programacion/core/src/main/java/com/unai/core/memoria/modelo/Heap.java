package com.unai.core.memoria.modelo;

// HEAP

// Es la región de memoria compartida por todos los hilos.
// En el heap viven los objetos y los arrays, que se crean
// mediante new.
//
// La referencia a un objeto se guarda en la pila o dentro de
// otro objeto, pero el objeto en sí siempre está en el heap.
//
// El heap se crea al arrancar la JVM y va creciendo según
// necesita el programa, hasta un máximo configurable.
// Si no queda espacio, se lanza OutOfMemoryError.
//
// El heap se gestiona de forma automática: los objetos que
// dejan de ser accesibles se recuperan mediante el proceso
// de garbage collection, sin que el programador tenga que
// liberarlos.
//
// Cada objeto tiene su propio espacio con sus atributos de
// instancia. Dos objetos de la misma clase comparten la
// definición de la clase, pero cada uno guarda sus valores.
//
// Un objeto solo permanece en el heap mientras exista alguna
// referencia accesible que apunte a él. Si se pierden todas
// las referencias, el objeto queda huérfano y pasa a ser
// candidato a ser recolectado.

// Ejemplo

public class Heap {

    static class Cuenta {

        String titular;
        int saldo;
    }

    public static void main(String[] args) {

        // Cada new crea un objeto nuevo en el heap.
        Cuenta cuentaAna = new Cuenta();
        cuentaAna.titular = "Ana";
        cuentaAna.saldo = 100;

        Cuenta cuentaLuis = new Cuenta();
        cuentaLuis.titular = "Luis";
        cuentaLuis.saldo = 50;

        // Dos objetos distintos: cada uno guarda sus propios valores.
        System.out.println(cuentaAna.titular + ": " + cuentaAna.saldo);
        System.out.println(cuentaLuis.titular + ": " + cuentaLuis.saldo);

        // Al asignar null se pierde la referencia desde main.
        // El objeto de Ana queda en el heap sin referencias
        // y pasa a ser candidato a recolección.
        cuentaAna = null;

        // La otra referencia sigue viva, por lo que su objeto
        // continúa utilizándose con normalidad.
        System.out.println("Referencia viva: " + cuentaLuis.titular);
    }
}

// Salida:
// Ana: 100
// Luis: 50
// Referencia viva: Luis
