# 📝 Sistema de Gestión de Notas de Alumnos - Python

[![Python](https://img.shields.io/badge/Python-3.6+-blue?logo=python)](https://www.python.org/)
[![Status](https://img.shields.io/badge/Status-Completed-green)]()
[![License](https://img.shields.io/badge/License-MIT-green)](LICENSE)

> **Proyecto**: Coloquio Promocional | **Materia**: Programación 1  
> **Profesor**: Emmanuel Galiotti | **Año**: 2025

---

## 🎯 Descripción del Proyecto

Este proyecto implementa un **sistema completo de gestión de notas** desarrollado en Python como parte del coloquio promocional de Programación 1. El sistema permite administrar alumnos, sus notas trimestrales y generar reportes académicos de forma interactiva.

### 🎓 Objetivos Académicos
- Aplicar todos los conceptos aprendidos en Programación 1
- Demostrar dominio de estructuras de datos en Python
- Implementar algoritmos de ordenamiento y búsqueda
- Desarrollar una interfaz de usuario intuitiva
- Manejar validación de datos y control de errores

---

## 🚀 Funcionalidades Principales

### 1. 📚 Carga de Alumnos
- **Ingreso masivo**: Carga múltiples alumnos con sus datos
- **Validación**: Notas entre 1-10, nombres no vacíos
- **Datos almacenados**: Nombre, notas de 3 trimestres
- **Cálculo automático**: Promedio y condición académica

### 2. 📊 Gestión de Condiciones Académicas
- **Promocionado**: Promedio ≥ 8.0
- **Regular**: Promedio ≥ 6.0 y < 8.0  
- **Libre**: Promedio < 6.0
- **Actualización automática**: Al modificar notas

### 3. 🔍 Búsqueda y Consultas
- **Búsqueda por nombre**: Localización rápida de alumnos
- **Mejor promedio**: Identificación del alumno destacado
- **Listado completo**: Visualización de todos los alumnos
- **Listado ordenado**: Por promedio descendente

### 4. ✏️ Modificación de Datos
- **Edición de notas**: Cambio de calificaciones por trimestre
- **Recálculo automático**: Actualización de promedio y condición
- **Validación**: Verificación de rangos válidos

### 5. 📈 Reportes y Estadísticas
- **Resumen general**: Cantidad de alumnos por condición
- **Estadísticas**: Promedio general, mejor y peor rendimiento
- **Exportación**: Posibilidad de guardar reportes

---

## 🛠️ Tecnologías y Conceptos Aplicados

### Estructuras de Datos
- **Listas**: Almacenamiento de alumnos y notas
- **Diccionarios**: Estructura de datos de cada alumno
- **Tuplas**: Agrupación de datos relacionados

### Algoritmos Implementados
- **Ordenamiento**: Por promedio (burbuja/inserción)
- **Búsqueda**: Lineal por nombre
- **Cálculos**: Promedios y estadísticas

### Programación Estructurada
- **Funciones**: Modularización del código
- **Estructuras de control**: `if/elif/else`, `for`, `while`
- **Validación**: Control de entrada de datos
- **Manejo de errores**: Try-catch básico

---

## 💻 Instalación y Uso

### Requisitos del Sistema
- **Python 3.6+** instalado
- **Terminal/Consola** para ejecución
- **Conocimientos básicos** de Python

### Instalación
1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/Ludmimar/ISSD.git
   ```

2. **Navegar al proyecto**
   ```bash
   cd ISSD/Programacion\ 1/Coloquio\ Promocional
   ```

3. **Ejecutar el programa**
   ```bash
   python martos.py
   ```

### Uso del Sistema
1. **Cargar alumnos**: Seleccionar opción 1 del menú
2. **Consultar datos**: Usar opciones 2-5 para visualizar información
3. **Modificar notas**: Opción 6 para editar calificaciones
4. **Salir**: Opción 7 para finalizar

---

## 📂 Estructura del Proyecto

```
Coloquio Promocional/
├── martos.py              # Programa principal
├── readme.md              # Documentación del proyecto
└── README.md              # Este archivo
```

### Archivos Principales
- **`martos.py`**: Código fuente principal del sistema
- **`readme.md`**: Documentación técnica detallada

---

## 🎯 Casos de Uso

### Escenario 1: Carga Inicial
```
1. Ejecutar programa
2. Seleccionar "Cargar alumnos"
3. Ingresar cantidad de alumnos
4. Completar datos de cada alumno
5. Verificar carga exitosa
```

### Escenario 2: Consulta de Rendimiento
```
1. Seleccionar "Mostrar alumno con mejor promedio"
2. Visualizar información del destacado
3. Seleccionar "Listado ordenado por promedio"
4. Revisar ranking completo
```

### Escenario 3: Modificación de Notas
```
1. Seleccionar "Modificar nota de un alumno"
2. Buscar alumno por nombre
3. Seleccionar trimestre a modificar
4. Ingresar nueva nota
5. Verificar actualización automática
```

---

## 🧪 Testing y Validación

### Casos de Prueba Implementados
- ✅ **Carga válida**: Datos correctos
- ✅ **Validación de notas**: Rangos 1-10
- ✅ **Nombres vacíos**: Prevención de errores
- ✅ **Búsqueda inexistente**: Manejo de casos no encontrados
- ✅ **Modificación**: Actualización correcta de datos

### Validaciones de Entrada
- **Notas**: Entre 1 y 10 (inclusive)
- **Nombres**: No vacíos, longitud mínima
- **Cantidad**: Número positivo de alumnos
- **Opciones de menú**: Valores válidos

---

## 📊 Métricas del Proyecto

### Complejidad del Código
- **Líneas de código**: ~300 líneas
- **Funciones**: 8 funciones principales
- **Estructuras de datos**: Listas y diccionarios
- **Algoritmos**: Ordenamiento y búsqueda

### Funcionalidades Implementadas
- ✅ Carga de datos
- ✅ Validación de entrada
- ✅ Cálculos automáticos
- ✅ Búsqueda y filtrado
- ✅ Ordenamiento
- ✅ Modificación de datos
- ✅ Interfaz de usuario
- ✅ Manejo de errores

---

## 🎓 Competencias Demostradas

### Técnicas
- ✅ **Programación en Python**: Sintaxis y estructuras
- ✅ **Estructuras de datos**: Listas, diccionarios, tuplas
- ✅ **Algoritmos**: Ordenamiento y búsqueda
- ✅ **Funciones**: Modularización y reutilización
- ✅ **Validación**: Control de entrada de datos

### Académicas
- ✅ **Resolución de problemas**: Enfoque sistemático
- ✅ **Diseño de algoritmos**: Soluciones eficientes
- ✅ **Documentación**: Código bien comentado
- ✅ **Testing**: Validación de funcionalidades
- ✅ **Presentación**: Interfaz de usuario clara

---

## 🚀 Mejoras Futuras

### Funcionalidades Adicionales
- **Persistencia**: Guardar datos en archivos
- **Importación**: Cargar desde CSV/Excel
- **Reportes**: Generar PDFs con estadísticas
- **Gráficos**: Visualización de datos
- **Backup**: Respaldo automático de datos

### Optimizaciones Técnicas
- **Base de datos**: SQLite para persistencia
- **Interfaz gráfica**: Tkinter o PyQt
- **Validación avanzada**: Expresiones regulares
- **Logging**: Sistema de registro de actividades
- **Testing**: Suite de pruebas automatizadas

---


## 👨‍💻 Autor

**Desarrollador**: Ludmila Martos

## 📞 Contacto

- **Email**: [ludmilamartos@gmail.com](mailto:ludmilamartos@gmail.com)
- **LinkedIn**: [ludmimar89](https://www.linkedin.com/in/ludmimar89/)
- **GitHub**: [Ludmimar](https://github.com/Ludmimar)

---

## 📚 Referencias y Recursos

- [Python Documentation](https://docs.python.org/3/)
- [Python Tutorial](https://docs.python.org/3/tutorial/)
- [Real Python](https://realpython.com/)
- [W3Schools Python](https://www.w3schools.com/python/)

---

> 📝 **Nota**: Este proyecto representa la culminación del aprendizaje en Programación 1, demostrando la aplicación práctica de todos los conceptos teóricos adquiridos durante el curso.


