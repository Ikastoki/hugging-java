package com.unai.core.sintaxis.variables;

/*
================================================================================
INFERENCIA DE TIPOS CON var
================================================================================

Java permite utilizar var para que el compilador infiera el tipo de una
variable local a partir de su valor inicial.

Ejemplo:

    var edad = 30;

El compilador determina que edad es de tipo int.

Conceptualmente:

    var edad = 30;
        ↓
    int edad = 30;


var NO significa que la variable pueda cambiar de tipo.

Ejemplo:

    var edad = 30;

    edad = 40;          // CORRECTO

    edad = "40";        // ERROR

La variable sigue siendo int.


¿DÓNDE SE PUEDE UTILIZAR?
--------------------------------------------------------------------------------

var solamente puede utilizarse para variables locales.

Por ejemplo:

    public static void main(String[] args) {

        var nombre = "Carlos";
        var edad = 30;
    }

También puede utilizarse en variables declaradas dentro de bloques y bucles.


NO SE PUEDE UTILIZAR COMO CAMPO
--------------------------------------------------------------------------------

Esto no es válido:

    public class Persona {

        var nombre = "Carlos";    // ERROR
    }

var está pensado para variables locales, no para campos de una clase.


NO SE PUEDE DECLARAR SIN INICIALIZAR
--------------------------------------------------------------------------------

Esto no es válido:

    var edad;

El compilador no tiene ningún valor a partir del cual pueda inferir el tipo.

Debemos proporcionar un valor inicial:

    var edad = 30;


EL TIPO SE DETERMINA EN COMPILACIÓN
--------------------------------------------------------------------------------

El tipo de var se determina durante la compilación.

Ejemplo:

    var edad = 30;

Java determina:

    edad -> int

Después de compilar, no existe una variable "var" especial.

Es simplemente una forma más corta de escribir el tipo explícitamente.


EJEMPLOS DE INFERENCIA
--------------------------------------------------------------------------------

    var edad = 30;
        -> int

    var precio = 19.99;
        -> double

    var nombre = "Carlos";
        -> String

    var activo = true;
        -> boolean

    var letra = 'A';
        -> char

    var numeros = new int[5];
        -> int[]

    var lista = new ArrayList<String>();
        -> ArrayList<String>


var Y null
--------------------------------------------------------------------------------

No podemos utilizar null como único valor inicial:

    var nombre = null;       // ERROR

El compilador no puede determinar qué tipo debería tener la variable.


var Y TIPOS DE REFERENCIA
--------------------------------------------------------------------------------

También podemos utilizar var cuando creamos objetos.

Ejemplo:

    var nombre = new String("Carlos");

El compilador infiere:

    String

Otro ejemplo:

    var lista = new ArrayList<String>();

El tipo inferido es:

    ArrayList<String>


VENTAJAS
--------------------------------------------------------------------------------

var puede hacer que el código sea más corto y legible cuando el tipo es
evidente por el contexto.

Ejemplo:

    var usuario = new Usuario();

Puede ser más fácil de leer que:

    Usuario usuario = new Usuario();


DESVENTAJA
--------------------------------------------------------------------------------

No debemos utilizar var cuando hace que el código sea menos claro.

Ejemplo:

    var resultado = calcular();

Si no conocemos qué devuelve calcular(), puede ser menos evidente qué tipo
tiene resultado.

En esos casos puede ser más claro:

    int resultado = calcular();


var NO ES tipado dinámico
--------------------------------------------------------------------------------

Java sigue siendo un lenguaje de tipado estático.

Esto:

    var edad = 30;

NO significa:

    "edad puede ser cualquier tipo".

Significa:

    "el compilador determinará el tipo de edad automáticamente".

Una vez determinado, el tipo no cambia.


================================================================================
EJEMPLO PRÁCTICO
================================================================================
*/

import java.util.ArrayList;

public class Inferencia {

    public static void main(String[] args) {

        var edad = 30;
        var nombre = "Carlos";
        var precio = 19.99;
        var activo = true;
        var inicial = 'C';

        var numeros = new int[3];

        var nombres = new ArrayList<String>();

        nombres.add("Ana");
        nombres.add("Luis");

        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Activo: " + activo);
        System.out.println("Inicial: " + inicial);
        System.out.println("Nombres: " + nombres);

        // edad = "30"; // ERROR: edad es int
        // var variable; // ERROR: falta inicialización
        // var valor = null; // ERROR: no se puede inferir el tipo
    }
}