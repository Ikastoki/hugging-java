package com.unai.core.clasesavanzadas.records;

// Constructores de records

// Constructor canónico
// Recibe un parámetro por cada componente del record.
// Java lo genera automáticamente si no lo declaras.
// Sus parámetros deben corresponder con los componentes.

// Constructor compacto
// Permite validar o normalizar los valores recibidos.
// No se escriben los parámetros ni las asignaciones this.campo = campo.
// Java asigna automáticamente los parámetros a los componentes
// al terminar el constructor.

// Constructor adicional
// Puede tener parámetros diferentes al constructor canónico.
// Debe delegar en otro constructor mediante this(...).

// Ejemplo completo
public class ConstructoresRecord {

    record Persona(String nombre, int edad) {

        // Constructor compacto con validaciones.
        Persona {
            if (nombre == null || nombre.isBlank()) {
                throw new IllegalArgumentException(
                        "El nombre no puede estar vacío");
            }

            if (edad < 0) {
                throw new IllegalArgumentException(
                        "La edad no puede ser negativa");
            }

            // Se puede normalizar el valor antes de asignarlo.
            nombre = nombre.trim();
        }

        // Constructor adicional.
        // Delega en el constructor canónico.
        Persona(String nombre) {
            this(nombre, 0);
        }
    }

    public static void main(String[] args) {

        // Utiliza el constructor canónico.
        Persona persona1 = new Persona(" Ana ", 25);

        // Utiliza el constructor adicional.
        Persona persona2 = new Persona("Luis");

        System.out.println(persona1);
        System.out.println(persona2);

        // Produciría IllegalArgumentException:
        // Persona persona3 = new Persona("", 20);
    }
}

// Salida:
// Persona[nombre=Ana, edad=25]
// Persona[nombre=Luis, edad=0]