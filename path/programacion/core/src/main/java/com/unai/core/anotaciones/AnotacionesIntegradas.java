package com.unai.core.anotaciones;

// ANOTACIONES INTEGRADAS

// Java incluye algunas anotaciones en el paquete java.lang,
// por lo que no necesitan import.
//
// @Override
// Comprueba en compilación que el método sobrescribe uno de la
// superclase o implementa un método de una interfaz.
// Si la firma no coincide, produce un error de compilación.
//
// @Deprecated
// Marca un elemento como obsoleto.
// Puede recibir los elementos since (desde qué versión está obsoleto)
// y forRemoval (si se eliminará en versiones futuras).
//
// @SuppressWarnings
// Indica al compilador que silencie determinadas advertencias.
// Recibe el identificador de la advertencia, por ejemplo
// "deprecation" u "unchecked".
//
// @FunctionalInterface
// Comprueba que la interfaz declara exactamente un método abstracto.
//
// @SafeVarargs
// Indica que un método o constructor con parámetros varargs genéricos
// no realiza operaciones inseguras con ellos, silenciando la
// correspondiente advertencia.
//
// Otras anotaciones integradas, como @Target o @Retention,
// pertenecen a java.lang.annotation y se verán en los siguientes temas.

// Ejemplo

public class AnotacionesIntegradas {

    // Comprueba que la interfaz declara un único método abstracto.
    // Si se añadiera otro método abstracto, fallaría la compilación.
    @FunctionalInterface
    interface Saludo {
        void saludar(String nombre);
    }

    static class Animal {

        public void hacerSonido() {
            System.out.println("...");
        }
    }

    static class Gato extends Animal {

        @Override
        public void hacerSonido() {
            System.out.println("Miau");
        }

        @Deprecated(since = "1.0", forRemoval = true)
        public void hacerSonidoAntiguo() {
            System.out.println("Sonido antiguo");
        }
    }

    // Silencia la advertencia del compilador al usar el método obsoleto.
    @SuppressWarnings("deprecation")
    static void usarMetodoAntiguo() {
        Gato gato = new Gato();
        gato.hacerSonidoAntiguo();
    }

    // Indica al compilador que el manejo de los elementos varargs
    // es seguro, silenciando la advertencia "unchecked".
    @SafeVarargs
    static <T> void imprimir(T... elementos) {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        Gato gato = new Gato();

        gato.hacerSonido();

        usarMetodoAntiguo();

        // La interfaz marcada con @FunctionalInterface puede
        // implementarse con una expresión lambda.
        Saludo saludo = nombre -> System.out.println("Hola " + nombre);
        saludo.saludar("Ana");

        imprimir("Java", 25);
    }
}

// Salida:
// Miau
// Sonido antiguo
// Hola Ana
// Java
// 25
