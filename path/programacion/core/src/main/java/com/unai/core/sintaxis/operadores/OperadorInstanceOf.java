package com.unai.core.sintaxis.operadores;

/*
 * OPERADOR INSTANCEOF
 *
 * Permite comprobar si un objeto es una instancia de una clase,
 * subclase o interfaz determinada.
 *
 * Sintaxis:
 *
 *     objeto instanceof Tipo
 *
 * El resultado es:
 *
 *     true  -> el objeto pertenece a ese tipo
 *     false -> el objeto no pertenece a ese tipo
 *
 * También tiene en cuenta la herencia.
 *
 * Por ejemplo, si Perro hereda de Animal:
 *
 *     Perro perro = new Perro();
 *
 * Entonces:
 *
 *     perro instanceof Perro   -> true
 *     perro instanceof Animal  -> true
 *
 * Si la referencia es null:
 *
 *     null instanceof CualquierTipo -> false
 */

public class OperadorInstanceOf {

    public static void main(String[] args) {

        String texto = "Hola";

        System.out.println(texto instanceof String); // true
        System.out.println(texto instanceof Object); // true

        Object valor = "Java";

        System.out.println(valor instanceof String); // true
        System.out.println(valor instanceof Integer); // false

        Object numero = 10;

        System.out.println(numero instanceof Integer); // true

        Object vacio = null;

        System.out.println(vacio instanceof String); // false
    }
}
