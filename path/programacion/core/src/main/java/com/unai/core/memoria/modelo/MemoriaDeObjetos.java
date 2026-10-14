package com.unai.core.memoria.modelo;

// MEMORIA DE OBJETOS

// Un objeto creado con new ocupa un espacio en el heap.
// Ese espacio contiene dos partes:
//
// - La cabecera: información común a todos los objetos, como el
//   puntero a la definición de su clase (en la metaspace) y datos
//   usados por el GC y por synchronized.
// - Los atributos de instancia de la clase, cada uno en su hueco.
//
// Los atributos primitivos se guardan completos dentro del objeto:
//
//     class Persona {
//         int edad;       // 4 bytes dentro del objeto
//         boolean activo; // 1 byte dentro del objeto
//     }
//
// Los atributos de tipo de referencia guardan una referencia;
// el objeto al que apuntan vive en otra zona del heap.
//
//     class Persona {
//         String nombre; // la referencia está dentro del objeto,
//                        // el texto está en otro objeto
//     }
//
// Los arrays también son objetos: tienen cabecera, la longitud
// y los elementos.
//
// Los tamaños exactos dependen de la JVM y de la plataforma, y
// el JVM alinea los objetos a múltiplos de un tamaño determinado.
// Lo importante es el concepto: cada objeto lleva su estado dentro
// y las referencias encadenan objetos entre sí.

// Ejemplo

public class MemoriaDeObjetos {

    static class Direccion {

        String ciudad;
    }

    static class Persona {

        // Atributos primitivos: guardados dentro del objeto.
        int edad;
        boolean activo;

        // Atributos de referencia: guardan una referencia;
        // el objeto apuntado vive en el heap.
        String nombre;
        Direccion direccion;
    }

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.edad = 25;
        persona.activo = true;

        // persona.nombre apunta a otro objeto del heap
        // (el texto "Ana").
        persona.nombre = "Ana";

        // persona.direccion apunta a un tercer objeto,
        // que a su vez contiene otra referencia.
        Direccion direccion = new Direccion();
        direccion.ciudad = "Bilbao";
        persona.direccion = direccion;

        // Para imprimir la ciudad se recorre la cadena de
        // referencias: persona -> direccion -> "Bilbao".
        System.out.println(persona.nombre + ", " + persona.direccion.ciudad);

        // Un array también es un objeto del heap.
        int[] notas = new int[3];
        notas[0] = 8;

        // La longitud es un dato propio del array.
        System.out.println("Notas: " + notas.length + ", primera: " + notas[0]);
    }
}

// Salida:
// Ana, Bilbao
// Notas: 3, primera: 8
