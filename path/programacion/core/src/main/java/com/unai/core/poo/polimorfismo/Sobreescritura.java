package com.unai.core.poo.polimorfismo;

// SOBREESCRITURA DE MÉTODOS
//
// Una clase hija puede sobrescribir un método heredado
// para modificar su comportamiento.
//
// El método sobrescrito debe mantener una firma compatible:
// mismo nombre y mismos parámetros.
//
// El tipo de retorno debe ser igual o compatible (covariante).
//
// No se pueden sobrescribir métodos static: se ocultan.
// Los métodos private no se heredan y los final no pueden sobrescribirse.
//
// @Override indica que queremos sobrescribir un método heredado.
// El compilador comprueba que la sobrescritura sea válida.
//
// La visibilidad no puede reducirse respecto al método original.
// Por ejemplo, un método public no puede sobrescribirse como private.
//
// La implementación sobrescrita se selecciona en tiempo de ejecución
// según la clase real del objeto.

// EJEMPLO

class Animal {
    public void hacerSonido() {
        System.out.println("Sonido genérico");
    }

    public void dormir() {
        System.out.println("El animal está durmiendo");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }

    // dormir() se hereda sin necesidad de sobrescribirlo
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}

public class Sobreescritura {
    public static void main(String[] args) {
        Animal animal1 = new Perro();
        Animal animal2 = new Gato();

        animal1.hacerSonido(); // Guau
        animal2.hacerSonido(); // Miau

        // Método heredado de Animal
        animal1.dormir(); // El animal está durmiendo
    }
}
