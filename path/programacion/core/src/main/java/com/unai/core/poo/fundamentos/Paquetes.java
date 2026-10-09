package com.unai.core.poo.fundamentos;

// ============================================================
// PAQUETES
// ============================================================
//
// Un paquete (package) agrupa clases e interfaces relacionadas.
//
// Sus principales ventajas son:
//
// - Organizar el código de un proyecto.
// - Evitar conflictos entre clases con el mismo nombre.
// - Controlar el acceso a clases y miembros.
//
// Para declarar un paquete se utiliza package:
//
// package com.ejemplo.app;
//
// La declaración debe aparecer al principio del archivo,
// antes de las importaciones y de las clases.
//
// Para utilizar una clase de otro paquete podemos importarla:
//
// import java.util.Scanner;
//
// También podemos utilizar su nombre completo:
//
// java.util.Scanner scanner = new java.util.Scanner(System.in);
//
// Por convención, los nombres de los paquetes se escriben
// en minúsculas y suelen utilizar nombres de dominio invertidos.
//
// Ejemplo:
//
// com.empresa.proyecto
//
// La estructura de carpetas normalmente refleja el paquete:
//
// src/
// └── com/
//     └── empresa/
//         └── proyecto/
//             └── Main.java
//
// ============================================================

// Ejemplo
// Archivo: src/com/ejemplo/modelo/Persona.java

//package com.ejemplo.modelo;

public class Paquetes {

    private String nombre;

    public Paquetes(String nombre) {
        this.nombre = nombre;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}

// ============================================================
// Archivo: src/com/ejemplo/app/Main.java
// ============================================================
//
// package com.ejemplo.app;
//
// import com.ejemplo.modelo.Persona;
//
// public class Main {
//
// public static void main(String[] args) {
// Persona persona = new Persona("Ana");
// persona.saludar();
// }
// }
//
// Salida:
// Hola, soy Ana
