package com.unai.core.sintaxis.tiposdedatos;

/*
 * SHORT
 *
 * short es un tipo primitivo de Java que almacena números enteros.
 *
 * Ocupa 16 bits (2 bytes).
 *
 * Su rango es:
 *
 * -32.768 hasta 32.767
 *
 *
 * DECLARACIÓN E INICIALIZACIÓN
 *
 * short edad = 25;
 * short temperatura = -100;
 *
 *
 * RANGO
 *
 * short minimo = -32768;
 * short maximo = 32767;
 *
 * short valor = 32768;   // ERROR: fuera del rango
 *
 *
 * LITERALES ENTEROS
 *
 * Los números enteros escritos directamente en Java se consideran
 * normalmente int.
 *
 * Podemos asignar un literal a short si está dentro de su rango:
 *
 * short numero = 1000;
 *
 * Pero una variable int no puede asignarse directamente a short:
 *
 * int numero = 1000;
 * short resultado = numero;   // ERROR
 *
 * Necesitamos realizar un casting:
 *
 * short resultado = (short) numero;
 *
 *
 * OPERACIONES
 *
 * Las operaciones aritméticas con short producen normalmente un int.
 *
 * short a = 1000;
 * short b = 2000;
 *
 * int suma = a + b;
 *
 * Si queremos guardar el resultado en un short, necesitamos casting:
 *
 * short resultado = (short) (a + b);
 *
 *
 * CUÁNDO UTILIZAR SHORT
 *
 * Se utiliza cuando necesitamos representar enteros que caben en
 * 16 bits y queremos controlar explícitamente el tamaño del dato.
 *
 *
 */

public class TipoShort {

    public static void main(String[] args) {

        short edad = 25;
        short temperatura = -100;

        System.out.println("Edad: " + edad);
        System.out.println("Temperatura: " + temperatura);

        short minimo = -32768;
        short maximo = 32767;

        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);

        short a = 1000;
        short b = 2000;

        int suma = a + b;

        System.out.println("Suma: " + suma);

        short resultado = (short) (a + b);

        System.out.println("Resultado como short: " + resultado);
    }
}
