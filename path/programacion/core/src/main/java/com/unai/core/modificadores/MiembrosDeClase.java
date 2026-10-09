package com.unai.core.modificadores;

// Miembros de clase

// Los miembros static pertenecen a la clase.
// Existe una única copia compartida de cada atributo static.
// Los métodos static se pueden invocar sin crear objetos.

// Atributo de clase
// Se comparte entre todas las instancias.
// static int contador = 0;

// Método de clase
// Se invoca utilizando el nombre de la clase.
//static void mostrarContador() {
//    System.out.println(contador);
// }

public class MiembrosDeClase {

    static int contador = 0;

    String nombre;

    public MiembrosDeClase(String nombre) {
        this.nombre = nombre;
        contador++;
    }

    static void mostrarContador() {
        System.out.println("Objetos creados: " + contador);
    }

    public static void main(String[] args) {

        // Crear objetos incrementa el atributo compartido.
        MiembrosDeClase objeto1 = new MiembrosDeClase("Ana");
        MiembrosDeClase objeto2 = new MiembrosDeClase("Luis");

        // Acceder al miembro de clase mediante el nombre
        // de la clase.
        MiembrosDeClase.mostrarContador();

        // También se puede consultar el atributo static.
        System.out.println(MiembrosDeClase.contador);

        // Los atributos de instancia pertenecen a cada objeto.
        System.out.println(objeto1.nombre);
        System.out.println(objeto2.nombre);
    }
}