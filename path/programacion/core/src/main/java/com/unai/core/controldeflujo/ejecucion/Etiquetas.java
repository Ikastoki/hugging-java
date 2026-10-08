package com.unai.core.controldeflujo.ejecucion;

/*
 * ETIQUETAS
 *
 * Una etiqueta permite poner un nombre a una instrucción.
 *
 * La sintaxis es:
 *
 *     nombreEtiqueta:
 *         instrucción
 *
 * Se utilizan especialmente con bucles anidados.
 *
 * Con break:
 *
 *     break nombreEtiqueta;
 *
 * termina el bucle que tiene esa etiqueta.
 *
 * Con continue:
 *
 *     continue nombreEtiqueta;
 *
 * salta a la siguiente iteración del bucle que tiene
 * esa etiqueta.
 *
 * Sin etiquetas, break y continue afectan al bucle
 * más cercano en el que se encuentran.
 *
 */

public class Etiquetas {

    public static void main(String[] args) {

        // break sin etiqueta:
        // termina únicamente el bucle interior

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (j == 2) {
                    break;
                }

                System.out.println(
                        "i = " + i + ", j = " + j);
            }
        }

        // break con etiqueta:
        // termina directamente el bucle exterior

        exterior: for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (i == 2 && j == 2) {
                    break exterior;
                }

                System.out.println(
                        "i = " + i + ", j = " + j);
            }
        }

        // continue con etiqueta:
        // pasa a la siguiente iteración del bucle exterior

        exterior2: for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (j == 2) {
                    continue exterior2;
                }

                System.out.println(
                        "i = " + i + ", j = " + j);
            }
        }
    }
}