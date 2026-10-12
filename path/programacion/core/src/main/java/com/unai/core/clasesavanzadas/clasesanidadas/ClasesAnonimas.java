package com.unai.core.clasesavanzadas.clasesanidadas;

// Clases anónimas

// No tienen nombre.
// Se declaran y se instancian en una misma expresión.
// Pueden extender una clase o implementar una interfaz.
// Deben implementar los métodos abstractos que correspondan.
// Se utilizan cuando una implementación solo se necesita en un lugar.

// Ejemplo
public class ClasesAnonimas {

    // Interfaz que define un comportamiento.
    interface Saludo {
        void saludar();
    }

    public static void main(String[] args) {

        // Clase anónima que implementa la interfaz Saludo.
        Saludo saludo = new Saludo() {

            @Override
            public void saludar() {
                System.out.println("Hola, mundo");
            }
        };

        // Invocar el método implementado.
        saludo.saludar();

        // También se puede crear una clase anónima
        // que extienda una clase existente.
        Thread hilo = new Thread() {

            @Override
            public void run() {
                System.out.println("Ejecutando el hilo");
            }
        };

        hilo.start();
    }
}

// Salida posible:
// Hola, mundo
// Ejecutando el hilo