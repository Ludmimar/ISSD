# 📗 Clase 11 - Maven y Spring Boot

[![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=flat&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Maven](https://img.shields.io/badge/Maven-3.9+-C71A36?style=flat&logo=apache-maven&logoColor=white)](https://maven.apache.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.4-6DB33F?style=flat&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Status](https://img.shields.io/badge/Status-Completada-success)]()

> **Clase 11** - Programación 2 - ISSD 2025  
> **Profesor**: Gabriel Arriola  
> **Alumna**: Ludmila Martos

---

## 📚 Contenido de la Clase

Esta clase introduce dos herramientas fundamentales para el desarrollo profesional de software:

1. **Maven**: Herramienta de gestión de proyectos y dependencias
2. **Spring Boot**: Framework para desarrollo de aplicaciones web y microservicios

---

## 🗂️ Estructura de Ejercicios

```
Clase 11/
├── Problema05/          # Jsoup - Web Scraper ISSD
│   ├── pom.xml
│   ├── Problema05.iml
│   └── src/main/java/com/issd/App.java
│
├── Problema07/          # Spring Boot - Autor
│   ├── pom.xml
│   ├── Problema07.iml
│   └── src/main/java/com/issd/
│       ├── App.java
│       └── HelloController.java
│
├── Problema08/          # Spring Boot - Contador de Visitas
│   ├── pom.xml
│   ├── Problema08.iml
│   └── src/main/java/com/issd/
│       ├── App.java
│       └── HelloController.java
│
├── Problema09/          # Spring Boot - Transformar a Mayúsculas
│   ├── pom.xml
│   ├── Problema09.iml
│   └── src/main/java/com/issd/
│       ├── App.java
│       └── EjemploSpring.java
│
├── ProblemaP1/          # Problema Propuesto 1 - Buscador Google
│   ├── pom.xml
│   ├── ProblemaP1.iml
│   └── src/main/java/com/issd/App.java
│
├── ProblemaP2/          # Problema Propuesto 2 - Números Primos
│   ├── pom.xml
│   ├── ProblemaP2.iml
│   └── src/main/java/com/issd/
│       ├── App.java
│       └── PrimosController.java
│
├── ProblemaP3/          # Problema Propuesto 3 - Investigación REST
│   ├── REST_INVESTIGACION.md
│   └── ProblemaP3.iml
│
└── README.md            # Este archivo
```

---

## 📝 Descripción de Ejercicios

### 🔹 Problema 05 - Web Scraper con Jsoup

**Descripción**: Proyecto Maven que utiliza la librería **jsoup** para conectarse a la página web del ISSD y extraer:
- El título de la página
- Todos los enlaces (links) de la página

**Dependencia Maven**:
```xml
<dependency>
    <groupId>org.jsoup</groupId>
    <artifactId>jsoup</artifactId>
    <version>1.17.2</version>
</dependency>
```

**Ejecución**: Ejecutar `App.java` directamente desde el IDE.

---

### 🔹 Problema 07 - Spring Boot: Autor

**Descripción**: Aplicación Spring Boot que muestra información del autor cuando se accede a `/autor` y además imprime un mensaje en la consola de Java.

**URL**: `http://localhost:8080/autor`

**Características**:
- Interfaz HTML con diseño moderno
- Mensaje en consola al acceder
- Página de bienvenida en `/`

---

### 🔹 Problema 08 - Spring Boot: Contador de Visitas

**Descripción**: Aplicación Spring Boot que implementa un contador de visitas que se incrementa cada vez que se refresca la página.

**URL**: `http://localhost:8080/contar`

**Características**:
- Contador visual con diseño atractivo
- Botón para refrescar y ver el incremento
- Simula un contador de visitas real

---

### 🔹 Problema 09 - Spring Boot: Transformar a Mayúsculas

**Descripción**: Aplicación Spring Boot que recibe un mensaje por parámetro URL y lo devuelve transformado a mayúsculas.

**URL**: `http://localhost:8080/transformar?mensaje=hola%20mundo`

**Resultado**: `HOLA MUNDO`

**Características**:
- Formulario interactivo para ingresar texto
- Uso de `@RequestParam` para recibir parámetros
- Método `toUpperCase()` para transformación

---

### 🔹 Problema Propuesto 1 - Buscador de Google

**Descripción**: Buscador de Google a través de Java usando jsoup. El usuario ingresa una frase de búsqueda y el programa devuelve los enlaces de los resultados.

**Características**:
- Entrada de usuario por consola
- Codificación URL automática
- User-Agent para simular navegador
- Manejo de posibles bloqueos de Google

**Nota**: Google puede bloquear solicitudes automatizadas. Este programa es solo para fines educativos.

---

### 🔹 Problema Propuesto 2 - Números Primos

**Descripción**: Aplicación Spring Boot que recibe un número por URL y devuelve todos los números primos entre 2 y dicho número, separados por comas.

**URL**: `http://localhost:8080/primos?numero=20`

**Resultado**: `2,3,5,7,11,13,17,19`

**Características**:
- Formulario interactivo
- Validación de entrada
- Algoritmo optimizado (raíz cuadrada)
- Estadísticas de resultados

---

### 🔹 Problema Propuesto 3 - Investigación REST

**Descripción**: Documentación completa sobre los conceptos de **REST** (Representational State Transfer) y **RESTful**.

**Contenido**:
- Definición de REST
- Principios arquitectónicos
- Métodos HTTP (GET, POST, PUT, DELETE)
- Códigos de estado HTTP
- Comparación REST vs SOAP
- Ejemplos prácticos con Spring Boot

**Archivo**: `REST_INVESTIGACION.md`

---

## 🚀 Cómo Ejecutar los Proyectos

### Requisitos Previos

1. **Java JDK 17+**
   ```bash
   java -version
   ```

2. **Maven 3.9+** (o usar el wrapper de Maven)
   ```bash
   mvn -version
   ```

3. **IntelliJ IDEA** (recomendado) o **Eclipse**

### Ejecución con Maven

1. **Navegar al proyecto**:
   ```bash
   cd "Programacion 2/Clase 11/ProblemaXX"
   ```

2. **Compilar y ejecutar**:
   ```bash
   # Compilar
   mvn clean compile
   
   # Ejecutar (para proyectos Spring Boot)
   mvn spring-boot:run
   
   # O ejecutar clase principal
   mvn exec:java -Dexec.mainClass="com.issd.App"
   ```

### Ejecución con IntelliJ IDEA

1. Abrir el proyecto (File > Open)
2. Esperar que Maven descargue las dependencias
3. Ejecutar `App.java` con el botón Run ▶️

---

## 🔧 Dependencias Utilizadas

### Jsoup (Web Scraping)
```xml
<dependency>
    <groupId>org.jsoup</groupId>
    <artifactId>jsoup</artifactId>
    <version>1.17.2</version>
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

### Maven
- **POM.xml**: Archivo de configuración del proyecto
- **GroupId**: Identificador de la organización
- **ArtifactId**: Identificador del proyecto
- **Dependencias**: Librerías externas necesarias
- **Repositorio**: Almacén de dependencias (Maven Central)

### Spring Boot
- **@SpringBootApplication**: Anotación principal
- **@RestController**: Controlador REST
- **@GetMapping**: Mapeo de método GET HTTP
- **@RequestParam**: Parámetro de la URL

### Versionado Semántico
- **Major.Minor.Patch** (ej: 3.2.4)
- Major: Cambios incompatibles
- Minor: Nuevas funcionalidades compatibles
- Patch: Corrección de errores

---

## 🎓 Competencias Desarrolladas

- ✅ Creación de proyectos Maven
- ✅ Gestión de dependencias con pom.xml
- ✅ Web scraping con Jsoup
- ✅ Desarrollo de microservicios con Spring Boot
- ✅ Creación de endpoints REST
- ✅ Uso de parámetros URL
- ✅ Comprensión de arquitectura REST

---

## 📚 Recursos Adicionales

- [Maven Repository](https://mvnrepository.com/)
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Jsoup Documentation](https://jsoup.org/)
- [REST API Tutorial](https://restfulapi.net/)

---

## 👨‍💻 Autor

**Desarrollador**: Ludmila Martos  
**Carrera**: Técnico Superior en Desarrollo de Software  
**Instituto**: ISSD - Instituto Superior Santo Domingo  
**Año**: 2025

---

> 📝 **Nota**: Esta clase forma parte del segundo parcial de Programación 2 y marca la introducción al desarrollo de aplicaciones web profesionales con Java.


