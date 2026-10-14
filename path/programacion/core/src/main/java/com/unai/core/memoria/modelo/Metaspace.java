package com.unai.core.memoria.modelo;

// METASPACE

// Es la región donde la JVM guarda los metadatos de las clases
// que ha cargado:
//
// - La definición de la clase.
// - Sus métodos y atributos.
// - La información de sus constructores.
// - El objeto Class asociado a la clase.
//
// Cada clase cargada tiene un único objeto Class, que se utiliza
// para representar a la clase en tiempo de ejecución.
// Ese objeto es la puerta de entrada a la reflexión, que veremos
// más adelante.
//
// Desde Java 8, la metaspace reside en la memoria nativa del
// sistema (fuera del heap) y su tamaño crece según necesidad.
// Antes de Java 8 existía una región equivalente llamada PermGen,
// con un tamaño fijo.
//
// La metaspace se libera cuando se descarga la clase. Esto ocurre
// normalmente cuando el class loader que la cargó deja de ser
// necesario y es recolectado por el GC.
//
// No confundir:
//
// - El heap contiene los objetos creados con new, incluidas las
//   instancias de las clases.
// - La metaspace contiene la definición de las clases.

// Ejemplo

public class Metaspace {

    static class Alumno {

        String nombre;
        int nota;
    }

    public static void main(String[] args) {

        // Cada objeto está en el heap.
        Alumno alumno1 = new Alumno();
        alumno1.nombre = "Ana";
        alumno1.nota = 9;

        Alumno alumno2 = new Alumno();
        alumno2.nombre = "Luis";
        alumno2.nota = 7;

        // Son objetos distintos del heap.
        System.out.println(alumno1 == alumno2);

        // getClass() devuelve el objeto Class de la clase.
        // Los dos objetos comparten la misma clase, y por tanto
        // el mismo objeto Class, guardado en la metaspace.
        System.out.println(alumno1.getClass() == alumno2.getClass());

        // Imprimir la clase muestra su nombre completo.
        System.out.println(Alumno.class);
    }
}

// Salida:
// false
// true
// class com.unai.core.memoria.modelo.Metaspace$Alumno
