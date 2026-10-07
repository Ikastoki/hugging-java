package com.unai.core.conceptos;

/*
##
# JDK, JRE y JVM
#
# Son tres conceptos relacionados, pero NO significan lo mismo.
#
#
# JVM — Java Virtual Machine
# --------------------------
# La JVM es la máquina virtual encargada de ejecutar el bytecode de Java.
#
# El código fuente Java (.java) se compila a bytecode (.class).
# La JVM interpreta y/o compila ese bytecode para ejecutarlo en la máquina.
#
# Gracias a la JVM, el mismo bytecode puede ejecutarse en diferentes
# sistemas operativos que dispongan de una JVM compatible.
#
#
# JRE — Java Runtime Environment
# ------------------------------
# El JRE proporciona el entorno necesario para EJECUTAR aplicaciones Java.
#
# Conceptualmente está formado por:
#
#     JRE = JVM + bibliotecas necesarias para ejecutar Java
#
# El JRE está orientado a ejecutar aplicaciones, no a desarrollarlas.
#
# IMPORTANTE:
# En las versiones modernas de Java, Oracle ya no distribuye un JRE
# independiente como ocurría tradicionalmente.
# Actualmente, para desarrollar normalmente se instala un JDK.
#
#
# JDK — Java Development Kit
# --------------------------
# El JDK proporciona las herramientas necesarias para DESARROLLAR
# aplicaciones Java.
#
# Incluye la JVM y las herramientas necesarias para compilar,
# ejecutar y desarrollar aplicaciones.
#
# Algunas herramientas importantes son:
#
#     javac  -> compila código Java a bytecode
#     java   -> ejecuta una aplicación Java
#     javadoc -> genera documentación a partir de Javadoc
#     jar    -> trabaja con archivos JAR
#
#
# RELACIÓN ENTRE LOS CONCEPTOS
#
# Conceptualmente podemos visualizarlo así:
#
#     JDK
#     ├── Herramientas de desarrollo
#     │   ├── javac
#     │   ├── javadoc
#     │   ├── jar
#     │   └── ...
#     │
#     └── Entorno de ejecución
#         ├── JVM
#         └── Bibliotecas Java
#
#
# RESUMEN
#
# JVM -> Ejecuta bytecode.
#
# JRE -> Entorno necesario para ejecutar aplicaciones Java.
#
# JDK -> Kit completo para desarrollar aplicaciones Java.
#
#
# Una forma sencilla de recordarlo:
#
#     JVM = Ejecutar
#     JRE = Ejecutar + entorno
#     JDK = Desarrollar + ejecutar
###
*/

public class Herramientas {

}
