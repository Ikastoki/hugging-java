package com.unai.core.jvm.arquitectura;

// EXECUTION ENGINE

// Es el componente de la JVM que ejecuta el bytecode cargado por
// el class loader. Se compone de tres piezas.
//
// INTÉRPRETE
// Lee las instrucciones del bytecode y las ejecuta una a una.
// Arranca rápido, pero su rendimiento es limitado si el mismo
// código se ejecuta muchas veces.
//
// COMPILADOR JIT
// Detecta el código que se ejecuta con frecuencia (código caliente)
// y lo traduce a código nativo de la máquina. A partir de ahí se
// ejecuta mucho más rápido.
//
// GARBAGE COLLECTOR
// Recupera la memoria del heap que ya no se utiliza.
//
// Ambos mecanismos cooperan: al principio, un método se ejecuta
// interpretado; si la JVM observa que es muy usado, lo compila.
// Si las suposiciones que hacía el código compilado dejan de
// cumplirse, la JVM puede descartarlo y volver a interpretar
// (desoptimización).
//
// Las llamadas a métodos nativos salen del engine y se ejecutan
// mediante JNI, en el lenguaje del sistema operativo.

// Ejemplo

public class ExecutionEngine {

    // Método pequeño, pero si se invoca muchas veces, el JIT
    // acabará compilándolo a código nativo.
    static int acumular(int limite) {
        int total = 0;

        for (int i = 0; i < limite; i++) {
            total += i;
        }

        return total;
    }

    public static void main(String[] args) {

        // La primera invocación se interpreta.
        System.out.println("Primera: " + acumular(1000));

        // Tras muchas invocaciones, la JVM lo considera caliente
        // y lo envía al compilador JIT.
        int total = 0;

        for (int i = 0; i < 20000; i++) {
            total = acumular(1000);
        }

        System.out.println("Tras calentarse: " + total);

        // El resultado es siempre el mismo; lo que cambia es
        // cómo lo ejecuta la JVM por dentro.
        System.out.println("Suma de 0 a 999: " + acumular(1000));
    }
}

// Salida:
// Primera: 499500
// Tras calentarse: 499500
// Suma de 0 a 999: 499500
