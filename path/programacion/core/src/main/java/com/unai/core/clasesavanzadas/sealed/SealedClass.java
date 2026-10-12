package com.unai.core.clasesavanzadas.sealed;

// Sealed classes

// Se utiliza la palabra clave sealed para restringir la herencia.
// La cláusula permits especifica las subclases permitidas.
// Cada subclase directa debe elegir una de estas opciones:
// final: no permite más herencia.
// sealed: sigue restringiendo qué clases pueden heredar de ella.
// non-sealed: permite herencia sin esa restricción.
//
// Las clases y sus subclases permitidas deben respetar
// las reglas de paquetes o módulos de Java.

// Ejemplo
public class SealedClass {

    sealed static class Animal
            permits Perro, Gato {
        void hacerSonido() {
            System.out.println("Sonido de animal");
        }
    }

    // No se puede heredar de Perro.
    static final class Perro extends Animal {
        @Override
        void hacerSonido() {
            System.out.println("Guau");
        }
    }

    // Gato puede tener subclases.
    static non-sealed class Gato extends Animal {
        @Override
        void hacerSonido() {
            System.out.println("Miau");
        }
    }

    // Esta clase es válida porque Gato es non-sealed.
    static class GatoDomestico extends Gato {
        @Override
        void hacerSonido() {
            System.out.println("Miau doméstico");
        }
    }

    public static void main(String[] args) {

        Animal perro = new Perro();
        Animal gato = new Gato();
        Animal gatoDomestico = new GatoDomestico();

        perro.hacerSonido();
        gato.hacerSonido();
        gatoDomestico.hacerSonido();
    }
}

// Salida:
// Guau
// Miau
// Miau doméstico