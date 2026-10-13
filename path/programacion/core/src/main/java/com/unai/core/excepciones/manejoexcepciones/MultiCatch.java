package com.unai.core.excepciones.manejoexcepciones;

// MÚLTIPLES BLOQUES CATCH

// Permiten gestionar diferentes tipos de excepciones producidas
// dentro de un mismo bloque try.
// Cada catch especifica el tipo de excepción que puede capturar.
// Solo se ejecuta el primer catch compatible con la excepción.
// Los catch deben colocarse desde la excepción más específica
// hasta la más general.
// Un catch de una excepción general, como Exception, debe ir al final,
// porque puede capturar también las excepciones más específicas.

// Ejemplo

public class MultiCatch {
    public static void main(String[] args) {

        try {
            int numero = Integer.parseInt("abc");
            int resultado = 10 / numero;
            System.out.println(resultado);

        } catch (NumberFormatException e) {
            System.out.println("El texto no es un número válido.");

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero.");

        } catch (Exception e) {
            System.out.println("Se ha producido otro error.");
        }
    }
}

// MÚLTIPLES EXCEPCIONES EN UN CATCH

// Se utiliza | para capturar varios tipos de excepciones
// en un mismo bloque catch.
// Los tipos no pueden tener relación de herencia entre sí.
// Por ejemplo, no puedes combinar NumberFormatException y Exception,
// porque NumberFormatException ya hereda de Exception.

// Ejemplo

class EnUnCatch {
    public static void main(String[] args) {

        try {
            int numero = Integer.parseInt("abc");
            System.out.println(10 / numero);

        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Error al convertir o calcular.");
        }
    }
}