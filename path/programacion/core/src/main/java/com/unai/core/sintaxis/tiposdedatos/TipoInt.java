package com.unai.core.sintaxis.tiposdedatos;

/*
 * INT
 *
 * int es un tipo primitivo de Java que almacena números enteros.
 *
 * Ocupa 32 bits (4 bytes).
 *
 * Su rango es:
 *
 * -2.147.483.648 hasta 2.147.483.647
 *
 *
 * DECLARACIÓN E INICIALIZACIÓN
 *
 * int edad = 30;
 * int temperatura = -15;
 * int habitantes = 1000000;
 *
 *
 * RANGO
 *
 * int minimo = -2147483648;
 * int maximo = 2147483647;
 *
 * int valor = 2147483648;   // ERROR: fuera del rango
 *
 *
 * LITERALES ENTEROS
 *
 * Los números enteros escritos directamente en Java son normalmente
 * de tipo int.
 *
 * int numero = 100;
 *
 * También podemos utilizar diferentes bases:
 *
 * int decimal = 100;
 * int binario = 0b1100100;
 * int octal = 0144;
 * int hexadecimal = 0x64;
 *
 *
 * OPERACIONES
 *
 * Las operaciones entre variables int producen otro int,
 * siempre que el resultado esté dentro del rango.
 *
 * int a = 10;
 * int b = 20;
 *
 * int suma = a + b;
 * int resta = a - b;
 * int multiplicacion = a * b;
 * int division = a / b;
 *
 *
 * DIVISIÓN ENTERA
 *
 * Cuando dividimos dos int, el resultado también es entero.
 *
 * int resultado = 5 / 2;
 *
 * resultado será 2, no 2.5.
 *
 *
 * DESBORDAMIENTO
 *
 * Si una operación supera el rango de int, se produce un
 * desbordamiento.
 *
 * int numero = 2147483647;
 * numero++;
 *
 * El resultado será -2147483648.
 *
 *
 * CUÁNDO UTILIZAR INT
 *
 * Es el tipo entero recomendado por defecto para la mayoría
 * de situaciones en las que necesitamos trabajar con números
 * enteros.
 *
 *
 */

public class TipoInt {

    public static void main(String[] args) {

        int edad = 30;
        int habitantes = 1000000;
        int temperatura = -15;

        System.out.println("Edad: " + edad);
        System.out.println("Habitantes: " + habitantes);
        System.out.println("Temperatura: " + temperatura);

        int a = 10;
        int b = 20;

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = b / a;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        int resultado = 5 / 2;

        System.out.println("5 / 2 = " + resultado);
    }
}