package com.unai.core.conceptos;

/*
================================================================================
DOCUMENTACIÓN DE LA API DE JAVA
================================================================================

1. ¿QUÉ ES LA API DE JAVA?
--------------------------------------------------------------------------------
API significa "Application Programming Interface".

La API de Java es el conjunto de clases, interfaces, métodos, campos y
enumeraciones que Java proporciona para que podamos reutilizar funcionalidades
sin tener que implementarlas desde cero.

Ejemplos:

    String
    ArrayList
    LocalDate
    Math
    Scanner

Estas clases forman parte de las bibliotecas estándar de Java.

La documentación de la API explica cómo utilizar esas clases y qué hace cada
uno de sus métodos.

--------------------------------------------------------------------------------
2. ¿DÓNDE ESTÁ LA DOCUMENTACIÓN?
--------------------------------------------------------------------------------

Java dispone de documentación oficial generada para su API.

En ella podemos consultar:

    - Clases
    - Interfaces
    - Enumeraciones
    - Métodos
    - Constructores
    - Campos
    - Parámetros
    - Valores de retorno
    - Excepciones
    - Métodos heredados
    - Relaciones entre clases

La documentación oficial es especialmente importante porque nos permite
aprender a utilizar una clase sin necesidad de conocer su implementación
interna.

--------------------------------------------------------------------------------
3. ¿CÓMO LEER LA DOCUMENTACIÓN DE UNA CLASE?
--------------------------------------------------------------------------------

Cuando abrimos la documentación de una clase, normalmente encontramos
información como:

    - Nombre de la clase
    - Paquete al que pertenece
    - Descripción
    - Constructores
    - Métodos
    - Campos
    - Interfaces implementadas
    - Clase padre
    - Métodos heredados

Ejemplo:

    java.lang.String

Podemos saber que String:

    - Es una clase.
    - Pertenece al paquete java.lang.
    - Representa una secuencia de caracteres.
    - Tiene muchos métodos para trabajar con texto.

--------------------------------------------------------------------------------
4. PAQUETE
--------------------------------------------------------------------------------

La documentación indica el paquete de una clase.

Ejemplo:

    java.util.ArrayList

Aquí:

    java.util
        -> paquete

    ArrayList
        -> clase

El paquete nos ayuda a localizar la clase y a saber a qué parte de la API
pertenece.

--------------------------------------------------------------------------------
5. CONSTRUCTORES
--------------------------------------------------------------------------------

La documentación muestra los constructores disponibles.

Por ejemplo, ArrayList tiene constructores que permiten crear una lista.

Conceptualmente:

    ArrayList()
    ArrayList(int initialCapacity)
    ArrayList(Collection<? extends E> c)

Al consultar la documentación podemos saber:

    - Qué constructor existe.
    - Qué parámetros necesita.
    - Qué comportamiento tiene.

--------------------------------------------------------------------------------
6. MÉTODOS
--------------------------------------------------------------------------------

La documentación de una clase muestra sus métodos.

Por ejemplo, String tiene métodos como:

    length()
    charAt(...)
    substring(...)
    toUpperCase()
    toLowerCase()
    contains(...)
    equals(...)

Al consultar un método debemos fijarnos especialmente en:

    - Nombre
    - Parámetros
    - Tipo de retorno
    - Descripción
    - Excepciones que puede lanzar
    - Si es estático o de instancia

--------------------------------------------------------------------------------
7. FIRMA DE UN MÉTODO
--------------------------------------------------------------------------------

La documentación muestra la declaración del método.

Ejemplo conceptual:

    public int length()

Podemos interpretarlo como:

    public
        -> modificador de acceso

    int
        -> tipo de retorno

    length
        -> nombre del método

    ()
        -> no recibe parámetros

Otro ejemplo:

    public char charAt(int index)

Aquí:

    char
        -> devuelve un carácter

    charAt
        -> nombre del método

    int index
        -> recibe un parámetro de tipo int

--------------------------------------------------------------------------------
8. PARÁMETROS
--------------------------------------------------------------------------------

La documentación indica qué parámetros recibe un método.

Ejemplo:

    String.substring(int beginIndex)

Significa que el método necesita un entero que indica desde dónde comenzar.

Ejemplo:

    String texto = "Java";

    String resultado = texto.substring(1);

Resultado:

    "ava"

La documentación nos permite saber qué significa ese parámetro y qué valores
son válidos.

--------------------------------------------------------------------------------
9. VALOR DE RETORNO
--------------------------------------------------------------------------------

También debemos consultar qué devuelve un método.

Ejemplo:

    String.length()

Devuelve:

    int

Por eso podemos hacer:

    String texto = "Java";

    int longitud = texto.length();

Si un método devuelve void:

    public void imprimir()

significa que no devuelve ningún valor.

--------------------------------------------------------------------------------
10. MÉTODOS ESTÁTICOS Y DE INSTANCIA
--------------------------------------------------------------------------------

La documentación permite distinguir entre métodos estáticos y métodos de
instancia.

Método estático:

    Math.max(10, 20)

No necesitamos crear un objeto Math.

Método de instancia:

    String texto = "Java";
    texto.length();

Necesitamos una instancia de String.

La documentación indica esta diferencia mediante la declaración del método.

--------------------------------------------------------------------------------
11. MÉTODOS HEREDADOS
--------------------------------------------------------------------------------

Una clase puede heredar métodos de otra clase.

Por ejemplo:

    ArrayList
        ↓
    AbstractList
        ↓
    AbstractCollection
        ↓
    Object

Por eso ArrayList también dispone de métodos heredados.

Todas las clases de Java heredan directa o indirectamente de Object.

Al consultar la documentación podemos encontrar:

    - Métodos propios de la clase.
    - Métodos heredados.
    - Métodos sobrescritos.

Esto es muy útil para saber qué podemos hacer realmente con un objeto.

--------------------------------------------------------------------------------
12. EXCEPCIONES
--------------------------------------------------------------------------------

La documentación también puede indicar qué excepciones puede lanzar un método.

Ejemplo conceptual:

    método(...)
        throws IOException

Esto significa que el método puede producir una IOException.

La documentación nos permite saber:

    - Qué excepción puede aparecer.
    - En qué circunstancias.
    - Qué debemos tener en cuenta al utilizar el método.

--------------------------------------------------------------------------------
13. EJEMPLO CON STRING
--------------------------------------------------------------------------------

Supongamos que queremos saber cómo comprobar si un texto contiene otra
cadena.

Podemos consultar la documentación de String y buscar:

    contains(CharSequence s)

La documentación nos indica que devuelve un boolean.

Por tanto:

    String texto = "Hola Java";

    boolean contieneJava = texto.contains("Java");

    System.out.println(contieneJava);

Resultado:

    true

No necesitamos conocer cómo está implementado internamente contains().

Solo necesitamos conocer su contrato.

--------------------------------------------------------------------------------
14. EJEMPLO CON ARRAYLIST
--------------------------------------------------------------------------------

Podemos consultar la documentación de ArrayList para saber cómo añadir
elementos.

Método:

    add(E e)

Ejemplo:

    import java.util.ArrayList;

    public class Main {

        public static void main(String[] args) {

            ArrayList<String> nombres = new ArrayList<>();

            nombres.add("Ana");
            nombres.add("Luis");

            System.out.println(nombres);
        }
    }

La documentación nos permite saber que add() añade un elemento a la lista.

--------------------------------------------------------------------------------
15. EJEMPLO CON LOCALDATE
--------------------------------------------------------------------------------

Podemos consultar la documentación de LocalDate para descubrir qué métodos
están disponibles para trabajar con fechas.

Ejemplo:

    import java.time.LocalDate;

    public class Main {

        public static void main(String[] args) {

            LocalDate fecha = LocalDate.now();

            System.out.println(fecha);
            System.out.println(fecha.getYear());
            System.out.println(fecha.getMonth());
            System.out.println(fecha.getDayOfMonth());
        }
    }

En lugar de memorizar todos los métodos de LocalDate, podemos consultar su
documentación cuando necesitemos realizar una operación concreta.

--------------------------------------------------------------------------------
16. LA DOCUMENTACIÓN COMO HERRAMIENTA DE TRABAJO
--------------------------------------------------------------------------------

No es necesario memorizar toda la API de Java.

Un buen desarrollador sabe:

    1. Qué necesita hacer.
    2. Qué clase podría proporcionar esa funcionalidad.
    3. Cómo encontrar esa clase.
    4. Cómo leer su documentación.
    5. Cómo encontrar el método adecuado.
    6. Cómo interpretar sus parámetros y retorno.
    7. Cómo utilizarlo correctamente.

Ejemplo:

    "Necesito ordenar una colección."

En lugar de intentar recordar todas las clases y métodos disponibles,
consultamos la API y buscamos las herramientas relacionadas con Collections,
List, Arrays, etc.

--------------------------------------------------------------------------------
17. DOCUMENTACIÓN VS IMPLEMENTACIÓN
--------------------------------------------------------------------------------

La documentación normalmente nos interesa para conocer el CONTRATO de una
clase o método.

No necesitamos saber cómo está implementado internamente.

Por ejemplo:

    String texto = "Java";

    int longitud = texto.length();

Nos interesa saber:

    - Que length() existe.
    - Que no necesita parámetros.
    - Que devuelve int.
    - Qué representa ese int.

No necesitamos conocer el código interno utilizado por Java para calcular
la longitud.

Esto permite utilizar las bibliotecas mediante sus APIs.

--------------------------------------------------------------------------------
18. DOCUMENTACIÓN Y IDE
--------------------------------------------------------------------------------

Los IDE modernos utilizan la información de la API para ayudarnos mientras
programamos.

Por ejemplo, al escribir:

    texto.

el IDE puede mostrar métodos disponibles:

    length()
    substring(...)
    contains(...)
    toUpperCase()
    toLowerCase()
    ...

También puede mostrar:

    - Tipo de retorno.
    - Parámetros.
    - Descripción.
    - Documentación del método.

Esto se conoce habitualmente como documentación contextual o ayuda del IDE.

--------------------------------------------------------------------------------
19. EJEMPLO PRÁCTICO DE LECTURA DE API
--------------------------------------------------------------------------------

Supongamos que queremos convertir un String a minúsculas.

Podemos buscar en la documentación de String un método relacionado con
convertir el texto a minúsculas.

Encontramos:

    toLowerCase()

Después comprobamos:

    - ¿Recibe parámetros?
        No.

    - ¿Qué devuelve?
        String.

Entonces podemos utilizar:

    String texto = "HOLA JAVA";

    String resultado = texto.toLowerCase();

    System.out.println(resultado);

Resultado:

    hola java

--------------------------------------------------------------------------------
20. QUÉ DEBEMOS BUSCAR EN LA DOCUMENTACIÓN
--------------------------------------------------------------------------------

Cuando consultemos una clase o método, debemos fijarnos principalmente en:

    CLASE
        ¿Qué representa?
        ¿Para qué sirve?

    CONSTRUCTOR
        ¿Cómo se crea?
        ¿Qué parámetros necesita?

    MÉTODO
        ¿Qué hace?

    PARÁMETROS
        ¿Qué necesita recibir?

    RETORNO
        ¿Qué devuelve?

    EXCEPCIONES
        ¿Qué puede lanzar?

    HERENCIA
        ¿Qué métodos hereda?

    ESTÁTICO / INSTANCIA
        ¿Cómo se debe invocar?

--------------------------------------------------------------------------------
21. IDEA CLAVE
--------------------------------------------------------------------------------

La API de Java es como un manual de referencia de las bibliotecas de Java.

No debemos intentar memorizar toda la API.

Debemos aprender a LEERLA.

Flujo habitual:

    NECESITO UNA FUNCIONALIDAD
            ↓
    BUSCO UNA CLASE DE LA API
            ↓
    CONSULTO SUS MÉTODOS
            ↓
    LEO PARÁMETROS Y RETORNO
            ↓
    COMPRUEBO LAS EXCEPCIONES
            ↓
    UTILIZO EL MÉTODO

La documentación de la API es una de las herramientas que más utilizarás
durante el desarrollo real con Java.
*/

public class Documentacion {

}
