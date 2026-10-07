package com.unai.core.sintaxis.variables;

/*
================================================================================
VARIABLES, DECLARACIÓN E INICIALIZACIÓN
================================================================================

¿QUÉ ES UNA VARIABLE?
--------------------------------------------------------------------------------
Una variable es un espacio de memoria al que damos un nombre y que utilizamos
para almacenar un valor durante la ejecución del programa.

Una variable está formada principalmente por:

    TIPO + NOMBRE + VALOR

Ejemplo:

    int edad = 25;

    int
        -> tipo

    edad
        -> nombre

    25
        -> valor


DECLARACIÓN DE UNA VARIABLE
--------------------------------------------------------------------------------
Declarar una variable significa indicar su tipo y su nombre.

Sintaxis:

    tipo nombre;

Ejemplo:

    int edad;

Aquí hemos declarado una variable llamada edad de tipo int.

Todavía no le hemos asignado un valor.


INICIALIZACIÓN DE UNA VARIABLE
--------------------------------------------------------------------------------
Inicializar una variable significa asignarle un valor.

Podemos declarar e inicializar en dos pasos:

    int edad;
    edad = 25;

O hacerlo directamente:

    int edad = 25;

La segunda forma es la más habitual cuando ya conocemos el valor inicial.


DECLARACIÓN + INICIALIZACIÓN
--------------------------------------------------------------------------------
Podemos declarar e inicializar diferentes tipos de variables:

    int edad = 25;
    double precio = 19.99;
    boolean activo = true;
    String nombre = "Carlos";

Cada variable tiene un tipo determinado.

Una variable de tipo int almacena enteros.
Una variable de tipo double almacena números decimales.
Una variable de tipo boolean almacena true o false.
Una variable de tipo String almacena texto.


REASIGNACIÓN
--------------------------------------------------------------------------------
Una vez inicializada una variable, podemos cambiar su valor.

Ejemplo:

    int edad = 25;

    edad = 26;

El nuevo valor de edad será 26.

El tipo de la variable no cambia.

Esto no es válido:

    int edad = 25;

    edad = "26";       // ERROR

Porque edad es de tipo int y "26" es un String.


VARIABLES LOCALES
--------------------------------------------------------------------------------
Las variables declaradas dentro de un método son variables locales.

Ejemplo:

    public static void main(String[] args) {

        int edad = 25;

    }

La variable edad solamente existe dentro del ámbito correspondiente.


IMPORTANTE: INICIALIZACIÓN DE VARIABLES LOCALES
--------------------------------------------------------------------------------
Una variable local debe tener un valor asignado antes de utilizarse.

Esto produce un error:

    int edad;

    System.out.println(edad);

Debemos inicializarla antes:

    int edad;

    edad = 25;

    System.out.println(edad);


CONVENCIÓN DE NOMBRES
--------------------------------------------------------------------------------
Las variables normalmente utilizan camelCase.

Correcto:

    int edadUsuario;
    String nombreCompleto;
    double precioFinal;

No es la convención habitual:

    int EdadUsuario;
    String nombre_completo;
    double PRECIOFINAL;
*/

public class Variables {

    public static void main(String[] args) {
        // Declaración
        int edad;

        // Inicialización
        edad = 99;

        // Declaración + Inicialización
        String nombre = "Cameron";
        double salario = 120.000;

        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(salario);
    }

}
