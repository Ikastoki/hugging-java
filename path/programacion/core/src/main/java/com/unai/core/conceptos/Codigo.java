package com.unai.core.conceptos;

/*
================================================================================
              JAVA CORE — CÓDIGO FUENTE, BYTECODE Y CÓDIGO MÁQUINA
================================================================================

1. CÓDIGO FUENTE

El código fuente es el código que escribimos los programadores.

En Java, normalmente se guarda en archivos con extensión:

    .java

Ejemplo:

    Main.java


Contenido:

    public class Main {
        public static void main(String[] args) {
            System.out.println("Hola Java");
        }
    }


El código fuente está escrito utilizando las reglas y sintaxis del lenguaje Java.

Es legible y modificable por los programadores.


================================================================================
2. BYTECODE

Cuando compilamos código Java:

    javac Main.java

el compilador transforma el código fuente en BYTECODE.

El bytecode se guarda normalmente en:

    Main.class


Proceso:

    Main.java
        |
        | javac
        v
    Main.class


El bytecode NO es código máquina específico de un procesador.

Es un código intermedio diseñado para ser ejecutado por la JVM.


================================================================================
3. ¿POR QUÉ JAVA UTILIZA BYTECODE?

Una de las ideas fundamentales de Java es:

    "Write Once, Run Anywhere"

Es decir, podemos compilar nuestro código Java y obtener bytecode.

Después, diferentes sistemas operativos y arquitecturas pueden ejecutar
ese bytecode mediante una JVM compatible.

Ejemplo:

                    Main.java
                        |
                        | javac
                        v
                    Main.class
                        |
             +----------+----------+
             |          |          |
             v          v          v
          JVM Linux   JVM Windows JVM macOS
             |          |          |
             v          v          v
          Ejecuta    Ejecuta    Ejecuta


Por eso el bytecode proporciona una capa de abstracción entre nuestro
programa y el hardware.


================================================================================
4. CÓDIGO MÁQUINA

El código máquina es el código que puede ejecutar directamente el procesador.

Está formado por instrucciones específicas de una arquitectura de CPU.

Por ejemplo:

    x86-64
    ARM64
    etc.


El código máquina depende del hardware.

Por eso un código máquina generado específicamente para una arquitectura
puede no funcionar directamente en otra arquitectura.


================================================================================
5. DIFERENCIA ENTRE LOS TRES

Tenemos tres niveles importantes:

    CÓDIGO FUENTE
        |
        | javac
        v
    BYTECODE
        |
        | JVM
        v
    CÓDIGO MÁQUINA


Código fuente:

    - Lo escribimos nosotros.
    - Está en archivos .java.
    - Es código Java.


Bytecode:

    - Lo genera el compilador.
    - Está normalmente en archivos .class.
    - Es independiente de una CPU concreta.
    - Lo ejecuta la JVM.


Código máquina:

    - Son instrucciones para el procesador.
    - Depende de la arquitectura.
    - Es ejecutado por la CPU.


================================================================================
6. ¿JAVA SE EJECUTA DIRECTAMENTE COMO CÓDIGO MÁQUINA?

No exactamente.

Cuando ejecutamos:

    java Main

la JVM carga y ejecuta el bytecode de:

    Main.class


La JVM puede interpretar bytecode y también puede utilizar compilación JIT
(Just-In-Time) para convertir partes del bytecode a código máquina durante
la ejecución.


Por tanto, simplificando:

    Main.java
        |
        | javac
        v
    Main.class
        |
        | JVM
        v
    Código máquina
        |
        v
       CPU


IMPORTANTE:

La conversión de bytecode a código máquina puede producirse durante la
ejecución mediante el JIT.

No debemos confundir:

    javac

con:

    JIT


javac:

    Código fuente Java -> Bytecode


JIT:

    Bytecode -> Código máquina durante la ejecución


================================================================================
7. FLUJO COMPLETO

Podemos representar todo el proceso así:

    ┌──────────────────────┐
    │ Código fuente        │
    │ Main.java            │
    └──────────┬───────────┘
               │
               │ javac
               v
    ┌──────────────────────┐
    │ Bytecode             │
    │ Main.class           │
    └──────────┬───────────┘
               │
               │ JVM
               v
    ┌──────────────────────┐
    │ Código máquina       │
    │ específico del       │
    │ hardware             │
    └──────────┬───────────┘
               │
               v
             CPU


================================================================================
8. EJEMPLO PRÁCTICO

Creamos:

    Main.java

Con:

    public class Main {
        public static void main(String[] args) {
            System.out.println("Hola Java");
        }
    }


Compilamos:

    javac Main.java


Ahora tenemos:

    Main.java
    Main.class


El archivo:

    Main.java

es nuestro código fuente.

El archivo:

    Main.class

contiene el bytecode.


Después ejecutamos:

    java Main


La JVM carga el bytecode y lo ejecuta.


================================================================================
9. EL BYTECODE NO ES CÓDIGO FUENTE

El bytecode no está pensado para que los programadores lo escriban
normalmente a mano.

Por ejemplo, nosotros escribimos:

    System.out.println("Hola Java");


El compilador transforma esta instrucción en bytecode.

La JVM trabaja con ese bytecode.


================================================================================
10. EL BYTECODE TAMPOCO ES CÓDIGO MÁQUINA

Esta diferencia es MUY IMPORTANTE.

    BYTECODE
        ->
    Código intermedio utilizado por la JVM.


    CÓDIGO MÁQUINA
        ->
    Instrucciones específicas para una arquitectura de CPU.


Por ejemplo:

    Main.class

puede ejecutarse en:

    JVM de Windows
    JVM de Linux
    JVM de macOS

siempre que exista una JVM compatible.


================================================================================
11. ¿DÓNDE ENTRA LA PORTABILIDAD?

Java consigue gran parte de su portabilidad gracias a esta separación:

    Código Java
        |
        v
    Bytecode
        |
        v
    JVM específica de cada plataforma
        |
        v
    Hardware


Cada plataforma necesita una JVM adecuada.

Pero nuestro:

    Main.class

puede mantenerse igual entre plataformas compatibles.


Por eso Java no necesita compilar normalmente un archivo .java diferente
para cada sistema operativo.


================================================================================
12. CONCEPTO FUNDAMENTAL

Podemos memorizarlo de esta manera:

    JAVA:

    .java
      |
      | javac
      v
    .class
      |
      | JVM / JIT
      v
    código máquina
      |
      v
    CPU


Donde:

    .java  = código fuente
    .class = bytecode
    CPU    = ejecuta código máquina


================================================================================
13. RESUMEN

    CÓDIGO FUENTE
        - Lo escribe el programador.
        - Archivo .java.
        - Lenguaje Java.

    BYTECODE
        - Lo genera javac.
        - Archivo .class.
        - Es ejecutado por la JVM.
        - No depende directamente de una CPU concreta.

    CÓDIGO MÁQUINA
        - Son instrucciones para la CPU.
        - Depende de la arquitectura.
        - Puede generarse durante la ejecución mediante JIT.
*/

public class Codigo {

}
