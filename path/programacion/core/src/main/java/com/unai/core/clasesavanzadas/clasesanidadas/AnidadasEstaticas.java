package com.unai.core.clasesavanzadas.clasesanidadas;

// Clases anidadas estáticas

// Se declaran dentro de otra clase utilizando static.
// No necesitan un objeto de la clase externa para instanciarse.
// Pueden acceder directamente a los miembros static de la clase externa.
// No pueden acceder directamente a los atributos o métodos de instancia
// de la clase externa, porque no están asociadas a un objeto externo.
// Pueden acceder a miembros private de la clase externa.

// Ejemplo completo
public class AnidadasEstaticas {

    private static String mensaje = "Hola desde la clase externa";
    private String nombre = "Ana";

    // Clase anidada estática
    static class ClaseAnidada {

        void mostrarMensaje() {
            // Puede acceder al atributo static de la clase externa.
            System.out.println(mensaje);
        }

        void mostrarNombre(AnidadasEstaticas externa) {
            // Para acceder a un atributo de instancia,
            // necesita recibir un objeto de la clase externa.
            System.out.println(externa.nombre);
        }
    }

    public static void main(String[] args) {

        // Crear la clase anidada sin crear primero un objeto externo.
        AnidadasEstaticas.ClaseAnidada anidada = new AnidadasEstaticas.ClaseAnidada();

        anidada.mostrarMensaje();

        // Para acceder al atributo de instancia, pasamos un objeto.
        AnidadasEstaticas externa = new AnidadasEstaticas();
        anidada.mostrarNombre(externa);
    }
}

// Salida:
// Hola desde la clase externa
// Ana