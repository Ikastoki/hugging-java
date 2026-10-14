package com.unai.core.genericos;

// INTERFACES GENÉRICAS

// Son interfaces que declaran uno o varios parámetros de tipo.
// Permiten definir contratos que funcionan con distintos tipos de datos.
// El parámetro de tipo se declara entre <> después del nombre
// de la interfaz.
// Las clases que implementan la interfaz deben especificar el tipo
// concreto o declarar sus propios parámetros genéricos.
// Los parámetros de tipo pueden utilizarse en los métodos
// para definir sus argumentos y valores de retorno.
// Una interfaz puede declarar varios parámetros genéricos separados por comas.

// Ejemplo

public class InterfacesGenericas {

    interface Almacen<T> {
        void guardar(T elemento);

        T obtener();
    }

    static class AlmacenTexto implements Almacen<String> {
        private String elemento;

        @Override
        public void guardar(String elemento) {
            this.elemento = elemento;
        }

        @Override
        public String obtener() {
            return elemento;
        }
    }

    public static void main(String[] args) {
        Almacen<String> almacen = new AlmacenTexto();

        almacen.guardar("Hola Java");
        String texto = almacen.obtener();

        System.out.println(texto);
    }
}
