package com.unai.core.poo.encapsulacion;

// ============================================================
// ENCAPSULACIÓN
// ============================================================
//
// La encapsulación es uno de los principios fundamentales
// de la programación orientada a objetos.
//
// Consiste en ocultar los detalles internos de una clase
// y controlar cómo se accede a sus datos.
//
// Para aplicarla habitualmente:
//
// - Se declaran los atributos como private.
// - Se proporcionan métodos públicos para acceder a ellos.
// - Se validan los valores antes de modificar el estado.
//
// private impide acceder directamente al atributo desde
// otras clases.
//
// Los getters permiten consultar atributos.
// Los setters permiten modificarlos de forma controlada.
//
// La encapsulación ayuda a mantener los objetos en un estado
// válido y facilita el mantenimiento del código.
//
// ============================================================

// Ejemplo

class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;

        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        }
    }

    // Getter: consultar el titular
    public String getTitular() {
        return titular;
    }

    // Getter: consultar el saldo
    public double getSaldo() {
        return saldo;
    }

    // Método controlado para ingresar dinero
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }
}

public class Encapsulacion {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("Ana", 100);

        cuenta.ingresar(50);

        System.out.println(cuenta.getTitular()); // Ana
        System.out.println(cuenta.getSaldo()); // 150.0

        // No se permite acceder directamente al atributo:
        // cuenta.saldo = -500;
    }
}
