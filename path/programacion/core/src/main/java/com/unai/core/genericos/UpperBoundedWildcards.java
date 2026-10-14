package com.unai.core.genericos;

// UPPER BOUNDED WILDCARDS

// Se representan mediante ? extends Tipo.
// Permiten aceptar un tipo concreto o cualquiera de sus subtipos.
// Se utilizan cuando se necesita leer o consultar datos de una colección.
// Los elementos pueden leerse como el tipo límite.
// No se pueden añadir elementos distintos de null de forma segura,
// porque se desconoce el tipo concreto de la colección.
// Son útiles para métodos que reciben datos y los procesan
// sin necesidad de modificarlos.
// Por ejemplo, List<? extends Number> acepta List<Integer>,
// List<Double> y otros tipos que hereden de Number.

// Ejemplo

import java.util.List;

public class UpperBoundedWildcards {

    static double sumar(List<? extends Number> numeros) {
        double suma = 0;

        for (Number numero : numeros) {
            suma += numero.doubleValue();
        }

        return suma;
    }

    public static void main(String[] args) {
        List<Integer> enteros = List.of(10, 20, 30);
        List<Double> decimales = List.of(1.5, 2.5);

        System.out.println(sumar(enteros));
        System.out.println(sumar(decimales));
    }
}