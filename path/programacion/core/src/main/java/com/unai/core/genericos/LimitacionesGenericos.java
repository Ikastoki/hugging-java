package com.unai.core.genericos;

// LIMITACIONES DE LOS GENÉRICOS

// Los tipos genéricos tienen varias restricciones debido principalmente
// al proceso de type erasure.

// No se pueden utilizar tipos primitivos como parámetros genéricos.
// Se deben utilizar sus clases envoltorio, como Integer o Double.

// No se pueden crear directamente objetos de un parámetro de tipo
// mediante new T(), porque el tipo concreto no está disponible.

// No se pueden crear arrays de tipos genéricos, como new T[10],
// ni arrays de tipos parametrizados, como new List<String>[10].
// Sí se pueden crear arrays de tipos genéricos sin concretar,
// como List<?>[].

// No se pueden utilizar parámetros de tipo en expresiones instanceof
// con tipos parametrizados, como instanceof List<String>.
// Sí se puede comprobar instanceof List<?>.

// No se pueden declarar campos static cuyo tipo dependa del parámetro
// genérico de la clase, porque static pertenece a la clase y no
// a cada parametrización.

// No se pueden crear métodos genéricos que difieran únicamente
// en el tipo genérico, porque pueden tener la misma firma tras
// aplicar type erasure.

// No se pueden declarar excepciones genéricas ni capturar directamente
// un tipo de excepción representado por un parámetro genérico.

// Ejemplo

import java.util.ArrayList;
import java.util.List;

public class LimitacionesGenericos {

    static class Caja<T> {
        private T contenido;

        // No sería válido:
        // private static T valor;

        public void guardar(T contenido) {
            this.contenido = contenido;
        }

        public T obtener() {
            return contenido;
        }
    }

    public static void main(String[] args) {
        Caja<Integer> caja = new Caja<>();
        caja.guardar(25);

        // Los tipos primitivos no se pueden usar como argumentos genéricos.
        // Caja<int> otraCaja = new Caja<>();

        // Se puede crear un array de comodines.
        List<?>[] listas = new List<?>[2];
        listas[0] = new ArrayList<String>();
        listas[1] = new ArrayList<Integer>();

        System.out.println(caja.obtener());
        System.out.println(listas.length);
    }
}
