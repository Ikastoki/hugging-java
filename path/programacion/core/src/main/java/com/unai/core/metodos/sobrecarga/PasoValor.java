package com.unai.core.metodos.sobrecarga;

/*
 * PASO POR VALOR
 *
 * Java utiliza siempre paso por valor.
 *
 * Cuando pasamos un argumento a un método, el parámetro
 * recibe una copia del valor.
 *
 * En tipos primitivos, esto es fácil de ver:
 *
 *     int numero = 10;
 *
 *     modificar(numero);
 *
 * El método recibe una copia de 10.
 *
 * Si modificamos el parámetro dentro del método,
 * la variable original no cambia.
 *
 */

public class PasoValor {

    static void modificar(int numero) {

        numero = 100;

        System.out.println("Dentro del método: " + numero);
    }

    public static void main(String[] args) {

        int numero = 10;

        modificar(numero);

        System.out.println("Fuera del método: " + numero);
    }
}

/*
 * Resultado:
 *
 * Dentro del método: 100
 * Fuera del método: 10
 *
 *
 * ¿Por qué?
 *
 * Antes de llamar:
 *
 * numero = 10
 *
 * Al invocar:
 *
 * modificar(numero);
 *
 * Java copia el valor:
 *
 * variable original → 10
 * ↓
 * copia del valor
 * ↓
 * parámetro numero
 *
 * Dentro del método:
 *
 * numero = 100;
 *
 * Solo cambia la copia.
 *
 * La variable original sigue teniendo:
 *
 * numero = 10
 *
 *
 * IMPORTANTE CON OBJETOS
 *
 * Java también utiliza paso por valor cuando trabajamos
 * con objetos.
 *
 * En este caso, lo que se copia es el valor de la referencia
 * al objeto.
 *
 * Por eso debemos distinguir:
 *
 * - Java NO pasa objetos por referencia.
 * - Java pasa por valor la referencia al objeto.
 *
 * Esto significa que un método puede modificar el estado
 * del objeto utilizando la referencia recibida.
 *
 */

class Persona {

    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }
}

class Ejemplo {

    static void cambiarNombre(Persona persona) {

        persona.nombre = "Luis";
    }

    static void cambiarReferencia(Persona persona) {

        persona = new Persona("Marta");
    }
}