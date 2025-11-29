package com.issd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para el Problema 9
 * 
 * Este controlador recibe un mensaje por parámetro URL y lo devuelve
 * transformado a mayúsculas.
 * 
 * Uso: http://localhost:8080/transformar?mensaje=texto%20a%20transformar
 * 
 * @author Ludmila Martos
 * @version 1.0.0
 */
@RestController
public class EjemploSpring {

    /**
     * Endpoint raíz que muestra un formulario para probar la transformación
     * URL: http://localhost:8080/
     * 
     * @return String con formulario HTML interactivo
     */
    @GetMapping("/")
    public String hello() {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Problema 9 - Transformar a Mayúsculas</title>
                <style>
                    body {
                        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        height: 100vh;
                        margin: 0;
                        background: linear-gradient(135deg, #f093fb 0%, #f5576c 100%);
                    }
                    .container {
                        background: white;
                        padding: 40px;
                        border-radius: 20px;
                        box-shadow: 0 20px 60px rgba(0,0,0,0.3);
                        text-align: center;
                        max-width: 500px;
                    }
                    h1 { color: #333; margin-bottom: 20px; }
                    input[type="text"] {
                        width: 100%;
                        padding: 15px;
                        margin: 15px 0;
                        border: 2px solid #ddd;
                        border-radius: 10px;
                        font-size: 16px;
                        box-sizing: border-box;
                    }
                    input[type="text"]:focus {
                        outline: none;
                        border-color: #f5576c;
                    }
                    button {
                        padding: 15px 30px;
                        background: linear-gradient(135deg, #f093fb 0%, #f5576c 100%);
                        color: white;
                        border: none;
                        border-radius: 10px;
                        cursor: pointer;
                        font-size: 16px;
                        font-weight: bold;
                        width: 100%;
                    }
                    button:hover { opacity: 0.9; }
                    .example {
                        margin-top: 30px;
                        padding: 20px;
                        background: #f8f9fa;
                        border-radius: 10px;
                        text-align: left;
                    }
                    .example code {
                        background: #e9ecef;
                        padding: 2px 6px;
                        border-radius: 4px;
                        font-size: 14px;
                    }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>🔠 Transformar a Mayúsculas</h1>
                    <p>Problema 9 - Clase 11</p>
                    <form action="/transformar" method="GET">
                        <input type="text" name="mensaje" placeholder="Escribe tu mensaje aquí..." required>
                        <button type="submit">TRANSFORMAR</button>
                    </form>
                    <div class="example">
                        <strong>Ejemplo de URL directa:</strong><br>
                        <code>/transformar?mensaje=hola mundo</code>
                    </div>
                </div>
            </body>
            </html>
            """;
    }

    /**
     * Endpoint que transforma un mensaje a mayúsculas
     * URL: http://localhost:8080/transformar?mensaje=texto
     * 
     * @param mensaje El texto a transformar (recibido por parámetro URL)
     * @return String con el mensaje transformado a mayúsculas
     */
    @GetMapping("/transformar")
    public String transformar(@RequestParam("mensaje") String mensaje) {
        String mensajeMayusculas = mensaje.toUpperCase();
        
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Resultado - Mayúsculas</title>
                <style>
                    body {
                        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        height: 100vh;
                        margin: 0;
                        background: linear-gradient(135deg, #f093fb 0%, #f5576c 100%);
                    }
                    .card {
                        background: white;
                        padding: 50px;
                        border-radius: 20px;
                        box-shadow: 0 20px 60px rgba(0,0,0,0.3);
                        text-align: center;
                        max-width: 600px;
                    }
                    h2 { color: #333; margin-bottom: 10px; }
                    .original {
                        color: #666;
                        font-size: 18px;
                        margin: 20px 0;
                    }
                    .resultado {
                        font-size: 32px;
                        font-weight: bold;
                        color: #f5576c;
                        margin: 30px 0;
                        padding: 20px;
                        background: #f8f9fa;
                        border-radius: 10px;
                        word-wrap: break-word;
                    }
                    a {
                        display: inline-block;
                        margin-top: 20px;
                        padding: 15px 30px;
                        background: linear-gradient(135deg, #f093fb 0%, #f5576c 100%);
                        color: white;
                        text-decoration: none;
                        border-radius: 10px;
                        font-weight: bold;
                    }
                    a:hover { opacity: 0.9; }
                </style>
            </head>
            <body>
                <div class="card">
                    <h2>✨ Transformación Completada</h2>
                    <div class="original">
                        <strong>Original:</strong> %s
                    </div>
                    <div class="resultado">%s</div>
                    <a href="/">← Transformar otro mensaje</a>
                </div>
            </body>
            </html>
            """.formatted(mensaje, mensajeMayusculas);
    }
}


