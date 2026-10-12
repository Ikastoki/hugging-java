package com.unai.core.clasesavanzadas.enumeraciones;

// Enumeraciones con métodos

// Un enum puede declarar métodos.
// Los métodos pueden utilizar los atributos de cada constante.
// Cada constante puede tener un comportamiento diferente
// si sobrescribe un método del enum.
// Los métodos pueden ser de instancia o static.

// Ejemplo
public class EnumConMetodos {

    enum Operacion {

        SUMA {
            @Override
            public int calcular(int a, int b) {
                return a + b;
            }
        },

        RESTA {
            @Override
            public int calcular(int a, int b) {
                return a - b;
            }
        },

        MULTIPLICACION {
            @Override
            public int calcular(int a, int b) {
                return a * b;
            }
        };

        // Método abstracto que cada constante implementa.
        public abstract int calcular(int a, int b);
    }

    public static void main(String[] args) {

        // Elegir una operación.
        Operacion operacion = Operacion.SUMA;

        // Ejecutar el método correspondiente.
        System.out.println(operacion.calcular(10, 5));

        operacion = Operacion.RESTA;
        System.out.println(operacion.calcular(10, 5));

        operacion = Operacion.MULTIPLICACION;
        System.out.println(operacion.calcular(10, 5));
    }
}

// Salida:
// 15
// 5
// 50