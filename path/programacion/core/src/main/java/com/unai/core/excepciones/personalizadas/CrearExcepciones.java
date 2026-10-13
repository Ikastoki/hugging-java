package com.unai.core.excepciones.personalizadas;

// CREAR EXCEPCIONES PERSONALIZADAS

// Permiten definir excepciones propias para representar errores
// específicos de una aplicación.
// Se crean mediante una clase que hereda de Exception
// o de RuntimeException.
// Si heredan de Exception (sin ser RuntimeException), son checked:
// deben capturarse o declararse con throws.
// Si heredan de RuntimeException, son unchecked:
// no es obligatorio capturarlas ni declararlas.
// Es habitual definir un constructor que reciba un mensaje
// y lo pase al constructor de la clase padre mediante super().

// Ejemplo

class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

public class CrearExcepciones {

    static void retirar(double saldo, double cantidad)
            throws SaldoInsuficienteException {

        if (cantidad > saldo) {
            throw new SaldoInsuficienteException(
                    "El saldo es insuficiente.");
        }

        System.out.println("Retirada realizada.");
    }

    public static void main(String[] args) {
        try {
            retirar(100, 150);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
