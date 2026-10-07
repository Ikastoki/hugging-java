package com.unai.core.sintaxis.variables;

/*
================================================================================
LITERALES
================================================================================

Un literal es un valor escrito directamente en el código fuente.

Ejemplos:

    10
    3.14
    'A'
    "Hola"
    true
    false
    null

Los literales representan valores concretos y Java determina su tipo según
la forma en la que están escritos.


LITERALES ENTEROS
--------------------------------------------------------------------------------

Los números enteros escritos directamente son literales enteros.

Ejemplos:

    10
    -25
    1000

Por defecto, un literal entero es de tipo int.

Ejemplo:

    int edad = 30;


También podemos indicar que un literal es long utilizando L o l:

    long poblacion = 8000000000L;

Es recomendable utilizar L en mayúscula para que sea más fácil distinguirla
del número 1.


LITERALES DECIMALES
--------------------------------------------------------------------------------

Los números con parte decimal son literales de coma flotante.

Por defecto son de tipo double.

Ejemplo:

    double precio = 19.99;

Para indicar que queremos un literal float utilizamos f o F:

    float temperatura = 36.5f;


LITERALES DE CARÁCTER
--------------------------------------------------------------------------------

Un literal char representa un único carácter.

Se escribe entre comillas simples:

    'A'
    'z'
    '5'
    '#'

Ejemplo:

    char inicial = 'C';

IMPORTANTE:

    'A'      -> char
    "A"      -> String


LITERALES DE CADENA
--------------------------------------------------------------------------------

Los textos escritos entre comillas dobles son literales String.

Ejemplos:

    "Hola"
    "Java"
    "Hola mundo"

Ejemplo:

    String mensaje = "Hola Java";


LITERALES BOOLEANOS
--------------------------------------------------------------------------------

Los valores booleanos tienen dos literales:

    true
    false

Ejemplos:

    boolean activo = true;
    boolean terminado = false;


LITERAL NULL
--------------------------------------------------------------------------------

null representa la ausencia de una referencia a un objeto.

Ejemplo:

    String nombre = null;

Una variable de referencia que contiene null no está apuntando a ningún
objeto.

Los tipos primitivos no pueden utilizar null.

Esto no es válido:

    int edad = null;       // ERROR


LITERALES CON GUIONES BAJOS
--------------------------------------------------------------------------------

Java permite utilizar _ dentro de determinados literales numéricos para
hacerlos más fáciles de leer.

Ejemplo:

    int numero = 1_000_000;

Es equivalente a:

    int numero = 1000000;

También podemos utilizarlo con otros tipos numéricos:

    long poblacion = 8_000_000_000L;
    double precio = 1_999.99;

Los guiones bajos solamente sirven para mejorar la legibilidad del código.


LITERALES HEXADECIMALES
--------------------------------------------------------------------------------

Los números enteros también pueden escribirse en hexadecimal utilizando 0x
o 0X.

Ejemplo:

    int numero = 0xFF;

0xFF representa el número 255 en decimal.


LITERALES BINARIOS
--------------------------------------------------------------------------------

Podemos escribir números en binario utilizando el prefijo 0b o 0B.

Ejemplo:

    int numero = 0b1010;

El valor decimal de 0b1010 es 10.


LITERALES OCTALES
--------------------------------------------------------------------------------

Los números octales utilizan un 0 como prefijo.

Ejemplo:

    int numero = 075;

El valor decimal de 075 es 61.


CARACTERES ESPECIALES
--------------------------------------------------------------------------------

Los literales char y String pueden utilizar secuencias de escape.

Algunas de las más importantes:

    \n      -> salto de línea
    \t      -> tabulación
    \"      -> comillas dobles
    \'      -> comillas simples
    \\      -> barra invertida

Ejemplo:

    String texto = "Hola\nJava";

Resultado:

    Hola
    Java


LITERALES Y VARIABLES
--------------------------------------------------------------------------------

No debemos confundir un literal con una variable.

Ejemplo:

    int edad = 30;

    edad
        -> variable

    30
        -> literal

La variable es un nombre que podemos utilizar para acceder al valor.

El literal es el valor escrito directamente en el código.
*/

public class Literales {

    public static void main(String[] args) {

        // Literal entero
        int edad = 30;

        // Literal long
        long poblacion = 8_000_000_000L;

        // Literal double
        double precio = 19.99;

        // Literal float
        float temperatura = 36.5f;

        // Literal char
        char inicial = 'C';

        // Literal String
        String nombre = "Carlos";

        // Literales booleanos
        boolean activo = true;
        boolean terminado = false;

        // Literal null
        String apellido = null;

        // Literal hexadecimal
        int hexadecimal = 0xFF;

        // Literal binario
        int binario = 0b1010;

        System.out.println(edad);
        System.out.println(poblacion);
        System.out.println(precio);
        System.out.println(temperatura);
        System.out.println(inicial);
        System.out.println(nombre);
        System.out.println(activo);
        System.out.println(terminado);
        System.out.println(apellido);
        System.out.println(hexadecimal);
        System.out.println(binario);
    }
}
