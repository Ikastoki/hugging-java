package com.unai.core.poo.encapsulacion;

// ============================================================
// GETTERS Y SETTERS
// ============================================================
//
// Los getters y setters permiten acceder a atributos private
// desde fuera de la clase mediante métodos públicos.
//
// Getter:
// Devuelve el valor de un atributo.
//
// Convención de nombres:
// getNombre()
//
// Setter:
// Modifica el valor de un atributo.
//
// Convención de nombres:
// setNombre(String nombre)
//
// Normalmente, los getters devuelven el tipo del atributo
// y los setters reciben un parámetro de ese tipo.
//
// Los setters también pueden validar los valores antes
// de modificar el atributo.
//
// No todos los atributos necesitan tener getter y setter.
// Podemos permitir consultar un valor sin permitir modificarlo.
//
// ============================================================

// Ejemplo

class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    // Getter de nombre
    public String getNombre() {
        return nombre;
    }

    // Setter de nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter de edad
    public int getEdad() {
        return edad;
    }

    // Setter de edad con validación
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }
}

public class GetterSetter {

    public static void main(String[] args) {

        Persona persona = new Persona("Ana", 25);

        // Consultar atributos mediante getters
        System.out.println(persona.getNombre()); // Ana
        System.out.println(persona.getEdad()); // 25

        // Modificar atributos mediante setters
        persona.setNombre("Laura");
        persona.setEdad(30);

        System.out.println(persona.getNombre()); // Laura
        System.out.println(persona.getEdad()); // 30

        // La edad negativa se ignora por la validación
        persona.setEdad(-5);

        System.out.println(persona.getEdad()); // 30
    }
}
