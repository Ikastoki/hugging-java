package com.unai.core.conceptos;

/*
================================================================================
                    JAVA CORE — COMPILACIÓN Y EJECUCIÓN
================================================================================

1. ¿QUÉ SIGNIFICA COMPILAR?

Compilar es transformar el código fuente Java (.java) en bytecode (.class).

El compilador de Java es:

    javac

Ejemplo:

    Main.java
        |
        | javac Main.java
        v
    Main.class

El archivo .java contiene el código que escribimos nosotros.

El archivo .class contiene BYTECODE, que es el código que entiende la JVM.

================================================================================
2. ¿QUÉ SIGNIFICA EJECUTAR?

Ejecutar significa poner en funcionamiento el bytecode mediante la JVM.

Para ejecutar utilizamos:

    java

Proceso:

    Main.class
        |
        | java Main
        v
    JVM
        |
        v
    Programa ejecutándose

IMPORTANTE:

    javac -> COMPILA
    java  -> EJECUTA

================================================================================
3. PROCESO COMPLETO

El proceso tradicional de un programa Java es:

    Código fuente
        |
        | javac
        v
    Bytecode
        |
        | java
        v
    JVM
        |
        v
    Programa ejecutándose


Por ejemplo:

    Main.java
       |
       | javac Main.java
       v
    Main.class
       |
       | java Main
       v
    JVM
       |
       v
    "Hola Java"


================================================================================
4. ARCHIVO .JAVA

El archivo .java contiene el código fuente.

Ejemplo:

    public class Main {
        public static void main(String[] args) {
            System.out.println("Hola Java");
        }
    }


Podemos guardar este código como:

    Main.java

El nombre del archivo debe coincidir con el nombre de una clase public.

    public class Main

    -> Main.java


================================================================================
5. COMPILACIÓN CON JAVAC

Desde la terminal podemos compilar:

    javac Main.java

Si no existen errores de compilación, se genera:

    Main.class


La compilación comprueba, entre otras cosas:

    - Sintaxis
    - Tipos
    - Estructura del código
    - Uso correcto de determinadas construcciones del lenguaje

Si existe un error, javac muestra un mensaje indicando el problema.

Ejemplo:

    Main.java

    public class Main {
        public static void main(String[] args) {
            System.out.println("Hola")
        }
    }

Falta el punto y coma.

Al ejecutar:

    javac Main.java

podemos obtener un error de compilación.


================================================================================
6. EJECUCIÓN CON JAVA

Una vez compilado:

    javac Main.java

ejecutamos:

    java Main

IMPORTANTE:

    NO hacemos:

        java Main.class

    Hacemos:

        java Main

Java recibe el nombre de la clase que queremos ejecutar.


================================================================================
7. EL MÉTODO MAIN

Por ahora utilizaremos:

    public static void main(String[] args)

Este método representa el punto de entrada de una aplicación Java tradicional.

Cuando ejecutamos:

    java Main

la JVM busca el método main de la clase Main(o de la clase Usuario,Coche,Biblioteca...).


================================================================================
8. ¿QUÉ PASA SI MODIFICAMOS EL CÓDIGO?

Supongamos:

    Main.java

    public class Main {
        public static void main(String[] args) {
            System.out.println("Hola");
        }
    }

Compilamos:

    javac Main.java

Se genera:

    Main.class

Después modificamos:

    System.out.println("Hola Java");

El archivo Main.java ha cambiado.

Tenemos que volver a compilar:

    javac Main.java

para generar un nuevo Main.class.

Después:

    java Main


La idea importante es:

    CAMBIO EN .java
          |
          v
    VOLVER A COMPILAR
          |
          v
    NUEVO .class
          |
          v
    EJECUTAR


================================================================================
9. EJEMPLO PRÁCTICO COMPLETO

Desde una terminal:

    mkdir java-repaso
    cd java-repaso

Crear:

    Main.java

Contenido:

    public class Main {
        public static void main(String[] args) {
            System.out.println("Hola desde Java");
        }
    }

Compilar:

    javac Main.java

Comprobar que se ha generado:

    Main.class

Ejecutar:

    java Main

Resultado:

    Hola desde Java


================================================================================
10. COMPILAR Y EJECUTAR EN DOS PASOS

Podemos verlo claramente:

    PASO 1 — COMPILAR

        javac Main.java

    PASO 2 — EJECUTAR

        java Main


================================================================================
11. ERROR DE COMPILACIÓN VS ERROR DE EJECUCIÓN

ERROR DE COMPILACIÓN:

Ocurre cuando javac no puede transformar correctamente el código fuente
en bytecode.

Ejemplo:

    System.out.println("Hola")

Falta:

    ;


ERROR DE EJECUCIÓN:

El programa ha conseguido compilar, pero ocurre un problema mientras
el programa está funcionando.

Por ejemplo, una operación puede provocar una excepción durante la ejecución.

La diferencia básica es:

    Compilación -> problema antes de ejecutar
    Ejecución   -> problema mientras el programa se está ejecutando


================================================================================
12. RESUMEN

    .java
       |
       | javac
       v
    .class
       |
       | java
       v
    JVM
       |
       v
    Programa ejecutándose


COMANDOS FUNDAMENTALES:

    javac Main.java
        -> compila el código fuente

    java Main
        -> ejecuta la clase Main


IDEAS CLAVE:

    - .java = código fuente
    - javac = compilador de Java
    - .class = bytecode
    - java = comando para ejecutar
    - JVM = ejecuta el bytecode
    - Hay que recompilar después de modificar el código
    - Para ejecutar usamos el nombre de la clase, no .class
*/

public class CompilacionEjecucion {

}
