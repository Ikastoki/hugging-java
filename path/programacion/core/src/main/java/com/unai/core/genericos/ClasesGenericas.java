package com.unai.core.genericos;

// CLASES GENÉRICAS

// Son clases que definen uno o varios parámetros de tipo.
// Permiten reutilizar la misma clase con diferentes tipos de datos.
// El parámetro de tipo se declara entre <> después del nombre de la clase.
// El tipo concreto se especifica al crear un objeto de esa clase.
// Se pueden utilizar los parámetros de tipo en atributos,
// constructores, parámetros y valores de retorno.
// Se pueden declarar varios parámetros de tipo, separados por comas.
// Los tipos utilizados deben ser tipos de referencia, no primitivos.

// Ejemplo

public class ClasesGenericas {

    static class Pareja<K, V> {
        private K clave;
        private V valor;

        public Pareja(K clave, V valor) {
            this.clave = clave;
            this.valor = valor;
        }

        public K getClave() {
            return clave;
        }

        public V getValor() {
            return valor;
        }
    }

    public static void main(String[] args) {
        Pareja<String, Integer> persona = new Pareja<>("Edad", 25);

        Pareja<Integer, String> producto = new Pareja<>(101, "Teclado");

        System.out.println(persona.getClave());
        System.out.println(persona.getValor());

        System.out.println(producto.getClave());
        System.out.println(producto.getValor());
    }
}