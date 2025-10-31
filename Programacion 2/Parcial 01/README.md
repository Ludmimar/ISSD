# 📚 Sistema de Gestión de Notas Académicas

> Sistema desarrollado en Java para la gestión y análisis de notas de alumnos con generación de reportes estadísticos.

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](LICENSE)

---

## 📋 Descripción

Sistema de gestión académica que permite administrar información de alumnos, sus materias y calificaciones. Incluye funcionalidades para calcular promedios, determinar el estado de aprobación de materias y generar reportes detallados del rendimiento académico.

**Autor:** Ludmila Martos  
**Proyecto:** Parcial 1 - Programación 2

---

## ✨ Características

- ✅ **Gestión de Alumnos**: Registro de alumnos con legajo, nombre y múltiples materias
- 📊 **Cálculo de Promedios**: Promedio automático de notas por alumno
- 📈 **Análisis de Rendimiento**: Identificación de materias superiores al promedio
- ✓/✗ **Estado de Materias**: Verificación automática de aprobación/desaprobación
- 📑 **Reportes Múltiples**: Generación de reportes individuales y consolidados
- 🎨 **Interfaz Visual**: Menú interactivo con formato de tablas Unicode

---

## 🏗️ Estructura del Proyecto

```
Martos.Ludmila.P1/
│
├── src/
│   ├── Alumno.java          # Clase entidad para alumnos
│   ├── Examen.java           # Clase para gestión de exámenes y reportes
│   └── Main.java             # Clase principal con menú interactivo
│
├── out/
│   └── production/           # Archivos compilados (.class)
│
└── README.md                 # Documentación del proyecto
```

---

## 🔧 Tecnologías Utilizadas

- **Lenguaje:** Java SE
- **Paradigma:** Programación Orientada a Objetos (POO)
- **IDE Recomendado:** IntelliJ IDEA / Eclipse / NetBeans
- **Versión Java:** JDK 8 o superior

---

## 🚀 Instalación y Ejecución

### Prerrequisitos

- Tener instalado Java JDK 8 o superior
- Configurar la variable de entorno `JAVA_HOME`

### Pasos para ejecutar

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/tu-usuario/Martos.Ludmila.P1.git
   cd Martos.Ludmila.P1
   ```

2. **Compilar el proyecto**
   ```bash
   javac -d out/production/Martos.Ludmila.P1 src/*.java
   ```

3. **Ejecutar la aplicación**
   ```bash
   java -cp out/production/Martos.Ludmila.P1 Main
   ```

### Ejecución desde IDE

1. Abrir el proyecto en tu IDE favorito
2. Configurar el SDK de Java (JDK 8+)
3. Ejecutar la clase `Main.java`

---

## 📖 Uso del Sistema

### Menú Principal

Al ejecutar el programa, se presenta un menú interactivo con las siguientes opciones:

```
╔════════════════════════════════════════════════════════════════════╗
║                        MENÚ PRINCIPAL                              ║
╠════════════════════════════════════════════════════════════════════╣
║  1. Mostrar listado de alumnos con estado de materias             ║
║  2. Mostrar promedios de alumnos                                   ║
║  3. Mostrar materias superiores al promedio por alumno             ║
║  4. Mostrar todos los reportes                                     ║
║  0. Salir del sistema                                              ║
╚════════════════════════════════════════════════════════════════════╝
```

### Funcionalidades

#### 1️⃣ Listado de Alumnos
Muestra cada alumno con todas sus materias y el estado de aprobación/desaprobación (✓/✗).

#### 2️⃣ Promedios
Calcula y muestra el promedio general de cada alumno.

#### 3️⃣ Materias Superiores al Promedio
Identifica y lista las materias donde la nota supera el promedio individual del alumno.

#### 4️⃣ Reporte Completo
Genera un informe consolidado con todas las funcionalidades anteriores.

---

## 💡 Conceptos Aplicados

### Programación Orientada a Objetos
- **Encapsulación**: Atributos privados con getters y setters
- **Composición**: Clase `Examen` contiene objetos `Alumno`
- **Responsabilidad Única**: Cada clase tiene una responsabilidad específica
- **Javadoc**: Documentación de métodos públicos

### Estructuras de Datos
- **Arrays Paralelos**: Sincronización entre arrays de materias y notas
- **Validación de Índices**: Prevención de excepciones `IndexOutOfBoundsException`

### Algoritmos
- **Cálculo de Promedios**: Suma y división con casting a `double`
- **Filtrado de Datos**: Búsqueda de elementos que cumplen condiciones
- **Comparación**: Uso del operador ternario para evaluaciones

### Buenas Prácticas
- Métodos estáticos para funciones utilitarias
- Cierre de recursos (`Scanner.close()`)
- Validaciones de entrada
- Código comentado y autodocumentado

---

## 📊 Datos de Ejemplo

El sistema viene precargado con 3 alumnos de prueba:

| Legajo | Nombre              | Materias | Promedio |
|--------|---------------------|----------|----------|
| 1001   | Ludmila Martos      | 4        | 58.00    |
| 1002   | Maximiliano Orosco  | 4        | 88.25    |
| 1003   | Ailen Acuña         | 4        | 62.75    |

**Nota de Aprobación:** 60 puntos

---

## 🎯 Ejemplos de Salida

### Listado de Alumnos
```
┌─────────────────────────────────────────────────────────────────┐
│ Legajo: 1001 - Nombre: Ludmila Martos
├─────────────────────────────────────────────────────────────────┤
│ Programación 1                 - Nota: 55 - ✗ REPROBADA
│ Matematica                     - Nota: 72 - ✓ APROBADA
│ Base de Datos                  - Nota: 60 - ✓ APROBADA
│ Ingles Tecnico                 - Nota: 45 - ✗ REPROBADA
└─────────────────────────────────────────────────────────────────┘
```

### Promedio de Alumno
```
┌─────────────────────────────────────────────────────────────────┐
│ Alumno: Maximiliano Orosco                                       │
│ Legajo: 1002                                                     │
│ Promedio General: 88.25                                          │
└─────────────────────────────────────────────────────────────────┘
```

---

## 🔄 Posibles Mejoras Futuras

- [ ] Persistencia de datos en archivos o base de datos
- [ ] Interfaz gráfica (GUI) con JavaFX o Swing
- [ ] Exportación de reportes a PDF/Excel
- [ ] Sistema de autenticación de usuarios
- [ ] Gestión de múltiples comisiones/cursos
- [ ] Gráficos estadísticos del rendimiento
- [ ] API REST para integración con otros sistemas

---

## 👤 Autor

**Ludmila Martos**

- DNI: 34811684
- Institución: ISSD - Instituto Superior de Desarrollo Software
- Materia: Programación 2 - 2do Cuatrimestre

---

## 📧 Contacto

- **Email**: [ludmilamartos@gmail.com](mailto:ludmilamartos@gmail.com)
- **LinkedIn**: [ludmimar89](https://www.linkedin.com/in/ludmimar89/)
- **GitHub**: [Ludmimar](https://github.com/Ludmimar)

---

<div align="center">

**⭐ Si te gustó este proyecto, dale una estrella en GitHub ⭐**

Hecho con ❤️ por Ludmila Martos - 2025

</div>


