package com.unai.core.reflexion;

// INSPECCIONAR MÉTODOS

// Cada método de una clase cargada se representa con un objeto
// java.lang.reflect.Method, que permite consultar su firma
// completa.
//
// Obtención:
//
// getDeclaredMethods() -> los métodos declarados en la clase,
//                          de cualquier visibilidad.
// getMethods()         -> los métodos públicos, incluidos los
//                          heredados de las superclases.
//
// Un objeto Method permite consultar:
//
// getName()            -> nombre del método.
// getReturnType()      -> tipo devuelto.
// getParameterTypes()  -> tipos de los parámetros.
// getModifiers()       -> modificadores, con Modifier.toString.
//
// Los métodos sobrecargados aparecen como objetos Method distintos.
// El orden del array no está garantizado.
//
// Un detalle heredado de los genéricos: cuando una clase implementa
// una interfaz genérica, el compilador genera métodos puente
// (bridge), que también aparecen en getDeclaredMethods.

// Ejemplo

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class InspeccionarMetodos {

    static class Calculadora {

        public int sumar(int a, int b) {
            return a + b;
        }

        public double sumar(double a, double b) {
            return a + b;
        }

        public static int doblar(int valor) {
            return valor * 2;
        }

        private void detalle() {
        }
    }

    public static void main(String[] args) {

        Class<Calculadora> clase = Calculadora.class;

        // Ordenamos por nombre y, dentro del mismo nombre, por el
        // tipo del primer parámetro, para tener una salida estable.
        Method[] metodos = clase.getDeclaredMethods();

        Arrays.sort(metodos, Comparator
                .comparing(Method::getName)
                .thenComparing(m -> m.getParameterTypes()[0].getName()));

        for (Method metodo : metodos) {
            System.out.println(
                    Modifier.toString(metodo.getModifiers()) + " "
                    + metodo.getReturnType().getSimpleName() + " "
                    + metodo.getName() + primerParametro(metodo));
        }

        // getMethods incluye los heredados: Object también
        // proporciona toString(), hashCode() o equals().
        for (Method metodo : clase.getMethods()) {
            if (metodo.getName().equals("toString")) {
                System.out.println("toString heredado de Object");
            }
        }
    }

    static String primerParametro(Method metodo) {
        Class<?>[] tipos = metodo.getParameterTypes();

        if (tipos.length == 0) {
            return "()";
        }

        return "(" + tipos[0].getSimpleName() + ")";
    }
}

// Salida:
// private void detalle()
// public static int doblar(int)
// public double sumar(double)
// public int sumar(int)
// toString heredado de Object
