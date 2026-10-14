package com.unai.core.genericos;

// LOWER BOUNDED WILDCARDS

// Se representan mediante ? super Tipo.
// Permiten aceptar un tipo concreto o cualquiera de sus supertipos.
// Por ejemplo, List<? super Integer> puede recibir una List<Integer>,
// una List<Number> o una List<Object>.
// Se utilizan cuando se necesita añadir elementos de un tipo determinado
// a una colección.
// Se pueden añadir elementos del tipo límite o de sus subtipos.
// Al leer elementos, solo se puede garantizar que sean de tipo Object,
// porque el tipo concreto de la colección es desconocido.
// Son útiles cuando un método introduce datos en una colección.

// Ejemplo

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcards {

    static void agregarNumeros(List<? super Integer> numeros) {
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
    }

    public static void main(String[] args) {
        List<Integer> enteros = new ArrayList<>();
        List<Number> numeros = new ArrayList<>();
        List<Object> objetos = new ArrayList<>();

        agregarNumeros(enteros);
        agregarNumeros(numeros);
        agregarNumeros(objetos);

        System.out.println(enteros);
        System.out.println(numeros);
        System.out.println(objetos);
    }
}