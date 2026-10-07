package com.unai.core.sintaxis.variables;

/*
================================================================================
TIPOS DE REFERENCIA
================================================================================

Los tipos de referencia son tipos que permiten trabajar con objetos.

Algunos ejemplos son:

    String
    Arrays
    Clases
    Interfaces
    Enums
    Records

Cuando declaramos una variable de referencia, la variable almacena una
referencia a un objeto.

Conceptualmente:

    variable
        |
        v
      objeto


DIFERENCIA CON LOS TIPOS PRIMITIVOS
--------------------------------------------------------------------------------

Tipo primitivo:

    int edad = 30;

La variable contiene directamente el valor:

    edad -> 30


Tipo de referencia:

    String nombre = "Carlos";

La variable contiene una referencia al objeto String:

    nombre -> objeto String


CLASES COMO TIPOS DE REFERENCIA
--------------------------------------------------------------------------------

Cualquier clase puede utilizarse como tipo de una variable.

Ejemplo:

    Persona persona = new Persona();

Aquí:

    Persona
        -> tipo

    persona
        -> variable

    new Persona()
        -> creación de un objeto

La variable persona contiene una referencia al objeto creado.


STRING
--------------------------------------------------------------------------------

String es una clase y, por tanto, es un tipo de referencia.

Ejemplo:

    String nombre = "Carlos";

Aunque String se utiliza constantemente y tiene una sintaxis especial para
los literales de texto, sigue siendo una clase.


ARRAYS
--------------------------------------------------------------------------------

Los arrays también son tipos de referencia.

Ejemplo:

    int[] numeros = new int[3];

La variable numeros hace referencia a un array.

Podemos almacenar valores dentro del array:

    numeros[0] = 10;
    numeros[1] = 20;
    numeros[2] = 30;


NULL
--------------------------------------------------------------------------------

Una variable de referencia puede no apuntar a ningún objeto.

Para representar esto utilizamos:

    null

Ejemplo:

    String nombre = null;

En este momento nombre no hace referencia a ningún objeto.

IMPORTANTE:

Los tipos primitivos no pueden tener el valor null.

Esto no es válido:

    int edad = null;       // ERROR

Pero esto sí:

    String nombre = null;


CREAR OBJETOS
--------------------------------------------------------------------------------

Normalmente utilizamos new para crear un objeto.

Ejemplo:

    Persona persona = new Persona();

El proceso conceptual es:

    1. Se crea el objeto.
    2. Se obtiene una referencia al objeto.
    3. La referencia se almacena en la variable.


VARIAS VARIABLES PUEDEN REFERENCIAR EL MISMO OBJETO
--------------------------------------------------------------------------------

Ejemplo:

    Persona persona1 = new Persona();

    Persona persona2 = persona1;

Ahora ambas variables hacen referencia al mismo objeto.

Conceptualmente:

    persona1 ──┐
               ├──> objeto Persona
    persona2 ──┘

Modificar el objeto a través de una referencia puede afectar a lo que vemos
desde la otra referencia porque ambas apuntan al mismo objeto.


COMPARACIÓN DE REFERENCIAS
--------------------------------------------------------------------------------

Con tipos de referencia podemos utilizar ==, pero hay que entender qué
estamos comparando.

El operador == compara si dos referencias apuntan al mismo objeto.

Ejemplo:

    Persona persona1 = new Persona();
    Persona persona2 = persona1;

    System.out.println(persona1 == persona2);

Resultado:

    true

Sin embargo, dos objetos diferentes pueden contener datos iguales:

    Persona persona1 = new Persona();
    Persona persona2 = new Persona();

    persona1 == persona2

sería false porque son objetos diferentes.

La comparación del contenido se estudia con métodos como equals().


TIPOS DE REFERENCIA Y OBJETOS
--------------------------------------------------------------------------------

Una variable de referencia puede utilizarse para acceder a los métodos y
atributos disponibles en el objeto.

Ejemplo:

    String nombre = "Carlos";

    int longitud = nombre.length();

nombre es una referencia a un objeto String y podemos utilizar sus métodos.


DIFERENCIA FUNDAMENTAL
--------------------------------------------------------------------------------

PRIMITIVO:

    int edad = 30;

    variable -> valor


REFERENCIA:

    String nombre = "Carlos";

    variable -> referencia -> objeto


Los tipos primitivos representan valores simples.

Los tipos de referencia permiten trabajar con objetos.
*/

public class Referencia {
    public static void main(String[] args) {

        // String es un tipo de referencia
        String nombre = "Carlos";

        // Array también es un tipo de referencia
        int[] numeros = new int[3];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        System.out.println("Nombre: " + nombre);
        System.out.println("Primer número: " + numeros[0]);

        // Una referencia puede ser null
        String apellido = null;

        System.out.println("Apellido: " + apellido);
    }
}
