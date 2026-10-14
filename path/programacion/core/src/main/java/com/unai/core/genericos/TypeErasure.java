package com.unai.core.genericos;

// TYPE ERASURE

// Es el proceso mediante el cual el compilador elimina la información
// de los tipos genéricos durante la compilación.
// Permite mantener la compatibilidad con código Java anterior a los genéricos.
// Los parámetros de tipo sin límites se sustituyen por Object.
// Los parámetros con límites se sustituyen por su tipo límite.
// El compilador inserta conversiones de tipos cuando son necesarias.
// Por este motivo, en tiempo de ejecución no se puede distinguir
// directamente entre List<String> y List<Integer>.
// Tampoco se puede utilizar new T() ni crear directamente
// arrays de tipos genéricos, como new T[10].
// La información genérica sí se conserva parcialmente en los metadatos
// de las clases, pero no está disponible como tipo genérico concreto
// para muchas comprobaciones en tiempo de ejecución.

// Ejemplo

import java.util.ArrayList;
import java.util.List;

public class TypeErasure {

    static class Caja<T> {
        private T contenido;

        public void guardar(T contenido) {
            this.contenido = contenido;
        }

        public T obtener() {
            return contenido;
        }
    }

    public static void main(String[] args) {
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Hola");

        // En ejecución, ambas clases tienen el mismo tipo raw
        List<String> textos = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();

        System.out.println(textos.getClass() == numeros.getClass()); // true
        System.out.println(cajaTexto.obtener());
    }
}