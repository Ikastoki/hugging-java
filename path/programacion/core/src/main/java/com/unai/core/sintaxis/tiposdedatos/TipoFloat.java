package com.unai.core.sintaxis.tiposdedatos;

/*
 * FLOAT
 *
 * float es un tipo primitivo de Java utilizado para almacenar
 * números decimales.
 *
 * Ocupa 32 bits (4 bytes).
 *
 * Tiene aproximadamente 6-7 dígitos decimales de precisión.
 *
 *
 * DECLARACIÓN E INICIALIZACIÓN
 *
 * Para indicar que un literal decimal es float debemos añadir
 * la letra F o f al final.
 *
 * float precio = 19.99F;
 * float temperatura = -5.5F;
 *
 * Sin la F, un literal decimal se considera double:
 *
 * float precio = 19.99;   // ERROR
 *
 *
 * PRECISIÓN
 *
 * float no representa todos los números decimales con precisión
 * exacta.
 *
 * Por ejemplo:
 *
 * float resultado = 0.1F + 0.2F;
 *
 * El resultado puede ser ligeramente diferente de 0.3.
 *
 *
 * OPERACIONES
 *
 * Podemos realizar las operaciones aritméticas habituales:
 *
 * float a = 10.5F;
 * float b = 2.5F;
 *
 * float suma = a + b;
 * float resta = a - b;
 * float multiplicacion = a * b;
 * float division = a / b;
 *
 *
 * CUÁNDO UTILIZAR FLOAT
 *
 * Se utiliza cuando necesitamos números decimales y queremos
 * ahorrar memoria frente a double, aceptando menor precisión.
 *
 * Para la mayoría de cálculos decimales, double suele ser
 * la opción habitual.
 *
 *
 */

public class TipoFloat {

    public static void main(String[] args) {

        float precio = 19.99F;
        float temperatura = -5.5F;

        System.out.println("Precio: " + precio);
        System.out.println("Temperatura: " + temperatura);

        float a = 10.5F;
        float b = 2.5F;

        float suma = a + b;
        float resta = a - b;
        float multiplicacion = a * b;
        float division = a / b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}