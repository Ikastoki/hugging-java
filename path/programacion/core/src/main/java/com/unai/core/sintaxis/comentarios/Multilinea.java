package com.unai.core.sintaxis.comentarios;

/*
 * COMENTARIOS MULTILÍNEA
 *
 * Permiten escribir comentarios que ocupan varias líneas.
 *
 * Se utilizan:
    /*
          comentario
          de varias líneas
    */

//    Java ignora todo el contenido que se encuentra*entre /* y */.*/

public class Multilinea {

    public static void main(String[] args) {

        /*
         * Este comentario explica
         * lo que hace el siguiente código.
         */
        int numero = 10;

        /*
         * Podemos utilizar varias líneas
         * para explicar una parte más compleja
         * del programa.
         */
        System.out.println(numero);
    }
}