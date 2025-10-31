# Clase 05 - Composición, Herencia e Interfaces

Esta clase introduce los conceptos fundamentales de la programación orientada a objetos en Java: **Composición**, **Herencia** e **Interfaces**.

## 📚 Conceptos Clave

### 🔗 Composición
- **Definición**: Relación entre clases donde una clase "tiene" objetos de otra clase como atributos
- **Relación**: "...tiene un..." o "...es parte de..."
- **Ejemplo**: Un Banco "tiene" Clientes, un JuegoDeDados "tiene" Dados
- **Implementación**: Declarar objetos de otras clases como atributos privados

### 🧬 Herencia
- **Definición**: Relación entre clases donde una clase hereda atributos y métodos de otra
- **Relación**: "...es un..." (relación de tipo-subtipo)
- **Ejemplo**: Un Empleado "es una" Persona, un Auto "es un" Vehículo
- **Implementación**: Usar `extends` para heredar de una clase padre
- **Modificadores**: `protected` para que las subclases accedan a atributos

### 🔌 Interfaces
- **Definición**: Contrato que define métodos que deben implementar las clases
- **Propósito**: Estandarizar comportamiento sin implementación específica
- **Ejemplo**: Interfaz Juego define métodos iniciar(), jugar(), finalizar()
- **Implementación**: Usar `implements` para implementar una interfaz

## 📁 Estructura de Ejercicios

### Ejercicios de Composición

#### Ejercicio 01 - ProyectoBanco
- **Clases**: `Cliente.java`, `Banco.java`
- **Concepto**: Un banco tiene 3 clientes que pueden hacer depósitos y extracciones
- **Relación**: Banco "tiene" Clientes
- **Funcionalidad**: Gestión de cuentas bancarias y cálculo de totales

#### Ejercicio 02 - ProyectoJuegoDeDados
- **Clases**: `Dado.java`, `JuegoDeDados.java`
- **Concepto**: Juego de dados donde se tiran 3 dados y se compara si son iguales
- **Relación**: JuegoDeDados "tiene" Dados
- **Funcionalidad**: Generación de números aleatorios y lógica de juego

#### Ejercicio 03 - Club y Socio
- **Clases**: `Socio.java`, `Club.java`
- **Concepto**: Un club tiene socios con nombre y antigüedad
- **Relación**: Club "tiene" Socios
- **Funcionalidad**: Gestión de socios y búsqueda del socio con mayor antigüedad

### Ejercicios de Herencia

#### Ejercicio 04 - Operaciones con Herencia
- **Clases**: `Operacion.java`, `Suma.java`, `Resta.java`, `Prueba.java`
- **Concepto**: Clase padre Operacion con clases hijas Suma y Resta
- **Relación**: Suma "es una" Operacion, Resta "es una" Operacion
- **Funcionalidad**: Operaciones matemáticas con métodos heredados y sobrescritos

#### Ejercicio 05 - Persona y Empleado con Herencia
- **Clases**: `Persona.java`, `Empleado.java`, `Prueba.java`
- **Concepto**: Clase padre Persona con clase hija Empleado
- **Relación**: Empleado "es una" Persona
- **Funcionalidad**: Gestión de datos personales y laborales

### Ejercicios de Interfaces

#### Ejercicio 06 - Interfaces de Juegos
- **Clases**: `Juego.java`, `JuegoDeDados.java`, `JuegoAdivinaNumero.java`, `PruebaDeJuegos.java`
- **Concepto**: Interfaz Juego implementada por diferentes tipos de juegos
- **Funcionalidad**: Estandarización del comportamiento de juegos

## 📁 Problemas Propuestos

### Problema 01 - Jerarquía de Vehículos
- **Clases**: `Vehiculo.java`, `Auto.java`, `Moto.java`, `PruebaVehiculos.java`
- **Concepto**: Jerarquía de herencia con Vehículo como clase padre
- **Relación**: Auto "es un" Vehículo, Moto "es un" Vehículo
- **Funcionalidad**: Demostración de herencia y polimorfismo

### Problema 02 - Sistema de Librería
- **Clases**: `Libro.java`, `LibroFisico.java`, `LibroVirtual.java`, `Empresa.java`
- **Concepto**: Sistema de gestión de libros físicos y virtuales
- **Relación**: LibroFisico "es un" Libro, LibroVirtual "es un" Libro
- **Funcionalidad**: Gestión de inventario y ventas

### Problema 03 - Puntos 2D y 3D
- **Clases**: `Punto2D.java`, `Punto3D.java`, `PruebaPuntos.java`
- **Concepto**: Puntos en el plano y en el espacio
- **Relación**: Punto3D "es un" Punto2D con coordenada z adicional
- **Funcionalidad**: Cálculos de distancia y volumen

## 🎯 Objetivos de Aprendizaje

1. **Composición**:
   - Identificar relaciones de composición
   - Implementar clases que contengan objetos de otras clases
   - Gestionar objetos relacionados

2. **Herencia**:
   - Crear jerarquías de clases
   - Usar modificadores `protected` y `super`
   - Sobrescribir métodos con `@Override`
   - Aplicar polimorfismo

3. **Interfaces**:
   - Definir contratos con interfaces
   - Implementar interfaces en clases
   - Estandarizar comportamiento

## 🔧 Herramientas y Sintaxis

### Composición
```java
public class Banco {
    private Cliente cliente1, cliente2, cliente3;
    
    public Banco() {
        cliente1 = new Cliente("Juan");
        cliente2 = new Cliente("Ana");
        cliente3 = new Cliente("Pedro");
    }
}
```

### Herencia
```java
public class Empleado extends Persona {
    protected float sueldo;
    
    public void cargar() {
        super.cargar(); // Llama al método de la clase padre
        // Código específico de Empleado
    }
}
```

### Interfaces
```java
public interface Juego {
    void iniciar();
    void jugar();
    void finalizar();
}

public class JuegoDeDados implements Juego {
    public void iniciar() { /* implementación */ }
    public void jugar() { /* implementación */ }
    public void finalizar() { /* implementación */ }
}
```

## 📝 Notas Importantes

- **Composición vs Herencia**: Usar composición cuando la relación es "tiene un", herencia cuando es "es un"
- **Modificadores de Acceso**: `protected` permite acceso desde subclases
- **Polimorfismo**: Los objetos pueden ser tratados como su tipo padre
- **Interfaces**: Permiten herencia múltiple de comportamiento
- **Encapsulación**: Mantener atributos privados y usar métodos públicos

## 🚀 Ejecución

Cada ejercicio puede ejecutarse independientemente compilando y ejecutando la clase principal:

```bash
javac *.java
java NombreClasePrincipal
```

## 📖 Recursos Adicionales

- Documentación oficial de Java sobre [Herencia](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
- Documentación oficial de Java sobre [Interfaces](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)
- Conceptos de [Programación Orientada a Objetos](https://docs.oracle.com/javase/tutorial/java/concepts/)

