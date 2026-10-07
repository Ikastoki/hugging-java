package com.unai.core.conceptos;

/*
================================================================================
                         JAVA CORE — PALABRAS RESERVADAS
================================================================================

1. ¿QUÉ SON LAS PALABRAS RESERVADAS?

Las palabras reservadas son palabras que tienen un significado especial
dentro del lenguaje Java.

Java las utiliza para definir la estructura y el comportamiento del programa.

Por ejemplo:

    class
    public
    static
    void
    int
    if
    else
    return

Estas palabras tienen un significado concreto para el compilador.

No podemos utilizarlas libremente como nombres de variables, métodos,
clases u otros identificadores.


================================================================================
2. EJEMPLO

Esto es correcto:

    int edad = 25;

Aquí:

    int

es una palabra reservada que indica que estamos declarando una variable
de tipo entero.

En cambio, esto NO es correcto:

    int class = 10;

Porque:

    class

es una palabra reservada de Java.


================================================================================
3. PRINCIPALES PALABRAS RESERVADAS

Podemos agruparlas según su finalidad.


DECLARACIÓN Y ESTRUCTURA:

    class
    interface
    enum
    extends
    implements
    package
    import


MODIFICADORES:

    public
    private
    protected
    static
    final
    abstract
    synchronized
    native
    transient
    volatile
    strictfp


TIPOS PRIMITIVOS:

    boolean
    byte
    short
    int
    long
    float
    double
    char


CONTROL DE FLUJO:

    if
    else
    switch
    case
    default
    for
    while
    do
    break
    continue
    return


MANEJO DE EXCEPCIONES:

    try
    catch
    finally
    throw
    throws


ORIENTACIÓN A OBJETOS:

    new
    this
    super


OTRAS:

    void
    instanceof
    assert


================================================================================
4. class

class se utiliza para declarar una clase.

Ejemplo:

    public class Persona {
    }

Aquí:

    public
    class

son palabras reservadas.


================================================================================
5. public

public es un modificador de acceso.

Indica que un elemento puede ser accesible desde otros lugares
dependiendo del contexto.

Ejemplo:

    public class Main {
    }


================================================================================
6. static

static indica que un miembro pertenece a la clase y no a una instancia
concreta.

Ejemplo:

    public static void main(String[] args) {
    }

Aquí:

    public
    static
    void

son palabras reservadas.


================================================================================
7. void

void indica que un método no devuelve un valor.

Ejemplo:

    public static void saludar() {
        System.out.println("Hola");
    }


================================================================================
8. TIPOS PRIMITIVOS

Los nombres de los tipos primitivos también son palabras reservadas:

    boolean
    byte
    short
    int
    long
    float
    double
    char

Ejemplo:

    int edad = 30;
    double precio = 19.99;
    boolean activo = true;
    char letra = 'A';


================================================================================
9. if, else

Se utilizan para crear condiciones.

Ejemplo:

    if (edad >= 18) {
        System.out.println("Mayor de edad");
    } else {
        System.out.println("Menor de edad");
    }


================================================================================
10. for, while, do

Se utilizan para crear bucles.

Ejemplo:

    for (int i = 0; i < 5; i++) {
        System.out.println(i);
    }


================================================================================
11. return

return se utiliza para devolver un valor desde un método o para terminar
la ejecución del método.

Ejemplo:

    public static int sumar(int a, int b) {
        return a + b;
    }


================================================================================
12. new

new se utiliza para crear objetos o instancias.

Ejemplo:

    Persona persona = new Persona();

Aquí:

    new

es una palabra reservada.


================================================================================
13. this

this hace referencia al objeto actual.

Ejemplo:

    public class Persona {

        private String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
        }
    }


================================================================================
14. super

super se utiliza principalmente para acceder a miembros de la
superclase o invocar su constructor.

Ejemplo:

    class Animal {
    }

    class Perro extends Animal {

        public Perro() {
            super();
        }
    }


================================================================================
15. instanceof

instanceof permite comprobar si un objeto es compatible con un tipo.

Ejemplo:

    Object valor = "Hola";

    if (valor instanceof String) {
        System.out.println("Es un String");
    }


================================================================================
16. true, false Y null

Es importante distinguirlos.

    true
    false
    null

Son valores especiales de Java, pero no son palabras reservadas
tradicionales de la misma categoría.

En particular:

    true
    false
    null

son literales reservados y no pueden utilizarse como identificadores.


================================================================================
17. CONST

En Java existe:

    final

pero NO existe:

    const

como palabra reservada utilizable para declarar constantes.

Para declarar una constante normalmente utilizamos:

    static final

Ejemplo:

    public static final int EDAD_MINIMA = 18;


================================================================================
18. GOTO Y CONST

Java también tiene palabras reservadas que no se utilizan actualmente
en el lenguaje:

    goto
    const

Están reservadas y no podemos utilizarlas como identificadores.


================================================================================
19. PALABRAS RESERVADAS VS IDENTIFICADORES

Esta diferencia es importante.

PALABRA RESERVADA:

    Tiene un significado definido por Java.

Ejemplo:

    class
    public
    int
    if


IDENTIFICADOR:

    Es un nombre que nosotros damos a elementos del programa.

Ejemplo:

    Persona
    edad
    nombre
    calcularPrecio


Por ejemplo:

    int edad = 25;

Aquí:

    int  -> palabra reservada
    edad -> identificador


================================================================================
20. REGLA IMPORTANTE

No podemos hacer:

    int class = 10;

porque class está reservado por Java.

Pero sí podemos hacer:

    int clase = 10;

porque:

    clase

es un identificador válido.
*/

public class PalabrasReservadas {

}
