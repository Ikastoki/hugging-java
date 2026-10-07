package com.unai.core.conceptos;

/*
================================================================================
                         JAVA CORE — IDENTIFICADORES
================================================================================

1. ¿QUÉ ES UN IDENTIFICADOR?

Un identificador es el nombre que utilizamos para identificar elementos
dentro de un programa Java.

Podemos utilizar identificadores para nombrar:

    - Clases
    - Variables
    - Métodos
    - Parámetros
    - Interfaces
    - Enums
    - Otros elementos del programa


Ejemplo:

    public class Persona {

        String nombre;

        void saludar() {
            System.out.println("Hola");
        }
    }


En este ejemplo:

    Persona  -> identificador de la clase
    nombre   -> identificador de la variable
    saludar  -> identificador del método


================================================================================
2. REGLAS PARA CREAR IDENTIFICADORES

Un identificador puede contener:

    - Letras
    - Dígitos
    - Guion bajo: _
    - Signo dólar: $

Pero existen algunas restricciones.


================================================================================
3. UN IDENTIFICADOR NO PUEDE EMPEZAR POR UN NÚMERO

Incorrecto:

    1persona

    123nombre

Correcto:

    persona1
    nombre123
    persona


El número sí puede aparecer después del primer carácter.


================================================================================
4. PUEDE EMPEZAR POR UNA LETRA

Ejemplos válidos:

    nombre
    edad
    Persona
    calcularPrecio
    usuario


================================================================================
5. TAMBIÉN PUEDE EMPEZAR POR _ O $

Java permite:

    _nombre
    $nombre


Aunque sean sintácticamente válidos, normalmente no se recomienda utilizar
$ en nombres propios del código de una aplicación.

El carácter _ tiene algunos usos especiales en Java moderno y un identificador
formado únicamente por:

    _

no es válido como identificador. 
A partir de Java 9+ puede generar errores de compilación


================================================================================
6. LOS ESPACIOS NO ESTÁN PERMITIDOS

Incorrecto:

    nombre usuario

Correcto:

    nombreUsuario


Por eso utilizamos convenciones como camelCase.


================================================================================
7. NO PODEMOS UTILIZAR PALABRAS RESERVADAS

Una palabra reservada ya tiene un significado definido por Java.

Incorrecto:

    int class = 10;

    int public = 20;

    int return = 30;


Correcto:

    int clase = 10;

    int publico = 20;

    int resultado = 30;


================================================================================
8. JAVA DISTINGUE MAYÚSCULAS Y MINÚSCULAS

Java es CASE-SENSITIVE.

Esto significa que:

    nombre
    Nombre
    NOMBRE

son identificadores diferentes.


Ejemplo:

    int edad = 20;
    int Edad = 30;

Son dos variables diferentes.


Aunque sea posible, NO es recomendable crear identificadores que solo
se diferencien por mayúsculas y minúsculas porque dificulta la lectura.


================================================================================
9. IDENTIFICADORES DE CLASES

Las clases normalmente utilizan PascalCase.

Ejemplos:

    Persona
    CuentaBancaria
    Producto
    Usuario
    GestorUsuarios


Ejemplo:

    public class CuentaBancaria {
    }


================================================================================
10. IDENTIFICADORES DE VARIABLES

Las variables normalmente utilizan camelCase.

Ejemplos:

    nombre
    edad
    fechaNacimiento
    precioTotal
    numeroDeUsuarios


Ejemplo:

    String nombreCompleto = "Ana";
    int edadUsuario = 25;


================================================================================
11. IDENTIFICADORES DE MÉTODOS

Los métodos normalmente utilizan camelCase.

Ejemplos:

    calcularTotal()
    obtenerNombre()
    guardarUsuario()
    buscarProducto()


Ejemplo:

    public double calcularPrecio() {
        return 10.0;
    }


================================================================================
12. IDENTIFICADORES DE PARÁMETROS

Los parámetros de los métodos también suelen utilizar camelCase.

Ejemplo:

    public void registrarUsuario(String nombre, int edad) {
    }


Aquí:

    nombre
    edad

son identificadores utilizados como parámetros.


================================================================================
13. IDENTIFICADORES DE CONSTANTES

Las constantes normalmente utilizan:

    MAYUSCULAS_CON_GUION_BAJO


Ejemplo:

    public static final int EDAD_MINIMA = 18;

    public static final double IVA = 0.21;


En estos casos:

    EDAD_MINIMA
    IVA

son identificadores.


================================================================================
14. IDENTIFICADORES VÁLIDOS

Ejemplos:

    nombre
    nombreCompleto
    edad2
    _nombre
    $precio
    Persona
    CuentaBancaria
    calcularTotal
    precio_total


Todos cumplen las reglas sintácticas básicas de Java.


================================================================================
15. IDENTIFICADORES NO VÁLIDOS

Ejemplos:

    2nombre
    nombre completo
    nombre-completo
    class
    public
    int


¿Por qué?

    2nombre
        -> empieza por un número

    nombre completo
        -> contiene un espacio

    nombre-completo
        -> contiene un carácter no permitido para un identificador

    class
        -> palabra reservada

    public
        -> palabra reservada

    int
        -> palabra reservada


================================================================================
16. GUION BAJO VS GUION NORMAL

En Java  _: sí puede formar parte de un identificador.

Pero -: no puede utilizarse como parte de un identificador porque se utiliza
como operador de resta.


Ejemplo válido:

    precio_total


Ejemplo inválido:

    precio-total


Java interpretaría:

    precio - total

como una operación de resta.


================================================================================
17. IDENTIFICADORES Y SIGNIFICADO

Un identificador no solo debe ser válido.

También debería ser descriptivo.

Poco recomendable:

    int x = 25;

Mejor:

    int edad = 25;


Poco recomendable:

    double p = 19.99;

Mejor:

    double precio = 19.99;


El objetivo es que el código sea fácil de entender.


================================================================================
18. IDENTIFICADORES DESCRIPTIVOS

Ejemplo:

    int numeroDeProductos = 10;

Es más fácil entenderlo que:

    int n = 10;


Otro ejemplo:

    double precioTotal = 150.50;

es más descriptivo que:

    double p = 150.50;


La elección de buenos identificadores mejora la legibilidad del código.


================================================================================
19. DIFERENCIA ENTRE IDENTIFICADOR Y PALABRA RESERVADA

PALABRA RESERVADA:

    Es una palabra cuyo significado está definido por Java.

Ejemplos:

    class
    int
    public
    return


IDENTIFICADOR:

    Es el nombre que utilizamos para nuestros elementos.

Ejemplos:

    Persona
    edad
    nombre
    calcularTotal


Ejemplo:

    public class Persona {

        int edad;

        void saludar() {
        }
    }


Aquí:

    public
    class
    int
    void

son palabras reservadas.

Mientras que:

    Persona
    edad
    saludar

son identificadores.
*/

public class Identificadores {

}
