package com.unai.core.jvm.ciclo;

// INICIALIZACIÓN DE CLASES

// La inicialización es la fase en la que la JVM ejecuta los
// bloques estáticos y los initializadores de los atributos
// estáticos de una clase. Se ejecuta una sola vez por clase.
//
// Cuándo se inicializa una clase (primera utilización activa):
//
// - Al crear un objeto con new.
// - Al invocar un método estático.
// - Al acceder a un atributo estático que no sea constante
//   compilable.
// - Mediante la reflexión.
// - Al iniciarse la clase que contiene el método main.
// - Al inicializarse una subclase, que obliga antes a inicializar
//   a su superclase.
//
// En cambio, no la inicializan:
//
// - Las constantes static final con valor compilable.
// - Las declaraciones que solo usan la clase como tipo.
//
// Orden de ejecución:
//
// - Primero se inicializa la superclase, después la subclase.
// - Dentro de una clase, los bloques estáticos y los
//   initializadores se ejecutan en orden textual.
//
// La clase que contiene el método main se inicializa antes de
// que main se ejecute.

// Ejemplo

public class InicializacionDeClases {

    // Constante compilable: no provoca la inicialización.
    static final int CONSTANTE = 5;

    // Este initializador se ejecuta al cargarse la clase principal,
    // antes de la primera línea de main.
    static int contador = 1;

    static {
        System.out.println("La clase principal ya está inicializada");
    }

    static class Base {

        static {
            System.out.println("Base inicializada");
        }
    }

    static class Derivada extends Base {

        static {
            System.out.println("Derivada inicializada");
        }
    }

    public static void main(String[] args) {

        // Leer la constante no inicializa nada.
        System.out.println("Constante: " + CONSTANTE);

        System.out.println("Antes de crear el objeto");

        // new inicializa Derivada, y antes su superclase Base.
        Derivada objeto = new Derivada();

        System.out.println("Contador: " + contador);
    }
}

// Salida:
// La clase principal ya está inicializada
// Constante: 5
// Antes de crear el objeto
// Base inicializada
// Derivada inicializada
// Contador: 1
