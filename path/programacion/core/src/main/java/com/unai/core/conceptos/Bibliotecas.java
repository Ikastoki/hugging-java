package com.unai.core.conceptos;

/*
================================================================================
                       JAVA CORE — BIBLIOTECAS DE JAVA
================================================================================

1. ¿QUÉ ES UNA BIBLIOTECA?

Una biblioteca (library) es un conjunto de código ya creado que podemos
utilizar desde nuestros programas para no tener que implementar todo
desde cero.

Una biblioteca puede proporcionar:

    - Clases
    - Interfaces
    - Métodos
    - Utilidades
    - Tipos de datos
    - Funcionalidades específicas


Por ejemplo, si queremos trabajar con fechas, colecciones o archivos,
Java ya proporciona muchas clases preparadas para ello.


================================================================================
2. BIBLIOTECA ESTÁNDAR DE JAVA

Java incluye una gran cantidad de APIs estándar.

Estas APIs forman parte de la plataforma Java y proporcionan
funcionalidades generales.

Algunos ejemplos:

    java.lang
    java.util
    java.io
    java.nio
    java.time
    java.math
    java.net


Estas bibliotecas nos permiten resolver problemas habituales sin
tener que implementar toda la funcionalidad desde cero.


================================================================================
3. API

API significa:

    Application Programming Interface

Una API define las clases, métodos, interfaces y reglas que podemos
utilizar para comunicarnos con una funcionalidad determinada.

Por ejemplo:

    java.lang.String

proporciona la clase String.

Podemos utilizar sus métodos:

    length()
    toUpperCase()
    toLowerCase()
    substring()
    etc.


================================================================================
4. java.lang

java.lang contiene clases fundamentales de Java.

Algunas de las más conocidas son:

    String
    Object
    System
    Math
    Integer
    Double
    Boolean
    Exception
    Thread


Una característica importante es que java.lang se importa
automáticamente.

Por eso podemos escribir:

    String nombre = "Ana";


sin hacer:

    import java.lang.String;


================================================================================
5. java.util

java.util contiene muchas utilidades generales.

Por ejemplo:

    ArrayList
    HashMap
    HashSet
    Scanner
    Arrays
    Collections
    Optional


Ejemplo:

    import java.util.ArrayList;

    ArrayList<String> nombres = new ArrayList<>();


Aquí estamos utilizando una clase de la biblioteca estándar.


================================================================================
6. java.io

java.io proporciona clases relacionadas con entrada y salida de datos.

Por ejemplo:

    File
    FileReader
    FileWriter
    BufferedReader
    InputStream
    OutputStream


Se utiliza, entre otras cosas, para trabajar con archivos y flujos
de entrada/salida.


================================================================================
7. java.nio

java.nio proporciona APIs modernas para trabajar con entrada/salida,
archivos y otros recursos.

Por ejemplo:

    Path
    Paths
    Files


Ejemplo:

    import java.nio.file.Path;
    import java.nio.file.Files;


Estas clases se utilizan mucho para trabajar con archivos.


================================================================================
8. java.time

java.time proporciona las APIs modernas para trabajar con fechas
y horas.

Algunas clases importantes:

    LocalDate
    LocalTime
    LocalDateTime
    Instant
    Duration
    Period


Ejemplo:

    import java.time.LocalDate;

    LocalDate fecha = LocalDate.now();


================================================================================
9. java.math

java.math proporciona clases para trabajar con cálculos numéricos
de precisión arbitraria.

Por ejemplo:

    BigInteger
    BigDecimal


Son especialmente útiles cuando necesitamos una precisión que no
queremos obtener mediante los tipos primitivos habituales.


================================================================================
10. java.net

java.net proporciona clases relacionadas con comunicaciones de red.

Por ejemplo:

    URI
    URL
    Socket


Permite trabajar con determinados conceptos relacionados con redes
y comunicaciones.


================================================================================
11. ¿CÓMO UTILIZAMOS UNA BIBLIOTECA?

Normalmente utilizamos:

    import


Por ejemplo:

    import java.util.ArrayList;


Después podemos utilizar:

    ArrayList<String> nombres = new ArrayList<>();


El import permite utilizar el nombre de la clase sin tener que escribir
su nombre completamente cualificado cada vez.


================================================================================
12. NOMBRE COMPLETAMENTE CUALIFICADO

Podemos utilizar una clase sin importarla escribiendo su nombre completo.

Por ejemplo:

    java.util.ArrayList<String> nombres = new java.util.ArrayList<>();


Aquí:

    java.util.ArrayList

es el nombre completamente cualificado de la clase.


Con import podemos escribir simplemente:

    ArrayList<String> nombres = new ArrayList<>();


================================================================================
13. import NO COPIA LA BIBLIOTECA

Es importante entender que:

    import java.util.ArrayList;


NO significa que estemos copiando el código de ArrayList dentro
de nuestro programa.

El import permite referirnos a la clase utilizando su nombre simple.

La clase pertenece a la biblioteca correspondiente y Java la utiliza
cuando es necesaria.


================================================================================
14. BIBLIOTECAS INTERNAS VS BIBLIOTECAS EXTERNAS

Podemos distinguir dos grandes grupos.

BIBLIOTECA ESTÁNDAR:

    Forma parte de la plataforma Java.

Ejemplos:

    java.lang
    java.util
    java.time
    java.io


BIBLIOTECA EXTERNA:

    Es desarrollada y distribuida fuera de la biblioteca estándar
    de Java.

Ejemplos conocidos dentro del ecosistema Java son:

    Spring
    Hibernate
    Apache Commons


Estas bibliotecas externas normalmente se incorporan al proyecto
mediante herramientas de gestión de dependencias(Maven/Gradle).


================================================================================
15. EJEMPLO CON java.util

    import java.util.ArrayList;

    public class Main {

        public static void main(String[] args) {

            ArrayList<String> nombres = new ArrayList<>();

            nombres.add("Ana");
            nombres.add("Luis");
            nombres.add("Marta");

            System.out.println(nombres);
        }
    }


Estamos utilizando:

    ArrayList

que pertenece a:

    java.util


================================================================================
16. EJEMPLO CON java.time

    import java.time.LocalDate;

    public class Main {

        public static void main(String[] args) {

            LocalDate hoy = LocalDate.now();

            System.out.println("Hoy es: " + hoy);
        }
    }


Aquí utilizamos:

    LocalDate

de:

    java.time


================================================================================
17. ¿POR QUÉ SON IMPORTANTES LAS BIBLIOTECAS?

Las bibliotecas nos permiten:

    - Reutilizar código.
    - Ahorrar tiempo.
    - Evitar implementar funcionalidades comunes.
    - Utilizar código probado y mantenido.
    - Crear aplicaciones más rápidamente.
    - Organizar funcionalidades en APIs.


Por ejemplo, sería innecesario implementar desde cero una estructura
de datos como una lista cuando Java ya proporciona:

    ArrayList


================================================================================
18. BIBLIOTECA, PAQUETE Y CLASE

No debemos confundir estos conceptos.

PAQUETE:

    Agrupa clases relacionadas.

Ejemplo:

    java.util


CLASE:

    Es un tipo concreto.

Ejemplo:

    ArrayList


BIBLIOTECA:

    Conjunto de código y APIs que podemos utilizar.

Por ejemplo, la biblioteca estándar contiene numerosos paquetes y clases.


Una representación simplificada sería:

    Biblioteca Java
        |
        +-- java.util
        |      |
        |      +-- ArrayList
        |      +-- HashMap
        |      +-- Scanner
        |
        +-- java.time
        |      |
        |      +-- LocalDate
        |      +-- LocalTime
        |
        +-- java.io
               |
               +-- File
               +-- FileReader
*/

public class Bibliotecas {

}
