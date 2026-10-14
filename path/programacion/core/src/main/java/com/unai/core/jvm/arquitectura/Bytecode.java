package com.unai.core.jvm.arquitectura;

// BYTECODE

// Es el lenguaje intermedio que produce el compilador de Java y
// que ejecuta la JVM. Se guarda en ficheros .class.
//
// Un fichero .class contiene, en este orden simplificado:
//
// - Un número mágico que lo identifica (CAFEBABE).
// - La versión del bytecode.
// - El constant pool: nombres de clases, métodos, campos y
//   literales.
// - Los flags de acceso de la clase.
// - La clase actual, su superclase e interfaces.
// - Campos, métodos y atributos, con su código.
//
// Las instrucciones son mnemotécnicas y operan sobre una pila:
// iconst_1 coloca un entero, iadd suma los dos superiores,
// invokevirtual invoca un método de instancia, y así sucesivamente.
//
// El bytecode es independiente de la plataforma: el mismo .class
// funciona en cualquier JVM compatible.
//
// Se puede inspeccionar con la herramienta javap del JDK:
//
//     javap -c NombreDeLaClase
//
// que muestra las instrucciones de cada método.

// Ejemplo

public class Bytecode {

    static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int resultado = sumar(2, 3);

        System.out.println("Resultado: " + resultado);
    }
}

// Salida:
// Resultado: 5

// Bytecode de sumar(int, int), con javap -c:
//
//   static int sumar(int, int);
//     Code:
//        0: iload_0
//        1: iload_1
//        2: iadd
//        3: ireturn
//
// Significado:
//
//   iload_0  -> apila el parámetro a (local 0).
//   iload_1  -> apila el parámetro b (local 1).
//   iadd     -> suma los dos valores de la pila.
//   ireturn  -> devuelve el entero resultante.
