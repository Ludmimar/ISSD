# 🔁 CLASE 02 - Estructuras Repetitivas en Java

[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=java&logoColor=white)](https://www.java.com/)
[![IDE](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-000?style=flat&logo=intellij-idea&logoColor=white)](https://www.jetbrains.com/idea/)
[![Status](https://img.shields.io/badge/Status-Completed-green)]()

> **Materia**: Programación 2 | **Profesor**: Gabriel Arriola  
> **Tema**: Estructuras Repetitivas y Bucles | **Año**: 2025

---

## 🎯 Objetivos de la Clase

- Dominar las estructuras repetitivas en Java
- Comprender los diferentes tipos de bucles (`for`, `while`, `do-while`)
- Aplicar bucles anidados en problemas complejos
- Implementar control de flujo con `break` y `continue`
- Desarrollar algoritmos iterativos eficientes

---

## 📂 Contenido de la Clase

### 📚 Material Teórico
- `(new) Clase 2 - AED2 2024.pdf` - Material teórico oficial

### 💻 Ejercicios Prácticos
- `Ejercicio01/` - Bucle `for` básico
- `Ejercicio02/` - Bucle `while` con condición
- `Ejercicio03/` - Bucle `do-while` garantizado
- `Ejercicio04/` - Bucles anidados
- `Ejercicio05/` - Control de flujo con `break`
- `Ejercicio06/` - Control de flujo con `continue`
- `Ejercicio07/` - Iteración con `for-each`
- `Ejercicio08/` - Bucles con arrays
- `Ejercicio09/` - Algoritmos iterativos
- `Ejercicio10/` - Problemas complejos
- `Ejercicio11/` - Optimización de bucles
- `Ejercicio12/` - Patrones con bucles

### 🎯 Proyecto Base
- `ProyectoBase-main/` - Plantilla base para proyectos Java

---

## 🚀 Conceptos Aprendidos

### Bucle `for`
- **Sintaxis**: `for(inicialización; condición; incremento)`
- **Uso**: Iteración con contador conocido
- **Variantes**: `for-each` para colecciones
- **Optimización**: Evitar cálculos innecesarios en condición

### Bucle `while`
- **Sintaxis**: `while(condición)`
- **Uso**: Iteración con condición de parada
- **Precaución**: Evitar bucles infinitos
- **Aplicación**: Validación de entrada, procesamiento de datos

### Bucle `do-while`
- **Sintaxis**: `do { } while(condición);`
- **Uso**: Ejecución garantizada al menos una vez
- **Aplicación**: Menús interactivos, validación de entrada

### Control de Flujo
- **`break`**: Salir del bucle inmediatamente
- **`continue`**: Saltar a la siguiente iteración
- **`return`**: Salir del método completo

---

## 💻 Cómo Ejecutar los Ejercicios

### Requisitos Previos
1. **Java JDK 8+ instalado**
   ```bash
   java -version
   javac -version
   ```

2. **IntelliJ IDEA configurado**

### Ejecución de Ejercicios

1. **Abrir proyecto en IntelliJ IDEA**
   ```bash
   cd "Programacion 2/Clase 02/Ejercicio01"
   ```

2. **Compilar y ejecutar**
   ```bash
   # Compilar
   javac src/*.java
   
   # Ejecutar
   java -cp src NombreClase
   ```

3. **Usando IntelliJ IDEA**
   - Abrir el proyecto
   - Ejecutar con `Ctrl + Shift + F10`
   - Ver resultados en la consola

---

## 📝 Ejercicios Destacados

### Ejercicio 01 - Bucle For Básico
**Ubicación**: `Ejercicio01/src/`

**Funcionalidad**:
- Iteración con contador
- Salida numerada
- Control de límites

**Conceptos aplicados**:
- Sintaxis del bucle `for`
- Variables de control
- Incremento y decremento

### Ejercicio 07 - For-Each
**Ubicación**: `Ejercicio07/src/`

**Funcionalidad**:
- Iteración sobre arrays
- Iteración sobre Strings
- Simplificación de sintaxis

**Conceptos aplicados**:
- Bucle `for-each`
- Arrays y Strings
- Iteración automática

### Proyecto Base
**Ubicación**: `ProyectoBase-main/`

**Características**:
- Estructura base para proyectos Java
- Configuración de IntelliJ IDEA
- Ejemplos de bucles implementados
- Plantilla para nuevos ejercicios

---

## 🔧 Patrones Comunes de Bucles

### Contador Ascendente
```java
for(int i = 0; i < n; i++) {
    // Procesar elemento i
}
```

### Contador Descendente
```java
for(int i = n-1; i >= 0; i--) {
    // Procesar elemento i
}
```

### Validación de Entrada
```java
do {
    // Solicitar entrada
    entrada = scanner.nextInt();
} while(entrada < 0 || entrada > 100);
```

### Búsqueda en Array
```java
for(int i = 0; i < array.length; i++) {
    if(array[i] == valorBuscado) {
        System.out.println("Encontrado en posición: " + i);
        break;
    }
}
```

---

## 🎓 Competencias Desarrolladas

- ✅ **Dominio de bucles `for`**
- ✅ **Uso eficiente de bucles `while`**
- ✅ **Aplicación de `do-while`**
- ✅ **Implementación de bucles anidados**
- ✅ **Control de flujo con `break/continue`**
- ✅ **Optimización de algoritmos iterativos**
- ✅ **Resolución de problemas complejos**

---

## 📚 Recursos Adicionales

- [Oracle Java Tutorials - Control Flow](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
- [Java For Loop Examples](https://www.programiz.com/java-programming/for-loop)
- [While and Do-While Loops](https://www.w3schools.com/java/java_while_loop.asp)

---

## 📈 Progreso de la Clase

- [x] Bucle `for` básico y avanzado
- [x] Bucle `while` con condiciones
- [x] Bucle `do-while` garantizado
- [x] Bucles anidados
- [x] Control de flujo (`break/continue`)
- [x] Bucle `for-each`
- [x] Algoritmos iterativos
- [x] Optimización de bucles
- [x] Proyecto base configurado

---

## 👨‍💻 Autor

**Desarrollador**: Ludmila Martos

## 📞 Contacto

- **Email**: [ludmilamartos@gmail.com](mailto:ludmilamartos@gmail.com)
- **LinkedIn**: [ludmimar89](https://www.linkedin.com/in/ludmimar89/)
- **GitHub**: [Ludmimar](https://github.com/Ludmimar)


---

> 📝 **Nota**: Esta clase profundiza en las estructuras repetitivas, fundamentales para el desarrollo de algoritmos eficientes en Java.
