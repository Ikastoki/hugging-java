package com.unai.core.jvm.ciclo;

// EJECUCIÓN DEL BYTECODE

// Una vez cargada, verificada, enlazada e inicializada la clase,
// el execution engine ejecuta sus instrucciones.
//
// El trabajo lo hace el marco de pila (stack frame) del método:
//
// - Un array de variables locales.
// - Una pila de operandos, donde se apilan los valores intermedios
//   de las operaciones.
//
// Las instrucciones del bytecode leen y escriben en esa pila de
// operandos. Por ejemplo, para int c = a + b * 2:
//
//     iload_0   -> apila a
//     iload_1   -> apila b
//     iconst_2  -> apila 2
//     imul      -> multiplica b * 2
//     iadd      -> suma a + (b * 2)
//     istore_2  -> guarda el resultado en la variable local c
//     iload_2   -> apila c
//     ireturn   -> devuelve c
//
// Cada instrucción se ejecuta de forma atómica respecto al hilo,
// y el contador de programa avanza de una a otra.
// Si el método se ejecuta muchas veces, el compilador JIT
// interviene y pasa a ejecutar código nativo.

// Ejemplo

public class EjecucionDelBytecode {

    static int operacion(int a, int b) {
        int c = a + b * 2;
        return c;
    }

    public static void main(String[] args) {

        // La pila de operandos del main va y viene mientras se
        // calcula e imprime el resultado.
        int resultado = operacion(3, 4);

        // 3 + 4 * 2 = 11.
        System.out.println("Resultado: " + resultado);
    }
}

// Salida:
// Resultado: 11

// Bytecode real de operacion(int, int), con javap -c:
//
//   static int operacion(int, int);
//     Code:
//        0: iload_0
//        1: iload_1
//        2: iconst_2
//        3: imul
//        4: iadd
//        5: istore_2
//        6: iload_2
//        7: ireturn
