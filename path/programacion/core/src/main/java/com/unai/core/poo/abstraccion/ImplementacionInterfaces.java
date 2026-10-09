package com.unai.core.poo.abstraccion;

// IMPLEMENTACIÓN DE INTERFACES
//
// Una clase implementa una interfaz mediante implements.
//
// Sintaxis:
// class MiClase implements MiInterfaz { }
//
// La clase debe implementar todos los métodos abstractos
// de la interfaz, salvo que se declare abstract.
//
// Una clase puede implementar varias interfaces separándolas
// mediante comas.
//
// Los métodos abstractos de una interfaz son public implícitamente.
// Por eso, al implementarlos deben declararse public.
//
// Una interfaz puede tener métodos default con implementación.
// La clase puede heredarlos o sobrescribirlos con @Override.
//
// Una referencia de tipo interfaz puede apuntar a cualquier objeto
// de una clase que implemente esa interfaz.
//
// Esto permite utilizar el polimorfismo sin depender de una
// implementación concreta.

// EJEMPLO

interface Notificable {
    void enviarNotificacion();

    default void mostrarEstado() {
        System.out.println("Notificación preparada");
    }
}

interface Registrable {
    void registrar();
}

class Correo implements Notificable, Registrable {
    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando correo electrónico");
    }

    @Override
    public void registrar() {
        System.out.println("Registrando el envío del correo");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Correo listo para enviar");
    }
}

class SMS implements Notificable {
    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando SMS");
    }
}

public class ImplementacionInterfaces {
    public static void main(String[] args) {
        Correo correo = new Correo();
        correo.enviarNotificacion();
        correo.registrar();
        correo.mostrarEstado();

        SMS sms = new SMS();
        sms.enviarNotificacion();

        // Polimorfismo mediante una referencia de interfaz
        Notificable notificacion = new Correo();
        notificacion.enviarNotificacion();

        // Podemos agrupar diferentes implementaciones
        Notificable[] notificaciones = {
                new Correo(),
                new SMS()
        };

        for (Notificable elemento : notificaciones) {
            elemento.enviarNotificacion();
        }
    }
}
