package com.unai.core.conceptos;

/*
================================================================================
                   JAVA CORE — MODIFICADORES DE MEMBRESÍA
================================================================================

1. ¿QUÉ SON LOS MODIFICADORES DE MEMBRESÍA?

Los modificadores de membresía son palabras clave que modifican el
comportamiento de los miembros de una clase.

Los miembros de una clase pueden ser, por ejemplo:

    - Atributos
    - Métodos
    - Constructores
    - Clases internas

Entre los modificadores más importantes encontramos:

    static
    final
    abstract
    synchronized
    native
    transient
    volatile

Algunos de ellos se estudiarán con más profundidad posteriormente.

IMPORTANTE:

    Modificadores de acceso:
        public
        protected
        private
        default

    Modificadores de membresía:
        static
        final
        abstract
        etc.

No son exactamente la misma categoría.


================================================================================
2. static

static indica que un miembro pertenece a la CLASE y no a cada objeto
individual de esa clase.

Ejemplo:

    public class Persona {

        static int contador;
    }


Si creamos varios objetos Persona:

    Persona persona1 = new Persona();
    Persona persona2 = new Persona();

todos comparten el mismo:

    contador


Un atributo static tiene una única copia asociada a la clase.


================================================================================
3. ATRIBUTO DE INSTANCIA VS ATRIBUTO static

Sin static:

    class Persona {

        String nombre;
    }


Cada objeto tiene su propio nombre:

    Persona persona1 = new Persona();
    Persona persona2 = new Persona();


Con static:

    class Persona {

        static int contador;
    }


El contador pertenece a la clase y es compartido.


================================================================================
4. MÉTODOS static

Un método static pertenece a la clase.

Ejemplo:

    public class Calculadora {

        public static int sumar(int a, int b) {
            return a + b;
        }
    }


Podemos llamarlo sin crear un objeto:

    int resultado = Calculadora.sumar(5, 3);


Esto es diferente de un método de instancia, que necesita un objeto.

Un uso común es para funciones que no necesitan estado (atributos) del objeto:
Ejemplos famosos: Math.sqrt(), Integer.parseInt(), String.valueOf()

================================================================================
5. static Y main

Ya hemos visto:

    public static void main(String[] args)


Aquí:

    public
        -> modificador de acceso

    static
        -> pertenece a la clase

    void
        -> no devuelve ningún valor

    main
        -> nombre del método

    String[] args
        -> parámetro


El método main es static porque la JVM puede invocarlo sin tener que
crear previamente una instancia de la clase.


================================================================================
6. final

final indica que algo no puede cambiar de determinada manera.

Su significado depende de dónde se utilice.

Puede aplicarse a:

    - Variables
    - Métodos
    - Clases


================================================================================
7. final EN VARIABLES

Una variable final solo puede recibir un valor una vez.

Ejemplo:

    final int EDAD_MINIMA = 18;


Después no podemos hacer:

    EDAD_MINIMA = 21;


porque ya ha sido asignada.


================================================================================
8. static final

Una combinación muy habitual es:

    static final


Se utiliza normalmente para representar constantes.

Ejemplo:

    public static final double IVA = 0.21;


Aquí:

    static
        -> pertenece a la clase

    final
        -> no puede reasignarse


Por convención, las constantes se escriben:

    MAYUSCULAS_CON_GUION_BAJO


================================================================================
9. final EN MÉTODOS

Un método final no puede ser sobrescrito por una subclase.

Ejemplo:

    public final void mostrarMensaje() {
        System.out.println("Hola");
    }


Una clase hija no podrá sobrescribir ese método.


================================================================================
10. final EN CLASES

Una clase final no puede ser heredada.

Ejemplo:

    public final class Configuracion {
    }


No podemos hacer:

    class MiConfiguracion extends Configuracion {
    }


porque Configuracion es final.


================================================================================
11. abstract

abstract indica que una clase o método es abstracto.

Una clase abstracta no puede instanciarse directamente.

Ejemplo:

    public abstract class Animal {
    }


No podemos hacer:

    Animal animal = new Animal();


Un método abstracto declara qué debe hacer una subclase, pero no contiene
su implementación.

Ejemplo:

    public abstract void hacerSonido();


Las clases hijas deberán proporcionar una implementación,
salvo que también sean abstractas.


================================================================================
12. EJEMPLO DE abstract

    abstract class Animal {

        abstract void hacerSonido();
    }


    class Perro extends Animal {

        @Override
        void hacerSonido() {
            System.out.println("Guau");
        }
    }


Aquí:

    Animal
        -> clase abstracta

    hacerSonido()
        -> método abstracto

    Perro
        -> proporciona la implementación


================================================================================
13. synchronized

synchronized se utiliza principalmente en programación concurrente.

Permite controlar el acceso de varios hilos a determinadas secciones
de código.

Ejemplo:

    public synchronized void incrementar() {
        contador++;
    }


El objetivo es evitar determinados problemas cuando varios hilos
intentan acceder simultáneamente a un recurso compartido.

Este concepto lo estudiaremos con más profundidad cuando lleguemos
a concurrencia y multihilo.


================================================================================
14. volatile

volatile se utiliza con variables que pueden ser modificadas por
diferentes hilos.

Indica que las lecturas y escrituras de esa variable deben tener
determinadas garantías de visibilidad entre hilos.

Ejemplo:

    private volatile boolean ejecutando = true;


Es un modificador relacionado con concurrencia y memoria.

No debe utilizarse simplemente como sustituto de synchronized.


================================================================================
15. transient

transient se utiliza con campos que no deben participar en determinados
procesos de serialización de objetos.

Ejemplo:

    private transient String password;


Cuando un objeto se serializa utilizando el mecanismo de serialización
de Java, un campo transient se excluye de esa serialización.


================================================================================
16. native

native indica que la implementación de un método está escrita fuera
del código Java, normalmente mediante código nativo.

Ejemplo conceptual:

    public native void ejecutar();


Java proporciona mecanismos para comunicarse con código nativo.

Es un concepto avanzado y no suele utilizarse en aplicaciones Java
convencionales.
*/

public class ModificadoresDeMembresia {

}
