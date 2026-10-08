package com.unai.core.sintaxis.operadores;

/*
 * OPERADORES UNARIOS
 *
 * Actúan sobre un único valor.
 *
 * +    indica un valor positivo
 * -    cambia el signo
 * ++   incrementa en 1
 * --   decrementa en 1
 * !    niega un booleano
 *
 * ++ y -- pueden utilizarse antes o después de la variable.
 *
 * ++numero -> primero incrementa y después utiliza el valor.
 * numero++ -> primero utiliza el valor y después incrementa.
 */

// Ejemplos prácticos

public class Unarios {

    public static void main(String[] args) {

        int numero = 5;

        // Signo positivo
        System.out.println(+numero); // 5

        // Cambio de signo
        System.out.println(-numero); // -5

        // Incremento
        numero++;
        System.out.println(numero); // 6

        // Decremento
        numero--;
        System.out.println(numero); // 5

        // Preincremento
        int a = 5;
        int resultado1 = ++a;

        System.out.println(resultado1); // 6
        System.out.println(a); // 6

        // Postincremento
        int b = 5;
        int resultado2 = b++;

        System.out.println(resultado2); // 5
        System.out.println(b); // 6

        // Negación lógica
        boolean activo = true;

        System.out.println(!activo); // false
    }
}