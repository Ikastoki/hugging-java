package com.unai.core.metodos.sobrecarga;

// ============================================================
// RECURSIÓN
// ============================================================
//
// La recursión consiste en que un método se llama a sí mismo.
//
// Una función recursiva necesita normalmente dos partes:
//
// - Caso base:
//   Condición que detiene la recursión.
//
// - Caso recursivo:
//   Parte donde el método vuelve a llamarse a sí mismo.
//
// En cada llamada recursiva se crea un nuevo stack frame
// en la pila de llamadas.
//
// Por ejemplo:
//
// factorial(4)
//     ↓
// factorial(3)
//     ↓
// factorial(2)
//     ↓
// factorial(1)
//     ↓
// caso base
//
// Después las llamadas empiezan a terminar en sentido inverso.
//
// Es importante que cada llamada acerque el problema al
// caso base. Si nunca se alcanza el caso base, las llamadas
// continúan hasta agotar la pila de llamadas.
//
// ============================================================

// Ejemplo: calcular el factorial de un número
//
// 5! = 5 × 4 × 3 × 2 × 1 = 120

public class Recursion {

    static int factorial(int numero) {

        // Caso base
        if (numero == 1) {
            return 1;
        }

        // Caso recursivo
        return numero * factorial(numero - 1);
    }

    public static void main(String[] args) {

        int resultado = factorial(5);

        System.out.println(resultado);
    }
}

/*
 * Ejecución:
 * 
 * factorial(5)
 * → 5 * factorial(4)
 * → 4 * factorial(3)
 * → 3 * factorial(2)
 * → 2 * factorial(1)
 * → 1
 * 
 * Después se resuelven las llamadas:
 * 
 * factorial(1) → 1
 * factorial(2) → 2 * 1 = 2
 * factorial(3) → 3 * 2 = 6
 * factorial(4) → 4 * 6 = 24
 * factorial(5) → 5 * 24 = 120
 */