package com.unai.core.genericos;

// MÉTODOS GENÉRICOS

// Son métodos que declaran sus propios parámetros de tipo.
// Permiten trabajar con distintos tipos de datos sin duplicar código.
// El parámetro de tipo se declara entre <> antes del tipo de retorno.
// El compilador puede inferir el tipo a partir de los argumentos.
// También se puede indicar explícitamente el tipo al invocar el método.
// Un método genérico puede estar dentro de una clase genérica o no genérica.
// Sus parámetros de tipo son independientes de los de la clase.

// Ejemplo

public class MetodosGenericos {

    // Método genérico que devuelve el mismo tipo que recibe
    public static <T> T obtenerPrimero(T primero, T segundo) {
        return primero;
    }

    public static void main(String[] args) {
        String texto = obtenerPrimero("Hola", "Java");
        Integer numero = obtenerPrimero(10, 20);

        // También se puede indicar el tipo explícitamente
        Double decimal = MetodosGenericos.<Double>obtenerPrimero(3.5, 7.2);

        System.out.println(texto);
        System.out.println(numero);
        System.out.println(decimal);
    }
}
