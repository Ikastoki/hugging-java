package com.unai.core.genericos;

// WILDCARDS

// Son comodines que se representan mediante el símbolo ?.
// Permiten trabajar con tipos genéricos desconocidos.
// Se utilizan principalmente en parámetros de métodos y colecciones.
// List<?> representa una lista de un tipo desconocido.
// No se pueden añadir elementos (excepto null) a una colección List<?>,
// porque no se conoce su tipo concreto.
// Se pueden leer sus elementos como Object.
// Los wildcards permiten crear métodos más flexibles
// sin tener que declarar un parámetro de tipo propio.
// Existen tres formas principales:
// ?        -> tipo desconocido.
// ? extends Tipo -> tipo desconocido que es Tipo o un subtipo suyo.
// ? super Tipo   -> tipo desconocido que es Tipo o un supertipo suyo.

// Ejemplo

import java.util.Arrays;
import java.util.List;

public class Wildcards {

    // Acepta una lista de cualquier tipo
    static void mostrarElementos(List<?> elementos) {
        for (Object elemento : elementos) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Luis");
        List<Integer> numeros = Arrays.asList(10, 20, 30);

        mostrarElementos(nombres);
        mostrarElementos(numeros);
    }
}