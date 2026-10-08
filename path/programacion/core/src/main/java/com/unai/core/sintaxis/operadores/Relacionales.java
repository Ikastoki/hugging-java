package com.unai.core.sintaxis.operadores;

/*
 * OPERADORES RELACIONALES
 *
 * Se utilizan para comparar dos valores.
 *
 * ==   igual a
 * !=   diferente de
 * >    mayor que
 * <    menor que
 * >=   mayor o igual que
 * <=   menor o igual que
 *
 * El resultado de una comparación siempre es un boolean:
 *
 *     true
 *     false
 */

public class Relacionales {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b); // true
        System.out.println(a < b); // false
        System.out.println(a >= b); // true
        System.out.println(a <= b); // false
    }
}