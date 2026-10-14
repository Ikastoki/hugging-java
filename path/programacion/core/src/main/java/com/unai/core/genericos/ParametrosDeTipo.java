package com.unai.core.genericos;

// PARÁMETROS DE TIPO

// Son variables que representan tipos de datos dentro de una declaración genérica.
// Permiten definir clases, interfaces y métodos reutilizables.
// Se escriben entre <> y suelen representarse con letras mayúsculas.
// T: Type, representa un tipo genérico.
// E: Element, representa un elemento.
// K: Key, representa una clave.
// V: Value, representa un valor.
// Se pueden declarar varios parámetros de tipo separados por comas.
// Cada parámetro puede representar un tipo diferente.
// El tipo concreto se especifica al utilizar la clase, interfaz o método.
// Los parámetros de tipo deben ser tipos de referencia, no tipos primitivos.
// No se pueden crear directamente instancias de un parámetro de tipo con new T().

// Ejemplo

public class ParametrosDeTipo {

    static class Contenedor<T, U> {
        private T primero;
        private U segundo;

        public Contenedor(T primero, U segundo) {
            this.primero = primero;
            this.segundo = segundo;
        }

        public T getPrimero() {
            return primero;
        }

        public U getSegundo() {
            return segundo;
        }
    }

    public static void main(String[] args) {
        Contenedor<String, Integer> datos = new Contenedor<>("Edad", 25);

        System.out.println(datos.getPrimero());
        System.out.println(datos.getSegundo());
    }
}
