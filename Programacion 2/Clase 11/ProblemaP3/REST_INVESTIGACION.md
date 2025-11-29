# 🌐 Problema Propuesto 3: Investigación sobre REST y RESTful

## Autor: Ludmila Martos
## Clase 11 - Programación 2 - ISSD 2025

---

## 📖 ¿Qué es REST?

**REST** (Representational State Transfer) es un **estilo de arquitectura de software** para sistemas distribuidos como la World Wide Web. Fue definido por **Roy Fielding** en su tesis doctoral en el año 2000.

REST no es un protocolo ni un estándar, sino un conjunto de **principios arquitectónicos** que definen cómo deben comunicarse los componentes de un sistema distribuido.

### Características principales de REST:

1. **Arquitectura Cliente-Servidor**: Separación clara entre el cliente (quien consume el servicio) y el servidor (quien lo provee).

2. **Sin estado (Stateless)**: Cada petición del cliente al servidor debe contener toda la información necesaria para entender la solicitud. El servidor no almacena ningún contexto del cliente entre peticiones.

3. **Cacheable**: Las respuestas deben indicar si pueden ser almacenadas en caché o no.

4. **Sistema en capas**: El cliente no puede saber si está conectado directamente al servidor final o a un intermediario.

5. **Interfaz uniforme**: Es el principio fundamental de REST. Define una interfaz genérica para todos los componentes.

---

## 🔧 ¿Qué es RESTful?

**RESTful** es un término que se usa para describir **servicios web que implementan la arquitectura REST** de manera correcta y completa.

Un servicio web es **RESTful** cuando:

- Utiliza **URLs** para identificar recursos
- Usa los **métodos HTTP** correctamente
- Devuelve **códigos de estado HTTP** apropiados
- Intercambia datos en formatos como **JSON** o **XML**

### Diferencia entre REST y RESTful

| REST | RESTful |
|------|---------|
| Es un estilo arquitectónico | Es la implementación de REST |
| Define principios y restricciones | Es un servicio que sigue esos principios |
| Es teórico | Es práctico |

---

## 📡 Métodos HTTP en REST

Los servicios RESTful utilizan los métodos HTTP estándar para realizar operaciones sobre recursos:

| Método | Descripción | Operación CRUD |
|--------|-------------|----------------|
| **GET** | Obtener un recurso | READ (Leer) |
| **POST** | Crear un nuevo recurso | CREATE (Crear) |
| **PUT** | Actualizar un recurso completo | UPDATE (Actualizar) |
| **PATCH** | Actualizar parcialmente un recurso | UPDATE (Actualizar parcial) |
| **DELETE** | Eliminar un recurso | DELETE (Eliminar) |

### Ejemplos de URLs RESTful:

```
GET    /api/usuarios          → Obtener todos los usuarios
GET    /api/usuarios/1        → Obtener el usuario con ID 1
POST   /api/usuarios          → Crear un nuevo usuario
PUT    /api/usuarios/1        → Actualizar el usuario con ID 1
DELETE /api/usuarios/1        → Eliminar el usuario con ID 1
```

---

## 📊 Códigos de Estado HTTP

Los servicios RESTful deben devolver códigos de estado HTTP apropiados:

### Códigos de éxito (2xx)
- **200 OK**: Solicitud exitosa
- **201 Created**: Recurso creado exitosamente
- **204 No Content**: Solicitud exitosa sin contenido de respuesta

### Códigos de error del cliente (4xx)
- **400 Bad Request**: Solicitud malformada
- **401 Unauthorized**: No autenticado
- **403 Forbidden**: No autorizado
- **404 Not Found**: Recurso no encontrado

### Códigos de error del servidor (5xx)
- **500 Internal Server Error**: Error interno del servidor
- **503 Service Unavailable**: Servicio no disponible

---

## 💻 Ejemplo de API RESTful

### Recurso: Productos de una tienda

```
Base URL: https://api.mitienda.com/v1

Endpoints:

GET    /productos              → Lista todos los productos
GET    /productos/123          → Obtiene el producto 123
POST   /productos              → Crea un nuevo producto
PUT    /productos/123          → Actualiza el producto 123
DELETE /productos/123          → Elimina el producto 123
GET    /productos?categoria=electronica  → Filtra por categoría
```

### Ejemplo de respuesta JSON:

```json
{
  "id": 123,
  "nombre": "Laptop HP",
  "precio": 899.99,
  "categoria": "electronica",
  "stock": 50,
  "fechaCreacion": "2024-01-15T10:30:00Z"
}
```

---

## 🎯 Ventajas de REST/RESTful

1. **Escalabilidad**: Al ser stateless, es fácil escalar horizontalmente
2. **Simplicidad**: Usa estándares HTTP existentes
3. **Flexibilidad**: Soporta múltiples formatos de datos (JSON, XML, etc.)
4. **Independencia**: Cliente y servidor pueden evolucionar por separado
5. **Rendimiento**: El uso de caché mejora la velocidad de respuesta
6. **Portabilidad**: Cualquier cliente que entienda HTTP puede consumir el servicio

---

## 🔄 REST vs SOAP

| Característica | REST | SOAP |
|---------------|------|------|
| Protocolo | HTTP | Cualquiera (HTTP, SMTP, etc.) |
| Formato de datos | JSON, XML, HTML, texto | Solo XML |
| Complejidad | Simple | Complejo |
| Velocidad | Rápido | Más lento |
| Estándar | Arquitectura/Estilo | Protocolo estricto |
| Caché | Sí | No |
| Uso actual | APIs modernas, móviles | Sistemas empresariales legacy |

---

## 🛠️ REST en Spring Boot

En Spring Boot, creamos servicios RESTful usando anotaciones:

```java
@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    // GET /api/productos
    @GetMapping
    public List<Producto> listarTodos() {
        return productoService.obtenerTodos();
    }

    // GET /api/productos/{id}
    @GetMapping("/{id}")
    public Producto obtenerPorId(@PathVariable Long id) {
        return productoService.obtenerPorId(id);
    }

    // POST /api/productos
    @PostMapping
    public Producto crear(@RequestBody Producto producto) {
        return productoService.guardar(producto);
    }

    // PUT /api/productos/{id}
    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable Long id, 
                               @RequestBody Producto producto) {
        return productoService.actualizar(id, producto);
    }

    // DELETE /api/productos/{id}
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        productoService.eliminar(id);
    }
}
```

---

## 📚 Recursos Adicionales

- [REST API Tutorial](https://restfulapi.net/)
- [MDN Web Docs - HTTP](https://developer.mozilla.org/es/docs/Web/HTTP)
- [Spring Framework - Building REST services](https://spring.io/guides/tutorials/rest/)
- [RESTful Web Services - Wikipedia](https://es.wikipedia.org/wiki/Transferencia_de_Estado_Representacional)

---

## 🎓 Conclusión

REST es un estilo arquitectónico que define cómo deben comunicarse los sistemas distribuidos. Cuando implementamos correctamente estos principios en un servicio web, lo llamamos **RESTful**.

En la materia de Programación 2, hemos comenzado a crear servicios web con Spring Boot que siguen algunos principios REST, específicamente:
- Usar URLs para identificar endpoints
- Usar el método GET para obtener recursos
- Usar parámetros de URL para enviar datos

A medida que avancemos, podremos implementar APIs RESTful completas con todos los métodos HTTP y buenas prácticas de diseño.

---

> **Nota**: Este documento forma parte de la investigación del Problema Propuesto 3 de la Clase 11.


