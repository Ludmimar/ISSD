# 📗 Clase 12 - Annotations, Multi-threading y Aplicaciones Web

[![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=flat&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Maven](https://img.shields.io/badge/Maven-3.9+-C71A36?style=flat&logo=apache-maven&logoColor=white)](https://maven.apache.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.4-6DB33F?style=flat&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Lombok](https://img.shields.io/badge/Lombok-1.18.32-red?style=flat)](https://projectlombok.org/)
[![Status](https://img.shields.io/badge/Status-Completada-success)]()

> **Clase 12** - Programación 2 - ISSD 2025  
> **Profesor**: Gabriel Arriola  
> **Alumna**: Ludmila Martos

---

## 📚 Contenido de la Clase

Esta clase cubre tres conceptos avanzados de la programación:

1. **Annotations (Anotaciones)**: Metadata y generación automática de código con Lombok
2. **Multi-threading**: Programación concurrente con Thread y Runnable
3. **Aplicaciones Web**: Backend en Java con Spring Boot + Frontend HTML/CSS/JS

---

## 🗂️ Estructura de Ejercicios

```
Clase 12/
├── Problema01/          # Lombok - @Data, @Getter, @Setter
│   ├── pom.xml
│   ├── Problema01.iml
│   └── src/main/java/com/issd/
│       ├── App.java
│       └── Alumno.java
│
├── Problema02/          # Documentación JavaDoc
│   ├── pom.xml
│   ├── Problema02.iml
│   └── src/main/java/com/issd/App.java
│
├── Problema03/          # Multi-threading con extends Thread
│   ├── pom.xml
│   ├── Problema03.iml
│   └── src/main/java/com/issd/App.java
│
├── Problema04/          # Multi-threading con implements Runnable
│   ├── pom.xml
│   ├── Problema04.iml
│   └── src/main/java/com/issd/App.java
│
├── Problema05/          # Sincronización con join()
│   ├── pom.xml
│   ├── Problema05.iml
│   └── src/main/java/com/issd/App.java
│
├── EjemploWeb/          # App Web - Conversor de Temperatura
│   ├── pom.xml
│   ├── EjemploWeb.iml
│   ├── index.html       # Frontend HTML/CSS/JS
│   └── src/main/java/com/issd/
│       ├── App.java
│       ├── TemperaturaController.java
│       └── CorsConfiguration.java
│
├── ProblemaP1/          # Bubble Sort Multi-thread vs Single-thread
│   ├── pom.xml
│   ├── ProblemaP1.iml
│   └── src/main/java/com/issd/App.java
│
├── ProblemaP2/          # Investigación conceptos avanzados
│   ├── INVESTIGACION.md
│   └── ProblemaP2.iml
│
├── ProblemaP3/          # App Web - Filtrar Números Primos
│   ├── pom.xml
│   ├── ProblemaP3.iml
│   ├── index.html       # Frontend con diseño moderno
│   └── src/main/java/com/issd/
│       ├── App.java
│       ├── PrimosController.java
│       └── CorsConfiguration.java
│
└── README.md            # Este archivo
```

---

## 📝 Descripción de Ejercicios

### 🏷️ Sección 1: Annotations (Anotaciones)

#### Problema 01 - Lombok

**Descripción**: Uso de la librería Lombok para generar automáticamente getters, setters, toString(), equals() y hashCode() con la anotación `@Data`.

**Dependencia Maven**:
```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.32</version>
    <scope>provided</scope>
</dependency>
```

**Conceptos demostrados**:
- `@Data` - Genera todos los métodos comunes
- `@Getter` / `@Setter` - Generan getters y setters individuales
- Reducción significativa de código boilerplate

**Instalación de Lombok en Eclipse**:
1. Descargar lombok.jar desde https://projectlombok.org/download
2. Ejecutar: `java -jar lombok.jar`
3. Seleccionar Eclipse y click en "Install/Update"
4. Reiniciar Eclipse

---

#### Problema 02 - JavaDoc

**Descripción**: Documentación de código usando anotaciones JavaDoc para que aparezca información en las ventanas emergentes del IDE.

**Anotaciones principales**:
- `@param` - Documenta parámetros
- `@return` - Documenta valor de retorno
- `@throws` - Documenta excepciones
- `@author`, `@version`, `@since`, `@see`

---

### 🧵 Sección 2: Multi-threading

#### Problema 03 - extends Thread

**Descripción**: Crear hilos extendiendo la clase `Thread` y sobrescribiendo el método `run()`.

```java
public class MiHilo extends Thread {
    public void run() {
        // Código del hilo
    }
}

// Uso
MiHilo hilo = new MiHilo();
hilo.start();
```

---

#### Problema 04 - implements Runnable

**Descripción**: Crear hilos implementando la interfaz `Runnable` (método preferido).

```java
public class MiRunnable implements Runnable {
    public void run() {
        // Código del hilo
    }
}

// Uso
Thread hilo = new Thread(new MiRunnable());
hilo.start();
```

**Ventajas de Runnable sobre Thread**:
- Permite herencia de otra clase
- Mejor separación de responsabilidades
- Mayor flexibilidad

---

#### Problema 05 - Sincronización con join()

**Descripción**: Uso de `join()` para evitar `ConcurrentModificationException` al acceder a recursos compartidos entre hilos.

```java
Thread t1 = new Thread(new Escritor(lista));
Thread t2 = new Thread(new Lector(lista));

t1.start();
t1.join(); // Esperar a que t1 termine
t2.start(); // Recién después iniciar t2
```

---

### 🌐 Sección 3: Aplicaciones Web

#### Ejemplo Web - Conversor de Temperatura

**Descripción**: Aplicación web completa que convierte temperaturas de Celsius a Fahrenheit.

**Arquitectura**:
- **Backend**: Spring Boot (Java)
- **Frontend**: HTML + CSS + JavaScript
- **Comunicación**: XMLHttpRequest (AJAX)

**Cómo ejecutar**:
1. Ejecutar `App.java` para iniciar el servidor
2. Abrir `index.html` en el navegador
3. Ingresar temperatura y presionar "Transformar!"

**Endpoint**: `GET /transformar?temp=30`

---

### 📋 Problemas Propuestos

#### Problema P1 - Bubble Sort Multi-thread

**Descripción**: Comparación de rendimiento entre ordenamiento secuencial (single-thread) y paralelo (multi-thread).

**Resultado esperado**: El ordenamiento multi-thread es significativamente más rápido al utilizar múltiples núcleos del procesador.

---

#### Problema P2 - Investigación

**Conceptos investigados**:
- **DeadLock**: Interbloqueo entre hilos
- **MVC**: Modelo Vista Controlador
- **CRUD**: Create, Read, Update, Delete
- **API**: Application Programming Interface
- **Client-side vs Server-side**: Procesamiento en cliente vs servidor

Ver archivo `INVESTIGACION.md` para documentación completa.

---

#### Problema P3 - App Web Filtrar Primos

**Descripción**: Aplicación web que filtra números primos de una lista ingresada por el usuario.

**Características**:
- ✅ Backend con Spring Boot
- ✅ Multi-threading para verificar primalidad en paralelo
- ✅ Frontend con diseño moderno (CSS)
- ✅ Comunicación REST API

**Endpoint**: `GET /filtrar?numeros=1,2,3,5,8,13,21`

---

## 🚀 Cómo Ejecutar los Proyectos

### Requisitos Previos

1. **Java JDK 17+**
2. **Maven 3.9+**
3. **IntelliJ IDEA** o **Eclipse** (con Lombok instalado)

### Proyectos Java (sin Spring)

```bash
cd "Programacion 2/Clase 12/ProblemaXX"
mvn clean compile exec:java -Dexec.mainClass="com.issd.App"
```

### Proyectos Spring Boot

```bash
cd "Programacion 2/Clase 12/EjemploWeb"
mvn spring-boot:run
```

Luego abrir `index.html` en el navegador.

---

## 🔧 Dependencias Utilizadas

### Lombok
```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.32</version>
    <scope>provided</scope>
</dependency>
```

### Spring Boot Starter Web
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    <version>3.2.4</version>
</dependency>
```

---

## 📖 Conceptos Clave

### Annotations
- **Metadata**: Información adicional sobre el código
- **@Override**: Sobrescritura de métodos
- **@Data**: Genera getters, setters, toString, equals, hashCode
- **JavaDoc**: Documentación que aparece en el IDE

### Multi-threading
- **Thread**: Hilo de ejecución
- **Runnable**: Interfaz para código ejecutable
- **start()**: Inicia un hilo
- **join()**: Espera a que un hilo termine
- **synchronized**: Bloque de acceso exclusivo
- **ConcurrentModificationException**: Error de acceso concurrente

### Aplicaciones Web
- **Backend**: Lógica del servidor (Spring Boot)
- **Frontend**: Interfaz de usuario (HTML/CSS/JS)
- **CORS**: Cross-Origin Resource Sharing
- **XMLHttpRequest**: Comunicación AJAX
- **REST API**: Arquitectura de servicios web

---

## 🎓 Competencias Desarrolladas

- ✅ Uso de anotaciones para generar código automáticamente
- ✅ Documentación de código con JavaDoc
- ✅ Creación de hilos con Thread y Runnable
- ✅ Sincronización de hilos con join()
- ✅ Evitar problemas de concurrencia
- ✅ Desarrollo de backend con Spring Boot
- ✅ Comunicación frontend-backend con AJAX
- ✅ Diseño de interfaces web con HTML/CSS

---

## 📚 Recursos Adicionales

- [Project Lombok](https://projectlombok.org/)
- [Java Concurrency Tutorial](https://docs.oracle.com/javase/tutorial/essential/concurrency/)
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [MDN Web Docs - AJAX](https://developer.mozilla.org/en-US/docs/Web/Guide/AJAX)

---

## 👨‍💻 Autor

**Desarrollador**: Ludmila Martos  
**Carrera**: Técnico Superior en Desarrollo de Software  
**Instituto**: ISSD - Instituto Superior Santo Domingo  
**Año**: 2025

---

> 📝 **Nota**: Esta clase marca el cierre del contenido de Programación 2, integrando conceptos avanzados de Java con desarrollo de aplicaciones web modernas.

