package com.unai.core.anotaciones;

// ANOTACIONES

// Son metadatos: información adicional que se asocia a clases,
// interfaces, métodos, atributos, constructores o parámetros.
// Se escriben con la arroba @ seguida del nombre, justo antes
// del elemento al que afectan.
//
// Una anotación por sí sola no cambia el comportamiento del programa.
// La información que contiene puede leer el compilador, la JVM
// u otras herramientas, durante la compilación o la ejecución.
// Las anotaciones se definen mediante @interface; lo veremos
// al detalle al crear anotaciones propias.
//
// No deben confundirse con los comentarios. Un comentario es texto
// libre que solo lee quien mira el código fuente. Una anotación tiene
// una estructura definida y puede ser leída de forma programática.
//
// Usos habituales:
// - Aportar información adicional al compilador (@Override,
//   @SuppressWarnings).
// - Documentar el código de forma estructurada.
// - Configurar frameworks (Spring, JUnit, JPA).
// - Indicar que una parte del código debe procesarse para generar
//   código o realizar comprobaciones.

// Ejemplo

public class Anotaciones {

    static class Animal {

        public void hacerSonido() {
            System.out.println("...");
        }
    }

    static class Perro extends Animal {

        // Indica al compilador que el método sobrescribe uno de la
        // superclase. Si no existe un método equivalente con la misma
        // firma, se produce un error de compilación.
        @Override
        public void hacerSonido() {
            System.out.println("Guau");
        }

        // Marca el método como obsoleto para indicar que no debe
        // utilizarse en código nuevo.
        @Deprecated
        public void hacerSonidoAntiguo() {
            System.out.println("Guau");
        }
    }

    // Silencia las advertencias del compilador dentro de este método.
    // El compilador avisa al usar un método obsoleto; con esta anotación
    // indicamos que el uso es intencionado.
    @SuppressWarnings("deprecation")
    static void usarMetodoAntiguo() {
        Perro perro = new Perro();
        perro.hacerSonidoAntiguo();
    }

    public static void main(String[] args) {
        Perro perro = new Perro();

        perro.hacerSonido();

        usarMetodoAntiguo();
    }
}

// Salida:
// Guau
// Guau
