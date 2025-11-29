# 📚 Problema Propuesto 2: Investigación de Conceptos Avanzados

## Autor: Ludmila Martos
## Clase 12 - Programación 2 - ISSD 2025

---

## 1. 🔒 DeadLock (Interbloqueo)

### ¿Qué es?
Un **DeadLock** (o interbloqueo) es una situación en programación concurrente donde dos o más hilos quedan bloqueados permanentemente, esperando cada uno por un recurso que el otro tiene bloqueado.

### Analogía
Imagina dos personas en un pasillo estrecho, cada una esperando que la otra se mueva primero. Ninguna puede avanzar porque ambas están esperando.

### Ejemplo en código
```java
// Hilo 1
synchronized(recursoA) {
    // Hace algo con A
    synchronized(recursoB) {  // Espera por B
        // Usa A y B
    }
}

// Hilo 2
synchronized(recursoB) {
    // Hace algo con B
    synchronized(recursoA) {  // Espera por A (¡DeadLock!)
        // Usa A y B
    }
}
```

### Condiciones para un DeadLock
1. **Exclusión mutua**: Los recursos no pueden ser compartidos
2. **Retención y espera**: Un hilo retiene recursos mientras espera otros
3. **No apropiación**: Los recursos no pueden ser quitados forzosamente
4. **Espera circular**: Existe una cadena circular de hilos esperando recursos

### Cómo evitarlo
- Ordenar los recursos y siempre adquirirlos en el mismo orden
- Usar timeouts al intentar adquirir recursos
- Usar `tryLock()` en lugar de `synchronized`

---

## 2. 🏗️ MVC (Modelo Vista Controlador)

### ¿Qué es?
**MVC** es un patrón de arquitectura de software que separa una aplicación en tres componentes principales:

### Componentes

#### 📦 Modelo (Model)
- Contiene los **datos** y la **lógica de negocio**
- Es independiente de la interfaz de usuario
- Notifica a las vistas cuando los datos cambian

```java
public class Usuario {
    private String nombre;
    private String email;
    // Getters, setters, validaciones...
}
```

#### 👁️ Vista (View)
- Es la **interfaz de usuario** (GUI)
- Muestra los datos del modelo
- Envía las acciones del usuario al controlador

```html
<form action="/usuarios" method="POST">
    <input type="text" name="nombre">
    <input type="email" name="email">
    <button>Guardar</button>
</form>
```

#### 🎮 Controlador (Controller)
- Actúa como **intermediario** entre Modelo y Vista
- Recibe las acciones del usuario
- Actualiza el modelo y selecciona la vista apropiada

```java
@Controller
public class UsuarioController {
    @PostMapping("/usuarios")
    public String crearUsuario(Usuario usuario) {
        usuarioService.guardar(usuario);
        return "redirect:/usuarios";
    }
}
```

### Flujo de MVC
```
Usuario → Vista → Controlador → Modelo
                      ↓
              Vista ← Controlador ← Modelo
```

### Ventajas
- **Separación de responsabilidades**
- **Facilita el testing**
- **Permite trabajo en paralelo** (frontend y backend)
- **Reutilización de código**

---

## 3. 💾 CRUD

### ¿Qué es?
**CRUD** es un acrónimo que representa las cuatro operaciones básicas de persistencia de datos:

| Operación | Significado | SQL | HTTP |
|-----------|-------------|-----|------|
| **C** | Create (Crear) | INSERT | POST |
| **R** | Read (Leer) | SELECT | GET |
| **U** | Update (Actualizar) | UPDATE | PUT/PATCH |
| **D** | Delete (Eliminar) | DELETE | DELETE |

### Ejemplo en Java con Spring Boot

```java
@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    
    // CREATE - POST /api/productos
    @PostMapping
    public Producto crear(@RequestBody Producto p) {
        return repository.save(p);
    }
    
    // READ - GET /api/productos
    @GetMapping
    public List<Producto> listar() {
        return repository.findAll();
    }
    
    // READ - GET /api/productos/{id}
    @GetMapping("/{id}")
    public Producto obtener(@PathVariable Long id) {
        return repository.findById(id);
    }
    
    // UPDATE - PUT /api/productos/{id}
    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable Long id, @RequestBody Producto p) {
        p.setId(id);
        return repository.save(p);
    }
    
    // DELETE - DELETE /api/productos/{id}
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
```

---

## 4. 🔌 API (Application Programming Interface)

### ¿Qué es?
Una **API** es un conjunto de definiciones, protocolos y herramientas que permite que diferentes aplicaciones se comuniquen entre sí.

### Tipos de APIs

#### APIs Web (REST)
- Usan HTTP para comunicación
- Intercambian datos en formato JSON o XML
- Son las más comunes actualmente

```
GET https://api.ejemplo.com/usuarios/123
→ {"id": 123, "nombre": "Juan", "email": "juan@mail.com"}
```

#### APIs de Librerías
- Funciones y clases que proporciona una librería
- Ejemplo: la API de Java Collections

```java
List<String> lista = new ArrayList<>();
lista.add("elemento");  // Método de la API de ArrayList
```

### Ejemplo de consumo de API REST
```java
// Consumir API de clima
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create("https://api.clima.com/temperatura?ciudad=Cordoba"))
    .GET()
    .build();
HttpResponse<String> response = client.send(request, 
    HttpResponse.BodyHandlers.ofString());
System.out.println(response.body());
```

### APIs populares
- **Google Maps API**: Mapas y geolocalización
- **Twitter API**: Publicar tweets, obtener timeline
- **Stripe API**: Procesamiento de pagos
- **OpenWeather API**: Datos meteorológicos

---

## 5. 🖥️ Client-side vs Server-side Processing

### Client-side (Lado del cliente)

El procesamiento ocurre en el **navegador del usuario**.

#### Tecnologías
- JavaScript
- HTML/CSS
- Frameworks: React, Vue, Angular

#### Características
- ✅ Respuesta inmediata (no espera al servidor)
- ✅ Reduce carga del servidor
- ✅ Interactividad rica
- ❌ El código es visible para el usuario
- ❌ Depende del dispositivo del usuario
- ❌ No es seguro para validaciones críticas

#### Ejemplo
```javascript
// Validación de formulario en el navegador
function validarEmail(email) {
    const regex = /^[\w-]+(\.[\w-]+)*@([\w-]+\.)+[a-zA-Z]{2,7}$/;
    return regex.test(email);
}

document.getElementById('form').onsubmit = function() {
    if (!validarEmail(document.getElementById('email').value)) {
        alert('Email inválido');
        return false;  // No envía al servidor
    }
};
```

### Server-side (Lado del servidor)

El procesamiento ocurre en el **servidor**.

#### Tecnologías
- Java (Spring Boot)
- Python (Django, Flask)
- Node.js
- PHP, Ruby, C#

#### Características
- ✅ Código oculto y seguro
- ✅ Acceso a bases de datos
- ✅ Validaciones seguras
- ✅ Procesamiento pesado
- ❌ Requiere conexión a internet
- ❌ Mayor tiempo de respuesta
- ❌ Mayor carga en el servidor

#### Ejemplo
```java
// Validación y procesamiento en el servidor
@PostMapping("/registro")
public String registrar(@RequestBody Usuario usuario) {
    // Validar (seguro, el usuario no puede evitarlo)
    if (!emailService.esValido(usuario.getEmail())) {
        throw new BadRequestException("Email inválido");
    }
    
    // Guardar en base de datos
    usuarioRepository.save(usuario);
    
    // Enviar email de confirmación
    emailService.enviarConfirmacion(usuario);
    
    return "Usuario registrado";
}
```

### Comparación

| Aspecto | Client-side | Server-side |
|---------|-------------|-------------|
| Velocidad | Más rápido | Más lento |
| Seguridad | Baja | Alta |
| Escalabilidad | Alta | Depende del servidor |
| SEO | Peor | Mejor |
| Ejemplo | Validar formato de email | Verificar si email existe en BD |

### Enfoque híbrido (recomendado)
Lo ideal es combinar ambos:
- **Client-side**: Validaciones básicas y UX
- **Server-side**: Validaciones de seguridad y lógica de negocio

```
Usuario completa formulario
       ↓
[Client-side] Valida formato → Muestra errores inmediatos
       ↓
[Server-side] Valida datos → Guarda en BD → Responde
       ↓
[Client-side] Muestra resultado
```

---

## 📚 Recursos Adicionales

- [Java Concurrency Tutorial - Oracle](https://docs.oracle.com/javase/tutorial/essential/concurrency/)
- [MVC Pattern - Microsoft Docs](https://learn.microsoft.com/en-us/aspnet/core/mvc/overview)
- [REST API Design - REST API Tutorial](https://restfulapi.net/)
- [MDN Web Docs - Client-side vs Server-side](https://developer.mozilla.org/en-US/docs/Learn/Server-side/First_steps/Client-Server_overview)

---

> **Nota**: Este documento forma parte de la investigación del Problema Propuesto 2 de la Clase 12.

