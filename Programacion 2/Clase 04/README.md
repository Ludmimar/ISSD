# Clase 04 - Arrays Unidimensionales y Bidimensionales

## Descripción General
Esta clase introduce el concepto de arrays (arreglos) en Java, tanto unidimensionales como bidimensionales. Los arrays son estructuras de datos que permiten almacenar múltiples valores del mismo tipo bajo un único nombre.

## Contenidos de la Clase

### Arrays Unidimensionales
Un array unidimensional es una estructura que permite almacenar un conjunto de datos del mismo tipo con un único nombre y acceso por subíndice.

#### Características principales:
- **Declaración**: `int[] array;`
- **Creación**: `array = new int[5];`
- **Atributo length**: `array.length` devuelve el tamaño del array
- **Acceso**: `array[0]`, `array[1]`, etc.

### Arrays Bidimensionales
Un array bidimensional es una estructura que permite almacenar datos en forma de matriz (filas y columnas).

#### Características principales:
- **Declaración**: `int[][] array;`
- **Creación**: `array = new int[3][5];`
- **Acceso**: `array[fila][columna]`
- **Arrays irregulares**: Cada fila puede tener diferente cantidad de elementos

## Ejercicios Incluidos

### Arrays Unidimensionales

#### Ejercicio01 - SueldoEmpleados
- **Objetivo**: Introducción básica a arrays unidimensionales
- **Funcionalidad**: Cargar y mostrar sueldos de 5 empleados
- **Conceptos**: Declaración, creación y acceso a elementos

#### Ejercicio02 - ProblemaArray1
- **Objetivo**: Trabajo con arrays de tamaño fijo y valores aleatorios
- **Funcionalidad**: Array de 100 elementos con valores aleatorios (1-10)
- **Conceptos**: Atributo `length`, valores aleatorios, conteo de elementos

#### Ejercicio03 - ProblemaArray2
- **Objetivo**: Arrays de tamaño dinámico
- **Funcionalidad**: Crear array con tamaño ingresado por el usuario
- **Conceptos**: Arrays de tamaño variable, entrada de datos

#### Ejercicio04 - AmericaSur
- **Objetivo**: Arrays inicializados y arrays paralelos
- **Funcionalidad**: Países de América del Sur y sus habitantes
- **Conceptos**: Inicialización directa, arrays paralelos, búsqueda de máximo

#### Ejercicio05 - ProblemaOrdenamiento
- **Objetivo**: Algoritmo de ordenamiento y medición de rendimiento
- **Funcionalidad**: Ordenamiento burbuja con medición de tiempo
- **Conceptos**: Algoritmos de ordenamiento, medición de rendimiento

### Arrays Bidimensionales

#### Ejercicio06 - PruebaArrayBi1
- **Objetivo**: Introducción a arrays bidimensionales
- **Funcionalidad**: Array 3x5 con carga e impresión
- **Conceptos**: Declaración bidimensional, bucles anidados

#### Ejercicio07 - TableroAjedrez
- **Objetivo**: Arrays bidimensionales inicializados
- **Funcionalidad**: Tablero de ajedrez con movimiento de piezas
- **Conceptos**: Inicialización bidimensional, manipulación de elementos

#### Ejercicio08 - Ejercicio1
- **Objetivo**: Arrays bidimensionales dinámicos
- **Funcionalidad**: Array de tamaño variable con uso de `length`
- **Conceptos**: Arrays dinámicos, atributo `length` en 2D

#### Ejercicio09 - ArrayIrregular
- **Objetivo**: Arrays bidimensionales irregulares
- **Funcionalidad**: Array donde cada fila tiene diferente tamaño
- **Conceptos**: Arrays irregulares, creación fila por fila

#### Ejercicio10 - ArrayIrregularFijo
- **Objetivo**: Arrays irregulares con estructura fija
- **Funcionalidad**: Array de 5 filas con 1, 2, 3, 4, 5 elementos respectivamente
- **Conceptos**: Arrays irregulares predefinidos

## Problemas Propuestos

### Arrays Unidimensionales

#### Problema01 - ArrayOperaciones
- **Enunciado**: Array de 4 elementos con operaciones básicas
- **Métodos**: Cargar, calcular valor acumulado, contar valores > 50

#### Problema02 - AlturasPersonas
- **Enunciado**: Array de alturas de 5 personas
- **Métodos**: Calcular promedio, contar alturas por encima/por debajo del promedio

#### Problema03 - ArrayOrdenado
- **Enunciado**: Verificar si array de 5 elementos está ordenado
- **Métodos**: Cargar, verificar ordenamiento ascendente

#### Problema04 - ArrayValoresAleatorios
- **Enunciado**: Array de tamaño variable con valores aleatorios
- **Métodos**: Encontrar mayor y menor valor

### Arrays Bidimensionales

#### Problema05 - Practico1ArrayBi
- **Enunciado**: Array 4x4 con operaciones matriciales
- **Métodos**: Suma diagonales, suma fila, promedio general

#### Problema06 - Practico2ArrayBi
- **Enunciado**: Array 2x5 con carga por columnas
- **Funcionalidad**: Cargar primero todas las columnas, luego filas

#### Problema07 - Practico3ArrayBi
- **Enunciado**: Array dinámico con intercambio de filas
- **Métodos**: Intercambiar primera y segunda fila, mostrar vértices

#### Problema08 - Practico4ArrayBi
- **Enunciado**: Array 3x4 con impresión de filas y columnas específicas
- **Métodos**: Imprimir primera fila, última fila, primera columna

## Conceptos Clave

### Sintaxis Java para Arrays
```java
// Unidimensional
int[] array = new int[5];
array[0] = 10;

// Bidimensional
int[][] matriz = new int[3][4];
matriz[0][0] = 15;

// Con inicialización
int[] valores = {1, 2, 3, 4, 5};
String[][] paises = {{"Argentina", "Brasil"}, {"Chile", "Uruguay"}};
```

### Atributo Length
```java
// Tamaño del array
int tamaño = array.length;

// En arrays bidimensionales
int filas = matriz.length;
int columnas = matriz[0].length;
```

### Bucles con Arrays
```java
// Recorrido completo
for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
}

// Arrays bidimensionales
for (int f = 0; f < matriz.length; f++) {
    for (int c = 0; c < matriz[f].length; c++) {
        System.out.print(matriz[f][c] + " ");
    }
    System.out.println();
}
```

## Diferencias con Python

### Arrays vs Listas
- **Java**: Arrays de tamaño fijo, mismo tipo de datos
- **Python**: Listas dinámicas, tipos mixtos permitidos

### Rendimiento
- **Java**: Compilado, ejecución más rápida
- **Python**: Interpretado, más flexible pero más lento

### Sintaxis
- **Java**: `array[index]` para acceso
- **Python**: `lista[index]` para acceso

## Notas Importantes

1. **Índices**: Los arrays en Java comienzan en 0
2. **Tamaño fijo**: Una vez creado, el tamaño no puede cambiar
3. **Tipo único**: Todos los elementos deben ser del mismo tipo
4. **Memoria**: Los arrays son objetos, se crean con `new`
5. **Inicialización**: Valores por defecto (0 para números, null para objetos)

## Compilación y Ejecución

Para compilar y ejecutar cualquier ejercicio:

```bash
# Compilar
javac src/*.java

# Ejecutar
java NombreClase
```

## Estructura de Archivos

```
Clase 04/
├── Ejercicio01/
│   ├── Ejercicio01.iml
│   └── src/
│       └── SueldoEmpleados.java
├── Ejercicio02/
│   ├── Ejercicio02.iml
│   └── src/
│       └── ProblemaArray1.java
├── ...
├── Problema01/
│   ├── Problema01.iml
│   └── src/
│       └── ArrayOperaciones.java
├── ...
└── README.md
```

Cada ejercicio y problema está organizado en su propia carpeta con el archivo de configuración `.iml` y el código fuente en la carpeta `src/`.
