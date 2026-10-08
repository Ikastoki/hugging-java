package com.unai.core.sintaxis.tiposdedatos;

/*
 * NULL
 *
 * null es un valor especial de Java que indica que una variable
 * de tipo referencia no está apuntando actualmente a ningún objeto.
 *
 * null NO es un tipo de dato ni un objeto.
 *
 *
 * USO
 *
 * String nombre = null;
 *
 * En este caso, nombre existe como variable, pero no referencia
 * ningún objeto String.
 *
 *
 * TIPOS DE REFERENCIA
 *
 * null puede asignarse a variables de tipos de referencia:
 *
 * String texto = null;
 * Integer numero = null;
 * Persona persona = null;
 *
 * No puede asignarse a tipos primitivos:
 *
 * int numero = null;       // ERROR
 * boolean activo = null;   // ERROR
 *
 *
 * COMPROBAR SI ES NULL
 *
 * Podemos comprobar si una referencia es null:
 *
 * String nombre = null;
 *
 * if (nombre == null) {
 *     System.out.println("No hay nombre");
 * }
 *
 * También podemos comprobar que NO sea null:
 *
 * if (nombre != null) {
 *     System.out.println(nombre);
 * }
 *
 *
 * NULL Y MÉTODOS
 *
 * Intentar utilizar un método sobre una referencia null provoca
 * una NullPointerException.
 *
 * String texto = null;
 * texto.length();   // NullPointerException
 *
 *
 * NULL Y OBJETOS
 *
 * Cuando una variable referencia un objeto:
 *
 * String texto = "Hola";
 *
 * Si posteriormente hacemos:
 *
 * texto = null;
 *
 * la variable deja de referenciar ese objeto.
 *
 * Si ningún otro objeto lo referencia, ese objeto podrá ser
 * eliminado posteriormente por el Garbage Collector.
 *
 *
 */

public class TipoNull {

    public static void main(String[] args) {

        String nombre = null;

        if (nombre == null) {
            System.out.println("El nombre no está informado");
        }

        nombre = "Juan";

        if (nombre != null) {
            System.out.println("Nombre: " + nombre);
        }

        String texto = null;

        // Esto provocaría una NullPointerException:
        // System.out.println(texto.length());
    }
}