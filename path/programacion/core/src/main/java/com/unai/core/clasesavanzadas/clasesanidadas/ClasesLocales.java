package com.unai.core.clasesavanzadas.clasesanidadas;

// Clases locales

// Se declaran dentro de un método o bloque.
// Solo son accesibles desde el bloque donde se declaran.
// No pueden declararse como public, protected, private ni static.
// Pueden acceder a los miembros de la clase externa.
// Pueden utilizar variables locales del método si son final
// y efectivamente finales (no se modifican después de inicializarlas).

// Ejemplo
public class ClasesLocales {

    private String mensaje = "Hola";

    public void ejecutar() {

        // Variable local
        String nombre = "Ana";

        // Clase local
        class Saludo {

            void mostrar() {
                // Puede acceder a miembros de la clase externa.
                System.out.println(mensaje);

                // Puede acceder a la variable local porque
                // no se modifica después de inicializarse.
                System.out.println("Bienvenida, " + nombre);
            }
        }

        // Crear y utilizar la clase local dentro del método.
        Saludo saludo = new Saludo();
        saludo.mostrar();
    }

    public static void main(String[] args) {

        ClasesLocales programa = new ClasesLocales();
        programa.ejecutar();

        // Saludo no puede utilizarse aquí,
        // porque solo existe dentro de ejecutar().
    }
}

// Salida:
// Hola
// Bienvenida, Ana
