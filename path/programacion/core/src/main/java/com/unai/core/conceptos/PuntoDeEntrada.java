package com.unai.core.conceptos;

/*
================================================================================
                JAVA CORE — PUNTO DE ENTRADA DE UNA APLICACIÓN
================================================================================

1. ¿QUÉ ES EL PUNTO DE ENTRADA?

El punto de entrada es el lugar donde comienza la ejecución de una
aplicación Java tradicional.

En una aplicación Java de consola, normalmente es el método:

    main


Su forma clásica es:

    public static void main(String[] args)


Cuando ejecutamos:

    java Main

la JVM busca un método main válido en la clase que estamos ejecutando.


================================================================================
2. ESTRUCTURA DEL MÉTODO main

    public static void main(String[] args)


Cada parte tiene un significado:

    public
        -> permite que la JVM pueda acceder al método.

    static
        -> el método pertenece a la clase y no necesita un objeto
           para ser invocado.

    void
        -> el método no devuelve ningún valor.

    main
        -> es el nombre que identifica el punto de entrada.

    String[] args
        -> recibe los argumentos proporcionados desde la línea de comandos.


================================================================================
3. EJEMPLO MÍNIMO

    public class Main {

        public static void main(String[] args) {

            System.out.println("Hola Java");
        }
    }


Si el archivo se llama:

    Main.java


Compilamos:

    javac Main.java


Y ejecutamos:

    java Main


La JVM comienza la ejecución en:

    main


================================================================================
4. ¿POR QUÉ main ES static?

Para ejecutar un método de instancia necesitamos normalmente un objeto.

Por ejemplo:

    Persona persona = new Persona();

    persona.saludar();


Pero la JVM necesita poder iniciar nuestro programa sin tener que crear
previamente una instancia de nuestra clase.

Por eso main es static:

    public static void main(String[] args)


La JVM puede invocarlo directamente sobre la clase.


================================================================================
5. ¿QUÉ ES String[] args?

    String[] args

es un array de cadenas de texto.

Contiene los argumentos que pasamos al programa desde la línea de comandos.

Por ejemplo:

    java Main hola mundo


Los argumentos serán:

    args[0] -> "hola"
    args[1] -> "mundo"


================================================================================
6. EJEMPLO CON ARGUMENTOS

Código:

    public class Main {

        public static void main(String[] args) {

            System.out.println("Número de argumentos: " + args.length);

            for (String argumento : args) {
                System.out.println(argumento);
            }
        }
    }


Si ejecutamos:

    java Main Java Spring Boot


Obtendremos aproximadamente:

    Número de argumentos: 3
    Java
    Spring
    Boot


================================================================================
7. args PUEDE ESTAR VACÍO

Si ejecutamos:

    java Main


entonces:

    args.length

será:

    0


No significa que el programa no pueda ejecutarse.

Simplemente significa que no hemos proporcionado argumentos.


================================================================================
8. EL NOMBRE args NO ES OBLIGATORIO

Esta forma:

    public static void main(String[] args)


es la más habitual.

Pero el nombre del parámetro puede cambiar:

    public static void main(String[] argumentos)


Sigue siendo válido porque:

    args

no es una palabra especial.

Es simplemente el nombre del parámetro.

Lo importante es el tipo:

    String[]


y la firma reconocida por Java para el punto de entrada.


================================================================================
9. TAMBIÉN PUEDE ESCRIBIRSE String...

Existe otra forma equivalente:

    public static void main(String... args)


Esto utiliza varargs.

Para el punto de entrada tiene el mismo significado práctico que:

    public static void main(String[] args)


La forma más habitual que veremos es:

    public static void main(String[] args)


================================================================================
10. ¿PODEMOS TENER VARIOS main?

Sí.

Podemos tener métodos llamados main sobrecargados.

Por ejemplo:

    public static void main(String[] args) {
    }

    public static void main(int numero) {
    }


Pero el método que la JVM reconoce como punto de entrada de una aplicación
es el que tiene la firma apropiada para el lanzamiento.


================================================================================
11. main NO ES EL PROGRAMA ENTERO

main simplemente es el punto desde donde comienza la ejecución.

Desde main podemos llamar a otros métodos:

    public static void main(String[] args) {

        saludar();
        calcular();
    }


Y esos métodos pueden llamar a otros métodos.

Por ejemplo:

    main()
      |
      +--> saludar()
      |
      +--> calcular()
              |
              +--> sumar()


Por tanto:

    main = punto de entrada

No significa:

    main = todo el programa


================================================================================
12. EJEMPLO CON MÉTODOS

    public class Main {

        public static void main(String[] args) {

            saludar();
            mostrarMensaje();
        }

        static void saludar() {
            System.out.println("Hola");
        }

        static void mostrarMensaje() {
            System.out.println("Programa ejecutándose");
        }
    }


La ejecución comienza en:

    main()


Después main llama a:

    saludar()

y:

    mostrarMensaje()


================================================================================
13. ¿QUÉ PASA SI NO EXISTE main?

Podemos tener una clase Java perfectamente válida sin método main:

    public class Persona {

        String nombre;
    }


La clase puede compilar:

    javac Persona.java


Pero si intentamos utilizarla como punto de entrada:

    java Persona


la JVM no encontrará el método main requerido para iniciar esa aplicación.


IMPORTANTE:

    COMPILAR una clase
        !=
    EJECUTAR esa clase como aplicación


Una clase puede compilar correctamente y no tener un punto de entrada.


================================================================================
14. UNA APLICACIÓN PUEDE TENER VARIAS CLASES

Ejemplo:

    Main.java
    Persona.java
    Calculadora.java


Podemos tener:

    public class Main {

        public static void main(String[] args) {

            Persona persona = new Persona();
            Calculadora.calcular();
        }
    }


En este caso:

    Main

contiene el punto de entrada.

Las otras clases proporcionan funcionalidades utilizadas por el programa.


================================================================================
15. EL NOMBRE DE LA CLASE NO TIENE QUE SER Main

No es obligatorio llamar a la clase:

    Main


Podemos tener:

    public class Aplicacion {

        public static void main(String[] args) {

            System.out.println("Inicio");
        }
    }


Si el archivo es:

    Aplicacion.java


compilamos:

    javac Aplicacion.java


y ejecutamos:

    java Aplicacion


La JVM buscará el main dentro de:

    Aplicacion


================================================================================
16. FLUJO DE EJECUCIÓN

Cuando hacemos:

    java Aplicacion


Podemos simplificar el proceso así:

    java Aplicacion
          |
          v
    JVM carga Aplicacion
          |
          v
    Busca main
          |
          v
    public static void main(String[] args)
          |
          v
    Comienza la ejecución
          |
          v
    El programa continúa ejecutando instrucciones
*/

public class PuntoDeEntrada {

}
