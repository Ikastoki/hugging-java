package com.unai.core.conceptos;

/*
================================================================================
                    JAVA CORE — MODIFICADORES DE ACCESO
================================================================================

1. ¿QUÉ SON LOS MODIFICADORES DE ACCESO?

Los modificadores de acceso determinan desde dónde podemos acceder a una
clase, atributo, método o constructor.

Los cuatro niveles principales de acceso en Java son:

    public
    protected
    private
    default (sin modificador)


La idea fundamental es controlar la VISIBILIDAD de los elementos.


================================================================================
2. LOS CUATRO NIVELES

    public
        -> Accesible desde cualquier lugar.

    protected
        -> Accesible desde la misma clase, el mismo paquete y también
           desde subclases bajo determinadas condiciones.

    default
        -> Accesible únicamente desde el mismo paquete.

    private
        -> Accesible únicamente desde la propia clase.


Podemos representarlo de forma simplificada:

    public
        ↓
    protected
        ↓
    default
        ↓
    private

Cuanto más restrictivo es el modificador, menor es su visibilidad.


================================================================================
3. public

public significa que el elemento es accesible desde cualquier lugar
donde sea accesible la clase que lo contiene.

Ejemplo:

    public class Persona {

        public String nombre;

        public void saludar() {
            System.out.println("Hola");
        }
    }


Desde otra clase podemos hacer:

    Persona persona = new Persona();

    persona.nombre = "Ana";
    persona.saludar();


================================================================================
4. private

private es el modificador más restrictivo.

Un elemento private solo puede ser accedido directamente desde la
misma clase donde está declarado.

Ejemplo:

    public class Persona {

        private String nombre;

        public void mostrarNombre() {
            System.out.println(nombre);
        }
    }


Desde otra clase NO podemos hacer:

    persona.nombre = "Ana";


porque nombre es private.


================================================================================
5. protected

protected permite acceder al elemento:

    - Desde la misma clase.
    - Desde clases del mismo paquete.
    - Desde subclases, incluso si están en otro paquete, respetando
      las reglas específicas de acceso de protected.


Ejemplo:

    public class Persona {

        protected String nombre;
    }


Una clase hija puede acceder al miembro protegido mediante las reglas
de herencia.


================================================================================
6. DEFAULT

Cuando no escribimos ningún modificador de acceso, tenemos acceso
de tipo package-private, también llamado acceso por defecto.

Ejemplo:

    class Persona {

        String nombre;

        void saludar() {
            System.out.println("Hola");
        }
    }


Aquí no hemos escrito:

    public
    protected
    private

Por tanto, el acceso es default.

Estos elementos pueden utilizarse desde clases que estén en el mismo paquete.


================================================================================
7. TABLA DE ACCESO

                    Misma    Mismo    Subclase    Otro
                    clase    paquete  otro pkg    paquete

    public             SI       SI        SI          SI

    protected          SI       SI        SI*         NO

    default            SI       SI        NO          NO

    private            SI       NO        NO          NO


    * protected desde otro paquete tiene reglas específicas:
      la subclase puede acceder al miembro heredado mediante la relación
      de herencia, no como un miembro cualquiera de una instancia externa.


================================================================================
8. EJEMPLO CON private

Una buena práctica habitual es mantener los atributos como private.

Ejemplo:

    public class Cuenta {

        private double saldo;

        public void ingresar(double cantidad) {
            saldo += cantidad;
        }

        public double getSaldo() {
            return saldo;
        }
    }


El atributo:

    saldo

no puede modificarse directamente desde fuera de la clase.

En su lugar utilizamos métodos públicos que controlan el acceso.


================================================================================
9. ¿POR QUÉ UTILIZAR private?

private ayuda a proteger el estado interno de un objeto.

Sin private:

    cuenta.saldo = -5000;


Podríamos modificar directamente el estado.

Con private:

    private double saldo;


la propia clase controla cómo se modifica.


Esto está relacionado con un concepto que veremos más adelante:

    ENCAPSULACIÓN


================================================================================
10. public EN CLASES

Una clase de nivel superior puede ser:

    public

o tener acceso:

    default


Ejemplo public:

    public class Persona {
    }


Ejemplo default:

    class Persona {
    }


Una clase public puede ser utilizada desde otros paquetes si es accesible
y está disponible en el classpath.


================================================================================
11. private EN CLASES

Una clase de nivel superior NO puede declararse:

    private class Persona {
    }


Tampoco:

    protected class Persona {
    }


Los modificadores private y protected no se pueden utilizar para clases
de nivel superior.

Más adelante veremos que las clases anidadas tienen reglas diferentes.


================================================================================
12. MÉTODOS Y ATRIBUTOS

Los atributos y métodos pueden utilizar los cuatro niveles:

    public
    protected
    private
    default


Ejemplo:

    public class Persona {

        public String nombre;

        protected int edad;

        String ciudad;

        private String dni;
    }


Aquí tenemos los cuatro niveles.


================================================================================
13. CONSTRUCTORES

Los constructores también pueden tener modificadores de acceso.

Ejemplo:

    public Persona() {
    }


O:

    private Persona() {
    }


Un constructor private puede impedir que otras clases creen directamente
instancias de la clase.

Ejemplo:

    public class Configuracion {

        private Configuracion() {
        }
    }


Desde fuera no podríamos hacer:

    new Configuracion();


porque el constructor es private.

*/

public class ModificadoresDeAcceso {

}
