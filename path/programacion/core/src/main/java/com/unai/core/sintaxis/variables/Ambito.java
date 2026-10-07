package com.unai.core.sintaxis.variables;

/*
================================================================================
ÁMBITO DE LAS VARIABLES
================================================================================

El ámbito (scope) de una variable determina la parte del código donde esa
variable puede ser utilizada.

En Java, una variable solamente puede utilizarse dentro del ámbito en el que
ha sido declarada.


VARIABLE LOCAL
--------------------------------------------------------------------------------
Una variable declarada dentro de un método solamente puede utilizarse dentro
de ese método.

Ejemplo:

    public static void main(String[] args) {

        int edad = 25;

        System.out.println(edad);
    }

La variable edad pertenece al ámbito de main().

No podemos utilizarla fuera de main().


BLOQUES DE CÓDIGO
--------------------------------------------------------------------------------
Las llaves { } crean un ámbito.

Ejemplo:

    if (true) {

        int numero = 10;

        System.out.println(numero);
    }

numero solamente existe dentro del bloque del if.

Esto no es válido:

    if (true) {

        int numero = 10;
    }

    System.out.println(numero);   // ERROR


ÁMBITO DE UN BUCLE
--------------------------------------------------------------------------------
Las variables declaradas dentro de un bucle también pertenecen a ese ámbito.

Ejemplo:

    for (int i = 0; i < 5; i++) {

        System.out.println(i);
    }

La variable i solamente existe dentro del for.

Esto no es válido:

    for (int i = 0; i < 5; i++) {

        System.out.println(i);
    }

    System.out.println(i);   // ERROR


VARIABLES DE DISTINTOS MÉTODOS
--------------------------------------------------------------------------------
Cada método tiene su propio ámbito.

Podemos tener variables con el mismo nombre en métodos diferentes.

Ejemplo:

    public static void metodoA() {

        int numero = 10;
    }

    public static void metodoB() {

        int numero = 20;
    }

Son variables diferentes porque pertenecen a ámbitos diferentes.


ÁMBITOS ANIDADOS
--------------------------------------------------------------------------------
Un ámbito interno puede acceder a variables declaradas en un ámbito externo.

Ejemplo:

    public static void main(String[] args) {

        int numero = 10;

        if (numero > 0) {

            System.out.println(numero);
        }
    }

El bloque del if puede acceder a numero porque numero fue declarado en un
ámbito exterior.

Sin embargo, el ámbito exterior no puede acceder a una variable declarada
dentro del ámbito interior.

Ejemplo:

    public static void main(String[] args) {

        if (true) {

            int valor = 100;
        }

        System.out.println(valor);   // ERROR
    }


VARIABLES LOCALES Y CAMPOS
--------------------------------------------------------------------------------
Hay que distinguir entre:

    Variables locales
        -> Declaradas dentro de métodos o bloques.

    Campos
        -> Variables declaradas directamente dentro de una clase.

Ejemplo:

    public class Persona {

        String nombre;       // Campo o atributo

        public void mostrar() {

            int edad = 30;   // Variable local
        }
    }

nombre es un campo de la clase.

edad es una variable local del método mostrar().

Los campos tienen un ámbito diferente al de las variables locales y se
estudiarán con más profundidad al llegar a clases y objetos.


REGLA IMPORTANTE
--------------------------------------------------------------------------------
Una variable solamente puede utilizarse desde el punto donde ha sido
declarada hasta el final de su ámbito.

Ejemplo:

    public static void main(String[] args) {

        int a = 10;

        if (a > 0) {

            int b = 20;

            System.out.println(a); // Correcto
            System.out.println(b); // Correcto
        }

        System.out.println(a);     // Correcto
        System.out.println(b);     // ERROR
    }
*/

public class Ambito {
    public static void main(String[] args) {

        int numero = 10;

        System.out.println("Ámbito principal: " + numero);

        if (numero > 0) {

            int resultado = numero * 2;

            System.out.println("Dentro del if:");
            System.out.println("Número: " + numero);
            System.out.println("Resultado: " + resultado);
        }

        // numero sigue existiendo porque fue declarado
        // en el ámbito exterior.
        System.out.println("Fuera del if: " + numero);

        // resultado ya no existe aquí.
        // System.out.println(resultado); // ERROR
    }
}
