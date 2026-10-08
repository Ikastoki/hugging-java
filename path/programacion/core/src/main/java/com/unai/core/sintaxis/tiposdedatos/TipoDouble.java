package com.unai.core.sintaxis.tiposdedatos;

/*
 * DOUBLE
 *
 * double es un tipo primitivo de Java utilizado para almacenar
 * números decimales.
 *
 * Ocupa 64 bits (8 bytes).
 *
 * Tiene aproximadamente 15-16 dígitos decimales de precisión.
 *
 *
 * DECLARACIÓN E INICIALIZACIÓN
 *
 * double precio = 19.99;
 * double temperatura = -5.5;
 *
 * A diferencia de float, no necesitamos añadir ninguna letra
 * al final del literal decimal.
 *
 * double numero = 10.5;
 *
 *
 * PRECISIÓN
 *
 * Aunque double tiene mucha más precisión que float, los números
 * decimales tampoco se representan siempre de forma exacta.
 *
 * Por ejemplo:
 *
 * double resultado = 0.1 + 0.2;
 *
 * El resultado puede ser ligeramente diferente de 0.3.
 *
 *
 * OPERACIONES
 *
 * Podemos realizar las operaciones aritméticas habituales:
 *
 * double a = 10.5;
 * double b = 2.5;
 *
 * double suma = a + b;
 * double resta = a - b;
 * double multiplicacion = a * b;
 * double division = a / b;
 *
 *
 * DOUBLE COMO VALOR PREDETERMINADO
 *
 * Los literales decimales son double por defecto:
 *
 * double numero = 10.5;
 *
 * Si queremos un float debemos indicarlo con F:
 *
 * float numero = 10.5F;
 *
 *
 * CUÁNDO UTILIZAR DOUBLE
 *
 * Es la opción habitual para trabajar con números decimales
 * cuando necesitamos más precisión que float.
 *
 * Para cálculos monetarios que requieren precisión exacta,
 * normalmente se utiliza BigDecimal en lugar de float o double.
 *
 *
 */

public class TipoDouble {

    public static void main(String[] args) {

        double precio = 19.99;
        double temperatura = -5.5;

        System.out.println("Precio: " + precio);
        System.out.println("Temperatura: " + temperatura);

        double a = 10.5;
        double b = 2.5;

        double suma = a + b;
        double resta = a - b;
        double multiplicacion = a * b;
        double division = a / b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}