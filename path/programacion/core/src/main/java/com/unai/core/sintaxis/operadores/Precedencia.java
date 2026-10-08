package com.unai.core.sintaxis.operadores;

/*
 * PRECEDENCIA DE OPERADORES
 *
 * La precedencia indica qué operadores se evalúan primero
 * cuando aparecen varios en una misma expresión.
 *
 * De forma simplificada, podemos recordar este orden:
 *
 * 1. ()        Paréntesis
 * 2. ++ -- !   Operadores unarios
 * 3. * / %     Multiplicación, división y módulo
 * 4. + -       Suma y resta
 * 5. < > <= >= Comparaciones
 * 6. == !=     Igualdad
 * 7. &&        AND lógico
 * 8. ||        OR lógico
 * 9. ?:        Ternario
 * 10. =        Asignación
 *
 * Si dos operadores tienen la misma precedencia,
 * normalmente se evalúan de izquierda a derecha.
 *
 * Los paréntesis tienen prioridad y permiten indicar
 * explícitamente qué queremos calcular primero.
 */

public class Precedencia {

    public static void main(String[] args) {

        // Multiplicación antes que suma
        int resultado1 = 2 + 3 * 4;

        System.out.println(resultado1); // 14

        // Los paréntesis cambian el orden
        int resultado2 = (2 + 3) * 4;

        System.out.println(resultado2); // 20

        // División antes que suma
        int resultado3 = 10 + 20 / 5;

        System.out.println(resultado3); // 14

        // Paréntesis
        int resultado4 = (10 + 20) / 5;

        System.out.println(resultado4); // 6

        // Comparación después de la operación aritmética
        boolean resultado5 = 10 + 5 > 12;

        System.out.println(resultado5); // true

        // Los operadores lógicos se evalúan después
        // de las comparaciones
        boolean resultado6 = 10 > 5 && 20 > 15;

        System.out.println(resultado6); // true
    }
}