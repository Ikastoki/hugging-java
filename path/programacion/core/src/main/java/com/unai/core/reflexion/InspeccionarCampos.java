package com.unai.core.reflexion;

// INSPECCIONAR CAMPOS

// Cada atributo de una clase se representa con un objeto
// java.lang.reflect.Field, que permite consultar su definición
// y leer o escribir su valor en tiempo de ejecución.
//
// Obtención:
//
// getDeclaredFields() -> los campos declarados en la clase,
//                         de cualquier visibilidad.
// getFields()         -> los campos públicos, incluidos los
//                         heredados.
//
// Un objeto Field permite consultar:
//
// getName()     -> nombre del campo.
// getType()     -> tipo del campo.
// getModifiers() -> modificadores, con Modifier.toString.
//
// Lectura y escritura de valores:
//
// field.get(objeto)      -> valor del campo en ese objeto.
// field.set(objeto, v)   -> cambia el valor.
// field.get(null)        -> solo para campos static.
//
// Un campo private puede leerse con reflexión si se llama a
// setAccessible(true), aunque el sistema de módulos puede
// impedirlo para clases de paquetes no abiertos.

// Ejemplo

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class InspeccionarCampos {

    public static class Usuario {

        public String nombre;
        private int edad;
        public static final String PAIS = "España";
    }

    public static void main(String[] args) throws Exception {

        Class<Usuario> clase = Usuario.class;

        // Campos declarados, ordenados para tener salida estable.
        // La ordenación por nombre compara mayúsculas y minúsculas,
        // por eso PAIS va antes.
        Field[] campos = clase.getDeclaredFields();

        Arrays.sort(campos, Comparator.comparing(Field::getName));

        for (Field campo : campos) {
            System.out.println(
                    Modifier.toString(campo.getModifiers()) + " "
                    + campo.getType().getSimpleName() + " "
                    + campo.getName());
        }

        // Lectura del valor de un campo de instancia.
        Usuario usuario = new Usuario();
        usuario.nombre = "Ana";

        Field campoNombre = clase.getDeclaredField("nombre");

        System.out.println("Valor: " + campoNombre.get(usuario));

        // Los campos static se leen sin objeto: get(null).
        Field campoPais = clase.getDeclaredField("PAIS");

        System.out.println("Valor estático: " + campoPais.get(null));
    }
}

// Salida:
// public static final String PAIS
// private int edad
// public String nombre
// Valor: Ana
// Valor estático: España
