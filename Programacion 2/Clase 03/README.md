# Programación 2 - Clase 03: Programación Orientada a Objetos

## Contenido de la Clase

Esta clase introduce los conceptos fundamentales de la **Programación Orientada a Objetos (POO)** en Java.

### Conceptos Principales

1. **Clases y Objetos**
   - Definición de clases
   - Creación de objetos (instanciación)
   - Atributos y métodos
   - Método main()

2. **Encapsulación**
   - Modificadores de acceso (private, public)
   - Atributos privados
   - Métodos públicos y privados

3. **Constructores**
   - Constructor por defecto
   - Constructor con parámetros
   - Inicialización de objetos

4. **Métodos**
   - Métodos que no retornan valores (void)
   - Métodos que retornan valores (return)
   - Parámetros en métodos

5. **Sobrecarga**
   - Sobrecarga de constructores
   - Sobrecarga de métodos

6. **Palabra clave 'this'**
   - Diferenciación entre parámetros y atributos
   - Referencia al objeto actual

7. **Múltiples objetos**
   - Una clase, múltiples instancias
   - Objetos independientes

8. **Miembros estáticos**
   - Atributos estáticos
   - Métodos estáticos
   - Diferencias con miembros de instancia

### Ejercicios Incluidos

Cada ejercicio está organizado en su propia carpeta con la estructura estándar de IntelliJ IDEA:

```
Ejercicio XX - Nombre/
├── EjercicioXX.iml          # Configuración del módulo
└── src/                      # Código fuente
    ├── Main.java           # Archivo principal
    └── [Otros archivos .java]  # Archivos adicionales si es necesario
```

**Lista de Ejercicios:**

1. **Ejercicio 1 - Persona**: Clase básica con atributos y métodos
2. **Ejercicio 2 - Triángulo**: Operaciones con múltiples atributos
3. **Ejercicio 3 - Punto**: Coordenadas y cuadrantes
4. **Ejercicio 4 - Cuadrado**: Cálculos geométricos
5. **Ejercicio 5 - Empleado**: Problema propuesto con impuestos
6. **Ejercicio 6 - Operaciones**: Operaciones matemáticas básicas
7. **Ejercicio 7 - Usuario Constructor**: Primer uso de constructores
8. **Ejercicio 8 - TablaMultiplicación**: Constructores con parámetros
9. **Ejercicio 9 - NumeroAleatorio**: Métodos que retornan valores
10. **Ejercicio 10 - Cuadrado Retorna**: Método que retorna String
11. **Ejercicio 11 - Dado Varios Objetos**: Múltiples instancias
12. **Ejercicio 12 - Usuario This**: Palabra clave 'this'
13. **Ejercicio 13 - Dado Sobrecarga**: Sobrecarga de constructores
14. **Ejercicio 14 - Persona Estático**: Atributos estáticos
15. **Ejercicio 15 - Operación Estático**: Métodos estáticos

### Estructura de Archivos Especiales

Algunos ejercicios incluyen archivos adicionales en la carpeta `src/`:

- **Ejercicio 14 - Persona Estático**: 
  - `Main.java` (clase Persona)
  - `PruebaPersona.java` (clase de prueba)
- **Ejercicio 15 - Operación Estático**: 
  - `Main.java` (clase PruebaOperacion)
  - `Operacion.java` (clase Operacion)

### Cómo Usar los Ejercicios

1. **Abrir en IntelliJ IDEA**: Cada carpeta de ejercicio es un módulo independiente
2. **Ejecutar**: Ejecutar la clase `Main` desde el IDE
3. **Modificar**: Editar el código en la carpeta `src/`
4. **Compilar**: El IDE compila automáticamente al ejecutar

### Estructura de una Clase en Java

```java
public class NombreClase {
    // Atributos (variables)
    private tipoVariable nombreAtributo;
    
    // Constructor
    public NombreClase() {
        // Inicialización
    }
    
    // Métodos (funciones)
    public void nombreMetodo() {
        // Código del método
    }
    
    // Método principal
    public static void main(String[] args) {
        // Código principal
    }
}
```

### Conceptos UML

La clase incluye ejemplos de diagramas UML básicos para representar:
- Clases con atributos y métodos
- Objetos como instancias

### Notas Importantes

- Los atributos se definen con `private` para encapsulación
- Los métodos se definen con `public` para acceso externo
- El constructor tiene el mismo nombre que la clase
- Los métodos estáticos se pueden llamar sin crear objetos
- La palabra `this` diferencia parámetros de atributos
- Una clase es una plantilla, los objetos son instancias

### Próximos Temas

Esta clase sienta las bases para:
- Herencia (Clase 04)
- Polimorfismo (Clase 05)
- Interfaces (Clase 06)
