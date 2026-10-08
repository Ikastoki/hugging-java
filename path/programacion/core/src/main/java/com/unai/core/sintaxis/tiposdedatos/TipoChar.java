package com.unai.core.sintaxis.tiposdedatos;

/*
 * CHAR
 *
 * char es un tipo primitivo de Java que representa un único carácter.
 *
 * Ocupa 16 bits (2 bytes).
 *
 * Java utiliza Unicode para representar caracteres, por lo que char
 * puede representar muchos caracteres de diferentes idiomas.
 *
 *
 * DECLARACIÓN E INICIALIZACIÓN
 *
 * Los caracteres se escriben entre comillas simples:
 *
 * char letra = 'A';
 * char numero = '5';
 * char simbolo = '@';
 *
 * Las comillas dobles se utilizan para String:
 *
 * char letra = "A";   // ERROR
 * String letra = "A"; // correcto
 *
 *
 * UN SOLO CARÁCTER
 *
 * Una variable char solo puede almacenar un carácter.
 *
 * char letra = 'A';    // correcto
 * char palabra = 'Hola'; // ERROR
 *
 *
 * CARACTERES ESPECIALES
 *
 * Podemos utilizar secuencias de escape:
 *
 * char salto = '\n';
 * char tabulador = '\t';
 * char comilla = '\'';
 *
 *
 * UNICODE
 *
 * También podemos representar caracteres mediante su código Unicode:
 *
 * char letra = '\u0041';  // A
 *
 *
 * OPERACIONES
 *
 * char también puede participar en operaciones numéricas porque
 * internamente representa un valor Unicode.
 *
 * char letra = 'A';
 * int codigo = letra;
 *
 * El resultado será 65, que es el código Unicode de 'A'.
 *
 *
 */

public class TipoChar {

    public static void main(String[] args) {

        char letra = 'A';
        char numero = '5';
        char simbolo = '@';

        System.out.println("Letra: " + letra);
        System.out.println("Número: " + numero);
        System.out.println("Símbolo: " + simbolo);

        char unicode = '\u0041';

        System.out.println("Unicode: " + unicode);

        int codigo = letra;

        System.out.println("Código Unicode: " + codigo);
    }
}
