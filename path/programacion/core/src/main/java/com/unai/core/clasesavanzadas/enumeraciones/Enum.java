package com.unai.core.clasesavanzadas.enumeraciones;

// Enum

// Se declara con la palabra clave enum.
// Define un conjunto fijo de constantes.
// Las constantes se escriben normalmente en mayúsculas.
// Cada constante es una instancia del tipo enumerado.
// Permite trabajar con valores definidos y evitar valores inválidos.

// Ejemplo completo
public class Enum {

    // Declaración de una enumeración.
    enum Dia {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }

    public static void main(String[] args) {

        // Asignar una constante del enum a una variable.
        Dia diaActual = Dia.LUNES;

        System.out.println(diaActual);

        // Utilizar un enum en una condición.
        if (diaActual == Dia.LUNES) {
            System.out.println("Comienza la semana");
        }

        // Recorrer todas las constantes.
        for (Dia dia : Dia.values()) {
            System.out.println(dia);
        }

        // Obtener una constante a partir de su nombre.
        Dia otroDia = Dia.valueOf("VIERNES");
        System.out.println(otroDia);
    }
}

// Salida:
// LUNES
// Comienza la semana
// LUNES
// MARTES
// MIERCOLES
// JUEVES
// VIERNES
// SABADO
// DOMINGO
// VIERNES