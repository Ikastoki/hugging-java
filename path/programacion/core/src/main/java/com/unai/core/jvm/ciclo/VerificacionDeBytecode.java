package com.unai.core.jvm.ciclo;

// VERIFICACIÓN DE BYTECODE

// Es la fase en la que la JVM comprueba que el bytecode de una
// clase es correcto antes de ejecutarlo. Se produce durante la
// carga, antes de la inicialización de la clase.
//
// La verificación garantiza que el bytecode es seguro aunque no
// provenga del compilador de Java: podría venir de otro lenguaje,
// de una herramienta o incluso manipulado.
//
// Comprobaciones principales:
//
// - La estructura del fichero .class es válida.
// - Los saltos apuntan a posiciones válidas del código.
// - La pila de operandos no se desborda ni queda vacía cuando
//   no debe.
// - Los tipos coinciden en las operaciones y en las llamadas a
//   métodos.
// - No se hereda de clases finales ni se accede a miembros
//   prohibidos.
//
// Si el bytecode no supera la verificación, la JVM lanza
// VerifyError y la clase no llega a utilizarse.
//
// Es un proceso transparente: el programa no hace nada para
// provocarlo ni para apagarlo. La verificación es una de las
// razones por las que Java es seguro a pesar de cargar código
// externo.

// Ejemplo

public class VerificacionDeBytecode {

    static int dividir(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        // Antes de ejecutar main, la JVM ha verificado este
        // fichero: la estructura, los tipos y la pila de
        // operandos de cada método.
        System.out.println("Bytecode verificado correctamente");

        // Los tipos se comprueban también aquí: los dos
        // argumentos deben ser enteros.
        System.out.println("Resultado: " + dividir(10, 2));

        // Un error de verificación no depende del programa:
        // se produciría si el fichero .class estuviera dañado
        // o manipulado. La JVM lo rechazará con VerifyError.
    }
}

// Salida:
// Bytecode verificado correctamente
// Resultado: 5
