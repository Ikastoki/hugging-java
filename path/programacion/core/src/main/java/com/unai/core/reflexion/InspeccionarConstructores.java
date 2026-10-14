package com.unai.core.reflexion;

// INSPECCIONAR CONSTRUCTORES

// Cada constructor de una clase se representa con un objeto
// java.lang.reflect.Constructor, que permite consultar su firma
// y crear objetos invocándolo.
//
// Obtención:
//
// getDeclaredConstructors() -> todos los constructores de la
//                               clase, de cualquier visibilidad.
// getConstructors()         -> solo los constructores públicos.
//
// Una clase sin constructor declarado tiene un constructor
// implícito, que aparece igualmente en estas consultas.
//
// Un objeto Constructor permite consultar:
//
// getParameterTypes() -> tipos de los parámetros.
// getModifiers()      -> modificadores.
//
// Y crear objetos:
//
// constructor.newInstance(arg1, arg2, ...)
//
// Las excepciones lanzadas dentro del constructor llegan envueltas
// en InvocationTargetException.

// Ejemplo

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Comparator;

public class InspeccionarConstructores {

    public static class Cuenta {

        String titular;
        double saldo;

        public Cuenta() {
            this.titular = "Sin titular";
        }

        public Cuenta(String titular) {
            this.titular = titular;
        }

        // De acceso por defecto: no aparece en getConstructors().
        Cuenta(String titular, double saldo) {
            this.titular = titular;
            this.saldo = saldo;
        }
    }

    public static void main(String[] args) throws Exception {

        Class<Cuenta> clase = Cuenta.class;

        // Solo los constructores públicos, ordenados por número
        // de parámetros.
        Constructor<?>[] publicos = clase.getConstructors();

        Arrays.sort(publicos, Comparator.comparingInt(Constructor::getParameterCount));

        for (Constructor<?> constructor : publicos) {
            System.out.println("Cuenta" + tipos(constructor) + " [public]");
        }

        // getDeclaredConstructors incluye el de acceso por defecto.
        System.out.println("Constructores declarados: "
                + clase.getDeclaredConstructors().length);

        // Crear un objeto mediante el constructor con un parámetro.
        Constructor<Cuenta> constructor = clase.getConstructor(String.class);
        Cuenta cuenta = constructor.newInstance("Ana");

        System.out.println("Titular: " + cuenta.titular);
    }

    static String tipos(Constructor<?> constructor) {
        Class<?>[] tipos = constructor.getParameterTypes();
        StringBuilder descripcion = new StringBuilder("(");

        for (int i = 0; i < tipos.length; i++) {
            if (i > 0) {
                descripcion.append(", ");
            }

            descripcion.append(tipos[i].getSimpleName());
        }

        return descripcion.append(")").toString();
    }
}

// Salida:
// Cuenta() [public]
// Cuenta(String) [public]
// Constructores declarados: 3
// Titular: Ana
