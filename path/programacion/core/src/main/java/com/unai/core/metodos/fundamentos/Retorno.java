package com.unai.core.metodos.fundamentos;

/*
 * VALORES DE RETORNO
 *
 * Un método puede devolver un valor después de ejecutarse.
 *
 * El tipo de retorno se escribe antes del nombre del método:
 *
 *     static int sumar(int a, int b) {
 *         return a + b;
 *     }
 *
 * En este caso:
 *
 *     int
 *     → indica que el método devuelve un int.
 *
 *     return a + b;
 *     → devuelve el resultado.
 *
 * El valor devuelto puede guardarse en una variable:
 *
 *     int resultado = sumar(10, 20);
 *
 * También podemos utilizarlo directamente:
 *
 *     System.out.println(sumar(10, 20));
 *
 * Un método que no devuelve ningún valor utiliza void.
 *
 *     static void saludar() {
 *         System.out.println("Hola");
 *     }
 *
 * En un método void podemos utilizar:
 *
 *     return;
 *
 * pero no podemos devolver un valor.
 *
 * Un método que no es void debe devolver un valor compatible
 * con el tipo de retorno en todos los caminos posibles
 * de ejecución.
 *
 */

public class Retorno {

    // Devuelve un int

    static int sumar(int a, int b) {
        return a + b;
    }

    // Devuelve un double

    static double calcularPrecio(double precio, double iva) {
        return precio + (precio * iva);
    }

    // Devuelve un String

    static String obtenerSaludo(String nombre) {
        return "Hola, " + nombre;
    }

    // Devuelve un boolean

    static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    // No devuelve ningún valor

    static void mostrarMensaje() {
        System.out.println("Hola");
    }

    public static void main(String[] args) {

        int resultado = sumar(10, 20);

        double precioFinal = calcularPrecio(100, 0.21);

        String saludo = obtenerSaludo("Ana");

        boolean mayor = esMayorDeEdad(25);

        System.out.println(resultado);
        System.out.println(precioFinal);
        System.out.println(saludo);
        System.out.println(mayor);

        mostrarMensaje();
    }
}
