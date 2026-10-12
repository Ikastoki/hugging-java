package com.unai.core.clasesavanzadas.sealed;

// Sealed interfaces

// Una interfaz sealed restringe qué tipos pueden implementarla
// o extenderla directamente.
// La cláusula permits indica los tipos permitidos.
// Cada tipo permitido debe declararse como:
// - final: no permite más herencia.
// - sealed: continúa restringiendo la jerarquía.
// - non-sealed: permite nuevas implementaciones o subclases.
//
// Una interfaz puede ser implementada por una clase
// o extendida por otra interfaz.

// Ejemplo
public class SealedInterfaces {

    // Solo Tarjeta y Efectivo pueden implementar Pago.
    sealed interface Pago
            permits Tarjeta, Efectivo {

        void procesar();
    }

    // No permite crear subclases de Tarjeta.
    static final class Tarjeta implements Pago {

        @Override
        public void procesar() {
            System.out.println("Pago con tarjeta");
        }
    }

    // Permite que otras clases implementen Pago
    // indirectamente a través de Efectivo.
    static non-sealed class Efectivo implements Pago {

        @Override
        public void procesar() {
            System.out.println("Pago en efectivo");
        }
    }

    // Válido porque Efectivo es non-sealed.
    static class EfectivoExacto extends Efectivo {

        @Override
        public void procesar() {
            System.out.println("Pago en efectivo exacto");
        }
    }

    public static void main(String[] args) {

        Pago pago1 = new Tarjeta();
        Pago pago2 = new Efectivo();
        Pago pago3 = new EfectivoExacto();

        pago1.procesar();
        pago2.procesar();
        pago3.procesar();
    }
}

// Salida:
// Pago con tarjeta
// Pago en efectivo
// Pago en efectivo exacto