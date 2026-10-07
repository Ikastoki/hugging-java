package com.unai.core.sintaxis.variables;

/*
================================================================================
CONSTANTES
================================================================================

Una constante es una variable cuyo valor no puede cambiar después de haber
sido asignado.

En Java utilizamos el modificador:

    final

Ejemplo:

    final int EDAD_MAXIMA = 120;

Después de asignarle un valor, no podemos reasignarla:

    EDAD_MAXIMA = 130;       // ERROR


DECLARACIÓN E INICIALIZACIÓN
--------------------------------------------------------------------------------

Una constante puede declararse e inicializarse:

    final double PI = 3.14159;

    final int DIAS_SEMANA = 7;

    final String PAIS = "España";


Una vez inicializada, no podemos cambiar su valor.


CONVENCIÓN DE NOMBRES
--------------------------------------------------------------------------------

Por convención, las constantes se escriben utilizando:

    MAYUSCULAS_CON_GUIONES_BAJOS

Ejemplos:

    final int MAX_USUARIOS = 100;
    final double IVA = 0.21;
    final String NOMBRE_APP = "MiAplicacion";

No es una regla obligatoria del compilador, sino una convención de estilo.


FINAL
--------------------------------------------------------------------------------

final significa que una variable solamente puede recibir una asignación.

Esto no es válido:

    final int EDAD = 30;

    EDAD = 31;       // ERROR


VARIABLE FINAL SIN INICIALIZAR
--------------------------------------------------------------------------------

Una variable local final puede declararse sin valor inicialmente, pero debe
recibir un valor antes de utilizarse y solamente puede asignarse una vez.

Ejemplo:

    final int edad;

    edad = 30;

Esto es válido.

Pero esto no:

    edad = 31;       // ERROR


CONSTANTES DE CLASE
--------------------------------------------------------------------------------

Es habitual utilizar constantes compartidas por toda una clase mediante:

    static final

Ejemplo:

    public static final double PI = 3.141592653589793;

    public static final int MAX_USUARIOS = 100;

static significa que pertenece a la clase y no a un objeto concreto.

final significa que su valor no puede reasignarse.


CONSTANTE VS VARIABLE
--------------------------------------------------------------------------------

VARIABLE:

    int edad = 30;

    edad = 31;

Puede cambiar su valor.


CONSTANTE:

    final int EDAD_MAXIMA = 120;

    EDAD_MAXIMA = 130;       // ERROR

No puede cambiar su valor.


IMPORTANTE SOBRE OBJETOS
--------------------------------------------------------------------------------

final impide cambiar la referencia almacenada en una variable, pero no
significa necesariamente que el objeto sea inmutable.

Ejemplo:

    final StringBuilder texto = new StringBuilder("Hola");

No podemos hacer:

    texto = new StringBuilder("Adiós");    // ERROR

Pero sí podemos modificar el objeto:

    texto.append(" Java");

Por tanto:

    final
        -> impide reasignar la variable.

    inmutabilidad
        -> significa que el objeto no puede cambiar su estado.

Son conceptos diferentes.
*/

public class Constantes {

    // Constantes de clase
    public static final double IVA = 0.21;
    public static final int MAX_USUARIOS = 100;
    public static final String NOMBRE_APP = "MiAplicacion";

    public static void main(String[] args) {

        // Constante local
        final int DIAS_SEMANA = 7;

        System.out.println("Aplicación: " + NOMBRE_APP);
        System.out.println("IVA: " + IVA);
        System.out.println("Máximo de usuarios: " + MAX_USUARIOS);
        System.out.println("Días de la semana: " + DIAS_SEMANA);

        // Esto produciría un error:
        // DIAS_SEMANA = 8;
        // IVA = 0.25;
    }
}
