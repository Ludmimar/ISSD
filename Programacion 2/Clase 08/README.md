# Clase 08 - Sets, Queues y Stacks

Esta clase introduce tres estructuras de datos fundamentales en Java: **Sets**, **Queues** y **Stacks**.

## 📚 Conceptos Clave

### 🔢 Sets (Conjuntos)
- **Definición**: Colección de elementos únicos (no permite duplicados)
- **Característica principal**: Cada elemento es único
- **Basado en**: Concepto matemático de conjuntos
- **Implementaciones**: HashSet, LinkedHashSet, TreeSet

### 📋 Queues (Colas)
- **Definición**: Estructura que sigue el principio FIFO (First In, First Out)
- **Característica principal**: El primer elemento en entrar es el primero en salir
- **Implementaciones**: LinkedList, PriorityQueue
- **Uso**: Procesamiento ordenado según llegada

### 📚 Stacks (Pilas)
- **Definición**: Estructura que sigue el principio LIFO (Last In, First Out)
- **Característica principal**: El último elemento en entrar es el primero en salir
- **Uso**: Backtracking, deshacer operaciones (Ctrl+Z), evaluación de expresiones

## 📁 Estructura de Ejercicios

### Ejercicios de Sets (01-05, 09)
- **Ejercicio 01**: Conjuntos básicos - conceptos matemáticos
- **Ejercicio 02**: HashSet básico - agregar y tamaño
- **Ejercicio 03**: HashSet con elementos duplicados
- **Ejercicio 04**: Métodos contains() y equals()
- **Ejercicio 05**: Set de objetos personalizados (Estudiante)
- **Ejercicio 09**: Dragon con equals() y hashCode() - prevención de duplicados

### Ejercicios de Queues (06-07)
- **Ejercicio 06**: Queue con LinkedList - métodos básicos
- **Ejercicio 07**: PriorityQueue - orden natural

### Ejercicios de Stacks (08)
- **Ejercicio 08**: Stack para laberinto - backtracking

## 📁 Problemas Propuestos

- **Problema 01**: Intereses únicos de usuarios (Set de intereses)
- **Problema 02**: Intereses únicos en orden alfabético (TreeSet)
- **Problema 03**: Números únicos aleatorios (contar elementos únicos)
- **Problema 04**: Lista de espera de banco (Queue)
- **Problema 05**: Camino de regreso en laberinto (Stack inverso)
- **Problema 06**: Pila de cartas aleatorias (Stack)

## 🎯 Objetivos de Aprendizaje

1. **Sets**:
   - Comprender que no permiten duplicados
   - Diferenciar HashSet, LinkedHashSet, TreeSet
   - Métodos: add(), remove(), contains(), size(), isEmpty()
   - equals() y hashCode() para objetos personalizados

2. **Queues**:
   - Principio FIFO (First In, First Out)
   - Métodos: offer(), poll(), peek(), remove(), element()
   - LinkedList vs PriorityQueue

3. **Stacks**:
   - Principio LIFO (Last In, First Out)
   - Métodos: push(), pop(), peek(), empty()
   - Aplicaciones: backtracking, deshacer

## 🔧 Herramientas y Sintaxis

### Sets
```java
import java.util.Set;
import java.util.HashSet;

Set<TipoObjeto> set = new HashSet<>();
set.add(elemento);
set.remove(elemento);
set.contains(elemento);
set.size();
```

### Queues
```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

Queue<TipoObjeto> queue = new LinkedList<>();
queue.offer(elemento);
queue.poll();  // Elimina y retorna
queue.peek();  // Solo retorna, no elimina
```

### Stacks
```java
import java.util.Stack;

Stack<TipoObjeto> stack = new Stack<>();
stack.push(elemento);
stack.pop();    // Elimina y retorna
stack.peek();   // Solo retorna, no elimina
stack.empty();
```

## 📝 Notas Importantes

- **Sets**: No permiten duplicados, usan equals() para comparar
- **HashSet**: Sin orden garantizado
- **LinkedHashSet**: Mantiene orden de inserción
- **TreeSet**: Mantiene orden natural o por comparador
- **Queues**: FIFO - primero en entrar, primero en salir
- **Stacks**: LIFO - último en entrar, primero en salir
- **Equals y HashCode**: Importantes para objetos personalizados en Sets

## 🚀 Ejecución

Cada ejercicio puede ejecutarse independientemente:

```bash
javac src/*.java
java -cp src NombreClasePrincipal
```

## 📖 Recursos Adicionales

- Documentación oficial de Java sobre [Sets](https://docs.oracle.com/javase/tutorial/collections/interfaces/set.html)
- Documentación oficial de Java sobre [Queues](https://docs.oracle.com/javase/tutorial/collections/interfaces/queue.html)
- Documentación oficial de Java sobre [Stacks](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)

