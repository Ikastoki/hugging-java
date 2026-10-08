package com.unai.core.sintaxis.tiposdedatos;

/*
 * BOOLEAN
 *
 * boolean es un tipo primitivo de Java que solo puede tener dos valores:
 *
 * true  -> verdadero
 * false -> falso
 *
 * Se utiliza principalmente para representar condiciones, estados
 * y resultados de comparaciones.
 *
 *
 * DECLARACIÓN
 *
 * boolean activo;
 *
 * Una variable local de tipo boolean debe inicializarse antes de utilizarse.
 *
 * boolean activo = true;
 *
 *
 * VALORES
 *
 * boolean encendido = true;
 * boolean apagado = false;
 *
 * Java no permite asignar números a un boolean:
 *
 * boolean valor = 1;     // ERROR
 * boolean valor = 0;     // ERROR
 *
 *
 * USO EN CONDICIONES
 *
 * Los boolean son muy utilizados con if, while y otras estructuras
 * de control.
 *
 * boolean mayorDeEdad = true;
 *
 * if (mayorDeEdad) {
 *     System.out.println("Puede acceder");
 * }
 *
 *
 * RESULTADO DE COMPARACIONES
 *
 * Las comparaciones producen un valor boolean.
 *
 * int edad = 20;
 *
 * boolean esMayor = edad >= 18;   // true
 * boolean esMenor = edad < 18;   // false
 *
 *
 * OPERADORES LÓGICOS
 *
 * Los boolean se pueden combinar mediante operadores lógicos:
 *
 * &&  -> AND (ambas condiciones deben ser true)
 * ||  -> OR  (al menos una condición debe ser true)
 * !   -> NOT (invierte el valor)
 *
 *
 * DIFERENCIA CON Boolean
 *
 * boolean es un tipo primitivo.
 * Boolean es su tipo envoltorio (wrapper).
 *
 * boolean activo = true;
 * Boolean estado = true;
 *
 * Boolean puede almacenar null, mientras que boolean no:
 *
 * Boolean valor = null;   // válido
 * boolean valor = null;   // ERROR
 *
 *
 */

public class TipoBoolean {

    public static void main(String[] args) {

        boolean activo = true;
        boolean tienePermiso = false;

        System.out.println(activo);
        System.out.println(tienePermiso);

        int edad = 20;

        boolean esMayorDeEdad = edad >= 18;

        if (esMayorDeEdad) {
            System.out.println("Es mayor de edad");
        }

        boolean puedeEntrar = activo && esMayorDeEdad;

        System.out.println("¿Puede entrar? " + puedeEntrar);
    }
}
