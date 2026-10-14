package com.unai.core.jvm.ciclo;

// COMPILACIÓN JIT

// Describe cómo evoluciona la ejecución de un método a lo largo
// del tiempo, desde que empieza a ejecutarse hasta que el JIT
// lo convierte en código nativo.
//
// Fases de un método:
//
// INTERPRETADO
// Al principio, el intérprete ejecuta el bytecode instrucción
// a instrucción. Es el arranque más rápido posible.
//
// CALIENTE
// La JVM cuenta invocaciones del método y vueltas de bucle.
// Cuando superan un umbral, el método es candidato a compilarse.
//
// COMPILADO
// El compilador C1 compila pronto, con pocas optimizaciones.
// Después, el C2 recompila el método con optimizaciones más
// agresivas, apoyado en los datos reunidos durante la ejecución.
//
// SUSTITUCIÓN EN LA PILA (OSR)
// Permite compilar un bucle que ya está en ejecución, sin
// esperar a que el método se vuelva a invocar.
//
// DESOPTIMIZACIÓN
// Si una suposición del código compilado deja de cumplirse,
// la JVM lo descarta y el método vuelve a interpretarse,
// hasta que pueda compilarse de nuevo.
//
// Este proceso es automático. El comportamiento del programa es
// idéntico en todas las fases; solo cambia la velocidad.

// Ejemplo

public class CompilacionJit {

    static long calcular(int vueltas) {

        long total = 0;

        for (int i = 0; i < vueltas; i++) {
            total += i % 10;
        }

        return total;
    }

    public static void main(String[] args) {

        // Fase interpretada.
        long resultado = calcular(1000);
        System.out.println("Interpretado: " + resultado);

        // Muchas invocaciones: el método se vuelve caliente y
        // pasa por los compiladores C1 y C2.
        for (int i = 0; i < 50000; i++) {
            resultado = calcular(1000);
        }

        // Ya compilado a código nativo.
        System.out.println("Compilado: " + resultado);

        // El resultado no cambia en ninguna fase.
        System.out.println("Mismo resultado siempre: " + (resultado == calcular(1000)));
    }
}

// Salida:
// Interpretado: 4500
// Compilado: 4500
// Mismo resultado siempre: true
