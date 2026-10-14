package com.unai.core.reflexion;

// LIMITACIONES DE REFLECTION

// La reflexión es potente, pero tiene restricciones importantes.
//
// TIPOS GENÉRICOS ERUIDOS
//
// En tiempo de ejecución no existen los parámetros de tipo: se
// han perdido durante la compilación (type erasure).
// Un parámetro List<String> se ve como List, y no se puede crear
// un objeto con un tipo genérico concreto mediante reflexión.
// La firma genérica sí se guarda en los metadatos y puede leerse
// como información, pero no cambia el tipo real.
//
// ANOTACIONES SIN RETENCIÓN RUNTIME
//
// Solo son visibles las anotaciones con retención RUNTIME.
// Las de retención SOURCE o CLASS no pueden leerse en ejecución.
//
// SISTEMA DE MÓDULOS
//
// Desde Java 17, el acceso a miembros internos del JDK está
// fuertemente encapsulado. setAccessible sobre clases de paquetes
// no abiertos lanza InaccessibleObjectException.
//
// RENDIMIENTO
//
// Las llamadas por reflexión son más lentas que las directas y
// el JIT las optimiza menos.
//
// FRAGILIDAD
//
// No hay comprobación en compilación: si se renombra un método
// o un campo, el error aparece en ejecución, no al compilar.

// Ejemplo

import java.lang.reflect.InaccessibleObjectException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class LimitacionesReflection {

    // Retención CLASS: no se podrá leer en ejecución.
    @Retention(RetentionPolicy.CLASS)
    @interface Interna {
    }

    @Interna
    static class Marcada {
    }

    static void procesar(List<String> elementos) {
    }

    public static void main(String[] args) {

        try {
            Method metodo = LimitacionesReflection.class
                    .getDeclaredMethod("procesar", List.class);

            // El tipo real del parámetro es List, sin más.
            System.out.println("Tipo real: " + metodo.getParameterTypes()[0].getName());

            // La firma genérica se conserva como metadato.
            System.out.println("Firma: " + metodo.getGenericParameterTypes()[0]);

            // Una anotación con retención CLASS no es visible.
            System.out.println("Anotación: "
                    + Marcada.class.getAnnotation(Interna.class));

            // El JDK encapsula sus clases internas: intentar abrir
            // un campo privado de java.base lanza la excepción.
            Field interno = ArrayList.class.getDeclaredField("elementData");
            interno.setAccessible(true);

            System.out.println("Acceso concedido");

        } catch (NoSuchMethodException | NoSuchFieldException e) {
            System.out.println("Miembro interno no disponible en esta versión");

        } catch (InaccessibleObjectException e) {
            System.out.println("El sistema de módulos impide el acceso");
        }
    }
}

// Salida:
// Tipo real: java.util.List
// Firma: java.util.List<java.lang.String>
// Anotación: null
// El sistema de módulos impide el acceso
