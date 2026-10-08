package com.unai.core.sintaxis.conversion;

/*
 * CONVERSIÓN IMPLÍCITA
 *
 * La conversión implícita ocurre cuando Java convierte
 * automáticamente un tipo de dato en otro compatible.
 *
 * Normalmente se produce cuando pasamos de un tipo con menor
 * capacidad/rango a otro con mayor capacidad/rango.
 *
 *
 * ORDEN HABITUAL
 *
 * byte
 *   ↓
 * short
 *   ↓
 * int
 *   ↓
 * long
 *   ↓
 * float
 *   ↓
 * double
 *
 * char también puede convertirse implícitamente a tipos numéricos.
 *
 *
 * EJEMPLO
 *
 * byte numero = 10;
 * int resultado = numero;
 *
 * Java convierte automáticamente byte a int.
 *
 *
 * NO NECESITAMOS CASTING
 *
 * int numero = 100;
 * long resultado = numero;
 *
 * double decimal = resultado;
 *
 *
 * PÉRDIDA DE INFORMACIÓN
 *
 * En una conversión implícita Java intenta evitar una pérdida
 * de información, aunque hay casos como long -> float donde
 * puede perderse precisión.
 *
 *
 * CHAR
 *
 * char puede convertirse implícitamente a un tipo numérico:
 *
 * char letra = 'A';
 * int codigo = letra;
 *
 * El resultado será 65.
 *
 *
 * NO TODAS LAS CONVERSIONES SON POSIBLES
 *
 * Java no convierte automáticamente de un tipo más grande
 * a uno más pequeño:
 *
 * int numero = 100;
 * byte resultado = numero;   // ERROR
 *
 * En ese caso necesitaremos una conversión explícita (casting),
 * que veremos a continuación.
 *
 */

public class Implicita {

    public static void main(String[] args) {

        byte numeroByte = 10;
        short numeroShort = numeroByte;
        int numeroInt = numeroShort;
        long numeroLong = numeroInt;
        float numeroFloat = numeroLong;
        double numeroDouble = numeroFloat;

        System.out.println(numeroByte);
        System.out.println(numeroShort);
        System.out.println(numeroInt);
        System.out.println(numeroLong);
        System.out.println(numeroFloat);
        System.out.println(numeroDouble);

        char letra = 'A';
        int codigo = letra;

        System.out.println("Código de A: " + codigo);
    }
}