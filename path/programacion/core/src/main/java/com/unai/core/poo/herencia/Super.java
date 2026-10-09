package com.unai.core.poo.herencia;

// ============================================================
// SUPER
// ============================================================
//
// super hace referencia a la parte heredada del objeto,
// es decir, a la clase padre.
//
// Se utiliza principalmente para:
//
// - Llamar al constructor del padre: super(...)
// - Invocar un método del padre: super.metodo()
// - Acceder a un atributo del padre: super.atributo
//
// La llamada super(...) sirve para inicializar la parte
// heredada del objeto.
//
// Si se escribe explícitamente, super(...) debe ser la primera
// instrucción del constructor.
//
// Si no se llama explícitamente a un constructor del padre,
// Java intenta insertar super() automáticamente, siempre que
// exista un constructor padre sin parámetros accesible.
//
// ============================================================

// Ejemplo

class Animal {

    String nombre;

    Animal(String nombre) {
        this.nombre = nombre;
    }

    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {

    Perro(String nombre) {
        // Llama al constructor de Animal
        super(nombre);
    }

    @Override
    void hacerSonido() {
        // Llama al método de la clase padre
        super.hacerSonido();

        System.out.println(nombre + " ladra: ¡Guau!");
    }
}

public class Super {

    public static void main(String[] args) {

        Perro perro = new Perro("Bobby");

        perro.hacerSonido();
    }
}

/*
 * Salida:
 * 
 * El animal hace un sonido
 * Bobby ladra: ¡Guau!
 */