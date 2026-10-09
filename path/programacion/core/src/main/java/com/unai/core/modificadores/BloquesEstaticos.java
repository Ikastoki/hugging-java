package com.unai.core.modificadores;

// Bloques estáticos

// Se declaran con la palabra static seguida de llaves.
// Se ejecutan cuando la JVM inicializa la clase.
// Se ejecutan una sola vez por cada ClassLoader que carga la clase.
// Si hay varios bloques estáticos, se ejecutan en orden de aparición.
// Se utilizan para inicializar atributos estáticos.

// Ejemplo completo
public class BloquesEstaticos {

    static int numero;

    // Bloque estático
    static {
        numero = 10;
        System.out.println("Se ejecuta el bloque estático");
    }

    public BloquesEstaticos() {
        System.out.println("Se ejecuta el constructor");
    }

    public static void main(String[] args) {

        System.out.println("Inicio del main");

        BloquesEstaticos objeto1 = new BloquesEstaticos();
        BloquesEstaticos objeto2 = new BloquesEstaticos();

        System.out.println("Número: " + numero);
    }
}

// Salida:
// Se ejecuta el bloque estático
// Inicio del main
// Se ejecuta el constructor
// Se ejecuta el constructor
// Número: 10