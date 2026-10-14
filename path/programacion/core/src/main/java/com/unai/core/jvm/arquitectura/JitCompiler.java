package com.unai.core.jvm.arquitectura;

// JIT COMPILER

// El compilador JIT (Just In Time) es la parte del execution
// engine que traduce el bytecode a código nativo durante la
// ejecución.
//
// En HotSpot conviven dos compiladores:
//
// C1 (cliente)
// Compila rápido, con optimizaciones sencillas. Se usa para
// código que se ejecuta pocas veces.
//
// C2 (servidor)
// Compila más despacio, con optimizaciones agresivas. Se usa
// para el código más caliente.
//
// La compilación por niveles (tiered compilation) combina ambos:
// el código empieza interpretado, pasa por el C1 y acaba en el
// C2 si sigue siendo caliente.
//
// La JVM detecta el código caliente mediante contadores de
// invocación de los métodos y contadores de bucles. Gracias a
// la sustitución en la pila (OSR), también puede compilar un
// bucle que ya está en ejecución, sin reiniciarlo.
//
// Optimizaciones habituales del JIT:
//
// - Inlining: sustituir una llamada a método pequeño por su cuerpo.
// - Plegado de constantes: calcular valores en compilación.
// - Análisis de escape (escape analysis): si un objeto no escapa
//   del método, puede asignarse en la pila o eliminarse.
// - Eliminación de bloqueos innecesarios.
//
// Si una suposición del código compilado deja de cumplirse, la
// JVM descarta ese código y vuelve a interpretar: desoptimización.

// Ejemplo

public class JitCompiler {

    // Método candidato a ser compilado por el JIT.
    static long cuadrado(int valor) {
        return (long) valor * valor;
    }

    public static void main(String[] args) {

        long resultado = 0;

        // Las primeras invocaciones se interpretan.
        // Al superar el umbral, la JVM compila el método.
        for (int i = 0; i < 50000; i++) {
            resultado = cuadrado(i);
        }

        System.out.println("Resultado: " + resultado);

        // 49999 * 49999 = 2499900001.
        // Con i tan grande, un entero no bastaría: se usa long
        // para no desbordar. El resultado es el mismo antes y
        // después de la compilación.
        System.out.println("Fin del ejemplo");
    }
}

// Salida:
// Resultado: 2499900001
// Fin del ejemplo
