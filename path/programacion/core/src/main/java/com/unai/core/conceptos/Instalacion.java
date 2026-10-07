package com.unai.core.conceptos;

/*
##
# Instalación del JDK
#
# Para desarrollar aplicaciones Java necesitamos instalar un JDK
# (Java Development Kit).
#
# El JDK incluye las herramientas necesarias para compilar y ejecutar
# nuestros programas Java.
#
# En Windows tenemos varias opciones:
#
# 1. Instalar Java directamente en Windows.
# 2. Utilizar WSL (Windows Subsystem for Linux).
#
# Si utilizamos WSL con Debian, podemos trabajar desde un entorno Linux
# manteniendo Windows como sistema operativo principal.
#
#
# ¿Qué es WSL?
# -------------
#
# WSL significa:
#
#     Windows Subsystem for Linux
#
# Permite ejecutar una distribución Linux dentro de Windows.
#
# En nuestro caso:
#
#     Windows
#        ↓
#       WSL
#        ↓
#      Debian
#        ↓
#       JDK
#        ↓
#      Java
#
#
# VENTAJAS DE ESTA CONFIGURACIÓN
# ------------------------------
#
# - Tenemos un entorno Linux realista para desarrollo.
# - Podemos utilizar herramientas habituales de Linux.
# - El entorno se parece mucho al utilizado en muchos servidores.
# - Podemos trabajar con terminal, Git, Maven, Gradle, Docker, etc.
# - Evitamos depender exclusivamente de herramientas específicas de Windows.
#
#
# IMPORTANTE
# ----------
#
# WSL no es Java.
# Debian tampoco es Java.
#
# Son simplemente el sistema/entorno donde vamos a instalar nuestro JDK.
###
*/

public class Instalacion {
    /*
     * # 1. INSTALAR WSL
     * # ----------------
     * #
     * # Abrimos PowerShell como administrador y ejecutamos:
     * #
     * # wsl --install
     * #
     * # Esto instala WSL y, en las configuraciones compatibles, WSL 2.
     * #
     * # Después reiniciamos Windows si se solicita.
     * #
     * #
     * # 2. INSTALAR DEBIAN
     * # ------------------
     * #
     * # Desde PowerShell podemos instalar Debian con:
     * #
     * # wsl --install -d Debian
     * #
     * # Podemos comprobar las distribuciones instaladas con:
     * #
     * # wsl --list --verbose
     * #
     * # Deberíamos ver algo parecido a:
     * #
     * # NAME STATE VERSION
     * # Debian Running 2
     * #
     * # El número 2 indica que estamos utilizando WSL 2.
     * #
     * #
     * # 3. ABRIR DEBIAN
     * # ---------------
     * #
     * # Podemos abrir Debian desde el menú Inicio de Windows o ejecutando:
     * #
     * # wsl -d Debian
     * #
     * # A partir de este momento estamos trabajando dentro de Linux,
     * # concretamente dentro de nuestra distribución Debian.
     * #
     * #
     * # 4. ACTUALIZAR LOS PAQUETES
     * # --------------------------
     * #
     * # Antes de instalar el JDK es recomendable actualizar la información
     * # de los paquetes:
     * #
     * # sudo apt update
     * #
     * # Y podemos actualizar los paquetes que ya tenemos instalados:
     * #
     * # sudo apt upgrade
     * #
     * #
     * # 5. INSTALAR EL JDK
     * # ------------------
     * #
     * # Debian utiliza APT como gestor de paquetes.
     * #
     * # Por ejemplo, para instalar OpenJDK 21:
     * #
     * # sudo apt install openjdk-21-jdk
     * #
     * # Java 21 es una versión LTS.
     * #
     * # OpenJDK es una implementación libre y de código abierto
     * # de la plataforma Java.
     * #
     * #
     * # 6. COMPROBAR LA INSTALACIÓN
     * # ---------------------------
     * #
     * # Comprobamos la versión del entorno de ejecución:
     * #
     * # java --version
     * #
     * # Y comprobamos la versión del compilador:
     * #
     * # javac --version
     * #
     * # Deberíamos obtener algo parecido a:
     * #
     * # openjdk 21.x.x
     * #
     * # y:
     * #
     * # javac 21.x.x
     * #
     * #
     * # 7. DIFERENCIA ENTRE java Y javac
     * # --------------------------------
     * #
     * # javac:
     * # Compila archivos .java y genera bytecode .class.
     * #
     * # java:
     * # Ejecuta una aplicación Java utilizando la JVM.
     * #
     * #
     * # Por tanto:
     * #
     * # Main.java
     * # ↓
     * # javac
     * # ↓
     * # Main.class
     * # ↓
     * # java
     * # ↓
     * # JVM
     * # ↓
     * # Programa
     * #
     * #
     * # 8. CREAR NUESTRO PRIMER PROYECTO
     * # --------------------------------
     * #
     * # Podemos crear una carpeta para nuestros ejercicios:
     * #
     * # mkdir java-repaso
     * #
     * # Entramos en ella:
     * #
     * # cd java-repaso
     * #
     * # Creamos el archivo:
     * #
     * # nano Main.java
     * #
     * # Y escribimos:
     * #
     * # public class Main {
     * #
     * # public static void main(String[] args) {
     * #
     * # System.out.println("Hola Java");
     * # }
     * # }
     * #
     * #
     * # 9. COMPILAR EL PROGRAMA
     * # -----------------------
     * #
     * # Desde la carpeta donde está Main.java ejecutamos:
     * #
     * # javac Main.java
     * #
     * # El compilador genera:
     * #
     * # Main.class
     * #
     * # Por tanto tendremos:
     * #
     * # java-repaso/
     * # ├── Main.java
     * # └── Main.class
     * #
     * #
     * # 10. EJECUTAR EL PROGRAMA
     * # ------------------------
     * #
     * # Para ejecutar la aplicación utilizamos:
     * #
     * # java Main
     * #
     * # Importante:
     * # No escribimos "java Main.class".
     * # Indicamos el nombre de la clase:
     * #
     * # java Main
     * #
     * # El resultado será:
     * #
     * # Hola Java
     * #
     * #
     * # RESUMEN
     * # -------
     * #
     * # Windows
     * # ↓
     * # WSL 2
     * # ↓
     * # Debian
     * # ↓
     * # JDK
     * # ↓
     * # javac → compila
     * # ↓
     * # .class → bytecode
     * # ↓
     * # java → ejecuta
     * # ↓
     * # JVM
     * ###
     */
}
