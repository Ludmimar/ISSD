# Clase 06 - Colecciones y Listas

Esta clase introduce los conceptos fundamentales de las **Colecciones** en Java, en particular las **Listas** (ArrayList y LinkedList).

## 📚 Conceptos Clave

### 📦 Colecciones
- **Definición**: Estructuras de datos que permiten agrupar objetos
- **Ventajas**: Métodos útiles para búsqueda, ordenamiento, manipulación, inserción y eliminación
- **Diferencia con Arrays**: Las colecciones pueden cambiar de tamaño dinámicamente

### 📋 Listas (List)
- **Interface**: `List<T>` - interface que define el comportamiento de las listas
- **Implementaciones**: ArrayList, LinkedList
- **Ventajas**: Acceso dinámico, métodos útiles, tamaño variable

### 🔄 ArrayList
- **Implementación**: Matriz dinámica
- **Características**: Acceso rápido por índice, inserciones/eliminaciones costosas en medio
- **Uso recomendado**: Cuando se necesita acceso frecuente por índice

### 🔗 LinkedList
- **Implementación**: Lista doblemente enlazada
- **Características**: Inserciones/eliminaciones rápidas, acceso por índice más lento
- **Uso recomendado**: Cuando se hacen muchas inserciones/eliminaciones

## 📁 Estructura de Ejercicios

### Ejercicios Básicos (01-06)
- **Ejercicio 01**: Lista de cartas con métodos básicos
- **Ejercicio 02**: ArrayList de String con .size()
- **Ejercicio 03**: Lista con .remove() y .set()
- **Ejercicio 04**: Lista con .isEmpty() y .clear()
- **Ejercicio 05**: Iterar lista con for tradicional
- **Ejercicio 06**: Pedir datos al usuario y almacenar en lista

### Ejercicios Intermedios (07-12)
- **Ejercicio 07**: Métodos con listas como parámetros
- **Ejercicio 08**: Mazo completo de cartas españolas
- **Ejercicio 09**: Iteración for-each sobre listas
- **Ejercicio 10**: Transformar arrays a listas
- **Ejercicio 11**: Métodos de Collections (sort, reverse, max, min, shuffle)
- **Ejercicio 12**: Lista de objetos (Alumno) con Collections.shuffle()

## 📁 Problemas Propuestos

- **Problema 01**: Lista de planetas del sistema solar
- **Problema 02**: Lista de números hasta ingresar 0, calcular promedio
- **Problema 03**: Lista de objetos Auto (marca y modelo)
- **Problema 04**: Mazo de baraja inglesa (52 cartas)
- **Problema 05**: Método que retorna carta aleatoria
- **Problema 06**: Método que retorna 3 cartas aleatorias sin repetir
- **Problema 07**: Copiar lista, desordenar y comparar

## 🎯 Objetivos de Aprendizaje

1. **Conceptos Básicos**:
   - Entender qué son las Colecciones
   - Diferenciar entre Arrays y Listas
   - Comprender tipos primitivos vs objetos wrapper

2. **ArrayList**:
   - Declarar y crear listas
   - Agregar elementos (.add())
   - Obtener elementos (.get())
   - Tamaño de lista (.size())

3. **Métodos Útiles**:
   - Eliminar elementos (.remove())
   - Reemplazar elementos (.set())
   - Limpiar lista (.clear())
   - Verificar si está vacía (.isEmpty())
   - Buscar elementos (.contains())

4. **Iteración**:
   - For tradicional con índices
   - For-each (enhanced for loop)
   - While loop sobre listas

5. **Collections**:
   - Ordenamiento (sort, reverse)
   - Búsqueda (max, min)
   - Aleatoriedad (shuffle)
   - Frecuencia (frequency)
   - Copia (copy)

6. **Listas de Listas**:
   - Estructuras multidimensionales
   - Acceso a elementos anidados

## 🔧 Herramientas y Sintaxis

### Declarar una Lista
```java
import java.util.List;
import java.util.ArrayList;

List<TipoObjeto> nombreLista = new ArrayList<>();
```

### Métodos Básicos
```java
lista.add(elemento);              // Agregar elemento
lista.get(indice);                // Obtener elemento
lista.size();                     // Tamaño de la lista
lista.remove(indice);             // Eliminar elemento
lista.set(indice, elemento);      // Reemplazar elemento
lista.clear();                    // Limpiar lista
lista.isEmpty();                  // Verificar si está vacía
lista.contains(elemento);         // Buscar elemento
```

### Iteración For-Each
```java
for (TipoObjeto elemento : lista) {
    // Hacer algo con elemento
}
```

### Collections
```java
import java.util.Collections;

Collections.sort(lista);           // Ordenar ascendente
Collections.reverse(lista);        // Invertir orden
Collections.shuffle(lista);        // Desordenar aleatoriamente
Collections.max(lista);            // Elemento máximo
Collections.min(lista);            // Elemento mínimo
Collections.frequency(lista, obj); // Frecuencia de objeto
Collections.copy(destino, origen); // Copiar lista
```

## 📝 Notas Importantes

- **Tipos Primitivos**: No se pueden usar directamente en listas
- **Wrappers**: Usar Integer, Double, Boolean en lugar de int, double, boolean
- **Referencias**: Las listas almacenan referencias a objetos, no los objetos en sí
- **ArrayList vs LinkedList**: Elegir según el tipo de operaciones más frecuentes
- **Imports**: Siempre importar `java.util.List` y `java.util.ArrayList`

## 🚀 Ejecución

Cada ejercicio puede ejecutarse independientemente compilando y ejecutando la clase principal:

```bash
javac src/*.java
java -cp src NombreClasePrincipal
```

## 📖 Recursos Adicionales

- Documentación oficial de Java sobre [Colecciones](https://docs.oracle.com/javase/tutorial/collections/)
- Documentación oficial de Java sobre [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
- Documentación oficial de Java sobre [LinkedList](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)
- Documentación oficial de Java sobre [Collections](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html)

