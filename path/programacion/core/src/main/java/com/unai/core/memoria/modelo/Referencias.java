package com.unai.core.memoria.modelo;

// REFERENCIAS

// Una referencia es el enlace que permite acceder a un objeto
// del heap. No es el objeto en sí, sino una dirección o puntero
// gestionado por la JVM.
//
// Las referencias se guardan en:
//
// - Variables locales y parámetros, en la pila.
// - Atributos de instancia, dentro de los objetos del heap.
// - Elementos de un array.
//
// Una referencia con valor null no apunta a ningún objeto.
// Acceder a un objeto a través de una referencia null produce
// NullPointerException.
//
// Mientras exista al menos una referencia viva hacia un objeto,
// el objeto no puede ser recolectado por el GC.
// Cuando se pierden todas, el objeto queda huérfano.
//
// El operador == compara referencias: comprueba si ambas apuntan
// al mismo objeto. El método equals() compara el contenido.
// Son dos cosas distintas.
//
// La referencia normal se llama referencia fuerte (strong).
// Existen tipos más débiles, en el paquete java.lang.ref, como
// la referencia débil (WeakReference), que permite detectar
// cuándo un objeto deja de ser accesible. La veremos al estudiar
// el garbage collection.

// Ejemplo

public class Referencias {

    public static void main(String[] args) {

        // Dos referencias a dos objetos distintos, con el mismo
        // contenido. La igualdad de referencias es falsa.
        String texto1 = new String("Java");
        String texto2 = new String("Java");

        System.out.println(texto1 == texto2);        // false
        System.out.println(texto1.equals(texto2));   // true

        // Una tercera referencia apunta al mismo objeto que texto1.
        String texto3 = texto1;

        System.out.println(texto1 == texto3);        // true

        // null: la referencia no apunta a ningún objeto.
        texto3 = null;

        System.out.println(texto3);                  // null

        // texto1 sigue viva, por lo que su objeto permanece
        // en el heap.
        System.out.println(texto1);
    }
}

// Salida:
// false
// true
// true
// null
// Java
