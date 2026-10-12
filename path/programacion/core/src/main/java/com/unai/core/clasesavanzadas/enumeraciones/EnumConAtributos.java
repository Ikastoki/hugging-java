package com.unai.core.clasesavanzadas.enumeraciones;

// Enumeraciones con atributos

// Un enum puede tener atributos para almacenar datos
// asociados a cada constante.
// El constructor se ejecuta al inicializar cada constante.
// Los constructores de un enum no pueden ser public ni protected.
// Los atributos suelen declararse private y final
// para evitar que se modifiquen después de la inicialización.

// Ejemplo completo
public class EnumConAtributos {

    enum Nivel {

        // Cada constante proporciona un valor al constructor.
        BAJO(1),
        MEDIO(2),
        ALTO(3);

        // Atributo asociado a cada constante.
        private final int valor;

        // Constructor del enum.
        Nivel(int valor) {
            this.valor = valor;
        }

        // Método para consultar el atributo.
        public int getValor() {
            return valor;
        }
    }

    public static void main(String[] args) {

        // Seleccionar una constante.
        Nivel nivel = Nivel.MEDIO;

        // Consultar la constante y su atributo.
        System.out.println("Nivel: " + nivel);
        System.out.println("Valor: " + nivel.getValor());

        // Recorrer las constantes y mostrar sus valores.
        for (Nivel n : Nivel.values()) {
            System.out.println(n + ": " + n.getValor());
        }
    }
}

// Salida:
// Nivel: MEDIO
// Valor: 2
// BAJO: 1
// MEDIO: 2
// ALTO: 3
