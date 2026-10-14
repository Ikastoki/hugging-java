package com.unai.core.jvm.ciclo;

// CARGA DE CLASES

// La carga de clases es la fase en la que la JVM localiza el
// fichero .class de una clase y lo convierte en un objeto Class
// en la metaspace.
//
// La carga es perezosa: normalmente una clase se carga cuando se
// utiliza por primera vez, no al arrancar el programa.
//
// La primera utilización activa de una clase puede ser:
//
// - Crear un objeto con new.
// - Invocar un método estático.
// - Acceder a un atributo estático que no sea una constante
//   compilable.
// - Utilizar la reflexión (Class.forName).
// - Iniciar la clase que contiene el método main.
// - Que una subclase se inicialice, lo que obliga a inicializar
//   también a su superclase.
//
// En cambio, estas operaciones NO cargan la clase:
//
// - Referenciar una constante static final con valor compilable.
// - Usar la clase como tipo en una declaración.
// - Acceder a un atributo estático de una superclase desde una
//   subclase.
//
// Después de cargarla, la JVM verifica, enlaza e inicializa la
// clase antes de poder utilizarla; esas fases se ven en los
// siguientes temas.

// Ejemplo

public class CargaDeClases {

    static final int CONSTANTE = 42;

    static class Cargada {

        // Los bloques estáticos se ejecutan al inicializar la
        // clase, es decir, en su primera utilización activa.
        static {
            System.out.println("Primer uso: la clase se carga e inicializa");
        }

        int valor;
    }

    public static void main(String[] args) {

        System.out.println("Inicio de main");

        // Acceder a la constante no carga ninguna clase:
        // su valor ya está en el bytecode.
        System.out.println("Constante: " + CONSTANTE);

        // La clase Cargada se carga aquí, en el new.
        Cargada objeto = new Cargada();

        System.out.println("Valor: " + objeto.valor);
    }
}

// Salida:
// Inicio de main
// Constante: 42
// Primer uso: la clase se carga e inicializa
// Valor: 0
