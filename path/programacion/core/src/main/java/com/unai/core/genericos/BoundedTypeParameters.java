package com.unai.core.genericos;

// BOUNDED TYPE PARAMETERS

// Permiten restringir los tipos que se pueden utilizar como parámetros genéricos.
// Se utiliza extends para indicar una clase o interfaz que el tipo debe cumplir.
// El tipo indicado puede ser la clase límite o cualquiera de sus subtipos.
// Si el límite es una interfaz, el tipo debe implementarla.
// Se pueden establecer varios límites utilizando &.
// Si se combina una clase con interfaces, la clase debe aparecer primero.
// Permiten utilizar dentro del código los métodos definidos por el tipo límite.

// Ejemplo

public class BoundedTypeParameters {

    // Solo acepta tipos que extiendan Number
    static class CajaNumero<T extends Number> {
        private T valor;

        public CajaNumero(T valor) {
            this.valor = valor;
        }

        public double obtenerComoDouble() {
            return valor.doubleValue();
        }
    }

    public static void main(String[] args) {
        CajaNumero<Integer> entero = new CajaNumero<>(10);
        CajaNumero<Double> decimal = new CajaNumero<>(5.5);

        System.out.println(entero.obtenerComoDouble());
        System.out.println(decimal.obtenerComoDouble());

        // No sería válido:
        // CajaNumero<String> texto = new CajaNumero<>("Hola");
        // String no extiende Number.
    }
}
