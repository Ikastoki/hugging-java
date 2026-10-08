package com.unai.core.metodos.sobrecarga;

// ============================================================

// PILA DE LLAMADAS
// ============================================================
//
// La pila de llamadas (Call Stack) es una estructura de memoria
// que mantiene información sobre los métodos que están siendo
// ejecutados.
//
// Funciona con el principio LIFO:
// Last In, First Out
// El último método que entra es el primero que sale.
//
// Cada vez que se invoca un método, se crea un "stack frame"
// (marco de pila) para ese método.
//
// Un stack frame contiene información como:
// - Parámetros del método.
// - Variables locales.
// - Información necesaria para regresar al método que lo llamó.
//
// Cuando un método termina:
// - Su stack frame se elimina de la pila.
// - La ejecución vuelve al método que hizo la llamada.
//
// El método main() suele estar en la parte inferior de la pila.
// Si main() llama a metodoA(), y metodoA() llama a metodoB():
//
//     metodoB()
//     metodoA()
//     main()
//
// metodoB() termina primero, después metodoA() y finalmente main().
//
// La pila crece cuando se hacen llamadas a métodos y disminuye
// cuando estos métodos terminan.
//
// Si un método se llama a sí mismo repetidamente mediante
// recursión sin una condición de parada adecuada, la pila puede
// llenarse y producir un StackOverflowError.
//
// ============================================================

public class PilaDeLlamada {

    public static void main(String[] args) {
        System.out.println("Inicio de main");

        metodoA();

        System.out.println("Fin de main");
    }

    static void metodoA() {
        System.out.println("Inicio de metodoA");

        metodoB();

        System.out.println("Fin de metodoA");
    }

    static void metodoB() {
        System.out.println("Ejecutando metodoB");
    }
}

/*
 * Orden de ejecución:
 * 
 * 1. main() entra en la pila.
 * 2. main() llama a metodoA().
 * 3. metodoA() entra en la pila.
 * 4. metodoA() llama a metodoB().
 * 5. metodoB() entra en la pila.
 * 6. metodoB() termina y sale de la pila.
 * 7. La ejecución vuelve a metodoA().
 * 8. metodoA() termina y sale de la pila.
 * 9. La ejecución vuelve a main().
 * 10. main() termina y sale de la pila.
 * 
 * Visualmente:
 * 
 * ┌─────────────┐
 * │ metodoB() │ ← entra último
 * ├─────────────┤
 * │ metodoA() │
 * ├─────────────┤
 * │ main() │ ← entra primero
 * └─────────────┘
 * 
 * Al terminar metodoB():
 * 
 * ┌─────────────┐
 * │ metodoA() │
 * ├─────────────┤
 * │ main() │
 * └─────────────┘
 * 
 * Al terminar metodoA():
 * 
 * ┌─────────────┐
 * │ main() │
 * └─────────────┘
 */
