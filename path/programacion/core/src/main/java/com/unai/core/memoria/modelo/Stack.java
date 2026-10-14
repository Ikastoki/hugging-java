package com.unai.core.memoria.modelo;

// STACK

// Es la región de memoria propia de cada hilo de ejecución.
// Cada hilo tiene su propia pila, creada al iniciarse el hilo
// y destruida cuando termina.
//
// Cuando un método se invoca, la JVM añade un marco de pila
// (stack frame) a la pila de ese hilo. El marco contiene:
//
// - Las variables locales del método.
// - Los parámetros del método.
// - Un espacio para valores intermedios de las operaciones.
//
// Cuando el método termina, su marco se elimina. No hace falta
// liberar nada manualmente: la pila se gestiona sola.
//
// Los marcos se apilan y se desapilan en orden LIFO: el último
// marco añadido es el primero que se elimina.
//
// La pila tiene un tamaño limitado, configurable al arrancar la JVM.
// Si una secuencia de llamadas lo excede, se lanza StackOverflowError.
// Ocurre, por ejemplo, con un método que se llama a sí mismo sin
// una condición de parada.
//
// Una misma pila puede contener marcos de métodos de clases
// distintas, porque cada invocación crea su propio marco.

// Ejemplo

public class Stack {

    // Cada llamada a este método crea un marco nuevo con sus
    // propias copias de nivel y duplicado.
    static void invocar(int nivel) {

        int duplicado = nivel * 2;

        System.out.println("Nivel: " + nivel + " (duplicado: " + duplicado + ")");

        if (nivel < 3) {
            // Llamada recursiva: la pila crece con un marco más.
            invocar(nivel + 1);
        }

        // Al volver, el marco actual se elimina de la pila.
        System.out.println("Fin del nivel: " + nivel);
    }

    public static void main(String[] args) {

        // La pila del hilo main acumula los marcos de invocar():
        //
        //     main() -> invocar(1) -> invocar(2) -> invocar(3)
        //
        // Y se vacía en orden inverso.
        invocar(1);
    }
}

// Salida:
// Nivel: 1 (duplicado: 2)
// Nivel: 2 (duplicado: 4)
// Nivel: 3 (duplicado: 6)
// Fin del nivel: 3
// Fin del nivel: 2
// Fin del nivel: 1
