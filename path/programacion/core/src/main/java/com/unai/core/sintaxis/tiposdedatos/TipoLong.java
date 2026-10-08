package com.unai.core.sintaxis.tiposdedatos;

/*
 * LONG
 *
 * long es un tipo primitivo de Java que almacena números enteros.
 *
 * Ocupa 64 bits (8 bytes).
 *
 * Su rango es:
 *
 * -9.223.372.036.854.775.808
 * hasta
 *  9.223.372.036.854.775.807
 *
 *
 * DECLARACIÓN E INICIALIZACIÓN
 *
 * long poblacion = 8000000000L;
 * long distancia = 384400000L;
 *
 * Es recomendable utilizar L al final del literal para indicar
 * explícitamente que el número es de tipo long.
 *
 *
 * RANGO
 *
 * long minimo = -9223372036854775808L;
 * long maximo =  9223372036854775807L;
 *
 *
 * LITERALES
 *
 * Un número entero escrito directamente en Java es normalmente
 * de tipo int.
 *
 * Por eso, si el valor supera el rango de int, debemos utilizar L:
 *
 * long numero = 3000000000L;
 *
 * Sin L:
 *
 * long numero = 3000000000;   // ERROR
 *
 *
 * OPERACIONES
 *
 * Las operaciones entre variables long producen normalmente
 * un resultado de tipo long.
 *
 * long a = 1000000000L;
 * long b = 2000000000L;
 *
 * long suma = a + b;
 *
 *
 * CUÁNDO UTILIZAR LONG
 *
 * Se utiliza cuando necesitamos representar números enteros
 * que pueden superar el rango de int.
 *
 * Es habitual en valores como identificadores, timestamps,
 * tamaños grandes o cantidades que pueden crecer mucho.
 *
 *
 */

public class TipoLong {

    public static void main(String[] args) {

        long poblacion = 8000000000L;
        long distancia = 384400000L;

        System.out.println("Población: " + poblacion);
        System.out.println("Distancia: " + distancia);

        long a = 1000000000L;
        long b = 2000000000L;

        long suma = a + b;

        System.out.println("Suma: " + suma);

        long timestamp = System.currentTimeMillis();

        System.out.println("Timestamp: " + timestamp);
    }
}