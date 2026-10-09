package com.unai.core.poo.fundamentos;

// ============================================================
// ATRIBUTOS
// ============================================================
//
// Los atributos representan las características o el estado
// de los objetos de una clase.
//
// Se declaran dentro de la clase y fuera de los métodos.
//
// Su sintaxis es:
//
// tipo nombreAtributo;
//
// Ejemplos:
//
// String nombre;
// int edad;
// double precio;
//
// Los atributos de instancia pertenecen a cada objeto.
// Por eso, dos objetos de una misma clase pueden tener
// valores diferentes.
//
// Si no se inicializan explícitamente, reciben un valor
// por defecto:
//
// Tipos numéricos → 0
// boolean         → false
// char            → '\u0000'
// Tipos referencia → null
//
// Los atributos también pueden inicializarse al declararlos.
//
// ============================================================

// Ejemplo

class Producto {

    // Atributos de instancia
    String nombre;
    double precio;
    int stock;

    // Atributo inicializado al declararlo
    boolean disponible = true;
}

public class Atributos {

    public static void main(String[] args) {

        Producto producto1 = new Producto();
        producto1.nombre = "Teclado";
        producto1.precio = 25.99;
        producto1.stock = 10;

        Producto producto2 = new Producto();
        producto2.nombre = "Ratón";
        producto2.precio = 15.50;
        producto2.stock = 5;

        // Cada objeto tiene sus propios valores
        System.out.println(producto1.nombre); // Teclado
        System.out.println(producto1.precio); // 25.99

        System.out.println(producto2.nombre); // Ratón
        System.out.println(producto2.precio); // 15.5

        System.out.println(producto1.disponible); // true
    }
}