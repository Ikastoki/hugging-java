package com.unai.core.clasesavanzadas.sealed;

// Permitted subclasses

// La cláusula permits indica qué clases pueden heredar
// directamente de una clase sealed.
// Las clases permitidas deben extender o implementar
// el tipo sealed correspondiente.
// Cada subclase debe declararse como final, sealed o non-sealed.
// Las subclases permitidas deben cumplir las reglas de Java
// sobre pertenencia al mismo módulo o paquete.

// Ejemplo completo
public class PermittedSubclasses {

    // Solo Coche y Moto pueden heredar directamente de Vehiculo.
    sealed static class Vehiculo
            permits Coche, Moto {
    }

    // final impide que otras clases hereden de Coche.
    static final class Coche extends Vehiculo {
    }

    // sealed permite que Moto restrinja su propia jerarquía.
    static sealed class Moto extends Vehiculo
            permits MotoDeportiva {
    }

    // MotoDeportiva es la única subclase permitida de Moto.
    static final class MotoDeportiva extends Moto {
    }

    public static void main(String[] args) {

        Vehiculo coche = new Coche();
        Vehiculo moto = new Moto();
        Vehiculo deportiva = new MotoDeportiva();

        System.out.println(coche.getClass().getSimpleName());
        System.out.println(moto.getClass().getSimpleName());
        System.out.println(deportiva.getClass().getSimpleName());

        // No sería válido declarar otra subclase directa:
        // static class Camion extends Vehiculo {}
        // Camion no aparece en permits.
    }
}

// Salida:
// Coche
// Moto
// MotoDeportiva
