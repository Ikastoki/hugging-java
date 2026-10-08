package com.unai.core.sintaxis.comentarios;

/*
* JAVADOC
*
* Javadoc es un sistema de documentación incluido en Java.
*
* Los comentarios Javadoc utilizan multilíneas
*
* Se colocan normalmente antes de una clase,método o campo*para explicar qué hace.
* **Javadoc también permite utilizar etiquetas como:**@param   describe un parámetro
*
 * @return  describe el valor que devuelve un método
 * @author  indica el autor
 * @throws  describe una excepción que puede lanzar
*
* A diferencia de los comentarios normales, Javadoc puede utilizarse
* para generar documentación HTML de nuestro código.
*/

public class JavaDoc {
    public class Calculadora {

        /**
         * Suma dos números enteros.
         *
         * @param a primer número
         * @param b segundo número
         * @return resultado de la suma
         */
        public int sumar(int a, int b) {
            return a + b;
        }
    }

}