package com.unai.core.memoria.gestion;

// ASIGNACIÓN DE MEMORIA

// La asignación de memoria es el proceso mediante el cual la JVM
// reserva espacio para cada dato del programa.
//
// EN LA PILA
//
// Las variables locales y los parámetros reciben su espacio al
// crearse el marco de pila del método.
// Una variable local no tiene valor por defecto: hay que asignarle
// un valor antes de usarla. Si se usa antes, no compila.
//
// EN EL HEAP
//
// new reserva espacio para el objeto en el heap y, a continuación,
// ejecuta el constructor para inicializarlo.
// Los atributos de instancia que el constructor no asigna quedan
// con su valor por defecto:
//
//     numéricos -> 0
//     boolean   -> false
//     referencias -> null
//
// Los arrays se crean con new también. Todos sus elementos se
// inicializan automáticamente al valor por defecto de su tipo.
//
//     int[] notas = new int[3];  // 0, 0, 0
//
// CAMPOS ESTÁTICOS
//
// Los atributos static no pertenecen a un objeto, sino a la clase.
// Reciben su espacio cuando la clase se inicializa, y conservan
// su valor por defecto hasta que se les asigna otro.
//
// SI NO HAY ESPACIO
//
// Si la JVM no puede reservar memoria, lanza OutOfMemoryError.

// Ejemplo

public class AsignacionDeMemoria {

    // El campo estático se inicializa con la clase.
    static int totalProductos = 100;

    static class Producto {

        // Sin asignación en el constructor, quedan con su
        // valor por defecto.
        String nombre;
        int cantidad;
        boolean activo;
    }

    public static void main(String[] args) {

        // Variable local en la pila: obligatoria su asignación.
        // int stock;              // no compilaría si se usara aquí
        int stock = 10;

        // new reserva el espacio en el heap y ejecuta el
        // constructor. Como no asigna nada, los atributos
        // conservan sus valores por defecto.
        Producto producto = new Producto();

        System.out.println(producto.nombre);    // null
        System.out.println(producto.cantidad);  // 0
        System.out.println(producto.activo);    // false

        // Array: el espacio reservado inicializa todos los
        // elementos a 0.
        int[] ventas = new int[3];

        System.out.println(ventas[0]);

        // A partir de aquí se les asignan valores reales.
        producto.nombre = "Portátil";
        producto.cantidad = stock;

        System.out.println(producto.nombre + ": " + producto.cantidad);
        System.out.println("Total estático: " + totalProductos);
    }
}

// Salida:
// null
// 0
// false
// 0
// Portátil: 10
// Total estático: 100
