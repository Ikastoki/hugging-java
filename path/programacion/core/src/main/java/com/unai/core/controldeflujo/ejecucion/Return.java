package com.unai.core.controldeflujo.ejecucion;

/*
 * RETURN
 *
 * La palabra return termina inmediatamente la ejecución
 * del método actual.
 *
 * Puede utilizarse de dos formas principales:
 *
 *     return;
 *
 * Para métodos void, simplemente termina el método.
 *
 *     return valor;
 *
 * Para métodos que devuelven un valor, termina el método
 * y devuelve ese valor al lugar desde donde fue llamado.
 *
 * Cuando se ejecuta return, cualquier código que aparezca
 * después dentro del mismo método no se ejecuta.
 *
 */

public class Return {

    public static void main(String[] args) {

        int resultado = sumar(10, 20);

        System.out.println(resultado);

        mostrarMensaje(false);
    }

    // return devuelve un valor

    static int sumar(int a, int b) {
        return a + b;
    }

    // return puede terminar un método void

    static void mostrarMensaje(boolean mostrar) {

        if (!mostrar) {
            return;
        }

        System.out.println("Mensaje mostrado");
    }

    // return puede utilizarse dentro de un bucle

    static int buscarPrimeroPositivo(int[] numeros) {

        for (int numero : numeros) {

            if (numero > 0) {
                return numero;
            }
        }

        return -1;
    }
}