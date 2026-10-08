package com.unai.core.sintaxis.operadores;

/*
 * OPERADORES LÓGICOS
 *
 * Se utilizan para trabajar con valores booleanos.
 *
 * &&   AND (Y)
 * ||   OR  (O)
 * !    NOT (NO)
 *
 * && devuelve true si ambas condiciones son true.
 *
 * || devuelve true si al menos una condición es true.
 *
 * ! invierte el valor booleano:
 *
 *     !true  -> false
 *     !false -> true
 */

public class Logicos {

    public static void main(String[] args) {

        boolean mayorDeEdad = true;
        boolean tienePermiso = false;

        // AND: ambas condiciones deben cumplirse
        System.out.println(mayorDeEdad && tienePermiso); // false

        // OR: al menos una condición debe cumplirse
        System.out.println(mayorDeEdad || tienePermiso); // true

        // NOT: invierte el valor
        System.out.println(!mayorDeEdad); // false

        // Combinación de operadores lógicos
        int edad = 25;
        boolean tieneEntrada = true;

        boolean puedeEntrar = edad >= 18 && tieneEntrada;

        System.out.println(puedeEntrar); // true
    }
}
