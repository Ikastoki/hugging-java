package com.unai.core.sintaxis.tiposdedatos;

/*
 * STRING
 *
 * String es una clase de Java utilizada para representar cadenas
 * de caracteres, es decir, texto.
 *
 * A diferencia de boolean, byte, short, int, long, float, double
 * y char, String NO es un tipo primitivo.
 *
 *
 * DECLARACIÓN E INICIALIZACIÓN
 *
 * Las cadenas se escriben entre comillas dobles:
 *
 * String nombre = "Juan";
 * String mensaje = "Hola mundo";
 *
 *
 * CADENA VACÍA
 *
 * Una String puede no contener ningún carácter:
 *
 * String texto = "";
 *
 * Esto es diferente de null:
 *
 * String texto = "";     // cadena vacía
 * String texto = null;  // no apunta a ningún objeto
 *
 *
 * CONCATENACIÓN
 *
 * Podemos unir cadenas utilizando el operador +:
 *
 * String nombre = "Juan";
 * String saludo = "Hola " + nombre;
 *
 *
 * MÉTODOS
 *
 * String proporciona muchos métodos para trabajar con texto:
 *
 * length()       -> devuelve la longitud
 * toUpperCase()  -> convierte a mayúsculas
 * toLowerCase()  -> convierte a minúsculas
 * charAt()       -> obtiene un carácter
 * contains()     -> comprueba si contiene un texto
 *
 *
 * COMPARAR STRINGS
 *
 * Para comparar el contenido de dos String debemos utilizar
 * equals(), no ==.
 *
 * String a = "Hola";
 * String b = "Hola";
 *
 * a.equals(b);   // true
 *
 * == compara referencias de objetos, no el contenido.
 *
 *
 * INMUTABILIDAD
 *
 * Los objetos String son inmutables.
 *
 * Esto significa que una vez creado un String, su contenido
 * no puede modificarse.
 *
 * String texto = "Hola";
 * texto = texto + " mundo";
 *
 * En realidad se crea una nueva String.
 *
 *
 */

public class TipoString {

    public static void main(String[] args) {

        String nombre = "Juan";
        String saludo = "Hola mundo";

        System.out.println(nombre);
        System.out.println(saludo);

        String mensaje = "Hola " + nombre;

        System.out.println(mensaje);

        System.out.println("Longitud: " + mensaje.length());
        System.out.println("Mayúsculas: " + mensaje.toUpperCase());
        System.out.println("Minúsculas: " + mensaje.toLowerCase());

        String texto = "Java";

        System.out.println("Contiene 'av': " + texto.contains("av"));
        System.out.println("Primer carácter: " + texto.charAt(0));

        String a = "Hola";
        String b = "Hola";

        System.out.println(a.equals(b)); // true
    }
}