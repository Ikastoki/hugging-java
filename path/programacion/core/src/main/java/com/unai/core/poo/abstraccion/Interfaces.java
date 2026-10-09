package com.unai.core.poo.abstraccion;

// INTERFACES
//
// Una interfaz se declara con la palabra reservada interface.
//
// Una clase implementa una interfaz utilizando implements.
//
// Las interfaces permiten definir un contrato: las clases que lo
// implementan deben proporcionar los métodos abstractos que les correspondan.
//
// Una clase puede implementar varias interfaces.
// En cambio, solo puede extender una clase directamente.
//
// Una interfaz puede contener:
//
// - Métodos abstractos: públicos y abstractos implícitamente.
// - Métodos default: tienen una implementación.
// - Métodos static: pertenecen a la interfaz.
// - Constantes: son public, static y final implícitamente.
//
// No se puede crear una instancia directamente de una interfaz.
//
// Las interfaces permiten que clases diferentes compartan un contrato
// aunque no pertenezcan a la misma jerarquía de herencia.

// EJEMPLO

interface Imprimible {
    void imprimir();
}

interface Guardable {
    void guardar();
}

class Documento implements Imprimible, Guardable {
    private String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo: " + contenido);
    }

    @Override
    public void guardar() {
        System.out.println("Guardando: " + contenido);
    }
}

class Fotografia implements Imprimible {
    @Override
    public void imprimir() {
        System.out.println("Imprimiendo fotografía");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Documento documento = new Documento("Informe");
        Fotografia fotografia = new Fotografia();

        documento.imprimir();
        documento.guardar();

        fotografia.imprimir();

        // Una referencia de interfaz puede apuntar a cualquier
        // objeto que implemente esa interfaz.
        Imprimible elemento = new Documento("Contrato");
        elemento.imprimir();

        // También podemos agrupar objetos con el mismo contrato.
        Imprimible[] elementos = { documento, fotografia };

        for (Imprimible item : elementos) {
            item.imprimir();
        }
    }
}

// DIFERENCIA ENTRE CLASE ABSTRACTA E INTERFAZ
//
// CLASE ABSTRACTA
// - Se declara con abstract class.
// - Puede tener atributos de instancia, constructores,
// métodos abstractos y métodos con implementación.
// - Se utiliza cuando varias clases comparten estado
// y comportamiento común.
// - Una clase solo puede extender una clase.
// - Se hereda mediante extends.
//
// INTERFAZ
// - Se declara con interface.
// - Define principalmente un contrato de comportamiento.
// - Puede contener métodos abstractos, default y static,
// además de constantes.
// - No tiene constructores ni atributos de instancia.
// - Una clase puede implementar varias interfaces.
// - Se implementa mediante implements.
//
// DIFERENCIA PRINCIPAL
// - Clase abstracta: permite compartir estado y código
// entre clases relacionadas.
// - Interfaz: permite definir capacidades o comportamientos
// que pueden compartir clases diferentes.
//
// EJEMPLO CONCEPTUAL
// abstract class Animal {}
// interface Volador {}
//
// class Pajaro extends Animal implements Volador {}
//
// Pajaro hereda de Animal y, además, implementa la capacidad
// definida por Volador.
//
// ¿CUÁNDO UTILIZAR CADA UNA?
// - Clase abstracta: cuando existe una base común con atributos
// o implementación compartida.
// - Interfaz: cuando quieres establecer un contrato que pueden
// cumplir clases distintas, incluso sin relación de herencia.
//
// Una clase puede extender una sola clase, pero implementar
// varias interfaces.