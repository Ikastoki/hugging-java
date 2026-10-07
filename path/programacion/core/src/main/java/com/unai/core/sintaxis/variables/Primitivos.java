package com.unai.core.sintaxis.variables;

/*
================================================================================
TIPOS PRIMITIVOS
================================================================================

Java tiene 8 tipos de datos primitivos:

    byte
    short
    int
    long
    float
    double
    char
    boolean

Los tipos primitivos representan valores simples.

A diferencia de los tipos de referencia, una variable de tipo primitivo
almacena directamente su valor.

Los 8 tipos se pueden agrupar en:

    Números enteros:
        byte
        short
        int
        long

    Números decimales:
        float
        double

    Carácter:
        char

    Booleano:
        boolean


byte
--------------------------------------------------------------------------------
Es un tipo entero de 8 bits.

Rango:

    -128 hasta 127

Ejemplo:

    byte edad = 30;
    byte temperatura = -10;

Se utiliza cuando necesitamos enteros pequeños y queremos reducir el espacio
utilizado en memoria.


short
--------------------------------------------------------------------------------
Es un tipo entero de 16 bits.

Rango:

    -32.768 hasta 32.767

Ejemplo:

    short cantidad = 1000;


int
--------------------------------------------------------------------------------
Es un tipo entero de 32 bits.

Rango aproximado:

    -2.147 millones hasta 2.147 millones

Es el tipo entero más utilizado normalmente.

Ejemplo:

    int edad = 30;
    int poblacion = 1000000;


long
--------------------------------------------------------------------------------
Es un tipo entero de 64 bits.

Permite almacenar números enteros mucho más grandes que int.

Ejemplo:

    long poblacionMundial = 8000000000L;

La L indica que el literal es de tipo long.

También podemos utilizar:

    long numero = 100L;


float
--------------------------------------------------------------------------------
Es un tipo decimal de 32 bits.

Ejemplo:

    float precio = 19.99f;

La f indica que el literal es float.

Sin la f:

    float precio = 19.99;    // ERROR

Porque los literales decimales como 19.99 son double por defecto.


double
--------------------------------------------------------------------------------
Es un tipo decimal de 64 bits.

Es el tipo decimal más utilizado habitualmente.

Ejemplo:

    double precio = 19.99;
    double altura = 1.80;

Los literales decimales son double por defecto.


char
--------------------------------------------------------------------------------
Representa un único carácter.

Se escribe entre comillas simples:

    char letra = 'A';
    char simbolo = '#';

No debemos confundir:

    char letra = 'A';       // Un carácter

    String texto = "A";     // Un String


boolean
--------------------------------------------------------------------------------
Representa un valor lógico.

Solamente puede tener dos valores:

    true
    false

Ejemplo:

    boolean activo = true;
    boolean terminado = false;


TAMAÑOS DE LOS TIPOS PRIMITIVOS
--------------------------------------------------------------------------------

    Tipo       Tamaño          Ejemplo

    byte       8 bits          100
    short      16 bits         1000
    int        32 bits         100000
    long       64 bits         100000L

    float      32 bits         10.5f
    double     64 bits         10.5

    char       16 bits         'A'
    boolean    depende de JVM   true/false


IMPORTANTE
--------------------------------------------------------------------------------
Los tamaños de los tipos numéricos son fijos según la especificación de Java.

Los tipos enteros tienen un tamaño determinado:

    byte  -> 8 bits
    short -> 16 bits
    int   -> 32 bits
    long  -> 64 bits

Los tipos float y double utilizan representación de coma flotante.

El tipo char utiliza 16 bits y representa una unidad de código UTF-16.


VALORES PREDETERMINADOS
--------------------------------------------------------------------------------
Los campos de una clase reciben valores predeterminados si no se inicializan
explícitamente.

Ejemplo:

    int      -> 0
    long     -> 0L
    float    -> 0.0f
    double   -> 0.0
    char     -> '\u0000'
    boolean  -> false

IMPORTANTE:

Las variables locales NO reciben automáticamente estos valores.

Una variable local debe inicializarse antes de utilizarse.
*/

public class Primitivos {
    public static void main(String[] args) {

        byte numeroPequeno = 100;

        short numeroMediano = 1000;

        int edad = 30;

        long poblacion = 8000000000L;

        float precio = 19.99f;

        double altura = 1.80;

        char inicial = 'C';

        boolean activo = true;

        System.out.println("byte: " + numeroPequeno);
        System.out.println("short: " + numeroMediano);
        System.out.println("int: " + edad);
        System.out.println("long: " + poblacion);
        System.out.println("float: " + precio);
        System.out.println("double: " + altura);
        System.out.println("char: " + inicial);
        System.out.println("boolean: " + activo);
    }
}
