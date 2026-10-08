package com.unai.core.sintaxis.tiposdedatos;

/*
 * BYTE
 *
 * byte es un tipo primitivo de Java que almacena números enteros.
 *
 * Ocupa 8 bits (1 byte).
 *
 * Su rango es:
 *
 * -128 hasta 127
 *
 *
 * DECLARACIÓN E INICIALIZACIÓN
 *
 * byte edad = 25;
 * byte temperatura = -10;
 *
 *
 * RANGO
 *
 * byte minimo = -128;
 * byte maximo = 127;
 *
 * byte valor = 128;   // ERROR: fuera del rango
 *
 *
 * LITERALES ENTEROS
 *
 * Los números enteros escritos directamente en Java se consideran
 * normalmente int.
 *
 * Por eso podemos asignar un literal entero a byte si está dentro
 * de su rango:
 *
 * byte numero = 100;
 *
 * Pero una variable int no se puede asignar directamente a byte:
 *
 * int numero = 100;
 * byte resultado = numero;   // ERROR
 *
 * En ese caso necesitamos casting.
 *
 *
 * OPERACIONES
 *
 * Las operaciones aritméticas con byte normalmente producen un int.
 *
 * byte a = 10;
 * byte b = 20;
 *
 * int resultado = a + b;
 *
 * Para guardar nuevamente el resultado en un byte necesitamos casting:
 *
 * byte resultado = (byte) (a + b);
 *
 *
 * DESBORDAMIENTO
 *
 * Si superamos el rango de byte, el valor puede desbordarse.
 *
 * byte numero = 127;
 * numero++;
 *
 * El resultado será -128.
 *
 *
 * CUÁNDO UTILIZAR BYTE
 *
 * Es útil cuando necesitamos trabajar con datos que realmente
 * necesitan 8 bits, por ejemplo datos binarios o bytes procedentes
 * de archivos y redes.
 *
 *
 */

public class TipoByte {

    public static void main(String[] args) {

        byte edad = 25;
        byte temperatura = -10;

        System.out.println("Edad: " + edad);
        System.out.println("Temperatura: " + temperatura);

        byte minimo = -128;
        byte maximo = 127;

        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);

        byte a = 10;
        byte b = 20;

        int suma = a + b;

        System.out.println("Suma: " + suma);

        byte resultado = (byte) (a + b);

        System.out.println("Resultado como byte: " + resultado);
    }
}