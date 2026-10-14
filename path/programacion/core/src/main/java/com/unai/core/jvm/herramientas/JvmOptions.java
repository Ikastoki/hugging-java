package com.unai.core.jvm.herramientas;

// JVM OPTIONS

// Son los parámetros con los que se configura la JVM al arrancar.
// Se escriben antes del nombre de la clase a ejecutar:
//
//     java [opciones JVM] -cp ruta ClasePrincipal
//
// Tipos de opciones:
//
// ESTÁNDAR (-Xms, -Xmx, -Xss)
// Documentadas y estables entre versiones:
//
// -Xms<valor>   -> tamaño inicial del heap (por ejemplo -Xms512m).
// -Xmx<valor>   -> tamaño máximo del heap (-Xmx2g).
// -Xss<valor>   -> tamaño de la pila de cada hilo (-Xss1m).
//
// AVANZADAS (-XX:)
// De la JVM de HotSpot. Las booleanas se activan con + y se
// desactivan con -:
//
//     -XX:+UseG1GC
//     -XX:-UseG1GC
//
// Las que toman valor se escriben con =:
//
//     -XX:MaxGCPauseMillis=200
//
// PROPIEDADES DEL SISTEMA (-D)
// Permiten definir pares clave=valor que el programa lee con
// System.getProperty:
//
//     java -Dmi.propiedad=valor ClasePrincipal
//
// OTRAS
//
// -cp o -classpath -> ruta de las clases.
// -jar             -> ejecuta un fichero JAR.
// -version         -> muestra la versión y termina.
// -ea o -enableassertions -> activa las aserciones.
//
// Las opciones se leen solo al arrancar la JVM; para cambiar
// algunas en ejecución existen herramientas como jcmd.

// Ejemplo

public class JvmOptions {

    public static void main(String[] args) {

        // Tamaño máximo del heap configurado con -Xmx.
        long maximaMB = Runtime.getRuntime().maxMemory() / (1024 * 1024);

        System.out.println("Heap máximo: " + maximaMB + " MB");

        // Propiedad definida con -D. Sin la opción, es null.
        String propiedad = System.getProperty("mi.propiedad");

        System.out.println("Propiedad: " + propiedad);
    }
}

// Ejecución con opciones JVM:
//
//     java -Xmx64m -Dmi.propiedad=hola \
//         com.unai.core.jvm.herramientas.JvmOptions
//
// Salida:
// Heap máximo: 64 MB
// Propiedad: hola
