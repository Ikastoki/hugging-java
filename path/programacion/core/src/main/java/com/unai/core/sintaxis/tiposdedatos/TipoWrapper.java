package com.unai.core.sintaxis.tiposdedatos;

/*
 * TIPOS ENVOLTORIO (WRAPPER)
 *
 * Los tipos envoltorio son clases que representan los tipos
 * primitivos como objetos.
 *
 * Cada primitivo tiene su correspondiente tipo envoltorio:
 *
 * byte    -> Byte
 * short   -> Short
 * int     -> Integer
 * long    -> Long
 * float   -> Float
 * double  -> Double
 * char    -> Character
 * boolean -> Boolean
 *
 *
 * PRIMITIVO VS ENVOLTORIO
 *
 * int edad = 30;
 * Integer edad = 30;
 *
 * El primero es un tipo primitivo.
 * El segundo es un objeto de la clase Integer.
 *
 *
 * ¿POR QUÉ EXISTEN?
 *
 * Son útiles cuando necesitamos trabajar con objetos en lugar
 * de tipos primitivos.
 *
 * Por ejemplo, las colecciones como ArrayList trabajan con
 * objetos:
 *
 * ArrayList<Integer> numeros = new ArrayList<>();
 *
 * No podemos utilizar directamente:
 *
 * ArrayList<int> numeros;   // ERROR
 *
 *
 * NULL
 *
 * Los tipos envoltorio pueden almacenar null porque son objetos:
 *
 * Integer numero = null;
 *
 * Un primitivo no puede:
 *
 * int numero = null;   // ERROR
 *
 *
 * MÉTODOS ÚTILES
 *
 * Las clases envoltorio proporcionan métodos para convertir
 * y trabajar con valores.
 *
 * Integer.parseInt("25")     -> convierte String a int
 * Double.parseDouble("3.14") -> convierte String a double
 *
 *
 * AUTObOXING Y UNBOXING
 *
 * Java puede convertir automáticamente entre primitivos y
 * sus tipos envoltorio.
 *
 * Autoboxing:
 *
 * int numero = 10;
 * Integer objeto = numero;
 *
 * Unboxing:
 *
 * Integer objeto = 10;
 * int numero = objeto;
 *
 *
 * EJEMPLO
 */

import java.util.ArrayList;

public class TipoWrapper {

    public static void main(String[] args) {

        int edad = 30;
        Integer edadObjeto = 30;

        System.out.println("Primitivo: " + edad);
        System.out.println("Envoltorio: " + edadObjeto);

        Integer numero = null;

        System.out.println("Número: " + numero);

        int valor = Integer.parseInt("100");

        System.out.println("Valor convertido: " + valor);

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println(numeros);
    }
}