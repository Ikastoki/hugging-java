package com.unai.core.jvm.ciclo;

// ENLAZADO

// El enlazado (linking) une la clase cargada con el resto del
// programa. Se compone de tres fases, en este orden:
//
// PREPARACIÓN
//
// La JVM reserva memoria para los atributos estáticos de la clase
// y les asigna sus valores por defecto: 0 para los numéricos,
// false para boolean y null para las referencias.
// En esta fase el atributo estático todavía no tiene el valor
// que indica el código fuente.
//
// RESOLUCIÓN
//
// Las referencias simbólicas del constant pool se sustituyen por
// referencias directas a las clases, métodos y campos reales.
// Por ejemplo, el nombre "com.ejemplo.Servicio" se convierte en
// una referencia al objeto Class correspondiente.
// Esta fase puede ser perezosa: la JVM puede posponerla hasta
// el momento en que la referencia se utiliza por primera vez.
//
// INICIALIZACIÓN
//
// La última fase: se ejecutan los bloques estáticos y los
// initializadores de los atributos estáticos, y los atributos
// toman sus valores definitivos.
//
// Orden completo:
//
//     carga -> verificación -> preparación -> resolución
//           -> inicialización -> ejecución

// Ejemplo

public class Enlazado {

    static class Contador {

        // Tras la preparación: 0.
        static int valor;

        // Tras la inicialización: 7.
        static {
            valor = 7;
            System.out.println("Inicialización: " + valor);
        }
    }

    public static void main(String[] args) {

        System.out.println("Antes del acceso");

        // El primer acceso dispara la inicialización.
        // En este punto el atributo ya tiene su valor final.
        System.out.println("Valor estático: " + Contador.valor);
    }
}

// Salida:
// Antes del acceso
// Inicialización: 7
// Valor estático: 7
