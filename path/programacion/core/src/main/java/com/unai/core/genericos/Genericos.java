package com.unai.core.genericos;

// QUÉ SON LOS GENÉRICOS

// Permiten crear clases, interfaces y métodos que trabajan con distintos
// tipos de datos sin perder la seguridad de tipos.
// Se definen mediante parámetros de tipo, normalmente representados
// por letras como T (Type), E (Element), K (Key) y V (Value).
// El tipo concreto se indica al utilizar la clase o el método.
// El compilador comprueba que los tipos sean compatibles.
// Reducen la necesidad de conversiones explícitas (casting).
// Con tipos genéricos se trabaja con tipos de referencia;
// para valores primitivos se utilizan sus clases envoltorio.

// Ejemplo

public class Genericos {

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
        cajaTexto.guardar("Hola Java");
        String texto = cajaTexto.obtener();

        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(25);
        int numero = cajaNumero.obtener();

        System.out.println(texto);
        System.out.println(numero);
    }
}
