# Clase 09 - Excepciones

Esta clase introduce el manejo de **Excepciones** en Java, mecanismo fundamental para crear programas robustos y tolerantes a fallos.

## 📚 Conceptos Clave

### ⚠️ Excepciones
- **Definición**: Eventos que interrumpen el flujo normal de un programa
- **Propósito**: Manejar condiciones inesperadas o errores en tiempo de ejecución
- **Diferencia**: Excepciones vs Errores (conceptos distintos en Java)
- **Beneficio**: Permite que el programa continúe ejecutándose tras un error

### 🔍 Tipos de Excepciones

#### Checked Exceptions (Excepciones Comprobadas)
- **Característica**: El compilador obliga a manejarlas explícitamente
- **Uso**: Condiciones fuera del control del programador
- **Ejemplos**: IOException, FileNotFoundException, SQLException
- **Manejo**: try-catch o throws

#### Unchecked Exceptions (Excepciones No Comprobadas)
- **Característica**: No requieren manejo explícito
- **Uso**: Errores de programación o condiciones previsibles
- **Ejemplos**: ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException
- **Manejo**: Opcional pero recomendado

### 🛠️ Mecanismos de Manejo

#### Try-Catch
```java
try {
    // Código que puede generar excepción
} catch (Exception e) {
    // Código que se ejecuta si hay excepción
}
```

#### Finally
```java
try {
    // Código
} catch (Exception e) {
    // Manejo de excepción
} finally {
    // Código que SIEMPRE se ejecuta
}
```

#### Throws
```java
public static void metodo() throws IOException {
    // Código que puede lanzar IOException
}
```

#### Try-With-Resources
```java
try (BufferedReader br = new BufferedReader(...)) {
    // Código
} catch (IOException e) {
    // Manejo
}
// Recurso se cierra automáticamente
```

## 📁 Estructura de Ejercicios

### Ejercicios Básicos (01-09)
- **Ejercicio 01**: División por cero - try-catch básico
- **Ejercicio 02**: Análisis de flujo try-catch (Problema 1)
- **Ejercicio 03**: Array fuera de rango - flujo de ejecución
- **Ejercicio 04**: StackTrace y getMessage()
- **Ejercicio 05**: Arrays y excepciones con información personalizada
- **Ejercicio 06**: Tarjeta de crédito - debugging con excepciones
- **Ejercicio 07**: Múltiples tipos de excepciones (catch específicos)
- **Ejercicio 08**: Finally - ejecución garantizada
- **Ejercicio 09**: Throws y propagación de excepciones

## 📁 Problemas Propuestos

- **Problema 01**: Validación de entrada numérica con reintentos
- **Problema 02**: Validación de nombre completo con límite de palabras

## 🎯 Objetivos de Aprendizaje

1. **Conceptos Básicos**:
   - Entender qué son las excepciones
   - Diferenciar excepciones de errores
   - Comprender cuándo usar manejo de excepciones

2. **Try-Catch**:
   - Sintaxis básica
   - Flujo de ejecución
   - Múltiples bloques catch

3. **Información de Excepciones**:
   - printStackTrace(): Mostrar stack trace completo
   - getMessage(): Obtener mensaje de error
   - Scope de variables en try-catch

4. **Tipos de Excepciones**:
   - ArithmeticException: División por cero
   - ArrayIndexOutOfBoundsException: Índice fuera de rango
   - NumberFormatException: Conversión fallida
   - NullPointerException: Acceso a objeto null

5. **Mecanismos Avanzados**:
   - Finally: Código que siempre se ejecuta
   - Throws: Delegar manejo de excepciones
   - Try-with-resources: Cierre automático de recursos

## 🔧 Herramientas y Sintaxis

### Try-Catch Básico
```java
try {
    // Código que puede fallar
} catch (Exception e) {
    // Manejo de excepción
}
```

### Múltiples Catch
```java
try {
    // Código
} catch (ArithmeticException e1) {
    // Manejo específico
} catch (ArrayIndexOutOfBoundsException e2) {
    // Manejo específico
}
```

### Finally
```java
try {
    // Código
} catch (Exception e) {
    // Manejo
} finally {
    // Siempre se ejecuta
}
```

### Throws
```java
public static void metodo() throws IOException {
    // Código que puede lanzar IOException
}
```

### Try-With-Resources
```java
try (RecursoAutoClosable recurso = new RecursoAutoClosable()) {
    // Usar recurso
} catch (Exception e) {
    // Manejo
} // Recurso se cierra automáticamente
```

## 📝 Notas Importantes

- **No usar excepciones como control de flujo**: Las excepciones son para errores, no para lógica normal
- **Scope de variables**: Variables declaradas en try solo existen en ese bloque
- **Orden de catch**: De más específica a más general
- **Checked vs Unchecked**: Checked deben manejarse, Unchecked son opcionales
- **Finally siempre se ejecuta**: Incluso si hay return en try o catch

## 🚀 Ejecución

Cada ejercicio puede ejecutarse independientemente:

```bash
javac src/*.java
java -cp src NombreClasePrincipal
```

## 📖 Recursos Adicionales

- Documentación oficial de Java sobre [Excepciones](https://docs.oracle.com/javase/tutorial/essential/exceptions/)
- [Java Exception Handling](https://www.javatpoint.com/exception-handling-in-java)
- [Best Practices for Exception Handling](https://www.baeldung.com/java-exceptions)

