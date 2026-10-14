package com.unai.core.reflexion;

// INVOCACIÓN MEDIANTE REFLEXIÓN

// La reflexión no solo permite inspeccionar: también permite
// invocar métodos y constructores cuyo nombre solo se conoce
// en tiempo de ejecución.
//
// Invocar un método:
//
//     Method metodo = Clase.class.getMethod("nombre", Tipo.class);
//     Object resultado = metodo.invoke(objeto, argumento);
//
// - getMethod busca métodos públicos, incluidos los heredados.
// - getDeclaredMethod busca también los no públicos.
// - invoke recibe el objeto sobre el que se invoca y los
//   argumentos; devuelve el resultado, o null si el método es void.
//
// Crear un objeto:
//
//     Constructor<Clase> constructor = Clase.class.getConstructor();
//     Clase objeto = constructor.newInstance();
//
// Excepciones habituales:
//
// NoSuchMethodException     -> el método o constructor no existe.
// IllegalAccessException    -> no se tiene acceso al miembro.
// InvocationTargetException -> el método invocado lanzó una
//                              excepción; la original está en
//                              getCause().
//
// Es el mecanismo que usan los frameworks para llamar a setters,
// constructores o métodos de ciclo de vida cuyos nombres leen de
// la configuración o de las anotaciones.

// Ejemplo

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvocacionPorReflexion {

    public static class Servicio {

        private String mensaje;

        public void configurar(String mensaje) {
            this.mensaje = mensaje;
        }

        public String ejecutar() {
            return "Servicio: " + mensaje;
        }
    }

    public static void main(String[] args) {

        Servicio servicio = new Servicio();

        try {
            // Se obtiene el método por su nombre y sus tipos.
            Method configurar = Servicio.class.getMethod("configurar", String.class);

            // Se invoca con el objeto y el argumento.
            configurar.invoke(servicio, "hola");

            Method ejecutar = Servicio.class.getMethod("ejecutar");

            Object resultado = ejecutar.invoke(servicio);

            System.out.println(resultado);

            // Si el nombre no existe, se lanza la excepción
            // correspondiente.
            Servicio.class.getMethod("inexistente");

        } catch (NoSuchMethodException e) {
            System.out.println("El método no existe");

        } catch (IllegalAccessException | InvocationTargetException e) {
            System.out.println("Error al invocar el método");
        }
    }
}

// Salida:
// Servicio: hola
// El método no existe
