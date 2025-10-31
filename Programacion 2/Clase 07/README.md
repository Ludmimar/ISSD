# Clase 07 - Mapas (Maps)

Esta clase introduce los conceptos fundamentales de los **Mapas** en Java, estructuras de datos que relacionan llaves (keys) con valores (values).

## 📚 Conceptos Clave

### 🗺️ Mapas (Maps)
- **Definición**: Estructuras de datos que relacionan pares Llave-Valor (Key-Value)
- **Característica principal**: Las llaves deben ser únicas
- **Relación**: Una llave única se asocia con un valor específico
- **Uso**: Búsqueda rápida por llave en lugar de índice

### 🔑 Tipos de Mapas
- **HashMap**: No preserva orden de inserción, acceso rápido
- **LinkedHashMap**: Preserva orden de inserción
- **TreeMap (SortedMap)**: Mantiene orden natural de las llaves

### 📋 Sintaxis Básica
```java
Map<K, V> mapa = new HashMap<>();
```
- `K`: Tipo de la llave (Key)
- `V`: Tipo del valor (Value)
- Ambos deben ser objetos, no tipos primitivos

## 📁 Estructura de Ejercicios

### Ejercicios Básicos (01-07)
- **Ejercicio 01**: Mapa de autos (modelo-fabricante)
- **Ejercicio 02**: Mapa de constantes matemáticas
- **Ejercicio 03**: Mapa de Personas con DNI
- **Ejercicio 04**: HashMap vs LinkedHashMap
- **Ejercicio 05**: Mapa de nombres y edades con iteración
- **Ejercicio 06**: Mapa de números y sus cubos
- **Ejercicio 07**: Mapa de calificaciones con entrada del usuario

### Ejercicios Intermedios (08-11)
- **Ejercicio 08**: Mapa de Tarjetas con validación
- **Ejercicio 09**: Sistema de hash para usuarios y PINs
- **Ejercicio 10**: Sistema de login básico
- **Ejercicio 11**: Sistema de login mejorado con validaciones

### Ejercicios Avanzados (12-13)
- **Ejercicio 12**: SortedMap con TreeMap
- **Ejercicio 13**: TreeMap con métodos firstKey y lastKey

## 📁 Problemas Propuestos

- **Problema 01**: Mapa de países y capitales
- **Problema 02**: Mapa de colores RGB
- **Problema 03**: Mapa de apellidos y calificaciones con eliminación
- **Problema 04**: Sistema de hash personalizado para usuarios
- **Problema 05**: Sistema con hash de usuario y contraseña
- **Problema 06**: Mapa de Artículos (código-Artículo)
- **Problema 07**: Sistema de facturación con códigos de artículos

## 🎯 Objetivos de Aprendizaje

1. **Conceptos Básicos**:
   - Entender qué son los Mapas
   - Diferenciar entre llave y valor
   - Comprender que las llaves deben ser únicas

2. **Métodos Básicos**:
   - `.put(K, V)`: Agregar par llave-valor
   - `.get(K)`: Obtener valor por llave
   - `.size()`: Tamaño del mapa
   - `.remove(K)`: Eliminar par llave-valor
   - `.clear()`: Limpiar mapa
   - `.isEmpty()`: Verificar si está vacío
   - `.containsKey(K)`: Verificar si contiene llave
   - `.containsValue(V)`: Verificar si contiene valor
   - `.replace(K, V)`: Reemplazar valor de una llave

3. **Iteración**:
   - `keySet()`: Obtener conjunto de llaves
   - `values()`: Obtener colección de valores
   - `entrySet()`: Obtener conjunto de entradas (llave-valor)

4. **Tipos de Mapas**:
   - HashMap: Sin orden garantizado
   - LinkedHashMap: Mantiene orden de inserción
   - TreeMap: Orden natural de llaves

5. **Aplicaciones**:
   - Sistemas de login con hash
   - Almacenamiento de datos relacionados
   - Búsqueda rápida por llave

## 🔧 Herramientas y Sintaxis

### Declarar un Mapa
```java
import java.util.Map;
import java.util.HashMap;

Map<TipoLlave, TipoValor> mapa = new HashMap<>();
```

### Métodos Básicos
```java
mapa.put(llave, valor);           // Agregar par llave-valor
mapa.get(llave);                  // Obtener valor por llave
mapa.size();                      // Tamaño del mapa
mapa.remove(llave);               // Eliminar par llave-valor
mapa.clear();                     // Limpiar mapa
mapa.isEmpty();                   // Verificar si está vacío
mapa.containsKey(llave);          // Verificar si contiene llave
mapa.containsValue(valor);        // Verificar si contiene valor
mapa.replace(llave, nuevoValor);  // Reemplazar valor
```

### Iteración
```java
// Iterar sobre llaves
for (TipoLlave key : mapa.keySet()) {
    TipoValor valor = mapa.get(key);
}

// Iterar sobre valores
for (TipoValor valor : mapa.values()) {
    // Hacer algo con valor
}

// Iterar sobre entradas (recomendado)
for (Map.Entry<TipoLlave, TipoValor> entry : mapa.entrySet()) {
    TipoLlave key = entry.getKey();
    TipoValor value = entry.getValue();
}
```

## 📝 Notas Importantes

- **Llaves únicas**: No puede haber dos llaves iguales en un mapa
- **Tipos primitivos**: Usar Integer, Double, Boolean en lugar de int, double, boolean
- **Orden**: HashMap no garantiza orden, LinkedHashMap sí, TreeMap ordena por llave
- **Búsqueda rápida**: Los mapas permiten búsqueda O(1) promedio por llave
- **Funciones Hash**: HashMap utiliza funciones hash para almacenamiento eficiente

## 🚀 Ejecución

Cada ejercicio puede ejecutarse independientemente compilando y ejecutando la clase principal:

```bash
javac src/*.java
java -cp src NombreClasePrincipal
```

## 📖 Recursos Adicionales

- Documentación oficial de Java sobre [Mapas](https://docs.oracle.com/javase/tutorial/collections/interfaces/map.html)
- Documentación oficial de Java sobre [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)
- Documentación oficial de Java sobre [TreeMap](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html)
- Documentación oficial de Java sobre [LinkedHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html)

